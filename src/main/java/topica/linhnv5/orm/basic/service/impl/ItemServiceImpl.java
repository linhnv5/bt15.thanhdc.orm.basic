package topica.linhnv5.orm.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import topica.linhnv5.orm.basic.model.Item;
import topica.linhnv5.orm.basic.repository.ItemRepository;
import topica.linhnv5.orm.basic.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@SuppressWarnings("deprecation")
	@Override
	public List<Item> findByCategory(String category, int pageIndex, int pageSize) {
		return itemRepository.findByCategory(category, new PageRequest(pageIndex, pageSize)).getContent();
	}
	
}
