package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.layout.WindowMetrics;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WindowMetricsCompatHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final WindowMetricsCompatHelper getInstance() {
            return Build.VERSION.SDK_INT >= 34 ? WindowMetricsCompatHelperApi34Impl.INSTANCE : Build.VERSION.SDK_INT >= 30 ? WindowMetricsCompatHelperApi30Impl.INSTANCE : WindowMetricsCompatHelperBaseImpl.INSTANCE;
        }
    }

    WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper);

    WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper);

    WindowMetrics maximumWindowMetrics(Context context, DensityCompatHelper densityCompatHelper);

    WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float f2);
}
