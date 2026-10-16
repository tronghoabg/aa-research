package androidx.window.layout.util;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowMetrics;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class DensityCompatHelperBaseImpl implements DensityCompatHelper {
    public static final DensityCompatHelperBaseImpl INSTANCE = new DensityCompatHelperBaseImpl();

    private DensityCompatHelperBaseImpl() {
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Configuration configuration, WindowMetrics windowMetrics) {
        x.f(configuration, "configuration");
        x.f(windowMetrics, "windowMetrics");
        return configuration.densityDpi / 160.0f;
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Context context) {
        x.f(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }
}
