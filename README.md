### 基于SpringBoot + Vue的企业管理系统.

企业系统、协同办公、人力资源系统、智慧办公平台

###### 管理员：
企业管理、待办任务、考勤记录、会议记录、部门管理、共享文档、财务申请、留言问题、请假申请、消息信息、用户通知、岗位管理、员工管理。

###### 企业：
企业信息、员工待办、考勤记录、会议记录、部门管理、文件管理、财务审核、留言记录、请假审核、消息记录、员工通知、岗位管理、员工管理、财务支付。

###### 员工：
我的考勤、我的任务、会议记录、共享文件、财务申请、留言发布、请假申请、员工沟通、我的消息。

##### 组织架构与人力资源
###### 部门/岗位管理： 灵活搭建企业多级组织架构，明确岗位职责权限，实现人力资源的标准化管理。

###### 员工管理/档案： 全面记录员工入职至离职的全生命周期信息，支撑企业人才梯队建设与调度。

###### 企业信息/通知： 统一维护企业百科并下发官方公告，确保核心价值观与重要政令精准传达。

##### 考勤管理与任务协同
###### 考勤记录/我的： 自动化汇总打卡数据，支持异常记录实时查看，为薪酬计算提供客观数据依据。

###### 待办任务/我的： 系统化梳理工作清单，支持任务分解与进度追踪，确保企业各项业务高效闭环。

###### 会议记录/纪要： 实现会议全过程数字化，在线存档决策内容，方便员工随时回溯工作重点。

##### 行政审批与财务管控
###### 请假申请/审核： 规范化处理各类假期事务，支持移动审批流转，自动关联考勤系统扣减。

###### 财务申请/审核： 数字化报销与款项申领流程，强化预算执行监控，确保每一笔支出合规透明。

###### 财务支付： 管理端直接对接结算环节，记录支付流水，实现财务收支的高效协同与存档。

##### 信息共享与沟通交互
###### 共享文档/文件： 建立企业级知识库，支持跨部门资料安全共享，沉淀企业核心数字化资产。

###### 留言发布/记录： 提供内民主反馈渠道，及时收集员工意见与问题，优化企业内部管理环境。

###### 员工沟通/消息： 整合即时通讯与系统提醒，确保任务变更、审批动态等关键信息实时触达。

##### 数据统计与运营分析
###### 数据看板（管理员）： 聚合考勤、任务及财务等多维数据，通过可视化报表辅助管理层科学决策。

#### 安装环境

JAVA 环境 

Node.js环境 [https://nodejs.org/en/] 选择14.17

Yarn 打开cmd， 输入npm install -g yarn !!!必须安装完毕nodejs

Mysql 数据库 [https://blog.csdn.net/qq_40303031/article/details/88935262] 一定要把账户和密码记住

redis

Idea 编译器 [https://blog.csdn.net/weixin_44505194/article/details/104452880]

WebStorm OR VScode 编译器 [https://www.jianshu.com/p/d63b5bae9dff]

#### 采用技术及功能

后端：SpringBoot、MybatisPlus、MySQL、Redis、
前端：Vue、Apex、Antd、Axios

平台前端：vue(框架) + vuex(全局缓存) + rue-router(路由) + axios(请求插件) + apex(图表)  + antd-ui(ui组件)

平台后台：springboot(框架) + redis(缓存中间件) + shiro(权限中间件) + mybatisplus(orm) + restful风格接口 + mysql(数据库)

开发环境：windows10 or windows7 ， vscode or webstorm ， idea + lambok


#### 前台启动方式
安装所需文件 yarn install 
运行 yarn run dev

#### 默认后台账户密码
[管理员]
admin
1234qwer

#### 项目截图
暂无

|  |  |
|---------------------|---------------------|
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/14c753fa-69f4-42c3-b430-1cf15fca2da1.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/c0f96ed5-610b-4bc9-b30e-12028019e04e.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/5ef01542-7d3e-4ce5-845a-d98efcbaee7a.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/bdc965b1-36fe-40f9-9e9c-fca2418aad3b.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/2ed78898-7d8b-4907-bdfa-fc51f4adddbd.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/b1cf3b1b-79e0-4975-926f-a94d45a0b236.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/2e48c3f9-6d86-4e93-8433-ed9ada7407a0.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/48224723-f251-4c82-8df1-b23117d687c9.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/0b5d2080-abd7-4dd7-a0a4-09d6966c1e4e.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1073f6c3-8b59-44ee-aa7f-eeef3e347412.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/fea39d07-6afc-4112-9185-221f41c6ba24.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/527b42f9-3e65-4881-a967-03256f36fc27.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/fde6e4af-3ed4-407a-868f-cbbec7476c26.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/75eafcf2-77a3-433a-a9e0-08c280693dc8.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/e1db2d62-ff1e-4617-9609-c0218c26ee15.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/44a1a514-0759-4a4e-8981-fcd26ff8c4de.png) |

![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/work/936e9baf53eb9a217af4f89c616dc19.png)

#### 演示视频

暂无

#### 获取方式

Email: fan1ke2ke@gmail.com

WeChat: `Storm_Berserker`

`附带部署与讲解服务，因为要恰饭资源非免费，伸手党勿扰，谢谢理解😭`

> 1.项目纯原创，不做二手贩子 2.一次购买终身有效 3.项目讲解持续到答辩结束 4.非常负责的答辩指导 5.**黑奴价格**

> 项目部署调试不好包退！功能逻辑没讲明白包退！

#### 其它资源

[2025年-答辩顺利通过-客户评价🍜](https://berserker287.github.io/2025/06/18/2025%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2024年-答辩顺利通过-客户评价👻](https://berserker287.github.io/2024/06/06/2024%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2023年-答辩顺利通过-客户评价🐢](https://berserker287.github.io/2023/06/14/2023%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2022年-答辩通过率100%-客户评价🐣](https://berserker287.github.io/2022/05/25/%E9%A1%B9%E7%9B%AE%E4%BA%A4%E6%98%93%E8%AE%B0%E5%BD%95/)

[毕业答辩导师提问的高频问题](https://berserker287.github.io/2023/06/13/%E6%AF%95%E4%B8%9A%E7%AD%94%E8%BE%A9%E5%AF%BC%E5%B8%88%E6%8F%90%E9%97%AE%E7%9A%84%E9%AB%98%E9%A2%91%E9%97%AE%E9%A2%98/)

[50个高频答辩问题-技术篇](https://berserker287.github.io/2023/06/13/50%E4%B8%AA%E9%AB%98%E9%A2%91%E7%AD%94%E8%BE%A9%E9%97%AE%E9%A2%98-%E6%8A%80%E6%9C%AF%E7%AF%87/)

[计算机毕设答辩时都会问到哪些问题？](https://www.zhihu.com/question/31020988)

[计算机专业毕业答辩小tips](https://zhuanlan.zhihu.com/p/145911029)

#### 接JAVAWEB毕设，纯原创，价格公道，诚信第一

`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)

<p><img align="center" src="https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/%E5%90%88%E4%BD%9C%E7%89%A9%E6%96%99%E6%A0%B7%E5%BC%8F%20(3).png" alt="fankekeke" /></p>
