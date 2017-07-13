package com.example.android.testing.notes.dagger;

import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.data.NotesServiceApi;

import dagger.Component;

/**
 * Created by godwin on 12/7/17.
 */

@FragmentScope
@Component(modules = FragmentModule.class)
public interface FragmentComponent {

    NotesServiceApi getNoteServiceApi();

    NotesRepository getNoteRepository();

}
