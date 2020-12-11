package com.xiaopy.springfx8.service;

import com.xiaopy.springfx8.domain.ConfigItem;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2020/12/9
 */
public interface ConfigItemService {
    ConfigItem saveConfigItem(ConfigItem item);

    List<ConfigItem> listAll();
}
