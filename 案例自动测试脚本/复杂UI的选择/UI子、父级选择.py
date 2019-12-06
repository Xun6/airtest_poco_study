# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android://127.0.0.1:5037/ZPF6NFRGNFWGLR4H",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本/复杂UI的选择")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)

from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()
poco("btn_start").click()
poco("local_positioning").click()


fish = poco('Canvas').child('plays').offspring('name')       #参数化元素‘name’，用fish表示
first_one = fish[1]       #定义第一个fish
print(first_one.get_text())  # 获取第一个fish的‘text’属性
first_one.click()

poco('btn_back').click()
time.sleep(3)
poco('btn_back').click()

