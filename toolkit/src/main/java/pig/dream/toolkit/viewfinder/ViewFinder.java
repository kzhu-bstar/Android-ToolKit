package pig.dream.toolkit.viewfinder;

import android.app.Activity;
import android.view.View;

/**
 * find view by id tools
 *
 * Created by pig on 2016/12/6.
 * @author dream.pig
 * @version 1.0
 */

@SuppressWarnings("unchecked")
public class ViewFinder {
    public static <T extends View> T find(Activity act, int id) {
        return (T) act.findViewById(id);
    }

    public static <T extends View> T find(View view, int id) {
        return (T) view.findViewById(id);
    }
}
