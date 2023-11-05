insert into sys_menu ( menu_id,parent_id, path, permission, menu_type, icon, del_flag, create_time, sort_order, update_time, name)
values (1699112301747, '-1', '/demo/index', '', '0', 'icon-bangzhushouji', '0', null , '8', null , 'demo 表');

insert into sys_menu ( menu_id,parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1699112301748,1699112301747, 'iddm_demo_demo_view', '1', null, '1',  '0', null, '0', null, 'demo 表查看');

insert into sys_menu ( menu_id,parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1699112301749,1699112301747, 'iddm_demo_demo_add', '1', null, '1',  '0', null, '1', null, 'demo 表添加');

insert into sys_menu (menu_id, parent_id, permission, menu_type, path, icon,  del_flag, create_time, sort_order, update_time, name)
values (1699112301750,1699112301747, 'iddm_demo_demo_edit', '1', null, '1',  '0', null, '2', null, 'demo 表编辑');

insert into sys_menu (menu_id, parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1699112301751,1699112301747, 'iddm_demo_demo_del', '1', null, '1',  '0', null, '3', null, 'demo 表删除');

insert into sys_menu ( menu_id,parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1699112301752,1699112301747, 'iddm_demo_demo_export', '1', null, '1',  '0', null, '3', null, 'demo表导出');
