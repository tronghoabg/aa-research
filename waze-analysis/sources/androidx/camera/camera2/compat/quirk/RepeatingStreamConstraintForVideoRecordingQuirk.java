package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RepeatingStreamConstraintForVideoRecordingQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isHuaweiMate9() {
            return Device.INSTANCE.isHuaweiDevice() && o.m("mha-l29", Build.MODEL, true);
        }

        public final boolean isEnabled() {
            return isHuaweiMate9();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
