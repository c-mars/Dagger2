package c.mars.dagger;

import javax.inject.Inject;

import dagger.Lazy;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Constantine Mars on 10/7/15.
 */
@Data
@AllArgsConstructor
public class Model {

    Lazy<Part> top, bottom;
    @Inject
    Part[] parts;
    private int size = 10;

    @Inject
    Model(Lazy<Part> top, Lazy<Part> bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public String desc() {
        return top.get().getName() + ", " + bottom.get().getName();
    }
}
