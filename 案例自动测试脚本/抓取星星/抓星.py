# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android://127.0.0.1:5037/ZPF6NFRGNFWGLR4H",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本/抓取星星")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)
from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()

poco("btn_start").click()
poco("drag_and_drop").click()

# drag the "star" to the "shell"
poco('star').drag_to(poco('shell'))
