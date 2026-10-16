package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dc {
    public static final int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static final void b(Context context) throws Resources.NotFoundException {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static boolean c(View view) {
        return view.getLayoutDirection() == 1;
    }
}
