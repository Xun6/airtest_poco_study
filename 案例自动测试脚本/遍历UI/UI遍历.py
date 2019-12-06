# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android://127.0.0.1:5037/ZPF6NFRGNFWGLR4H",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本/遍历UI")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)

from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()

poco('btn_start').click()
#poco("local_positioning").click()

poco(text='drag drop').click()
time.sleep(1.5)


shell = poco('collectionArea').child('shell').focus('center')    #参数化‘shell’  并获取‘shell’的中心位置
for star in poco('playDragAndDrop').child('star'):               # 参数化 star 并进行循环遍历
    star.drag_to(shell,0.5)             #将star 拖动至shell
time.sleep(1)


if poco("scoreVal").get_text() == "80":
    poco("btn_back").click()
poco("btn_back",type='Button').click()
poco("btn_back",type='Button').click()

# assert poco('scoreVal').get_text() == "100", "score correct."
# poco('btn_back', type='Button').click()





