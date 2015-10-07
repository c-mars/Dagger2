package c.mars.dagger;

import javax.inject.Inject;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Constantine Mars on 10/7/15.
 */
@Data
@AllArgsConstructor
public class Part {
    private String name = "default";

    @Inject
    public Part() {
        name = "injected part";
    }
}
