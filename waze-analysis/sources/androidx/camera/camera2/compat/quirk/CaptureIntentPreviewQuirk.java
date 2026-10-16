package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CaptureIntentPreviewQuirk extends Quirk {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$workaroundByCaptureIntentPreview(CaptureIntentPreviewQuirk captureIntentPreviewQuirk) {
            return true;
        }

        public static /* synthetic */ boolean access$workaroundByCaptureIntentPreview$jd(CaptureIntentPreviewQuirk captureIntentPreviewQuirk) {
            return true;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean workaroundByCaptureIntentPreview(Quirks quirks) {
            x.f(quirks, "quirks");
            Iterator it = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
            while (it.hasNext()) {
                if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean workaroundByCaptureIntentPreview(CaptureIntentPreviewQuirk captureIntentPreviewQuirk) {
            return true;
        }
    }

    boolean workaroundByCaptureIntentPreview();
}
