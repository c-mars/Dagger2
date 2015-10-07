package c.mars.dagger;

import javax.inject.Inject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Created by mars on 10/7/15.
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class Model {
    @Inject
    Part top, bottom;

    private int size = 10;
}
