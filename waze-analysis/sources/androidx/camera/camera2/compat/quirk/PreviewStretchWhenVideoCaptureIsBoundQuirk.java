package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewStretchWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public /* synthetic */ boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isHuaweiP8Lite() {
            return Device.INSTANCE.isHuaweiDevice() && o.m("HUAWEI ALE-L04", Build.MODEL, true);
        }

        private final boolean isOppoA37F() {
            return Device.INSTANCE.isOppoDevice() && o.m("A37F", Build.MODEL, true);
        }

        private final boolean isSamsungJ1AceNeo() {
            return Device.INSTANCE.isSamsungDevice() && o.m("sm-j111f", Build.MODEL, true);
        }

        private final boolean isSamsungJ3() {
            return Device.INSTANCE.isSamsungDevice() && o.m("sm-j320f", Build.MODEL, true);
        }

        private final boolean isSamsungJ5() {
            return Device.INSTANCE.isSamsungDevice() && o.m("sm-j510fn", Build.MODEL, true);
        }

        private final boolean isSamsungJ7() {
            return Device.INSTANCE.isSamsungDevice() && o.m("sm-j700f", Build.MODEL, true);
        }

        public final boolean isEnabled() {
            return isHuaweiP8Lite() || isSamsungJ3() || isSamsungJ7() || isSamsungJ1AceNeo() || isOppoA37F() || isSamsungJ5();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
