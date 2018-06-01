package com.hex.service;

import com.github.pagehelper.PageInfo;
import com.hex.entity.TbItem;

public interface ItemService {
	
	public TbItem getItemById(Long itemId);
	
	public PageInfo<TbItem> getItems(int page, int offset);

}
