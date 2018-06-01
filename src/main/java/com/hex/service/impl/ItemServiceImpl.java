package com.hex.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hex.entity.TbItem;
import com.hex.mapping.TbItemMapper;
import com.hex.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(Long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}
	
	public PageInfo<TbItem> getItems(int page, int offset) {
		PageHelper.startPage(page, offset);
		List<TbItem> items = itemMapper.selectItemList();
		PageInfo<TbItem> info = new PageInfo<>(items);
		return info;
	}

}
