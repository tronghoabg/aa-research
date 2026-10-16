package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import h.g.b.o;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetryingCameraStateOpenerImpl implements RetryingCameraStateOpener {
    public static final Companion Companion = new Companion(null);
    private final AudioRestrictionController audioRestrictionController;
    private final CameraAvailabilityMonitor cameraAvailabilityMonitor;
    private final CameraErrorListener cameraErrorListener;
    private final CameraPipe.CameraInteropConfig cameraInteropConfig;
    private final CameraStateOpener cameraStateOpener;
    private final DevicePolicyManagerWrapper devicePolicyManager;
    private final Threads threads;
    private final TimeSource timeSource;

    public RetryingCameraStateOpenerImpl(CameraStateOpener cameraStateOpener, CameraErrorListener cameraErrorListener, CameraAvailabilityMonitor cameraAvailabilityMonitor, TimeSource timeSource, DevicePolicyManagerWrapper devicePolicyManagerWrapper, AudioRestrictionController audioRestrictionController, CameraPipe.CameraInteropConfig cameraInteropConfig, Threads threads) {
        x.f(cameraStateOpener, "cameraStateOpener");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(cameraAvailabilityMonitor, "cameraAvailabilityMonitor");
        x.f(timeSource, "timeSource");
        x.f(devicePolicyManagerWrapper, "devicePolicyManager");
        x.f(audioRestrictionController, "audioRestrictionController");
        x.f(threads, "threads");
        this.cameraStateOpener = cameraStateOpener;
        this.cameraErrorListener = cameraErrorListener;
        this.cameraAvailabilityMonitor = cameraAvailabilityMonitor;
        this.timeSource = timeSource;
        this.devicePolicyManager = devicePolicyManagerWrapper;
        this.audioRestrictionController = audioRestrictionController;
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener
    public void cancelOpen() {
        this.cameraStateOpener.cancelOpen$camera_camera2_pipe();
    }

    @Override // androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener
    /* renamed from: openAndAwaitCameraWithRetry-0r8Bogc */
    public AwaitOpenCameraResult mo1091openAndAwaitCameraWithRetry0r8Bogc(String str, Camera2DeviceCloser camera2DeviceCloser) {
        x.f(str, "cameraId");
        x.f(camera2DeviceCloser, "camera2DeviceCloser");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, this + "#openAndAwaitCameraWithRetry(" + CameraId.m552toStringimpl(str) + ")");
        }
        return (AwaitOpenCameraResult) aj.u(this.threads.getBlockingDispatcher(), new RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2(this, str, camera2DeviceCloser, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(1:(9:13|94|14|15|76|(1:80)|81|31|(3:33|34|35)(4:36|(3:38|39|(2:43|(4:45|(1:47)|48|49)(8:50|(1:52)(1:53)|54|(4:56|(1:58)|67|(3:69|70|71)(3:72|73|(6:75|76|(2:78|80)|81|31|(0)(0))(1:97)))(1:59)|60|(4:62|(1:64)|65|66)|67|(0)(0)))(2:41|42))|88|89))(2:18|19))(6:20|92|21|22|39|(0)(0))|90|84)(1:25))(4:26|(1:28)|88|89)|29|95|30|31|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ff, code lost:
    
        r1 = r0;
        r5 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #3 {all -> 0x02fe, blocks: (B:31:0x00f3, B:33:0x00f9, B:36:0x010c, B:30:0x00f0), top: B:95:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[Catch: all -> 0x02fe, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x02fe, blocks: (B:31:0x00f3, B:33:0x00f9, B:36:0x010c, B:30:0x00f0), top: B:95:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #2 {all -> 0x005b, blocks: (B:14:0x0050, B:76:0x02c8, B:78:0x02d0, B:80:0x02d8, B:39:0x014c, B:43:0x016b, B:45:0x0171, B:47:0x0179, B:50:0x0183, B:52:0x01a5, B:54:0x01ae, B:56:0x01c2, B:60:0x01d0, B:62:0x01df, B:64:0x01e7, B:67:0x0273, B:69:0x0279, B:73:0x0290), top: B:94:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0279 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:14:0x0050, B:76:0x02c8, B:78:0x02d0, B:80:0x02d8, B:39:0x014c, B:43:0x016b, B:45:0x0171, B:47:0x0179, B:50:0x0183, B:52:0x01a5, B:54:0x01ae, B:56:0x01c2, B:60:0x01d0, B:62:0x01df, B:64:0x01e7, B:67:0x0273, B:69:0x0279, B:73:0x0290), top: B:94:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.camera.camera2.pipe.compat.AndroidCameraState, h.g.b.o, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02c1 -> B:76:0x02c8). Please report as a decompilation issue!!! */
    @Override // androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener
    /* renamed from: openCameraWithRetry-zDSwpeU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1092openCameraWithRetryzDSwpeU(java.lang.String r29, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r30, h.g.a.l<? super h.ab, java.lang.Boolean> r31, kotlinx.coroutines.am<h.ab> r32, h.c.e<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> r33) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl.mo1092openCameraWithRetryzDSwpeU(java.lang.String, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser, h.g.a.l, kotlinx.coroutines.am, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getRetryTimeout-1O43Jpo$camera_camera2_pipe$default, reason: not valid java name */
        public static /* synthetic */ long m1094getRetryTimeout1O43Jpo$camera_camera2_pipe$default(Companion companion, boolean z, h.o.a aVar, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                aVar = null;
            }
            return companion.m1098getRetryTimeout1O43Jpo$camera_camera2_pipe(z, aVar);
        }

        /* renamed from: min-Rsxs6sk, reason: not valid java name */
        private final long m1095minRsxs6sk(long j2, h.o.a aVar) {
            return (aVar != null && h.o.a.c(j2, aVar.w()) >= 0) ? aVar.w() : j2;
        }

        /* renamed from: shouldRetry-kCGJ6dk$camera_camera2_pipe$default, reason: not valid java name */
        public static /* synthetic */ boolean m1096shouldRetrykCGJ6dk$camera_camera2_pipe$default(Companion companion, int i2, int i3, long j2, boolean z, boolean z2, h.o.a aVar, int i4, Object obj) {
            boolean z3 = z2 | (!((i4 & 16) == 0));
            if ((i4 & 32) != 0) {
                aVar = null;
            }
            return companion.m1100shouldRetrykCGJ6dk$camera_camera2_pipe(i2, i3, j2, z, z3, aVar);
        }

        /* renamed from: getRetryDelay-UqaQ4Hc$camera_camera2_pipe, reason: not valid java name */
        public final long m1097getRetryDelayUqaQ4Hc$camera_camera2_pipe(long j2, boolean z) {
            return !z ? RetryingCameraStateOpenerKt.defaultCameraRetryDelay : h.o.a.c(j2, RetryingCameraStateOpenerKt.activeResumeCameraRetryThresholds[0].w()) < 0 ? RetryingCameraStateOpenerKt.activeResumeCameraRetryDelayBase : h.o.a.c(j2, RetryingCameraStateOpenerKt.activeResumeCameraRetryThresholds[1].w()) < 0 ? h.o.a.t(RetryingCameraStateOpenerKt.activeResumeCameraRetryDelayBase, 4) : h.o.a.t(RetryingCameraStateOpenerKt.activeResumeCameraRetryDelayBase, 8);
        }

        /* renamed from: getRetryTimeout-1O43Jpo$camera_camera2_pipe, reason: not valid java name */
        public final long m1098getRetryTimeout1O43Jpo$camera_camera2_pipe(boolean z, h.o.a aVar) {
            return !z ? m1095minRsxs6sk(RetryingCameraStateOpenerKt.defaultCameraRetryTimeout, aVar) : m1095minRsxs6sk(RetryingCameraStateOpenerKt.activeResumeCameraRetryTimeout, aVar);
        }

        /* renamed from: shouldActivateActiveResume-8PWMtlg$camera_camera2_pipe, reason: not valid java name */
        public final boolean m1099shouldActivateActiveResume8PWMtlg$camera_camera2_pipe(boolean z, int i2) {
            if (!z || Build.VERSION.SDK_INT >= 33) {
                return false;
            }
            return CameraError.m474equalsimpl0(i2, CameraError.Companion.m485getERROR_CAMERA_IN_USEv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m484getERROR_CAMERA_DISCONNECTEDv7Vf74A());
        }

        /* renamed from: shouldRetry-kCGJ6dk$camera_camera2_pipe, reason: not valid java name */
        public final boolean m1100shouldRetrykCGJ6dk$camera_camera2_pipe(int i2, int i3, long j2, boolean z, boolean z2, h.o.a aVar) {
            boolean zM1099shouldActivateActiveResume8PWMtlg$camera_camera2_pipe = m1099shouldActivateActiveResume8PWMtlg$camera_camera2_pipe(z2, i2);
            if (zM1099shouldActivateActiveResume8PWMtlg$camera_camera2_pipe && Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "shouldRetry: Active resume mode is activated");
            }
            if (h.o.a.c(j2, m1098getRetryTimeout1O43Jpo$camera_camera2_pipe(zM1099shouldActivateActiveResume8PWMtlg$camera_camera2_pipe, aVar)) > 0) {
                return false;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m494getERROR_UNDETERMINEDv7Vf74A())) {
                return i3 <= 1;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m485getERROR_CAMERA_IN_USEv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A())) {
                return true;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m483getERROR_CAMERA_DISABLEDv7Vf74A())) {
                return !z || i3 <= 1;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m482getERROR_CAMERA_DEVICEv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m489getERROR_CAMERA_SERVICEv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m484getERROR_CAMERA_DISCONNECTEDv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m492getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A())) {
                return true;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m493getERROR_SECURITY_EXCEPTIONv7Vf74A())) {
                return i3 <= 1;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m490getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A())) {
                return false;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m495getERROR_UNKNOWN_EXCEPTIONv7Vf74A())) {
                return i3 <= 1;
            }
            if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m487getERROR_CAMERA_OPENERv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m488getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A()) || !Log.INSTANCE.getERROR_LOGGABLE()) {
                return false;
            }
            Companion companion = RetryingCameraStateOpenerImpl.Companion;
            Objects.toString(companion);
            android.util.Log.e(Log.TAG, "Unexpected CameraError: ".concat(String.valueOf(companion)));
            return false;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
