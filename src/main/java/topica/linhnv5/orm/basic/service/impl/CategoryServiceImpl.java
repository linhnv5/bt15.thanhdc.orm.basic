package topica.linhnv5.orm.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import topica.linhnv5.orm.basic.model.Category;
import topica.linhnv5.orm.basic.repository.CategoryRepository;
import topica.linhnv5.orm.basic.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@SuppressWarnings("deprecation")
	@Override
	public List<Category> findByType(String type, int pageIndex, int pageSize) {
		return categoryRepository.findByType(type, new PageRequest(pageIndex, pageSize)).getContent();
	}

	@Override
	public void updateCategory(Long id, String name) {
		Category cat = categoryRepository.findById(id).get();
		if (cat != null) {
			cat.setName(name);
			categoryRepository.save(cat);
		}
	}

}
