package com.springboot.service.impl;

import com.springboot.entity.Item;
import com.springboot.mapper.ItemMapper;
import com.springboot.service.IItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 文涛
 * @since 2023-03-04
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

}
