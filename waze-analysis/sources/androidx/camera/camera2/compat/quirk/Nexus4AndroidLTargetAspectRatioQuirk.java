package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.impl.Quirk;
import h.a.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Nexus4AndroidLTargetAspectRatioQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> DEVICE_MODELS = i.d("NEXUS 4");

    public final int getCorrectedAspectRatio() {
        return 2;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            Device.INSTANCE.isGoogleDevice();
            return false;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
