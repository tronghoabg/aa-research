package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewUnderExposureQuirk implements Quirk {
    public static final PreviewUnderExposureQuirk INSTANCE = new PreviewUnderExposureQuirk();
    private static final boolean isTclDevice = o.m(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }

    public static final boolean load() {
        return isTclDevice;
    }
}
