# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android://127.0.0.1:5037/ZPF6NFRGNFWGLR4H",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本/等待UI")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)


from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()



# start and waiting for switching scene
start_btn = poco(text='Start')
start_btn.click()
start_btn.wait_for_disappearance()

# waiting for the scene ready then click
#exit_btn = poco('btn_back')
#exit_btn.wait_for_appearance()
#exit_btn.click()
poco("wait_ui").click()
time.sleep(1)




#轮询UI，任意一个UI出现就往下走
bomb_count = 0   #初始化炸弹炸弹出现数量
while True:
    blue_fish = poco('fish_emitter').child('blue')
    yellow_fish = poco('fish_emitter').child('yellow')
    bomb = poco('fish_emitter').child('bomb')
    fish = poco.wait_for_any([blue_fish, yellow_fish, bomb])   #等待任意一个出现，参数化‘fish’
    #are = poco("fish_prefabs").get_position()
    if fish is bomb:
        # skip the bomb and count to 3 to exit
        bomb_count += 1
        if bomb_count > 4:     #炸弹超过4次退出循环
            break
    else:
        # otherwise click the fish to collect.
        fish.click()
        fish.wait_for_disappearance()
    time.sleep(2.5)
