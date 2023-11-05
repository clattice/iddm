package com.byd.dct.iddm.demo.controller;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byd.dct.iddm.common.core.util.R;
import com.byd.dct.iddm.common.log.annotation.SysLog;
import com.byd.dct.iddm.demo.entity.TableEntity;
import com.byd.dct.iddm.demo.service.TableService;
import org.springframework.security.access.prepost.PreAuthorize;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpHeaders;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * demo 表
 *
 * @author iddm
 * @date 2023-11-04 23:38:21
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/table" )
@Tag(description = "demo" , name = "demo 表" )
@SecurityRequirement(name = HttpHeaders.AUTHORIZATION)
public class TableController {

    private final TableService tableService;

    /**
     * åˆ†é¡µæŸ¥è¯¢
     * @param page åˆ†é¡µå¯¹è±¡
     * @param demo demo 表
     * @return
     */
    @Operation(summary = "1111111111" , description = "111111111" )
    @GetMapping("/page" )
    @PreAuthorize("@pms.hasPermission('iddm_demo_demo_view')" )
    public R getDemoPage(@ParameterObject Page page, @ParameterObject TableEntity demo) {
        LambdaQueryWrapper<TableEntity> wrapper = Wrappers.lambdaQuery();
        return R.ok(tableService.page(page, wrapper));
    }


    /**
     * é€šè¿‡idæŸ¥è¯¢demo 表
     * @param id id
     * @return R
     */
    @Operation(summary = "22222222222" , description = "22222222" )
    @GetMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('iddm_demo_demo_view')" )
    public R getById(@PathVariable("id" ) Long id) {
        return R.ok(tableService.getById(id));
    }

    /**
     * æ–°å¢ždemo 表
     * @param demo demo 表
     * @return R
     */
    @Operation(summary = "demo 表" , description = "demo 表" )
    @SysLog("demo 表" )
    @PostMapping
    @PreAuthorize("@pms.hasPermission('iddm_demo_demo_add')" )
    public R save(@RequestBody TableEntity demo) {
        return R.ok(tableService.save(demo));
    }

    /**
     * ä¿®æ”¹demo 表
     * @param demo demo 表
     * @return R
     */
    @Operation(summary = "demo 表" , description = "demo 表" )
    @SysLog("ä¿®æ”¹demo 表" )
    @PutMapping
    @PreAuthorize("@pms.hasPermission('iddm_demo_demo_edit')" )
    public R updateById(@RequestBody TableEntity demo) {
        return R.ok(tableService.updateById(demo));
    }

    /**
     * é€šè¿‡idåˆ é™¤demo 表
     * @param ids idåˆ—è¡¨
     * @return R
     */
    @Operation(summary = "emo 表" , description = "emo 表" )
    @SysLog("é€šè¿‡idåˆ é™¤demo 表" )
    @DeleteMapping
    @PreAuthorize("@pms.hasPermission('iddm_demo_demo_del')" )
    public R removeById(@RequestBody Long[] ids) {
        return R.ok(tableService.removeBatchByIds(CollUtil.toList(ids)));
    }


    /**
     * å¯¼å‡ºexcel è¡¨æ ¼
     * @param demo æŸ¥è¯¢æ¡ä»¶
   	 * @param ids å¯¼å‡ºæŒ‡å®šID
     * @return excel æ–‡ä»¶æµ
     */
    @ResponseExcel
    @GetMapping("/export")
    @PreAuthorize("@pms.hasPermission('iddm_demo_demo_export')" )
    public List<TableEntity> export(TableEntity demo, Long[] ids) {
        return tableService.list(Wrappers.lambdaQuery(demo).in(ArrayUtil.isNotEmpty(ids), TableEntity::getId, ids));
    }
}