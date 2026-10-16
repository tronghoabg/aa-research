package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DisableAbortCapturesOnStopQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final boolean isPocoX3ProDevice;
    private static final boolean isSamsungNote10PlusDevice;

    static {
        isSamsungNote10PlusDevice = Device.INSTANCE.isSamsungDevice() && o.m("d2q", Build.DEVICE, true);
        isPocoX3ProDevice = Device.INSTANCE.isPocoDevice() && o.m("M2102J20SG", Build.MODEL, true);
    }

    public static final boolean isEnabled() {
        return Companion.isEnabled();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return Device.INSTANCE.isTecnoDevice() || DisableAbortCapturesOnStopQuirk.isSamsungNote10PlusDevice || DisableAbortCapturesOnStopQuirk.isPocoX3ProDevice;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
