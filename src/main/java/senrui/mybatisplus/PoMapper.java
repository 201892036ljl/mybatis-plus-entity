package senrui.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PoMapper<T> {
    /**
     * 查询列表
     * @param queryWrapper
     * @return
     */
    List<T> selectPoList(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

    /**
     * 查询单个Po， 多条记录会报错
     * @param queryWrapper
     * @return
     */
    T selectPoOne(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

    /**
     * 分页查询Po
     * @param page
     * @param queryWrapper
     * @return
     */
    IPage<T> selectPoPage(IPage<T> page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
}
