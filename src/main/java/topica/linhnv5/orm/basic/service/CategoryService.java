package topica.linhnv5.orm.basic.service;

import java.util.List;

import topica.linhnv5.orm.basic.model.Category;

public interface CategoryService {

	/**
	 * find categories by type name
	 * @param type
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<Category> findByType(String type, int pageIndex, int pageSize);

	/**
	 * Update category
	 * @param id
	 * @param name
	 */
	public void updateCategory(Long id, String name);

}
