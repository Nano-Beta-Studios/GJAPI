package com.nanobetastudios.GJAPI;

/**
 * <b>Trophy</b><br />
 * Represents GameJolt trophy.
 * @author Alastor
 * @since 1.0.0
 * @version 1.0.0
 */
public class Trophy extends PropertyContainer{
    public enum Difficulty {BRONZE, SILVER, GOLD, PLATINIUM};

    public enum Achieved {TRUE, FALSE, EMPTY};

    public Trophy(PropertyContainer container){
        super(container);
    }

    public String getId(){
        return getProperty("id");
    }

    public String getTitle(){
        return getProperty("title");
    }

    public String getDescription(){
        return getProperty("description");
    }

    public Difficulty getDifficulty(){
        return Difficulty.valueOf(getProperty("difficulty"));
    }

    public boolean isAchieved(){
        return !getProperty("achieved").equals("false");
    }

    public String getImageUrl(){
        return getProperty("image_url");
    }

    public String getFullTrophy(){
        return "Trophy [id=" + this.getId() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", difficulty=" + this.getDifficulty() + ", achieved=" + this.isAchieved() + "]";
    }

    public String getTrophy(){
        return "Trophy [id=" + this.getId() + ", title=" + this.getTitle() + "]";
    }
}
