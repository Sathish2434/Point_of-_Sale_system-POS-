package in.sathish.Point_of_sale_system.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.sathish.Point_of_sale_system.io.CategoryRequest;
import in.sathish.Point_of_sale_system.io.CategoryResponse;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file);

    List<CategoryResponse> read();

    void delete(String categoryId);

}
