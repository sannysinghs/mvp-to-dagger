package com.example.android.testing.notes.dagger;

import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.notes.NotesContract;
import com.example.android.testing.notes.notes.NotesPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by godwin on 12/7/17.
 */
@FragmentScope
@Module
public class NotesFragmentModule {

    private final NotesContract.View view;
    public NotesFragmentModule(NotesContract.View view) {
        this.view = view;

    }

    @Provides
    @FragmentScope
    public NotesContract.View provideNotesContractView(){
        return view;
    }

    @Provides
    @FragmentScope
    public NotesContract.UserActionsListener provideNotesPresenter(NotesRepository repo, NotesContract.View view){
        return new NotesPresenter(repo, view);
    }
}
