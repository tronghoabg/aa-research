package androidx.window.layout.util;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.WindowMetrics;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface DensityCompatHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DensityCompatHelper getInstance() {
            return Build.VERSION.SDK_INT >= 34 ? DensityCompatHelperApi34Impl.INSTANCE : DensityCompatHelperBaseImpl.INSTANCE;
        }
    }

    float density(Context context);

    float density(Configuration configuration, WindowMetrics windowMetrics);
}
