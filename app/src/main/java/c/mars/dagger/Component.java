package c.mars.dagger;

import android.content.Context;

import javax.inject.Singleton;

/**
 * Created by mars on 10/7/15.
 */
@Singleton @dagger.Component(modules = {Module.class})
public interface Component {
    Model model();
    void inject(MainActivity context);
}
