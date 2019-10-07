package topica.linhnv5.orm.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import topica.linhnv5.orm.basic.model.Category;
import topica.linhnv5.orm.basic.model.Item;
import topica.linhnv5.orm.basic.service.CategoryService;
import topica.linhnv5.orm.basic.service.ItemService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ItemService itemService;

	@Override
	public void run(String... args) throws Exception {
		// Test find category by type
		System.out.println("Select category by type2");
		List<Category> listOfCategory = categoryService.findByType("Type2", 0, 5);
		System.out.println("Size: "+listOfCategory.size());
		listOfCategory.forEach(cat -> System.out.println("Category "+cat.getId()+" name="+cat.getName()+" typ="+cat.getTypeId()));

		// Test find item
		System.out.println("Select item by cate4");
		List<Item> listOfItem = itemService.findByCategory("Cate4", 0, 5);
		System.out.println("Size: "+listOfItem.size());
		listOfItem.forEach(it -> System.out.println("Item "+it.getId()+" name="+it.getName()));
	}

}
