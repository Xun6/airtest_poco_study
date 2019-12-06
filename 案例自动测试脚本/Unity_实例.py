# -*- encoding=utf8 -*-
__author__ = "Administrator"

from airtest.core.api import *
from airtest.cli.parser import cli_setup

if not cli_setup():
    auto_setup(__file__, logdir=True, devices=[
            "Android:///",
    ], project_root="C:/Users/Administrator/Desktop/天启自动测试脚本")


# script content
print("start...")


# generate html report
# from airtest.report.report import simple_report
# simple_report(__file__, logpath=True)

from poco.drivers.unity3d import UnityPoco
poco = UnityPoco()

poco("btn_start").click()
poco("basic").click()

star = poco('star_single')    #参数化‘star’
if star.exists():             #判断‘star’是否存在
    pos = star.get_position()
    input_field = poco('pos_input')         #定义、参数化‘input_field’
    time.sleep(1)
    input_field.set_text('x={:.02f}, y={:.02f}'.format(*pos))  # very fast
    time.sleep(3)

title = poco('title').get_text()          #参数化‘title’，并获取title的属性
if title == 'Basic test':                 #判断‘title’的属性是否等于‘Basic test’
    back = poco('btn_back', type='Button')   #多属性参数化‘back’
    back.click()                            
    back.click()
    





