package com.byd.dct.iddm.admin.api.feign;

import com.byd.dct.iddm.admin.api.entity.SysDictItem;
import com.byd.dct.iddm.common.core.constant.ServiceNameConstants;
import com.byd.dct.iddm.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author lengleng
 * @date 2020/5/12
 * <p>
 * 查询参数相关
 */
@FeignClient(contextId = "remoteDictService", value = ServiceNameConstants.UPMS_SERVICE)
public interface RemoteDictService {

	/**
	 * 通过字典类型查找字典
	 * @param type 字典类型
	 * @return 同类型字典
	 */
	@GetMapping("/dict/type/{type}")
	R<List<SysDictItem>> getDictByType(@PathVariable("type") String type);

}