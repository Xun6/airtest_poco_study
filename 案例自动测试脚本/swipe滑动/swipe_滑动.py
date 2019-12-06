# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android://127.0.0.1:5037/ZPF6NFRGNFWGLR4H",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本/swipe滑动")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)
# swipe the list view up
from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()
poco("btn_start").click()
poco("list_view").click()


#poco('Scroll View').swipe([0, 0.5])
#poco('Scroll View').swipe([0, -0.5])
#poco('Scroll View').swipe('up')      # the same as above, also have down/left/right
#poco('Scroll View').swipe('down')

# perform swipe without UI selected
x, y = poco('Scroll View').get_position()
end = [x, y - 0.1]
dir = [0, -0.1]            #定义方向
poco.swipe([x, y], end)  # drag from point A to point B
poco.swipe([x, y], direction=dir)  # drag from point A toward given direction and length
time.sleep(5)


title = poco('title').get_text()
if title == 'ListView test':
    back = poco('btn_back')
    back.click()
    back.click()