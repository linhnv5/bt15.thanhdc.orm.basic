package topica.linhnv5.orm.basic.service;

import java.util.List;

import topica.linhnv5.orm.basic.model.Item;

public interface ItemService {

	/**
	 * find items by category’s name
	 * @param category
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<Item> findByCategory(String category, int pageIndex, int pageSize);

}
