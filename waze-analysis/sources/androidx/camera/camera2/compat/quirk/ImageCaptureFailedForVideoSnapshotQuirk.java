package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import e.c.d.a;
import h.g.b.x;
import h.n.o;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCaptureFailedForVideoSnapshotQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> PROBLEMATIC_UNI_SOC_MODELS = a.r("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isHuaweiPSmart() {
            return Device.INSTANCE.isHuaweiDevice() && o.m("FIG-LX1", Build.MODEL, true);
        }

        private final boolean isProblematicUniSocChipsetDevice() {
            Set set = ImageCaptureFailedForVideoSnapshotQuirk.PROBLEMATIC_UNI_SOC_MODELS;
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            return set.contains(lowerCase);
        }

        public final boolean isEnabled() {
            return isProblematicUniSocChipsetDevice() || Device.INSTANCE.isUniSocChipsetDevice() || isHuaweiPSmart();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
