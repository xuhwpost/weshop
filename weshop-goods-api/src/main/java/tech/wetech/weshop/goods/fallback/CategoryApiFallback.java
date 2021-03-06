package tech.wetech.weshop.goods.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.fallback.ApiFallback;
import tech.wetech.weshop.goods.api.CategoryApi;
import tech.wetech.weshop.goods.dto.CategoryDTO;
import tech.wetech.weshop.goods.dto.CategoryIndexDTO;
import tech.wetech.weshop.goods.enums.CategoryLevelEnum;
import tech.wetech.weshop.goods.po.Category;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class CategoryApiFallback extends ApiFallback<Category> implements CategoryApi {
    @Override
    public Result<List<Category>> queryCategoryByLevel(CategoryLevelEnum categoryLevel) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<CategoryIndexDTO> index(Integer cateogyId) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<CategoryDTO> current(Integer id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
