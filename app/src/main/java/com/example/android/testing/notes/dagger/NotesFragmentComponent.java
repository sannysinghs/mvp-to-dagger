package com.example.android.testing.notes.dagger;

import com.example.android.testing.notes.notes.NotesFragment;

import dagger.Component;

/**
 * Created by godwin on 12/7/17.
 */

@FragmentScope
@Component(modules = {NotesFragmentModule.class, FragmentModule.class})
public interface NotesFragmentComponent {
    void inject(NotesFragment notesFragment);
}
