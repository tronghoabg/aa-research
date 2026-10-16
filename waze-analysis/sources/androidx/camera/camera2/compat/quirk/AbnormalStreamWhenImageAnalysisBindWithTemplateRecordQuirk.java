package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        return Companion.isSamsungM55();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSamsungM55() {
            return Device.INSTANCE.isSamsungDevice() && o.m(Build.DEVICE, "m55xq", true);
        }

        public final boolean isEnabled() {
            return isSamsungM55();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
