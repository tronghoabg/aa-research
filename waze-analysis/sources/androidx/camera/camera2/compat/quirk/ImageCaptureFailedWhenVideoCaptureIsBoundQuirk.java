package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        Companion companion = Companion;
        return companion.isBluStudioX10() || companion.isItelW6004() || companion.isVivo1805() || companion.isPositivoTwist2Pro();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public boolean workaroundBySurfaceProcessing() {
        Companion companion = Companion;
        return companion.isBluStudioX10() || companion.isItelW6004() || companion.isVivo1805() || companion.isPositivoTwist2Pro() || companion.isPixel4XLApi29() || companion.isMotoE13() || companion.isSamsungTabA8() || companion.isSamsungA53() || Device.INSTANCE.isUniSocChipsetDevice();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBluStudioX10() {
            return Device.INSTANCE.isBluDevice() && o.m("studio x10", Build.MODEL, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isItelW6004() {
            return Device.INSTANCE.isItelDevice() && o.m("itel w6004", Build.MODEL, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isMotoE13() {
            return Device.INSTANCE.isMotorolaDevice() && o.m("moto e13", Build.MODEL, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPixel4XLApi29() {
            return o.m("pixel 4 xl", Build.MODEL, true) && Build.VERSION.SDK_INT == 29;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPositivoTwist2Pro() {
            return Device.INSTANCE.isPositivoDevice() && o.m("twist 2 pro", Build.MODEL, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSamsungA53() {
            if (!Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            return o.ah(str, "SM-A536");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSamsungTabA8() {
            if (Device.INSTANCE.isSamsungDevice()) {
                return o.m("gta8", Build.DEVICE, true) || o.m("gta8wifi", Build.DEVICE, true);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isVivo1805() {
            return Device.INSTANCE.isVivoDevice() && o.m("vivo 1805", Build.MODEL, true);
        }

        public final boolean isEnabled() {
            return isBluStudioX10() || isItelW6004() || isVivo1805() || isPositivoTwist2Pro() || isPixel4XLApi29() || isMotoE13() || isSamsungTabA8() || isSamsungA53() || Device.INSTANCE.isUniSocChipsetDevice();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
