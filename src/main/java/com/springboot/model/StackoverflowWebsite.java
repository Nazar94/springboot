package com.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *in modelclass creates model of our entity with data
 * in this case it will be body with datas:
 *         $scope.websites = [{
 iconImageUrl: '',
 id: 'stackoverflow',
 website: 'stackoverflow.com',
 title: 'Stackoverflow website',
 description: 'StackOverflow description'
 }];
 */
/*@Document-annotation for admiring pojo like document mongo*/
@Document
public class StackoverflowWebsite {
//all variables names must be the same like in JSON
    /*
        $scope.websites = [{
        iconImageUrl: '',
        id: 'stackoverflow',
        website: 'stackoverflow.com',
        title: 'Stackoverflow website',
        description: 'StackOverflow description'
    }];
    */
    @Id/*@id annotation for identifier*/
    private final String id;
    private final String website;
    private final String iconImageUrl;
    private final String title;
    private final String description;

    public StackoverflowWebsite(String id, String website, String iconImageUrl, String title, String description) {
        this.id = id;
        this.website = website;
        this.iconImageUrl = iconImageUrl;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
