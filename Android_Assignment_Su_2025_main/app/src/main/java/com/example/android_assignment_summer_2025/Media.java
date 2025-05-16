package com.example.android_assignment_summer_2025;
// DO NOT MODIFY THIS CLASS
public class Media {
    private String media;
    private boolean isCompleted;

    public Media(String media) {
        this.media = media;
        this.isCompleted = false;
    }

    public String getDescription() {
        return media;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompletionStatus( boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}
