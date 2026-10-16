package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isMotorolaMotoG3() {
            return Device.INSTANCE.isMotorolaDevice() && o.m("MotoG3", Build.MODEL, true);
        }

        private final boolean isSamsungSMA920F() {
            return Device.INSTANCE.isSamsungDevice() && o.m("SM-A920F", Build.MODEL, true);
        }

        private final boolean isSamsungSMG532F() {
            return Device.INSTANCE.isSamsungDevice() && o.m("SM-G532F", Build.MODEL, true);
        }

        private final boolean isSamsungSMJ415F() {
            return Device.INSTANCE.isSamsungDevice() && o.m("SM-J415F", Build.MODEL, true);
        }

        private final boolean isSamsungSMJ700F() {
            return Device.INSTANCE.isSamsungDevice() && o.m("SM-J700F", Build.MODEL, true);
        }

        private final boolean isXiaomiMiA1() {
            return Device.INSTANCE.isXiaomiDevice() && o.m("Mi A1", Build.MODEL, true);
        }

        public final boolean isEnabled() {
            return isMotorolaMotoG3() || isSamsungSMG532F() || isSamsungSMJ700F() || isSamsungSMA920F() || isSamsungSMJ415F() || isXiaomiMiA1();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
