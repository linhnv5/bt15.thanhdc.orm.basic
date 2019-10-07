package topica.linhnv5.orm.basic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import topica.linhnv5.orm.basic.model.Item;

public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

	/**
	 * find items by category’s name
	 * @param category
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@Query("SELECT obj FROM Item obj, ItemCategory ic, Category c WHERE ic.itemId = obj.id AND ic.categoryId=c.id AND c.name=:category")
	public Page<Item> findByCategory(@Param("category") String category, Pageable pageable);

}
