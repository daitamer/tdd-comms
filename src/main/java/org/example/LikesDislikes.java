package org.example;

public class LikesDislikes {

    Reactions like = Reactions.LIKE;
    Reactions dislike = Reactions.DISLIKE;
    Reactions neutral = Reactions.NEUTRAL;

    public Reactions likesDislike(Reactions[] reactions){

        Reactions result;

        if (reactions.length % 2 == 0){
            return neutral;
        }

        int countLikes = 0;
        int countDislikes = 0;

for (Reactions reaction : reactions){
    if (reaction.equals(like)){
        countLikes++;
    } else {
        countDislikes++;
    }
}

if (countLikes > countDislikes){
    return Reactions.LIKE;
} else {
    return Reactions.DISLIKE;
}
    }

}
