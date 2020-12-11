package com.xiaopy.springfx8;

import com.xiaopy.springfx8.domain.ConfigItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiaopeiyu
 * @since 2020/12/9
 */
@Repository
public interface ConfigItemRepository extends JpaRepository<ConfigItem,String> {
}
