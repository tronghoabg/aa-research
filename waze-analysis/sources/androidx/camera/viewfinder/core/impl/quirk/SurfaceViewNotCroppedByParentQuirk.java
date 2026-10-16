package androidx.camera.viewfinder.core.impl.quirk;

import android.os.Build;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SurfaceViewNotCroppedByParentQuirk implements Quirk {
    public static final SurfaceViewNotCroppedByParentQuirk INSTANCE = new SurfaceViewNotCroppedByParentQuirk();
    private static final String RED_MI_NOTE_10_MODEL = "M2101K7AG";
    private static final String XIAOMI = "XIAOMI";

    private SurfaceViewNotCroppedByParentQuirk() {
    }

    public static final boolean load() {
        return o.m(XIAOMI, Build.MANUFACTURER, true) && o.m(RED_MI_NOTE_10_MODEL, Build.MODEL, true);
    }
}
