package c.mars.dagger;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by mars on 10/7/15.
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
}
