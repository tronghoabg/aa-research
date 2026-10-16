package androidx.camera.viewfinder.core.impl.quirk;

import android.os.Build;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SurfaceViewStretchedQuirk implements Quirk {
    private static final String GALAXY_Z_FOLD_2 = "F2Q";
    private static final String GALAXY_Z_FOLD_3 = "Q2Q";
    public static final SurfaceViewStretchedQuirk INSTANCE = new SurfaceViewStretchedQuirk();
    private static final String LENOVO = "LENOVO";
    private static final String LENOVO_TAB_P12_PRO = "Q706F";
    private static final String OPPO = "OPPO";
    private static final String OPPO_FIND_N = "OP4E75L1";
    private static final String SAMSUNG = "SAMSUNG";

    private SurfaceViewStretchedQuirk() {
    }

    private final boolean isLenovoTablet() {
        return o.m(LENOVO, Build.MANUFACTURER, true) && o.m(LENOVO_TAB_P12_PRO, Build.DEVICE, true);
    }

    private final boolean isOppoFoldable() {
        return o.m(OPPO, Build.MANUFACTURER, true) && o.m(OPPO_FIND_N, Build.DEVICE, true);
    }

    private final boolean isSamsungFold2OrFold3() {
        if (o.m(SAMSUNG, Build.MANUFACTURER, true)) {
            return o.m(GALAXY_Z_FOLD_2, Build.DEVICE, true) || o.m(GALAXY_Z_FOLD_3, Build.DEVICE, true);
        }
        return false;
    }

    public static final boolean load() {
        if (Build.VERSION.SDK_INT >= 33) {
            return false;
        }
        SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = INSTANCE;
        return surfaceViewStretchedQuirk.isSamsungFold2OrFold3() || surfaceViewStretchedQuirk.isOppoFoldable() || surfaceViewStretchedQuirk.isLenovoTablet();
    }
}
