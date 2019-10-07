package topica.linhnv5.orm.basic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import topica.linhnv5.orm.basic.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

	/**
	 * find categories by type name
	 * @param type
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@Query("SELECT obj FROM Category obj, Type t WHERE obj.typeId = t.id AND t.name=:type")
	public Page<Category> findByType(@Param("type") String type, Pageable pageable);

}
