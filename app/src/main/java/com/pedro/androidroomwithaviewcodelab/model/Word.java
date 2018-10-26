package com.pedro.androidroomwithaviewcodelab.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table",
        indices = {@Index(value = {"word"},
        unique = true)})
public class Word
{
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word) {this.mWord = word;}

    public int getId() {
        return id;
    }

    public String getWord(){return this.mWord;}

}
