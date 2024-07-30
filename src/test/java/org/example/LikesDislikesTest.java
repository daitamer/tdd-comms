package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikesDislikesTest {

    LikesDislikes likesDislikes;

Reactions like = Reactions.LIKE;
Reactions dislike = Reactions.DISLIKE;
Reactions neutral = Reactions.NEUTRAL;

    @BeforeEach
    void setUp(){
        likesDislikes = new LikesDislikes();
    }

    @Test
    @DisplayName("returns the overall outcome of button presses")
    void testLikesDislike() {

//      Arrange
       Reactions[] input = new Reactions[]{like, dislike};
       Reactions[] input2 = new Reactions[]{dislike, dislike};
       Reactions[] input3 = new Reactions[]{like, like, like, dislike, like};

//       Act
        Reactions result = likesDislikes.likesDislike(input);
        Reactions result2 = likesDislikes.likesDislike(input2);
        Reactions result3 = likesDislikes.likesDislike(input3);

//        Assert
       assertAll("returns the overall outcome of button presses",
               () -> assertEquals(neutral, result),
               () -> assertEquals(neutral, result2),
               () -> assertEquals(like, result3)
               );

    }



}