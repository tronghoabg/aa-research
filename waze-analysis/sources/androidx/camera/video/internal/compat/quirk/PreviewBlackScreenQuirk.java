package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final Companion Companion = new Companion(null);
    private static final boolean isMotorolaEdge20Fusion;
    private static final boolean isSamsungSmT580;

    static {
        isMotorolaEdge20Fusion = o.m(Build.BRAND, "motorola", true) && o.m(Build.MODEL, "motorola edge 20 fusion", true);
        isSamsungSmT580 = o.m(Build.BRAND, "samsung", true) && o.m(Build.MODEL, "sm-t580", true);
    }

    public static final boolean load() {
        return Companion.load();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public /* synthetic */ boolean workaroundBySurfaceProcessing() {
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean load() {
            return PreviewBlackScreenQuirk.isMotorolaEdge20Fusion || PreviewBlackScreenQuirk.isSamsungSmT580;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
