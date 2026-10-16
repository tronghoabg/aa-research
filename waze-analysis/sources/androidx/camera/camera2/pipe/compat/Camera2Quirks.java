package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StrictMode;
import h.a.r;
import h.g.b.x;
import h.i;
import h.k;
import h.n.o;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Quirks {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Set<String>> SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP = r.e(new k("Google", e.c.d.a.r("oriole", "raven", "bluejay", "panther", "cheetah", "lynx")));
    private static final Map<String, Set<String>> SM8150_DEVICES = r.k(new k("google", e.c.d.a.r("pixel 4", "pixel 4 xl")), new k("samsung", e.c.d.a.o("sm-g770f")));
    private final Camera2MetadataProvider metadataProvider;
    private final StrictMode strictMode;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.values().length];
            try {
                iArr[CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.EXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Camera2Quirks(Camera2MetadataProvider camera2MetadataProvider, StrictMode strictMode) {
        x.f(camera2MetadataProvider, "metadataProvider");
        x.f(strictMode, "strictMode");
        this.metadataProvider = camera2MetadataProvider;
        this.strictMode = strictMode;
    }

    public final int getRepeatingRequestFrameCountForCapture$camera_camera2_pipe(CameraGraph.Flags flags) {
        x.f(flags, "graphConfigFlags");
        int iMax = 0;
        if (this.strictMode.getEnabled()) {
            return 0;
        }
        CameraGraph.RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture = flags.getAwaitRepeatingRequestBeforeCapture();
        Set<String> set = SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP.get(Build.MANUFACTURER);
        if (set != null && set.contains(Build.DEVICE) && Build.VERSION.SDK_INT < 34) {
            iMax = Math.max(0, 10);
        }
        CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior = awaitRepeatingRequestBeforeCapture.getCompletionBehavior();
        CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior2 = CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST;
        int iOrdinal = completionBehavior.ordinal();
        if (iOrdinal == 0) {
            return Math.max(iMax, awaitRepeatingRequestBeforeCapture.m538getRepeatingFramesToCompletepVg5ArA());
        }
        if (iOrdinal == 1) {
            return awaitRepeatingRequestBeforeCapture.m538getRepeatingFramesToCompletepVg5ArA();
        }
        throw new i();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* renamed from: shouldCloseCameraBeforeCreatingCaptureSession-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1051x552c1673(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cameraId"
            h.g.b.x.f(r5, r0)
            androidx.camera.camera2.pipe.StrictMode r0 = r4.strictMode
            boolean r0 = r0.getEnabled()
            r1 = 0
            if (r0 == 0) goto Lf
            return r1
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            r3 = 1
            if (r0 > r2) goto L26
            androidx.camera.camera2.pipe.compat.Camera2MetadataProvider r4 = r4.metadataProvider
            androidx.camera.camera2.pipe.CameraMetadata$Companion r0 = androidx.camera.camera2.pipe.CameraMetadata.Companion
            androidx.camera.camera2.pipe.CameraMetadata r4 = r4.mo1047awaitCameraMetadataEfqyGwQ(r5)
            boolean r4 = r0.isHardwareLevelLegacy(r4)
            if (r4 == 0) goto L26
            r4 = r3
            goto L27
        L26:
            r4 = r1
        L27:
            java.lang.String r0 = "motorola"
            java.lang.String r2 = android.os.Build.BRAND
            boolean r0 = h.n.o.m(r0, r2, r3)
            if (r0 == 0) goto L45
            java.lang.String r0 = "moto e20"
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = h.n.o.m(r0, r2, r3)
            if (r0 == 0) goto L45
            java.lang.String r0 = "1"
            boolean r5 = h.g.b.x.n(r5, r0)
            if (r5 == 0) goto L45
            r5 = r3
            goto L46
        L45:
            r5 = r1
        L46:
            if (r4 != 0) goto L4c
            if (r5 == 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2Quirks.m1051x552c1673(java.lang.String):boolean");
    }

    /* renamed from: shouldCreateEmptyCaptureSessionBeforeClosing-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m1052xfcf3eba9(String str) {
        x.f(str, "cameraId");
        this.strictMode.getEnabled();
        return false;
    }

    /* renamed from: shouldWaitForCameraDeviceOnClosed-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m1053shouldWaitForCameraDeviceOnClosedEfqyGwQ$camera_camera2_pipe(String str) {
        x.f(str, "cameraId");
        if (this.strictMode.getEnabled()) {
            return false;
        }
        return CameraMetadata.Companion.isHardwareLevelLegacy(this.metadataProvider.mo1047awaitCameraMetadataEfqyGwQ(str));
    }

    public final boolean shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe(CameraGraph.Config config) {
        x.f(config, "graphConfig");
        if (this.strictMode.getEnabled()) {
            return false;
        }
        Boolean awaitRepeatingRequestOnDisconnect = config.getFlags().getAwaitRepeatingRequestOnDisconnect();
        if (awaitRepeatingRequestOnDisconnect != null) {
            return awaitRepeatingRequestOnDisconnect.booleanValue();
        }
        return CameraMetadata.Companion.isHardwareLevelLegacy(this.metadataProvider.mo1047awaitCameraMetadataEfqyGwQ(config.m505getCameraDz_R5H8()));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe() {
            if (x.n(Build.HARDWARE, "samsungexynos7870")) {
                return true;
            }
            if (o.m(Build.HARDWARE, "qcom", true) && Build.VERSION.SDK_INT <= 31) {
                return true;
            }
            Map map = Camera2Quirks.SM8150_DEVICES;
            String str = Build.BRAND;
            x.e(str, "BRAND");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                String str2 = Build.MODEL;
                x.e(str2, "MODEL");
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                x.e(lowerCase2, "toLowerCase(...)");
                if (set.contains(lowerCase2)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
