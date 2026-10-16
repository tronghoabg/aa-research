package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface BoundsHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG;

        static {
            x.e("BoundsHelper", "getSimpleName(...)");
            TAG = "BoundsHelper";
        }

        private Companion() {
        }

        public final BoundsHelper getInstance() {
            return Build.VERSION.SDK_INT >= 30 ? BoundsHelperApi30Impl.INSTANCE : BoundsHelperApi29Impl.INSTANCE;
        }

        public final String getTAG() {
            return TAG;
        }
    }

    Rect currentWindowBounds(Activity activity);

    Rect maximumWindowBounds(Context context);
}
