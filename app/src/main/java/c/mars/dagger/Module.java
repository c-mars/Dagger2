package c.mars.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by Constantine Mars on 10/7/15.
 */
@dagger.Module
public class Module {
    @Provides @Singleton
    Part providePart() {
        return new Part();
    }

    @Provides
    Part[] provideParts() {
        return new Part[]{new Part("a"), new Part("b"), new Part("c")};
    }

    @Provides @Singleton
    Model provideModel() {return  new Model(new Part(), new Part());}
}
