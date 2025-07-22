package in.sathish.Point_of_sale_system.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CategoryRequest {

    private String name;
    private String description;
    private String bgColor;


}
