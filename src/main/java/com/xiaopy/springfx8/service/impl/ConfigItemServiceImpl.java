package com.xiaopy.springfx8.service.impl;

import com.xiaopy.springfx8.ConfigItemRepository;
import com.xiaopy.springfx8.domain.ConfigItem;
import com.xiaopy.springfx8.service.ConfigItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2020/12/9
 */
@Service
public class ConfigItemServiceImpl implements ConfigItemService {


    @Autowired
    private ConfigItemRepository repository;

    @Override
    @Transactional()
    public ConfigItem saveConfigItem(ConfigItem item) {
        return repository.save(item);
    }

    @Override
    public List<ConfigItem> listAll() {
        return repository.findAll();
    }
}
