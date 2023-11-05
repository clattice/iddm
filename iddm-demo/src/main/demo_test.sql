-- 创建测试库
create database `iddm_demo` default character set utf8mb4 collate utf8mb4_general_ci;

USE iddm_demo;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- 创建测试表
DROP TABLE IF EXISTS `demo`;

CREATE TABLE `demo` (
                        `id` bigint NOT NULL COMMENT '主键',
                        `username` varchar(255) DEFAULT NULL COMMENT '用户名',
                        `nicename` varchar(255) DEFAULT NULL COMMENT '昵称',
                        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                        `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
                        `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                        `update_by` varchar(64) DEFAULT NULL COMMENT '更新人',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='demo 表';