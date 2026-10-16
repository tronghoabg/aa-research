package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final boolean isSamsungExynos7570Device = x.n(Build.HARDWARE, "samsungexynos7570");
    private static final boolean isSamsungExynos7870Device = x.n(Build.HARDWARE, "samsungexynos7870");
    private static final boolean isSamsungProblematicDevice;
    private static final boolean isSonyProblematicDevice;
    private static final boolean isXiaomiProblematicDevice;

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    static {
        /*
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk$Companion r0 = new androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.Companion = r0
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7570"
            boolean r0 = h.g.b.x.n(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device = r0
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7870"
            boolean r0 = h.g.b.x.n(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7870Device = r0
            androidx.camera.camera2.compat.quirk.Device r0 = androidx.camera.camera2.compat.quirk.Device.INSTANCE
            boolean r0 = r0.isXiaomiDevice()
            java.lang.String r1 = "DEVICE"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L48
            java.lang.String r0 = "aurora"
            java.lang.String r4 = "houji"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.lang.String r4 = android.os.Build.DEVICE
            h.g.b.x.e(r4, r1)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "toLowerCase(...)"
            h.g.b.x.e(r4, r5)
            boolean r0 = h.a.c.aj(r0, r4)
            if (r0 == 0) goto L48
            r0 = r2
            goto L49
        L48:
            r0 = r3
        L49:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isXiaomiProblematicDevice = r0
            androidx.camera.camera2.compat.quirk.Device r0 = androidx.camera.camera2.compat.quirk.Device.INSTANCE
            boolean r0 = r0.isSonyDevice()
            if (r0 == 0) goto L8e
            java.lang.String r0 = "SO"
            java.lang.String r4 = "A301SO"
            java.lang.String r5 = "XQ-DQ"
            java.lang.String[] r0 = new java.lang.String[]{r5, r0, r4}
            java.util.List r0 = h.a.i.i(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L71
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L71
            goto L8e
        L71:
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.DEVICE
            h.g.b.x.e(r5, r1)
            boolean r4 = h.n.o.o(r5, r4, r2)
            if (r4 == 0) goto L75
            r0 = r2
            goto L8f
        L8e:
            r0 = r3
        L8f:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSonyProblematicDevice = r0
            androidx.camera.camera2.compat.quirk.Device r0 = androidx.camera.camera2.compat.quirk.Device.INSTANCE
            boolean r0 = r0.isSamsungDevice()
            if (r0 == 0) goto La6
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La6
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 > r1) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungProblematicDevice = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.<clinit>():void");
    }

    public static final boolean isEnabled() {
        return Companion.isEnabled();
    }

    public final boolean shouldCloseCameraDevice(boolean z) {
        if (isXiaomiProblematicDevice || !(!isSamsungProblematicDevice || isSamsungExynos7570Device || isSamsungExynos7870Device)) {
            return z;
        }
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            if (CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device || CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7870Device) {
                return true;
            }
            int i2 = Build.VERSION.SDK_INT;
            return (i2 >= 30 && i2 < 34 && (Device.INSTANCE.isOppoDevice() || Device.INSTANCE.isOnePlusDevice() || Device.INSTANCE.isRealmeDevice())) || Device.INSTANCE.isVivoDevice() || CloseCameraDeviceOnCameraGraphCloseQuirk.isXiaomiProblematicDevice || CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungProblematicDevice || CloseCameraDeviceOnCameraGraphCloseQuirk.isSonyProblematicDevice;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
