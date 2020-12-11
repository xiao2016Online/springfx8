package com.xiaopy.springfx8.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author xiaopeiyu
 * @since 2020/12/9
 */
@Entity
@Data
@Table(name = "t_config_item")
public class ConfigItem implements Serializable {


    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 36)
    private String id;

    private String name;

    private String value;

}
