package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewDelayWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public /* synthetic */ boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public /* synthetic */ boolean workaroundBySurfaceProcessing() {
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return Device.INSTANCE.isHuaweiDevice();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
