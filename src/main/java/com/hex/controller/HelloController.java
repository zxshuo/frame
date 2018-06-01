package com.hex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.hex.entity.TbItem;
import com.hex.service.ItemService;

@Controller
public class HelloController {
	
	@Autowired
	private ItemService itemService;

	@ResponseBody
	@RequestMapping(value="/item/{itemId}")
	public TbItem getItem(@PathVariable Long itemId) {
		
		return itemService.getItemById(itemId);
	}
	
	@ResponseBody
	@RequestMapping(value="/items")
	public PageInfo<TbItem> getItems() {
		
		return itemService.getItems(1, 30);
	}

	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}

}
