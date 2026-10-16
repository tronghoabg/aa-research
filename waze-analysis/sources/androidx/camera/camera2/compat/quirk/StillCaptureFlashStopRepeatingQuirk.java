package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.g.b.x;
import h.n.o;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StillCaptureFlashStopRepeatingQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            if (!Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            return o.ah(upperCase, "SM-A716");
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
