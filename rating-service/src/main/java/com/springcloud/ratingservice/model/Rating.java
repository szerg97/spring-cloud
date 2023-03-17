package com.springcloud.ratingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private long id;
    private long bookId;
    private int stars;
}
