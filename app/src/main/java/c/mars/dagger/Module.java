package c.mars.dagger;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by mars on 10/7/15.
 */
@dagger.Module
public class Module {
    @Provides
    Part providePart(){
        return new Part("c");
    }

    @Provides @Singleton
    Model provideModel(){
        return new Model(new Part("a"), new Part("b"), 1);
    }
}
