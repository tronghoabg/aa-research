package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PrematureEndOfStreamVideoQuirk implements Quirk {
    public static final PrematureEndOfStreamVideoQuirk INSTANCE = new PrematureEndOfStreamVideoQuirk();
    private static final boolean isCph1931;

    static {
        isCph1931 = o.m("OPPO", Build.BRAND, true) && o.m("CPH1931", Build.MODEL, true);
    }

    private PrematureEndOfStreamVideoQuirk() {
    }

    public static final boolean load() {
        return isCph1931;
    }
}
