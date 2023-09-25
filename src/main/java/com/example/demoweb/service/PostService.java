package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        var date1 = createDate(2023, 9, 25);
        var date2 = createDate(2022, 10, 14);
        var date3 = createDate(2023, 7, 23);
        return List.of(new Post("e>)", date1),
                new Post("Стёпа теперь джавист", date2),
                new Post("Пост №3", date3));
    }

    private Date createDate(int year, int month, int day) {
        var calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, day);
        var date = calendar.getTime();
        return Date.from(date.toInstant());
    }
}
