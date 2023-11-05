package com.byd.dct.iddm.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.byd.dct.iddm.demo.entity.TableEntity;
import com.byd.dct.iddm.demo.mapper.TableMapper;
import com.byd.dct.iddm.demo.service.TableService;
import org.springframework.stereotype.Service;
/**
 * demo 表
 *
 * @author iddm
 * @date 2023-11-04 23:38:21
 */
@Service
public class TableServiceImpl extends ServiceImpl<TableMapper, TableEntity> implements TableService {
}