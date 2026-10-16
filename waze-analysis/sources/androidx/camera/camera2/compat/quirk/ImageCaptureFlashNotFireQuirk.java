package androidx.camera.camera2.compat.quirk;

import h.a.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> BUILD_MODELS = i.i("itel w6004", "sm-j700m");
    private static final List<String> BUILD_MODELS_FRONT_CAMERA = i.i("sm-j700f", "sm-j710f");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata r6) {
            /*
                r5 = this;
                java.lang.String r5 = "cameraMetadata"
                h.g.b.x.f(r6, r5)
                java.util.List r5 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.access$getBUILD_MODELS_FRONT_CAMERA$cp()
                java.lang.String r0 = android.os.Build.MODEL
                java.lang.String r1 = "MODEL"
                h.g.b.x.e(r0, r1)
                java.util.Locale r2 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r2)
                java.lang.String r2 = "toLowerCase(...)"
                h.g.b.x.e(r0, r2)
                boolean r5 = r5.contains(r0)
                r0 = 1
                r3 = 0
                if (r5 == 0) goto L3b
                android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
                java.lang.String r4 = "LENS_FACING"
                h.g.b.x.e(r5, r4)
                java.lang.Object r5 = r6.get(r5)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 != 0) goto L33
                goto L3b
            L33:
                int r5 = r5.intValue()
                if (r5 != 0) goto L3b
                r5 = r0
                goto L3c
            L3b:
                r5 = r3
            L3c:
                java.util.List r6 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.access$getBUILD_MODELS$cp()
                java.lang.String r4 = android.os.Build.MODEL
                h.g.b.x.e(r4, r1)
                java.util.Locale r1 = java.util.Locale.ROOT
                java.lang.String r1 = r4.toLowerCase(r1)
                h.g.b.x.e(r1, r2)
                boolean r6 = r6.contains(r1)
                if (r5 != 0) goto L58
                if (r6 == 0) goto L57
                goto L58
            L57:
                return r3
            L58:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.Companion.isEnabled(androidx.camera.camera2.pipe.CameraMetadata):boolean");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
