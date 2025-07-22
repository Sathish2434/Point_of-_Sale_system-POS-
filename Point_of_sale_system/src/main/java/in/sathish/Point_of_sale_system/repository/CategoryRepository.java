package in.sathish.Point_of_sale_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import in.sathish.Point_of_sale_system.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByCategoryId(String categoryId);

    
}
