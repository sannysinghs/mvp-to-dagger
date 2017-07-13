package com.example.android.testing.notes.dagger;

import com.example.android.testing.notes.data.InMemoryNotesRepository;
import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.data.NotesServiceApi;
import com.example.android.testing.notes.data.NotesServiceApiImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by godwin on 12/7/17.
 */

@FragmentScope
@Module
public class FragmentModule {

    @Provides
    @FragmentScope
    public NotesServiceApi provideServiceApi(){
        return new NotesServiceApiImpl();
    }

    @Provides
    @FragmentScope
    public NotesRepository provideNotesRepository(NotesServiceApi api){
        return new InMemoryNotesRepository(api);
    }

}
