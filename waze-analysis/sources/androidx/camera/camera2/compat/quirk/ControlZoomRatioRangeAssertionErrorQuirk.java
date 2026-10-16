package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ControlZoomRatioRangeAssertionErrorQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isJioPhoneNext() {
            if (!Device.INSTANCE.isJioDevice()) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            return o.o(str, "LS1542QW", true);
        }

        private final boolean isSamsungA2s() {
            if (!Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            return o.o(str, "SM-A025", true) || o.m(Build.MODEL, "SM-S124DL", true);
        }

        private final boolean isVivo2039() {
            return Device.INSTANCE.isVivoDevice() && o.m(Build.MODEL, "VIVO 2039", true);
        }

        public final boolean isEnabled() {
            return isJioPhoneNext() || isSamsungA2s() || isVivo2039();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
