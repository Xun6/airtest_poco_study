# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android://127.0.0.1:5037/ZPF6NFRGNFWGLR4H",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本/坐标系和局部定位")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)

from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()
poco("btn_start").click()
poco("local_positioning").click()

image = poco('fish').child(type='Image')   #参数化定义 子级‘Image’
image.focus('center').long_click()       #长按中心点
time.sleep(0.2)
image.focus([0.1, 0.1]).long_click()     # 长按左上角
time.sleep(0.2)
image.focus([0.9, 0.9]).long_click()     # 长按右下角
time.sleep(0.2)
image.focus([0.5, 0.9]).long_click()
time.sleep(0.2)


poco('btn_back').click()
time.sleep(0.2)
poco('btn_back',type='Button').click()
time.sleep(0.2)
