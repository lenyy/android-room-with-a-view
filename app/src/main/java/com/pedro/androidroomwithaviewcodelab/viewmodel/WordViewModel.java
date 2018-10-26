package com.pedro.androidroomwithaviewcodelab.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.pedro.androidroomwithaviewcodelab.model.Word;
import com.pedro.androidroomwithaviewcodelab.repositories.WordRepository;

import java.util.List;

public class WordViewModel extends AndroidViewModel
{
    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }


    public LiveData<List<Word>> getAllWords() { return mAllWords; }

    public void insert(Word word) { mRepository.insert(word); }

}