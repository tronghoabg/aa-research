package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloser;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidCameraState extends CameraDevice.StateCallback {
    private final bn<CameraState> _state;
    private final int attemptNumber;
    private final long attemptTimestampNanos;
    private final AudioRestrictionController audioRestrictionController;
    private final Camera2DeviceCloser camera2DeviceCloser;
    private final Camera2Quirks camera2Quirks;
    private final Camera2SystemState camera2SystemState;
    private final CountDownLatch cameraDeviceClosed;
    private final CameraErrorListener cameraErrorListener;
    private final String cameraId;
    private final int debugId;
    private final CameraDevice.StateCallback interopCameraDeviceStateCallback;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;
    private final Object lock;
    private final CameraMetadata metadata;
    private TimestampNs openTimestampNanos;
    private boolean opening;
    private ClosingInfo pendingClose;
    private final long requestTimestampNanos;
    private boolean shouldDelayFinalizing;
    private final Threads threads;
    private final TimeSource timeSource;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.AndroidCameraState$awaitClosed$2, reason: invalid class name */
    final class AnonymousClass2 extends h.c.b.a.g implements p<CameraState, h.c.e<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(h.c.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(CameraState cameraState, h.c.e<? super Boolean> eVar) {
            return ((AnonymousClass2) create(cameraState, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return Boolean.valueOf(((CameraState) this.L$0) instanceof CameraStateClosed);
        }
    }

    private AndroidCameraState(String str, CameraMetadata cameraMetadata, int i2, long j2, TimeSource timeSource, CameraErrorListener cameraErrorListener, Camera2DeviceCloser camera2DeviceCloser, Camera2Quirks camera2Quirks, Camera2SystemState camera2SystemState, Threads threads, AudioRestrictionController audioRestrictionController, CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener) {
        x.f(str, "cameraId");
        x.f(cameraMetadata, TtmlNode.TAG_METADATA);
        x.f(timeSource, "timeSource");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(camera2DeviceCloser, "camera2DeviceCloser");
        x.f(camera2Quirks, "camera2Quirks");
        x.f(camera2SystemState, "camera2SystemState");
        x.f(threads, "threads");
        x.f(audioRestrictionController, "audioRestrictionController");
        this.cameraId = str;
        this.metadata = cameraMetadata;
        this.attemptNumber = i2;
        this.attemptTimestampNanos = j2;
        this.timeSource = timeSource;
        this.cameraErrorListener = cameraErrorListener;
        this.camera2DeviceCloser = camera2DeviceCloser;
        this.camera2Quirks = camera2Quirks;
        this.camera2SystemState = camera2SystemState;
        this.threads = threads;
        this.audioRestrictionController = audioRestrictionController;
        this.interopCameraDeviceStateCallback = stateCallback;
        this.interopCaptureSessionListener = captureSessionListener;
        this.debugId = VirtualCameraKt.getAndroidCameraDebugIds().e();
        this.lock = new Object();
        this.cameraDeviceClosed = new CountDownLatch(1);
        this._state = ck.b(CameraStateUnopened.INSTANCE);
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            android.util.Log.i(Log.TAG, "Opening ".concat(CameraId.m552toStringimpl(m990getCameraIdDz_R5H8())));
        }
        this.requestTimestampNanos = i2 != 1 ? timeSource.mo1117nowvQl9yQU() : j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void closeWith(android.hardware.camera2.CameraDevice r11, androidx.camera.camera2.pipe.compat.AndroidCameraState.ClosingInfo r12) {
        /*
            r10 = this;
            kotlinx.coroutines.b.bn<androidx.camera.camera2.pipe.compat.CameraState> r0 = r10._state
            java.lang.Object r0 = r0.d()
            androidx.camera.camera2.pipe.compat.CameraState r0 = (androidx.camera.camera2.pipe.compat.CameraState) r0
            boolean r1 = r0 instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen
            r2 = 0
            if (r1 == 0) goto L15
            androidx.camera.camera2.pipe.compat.CameraStateOpen r0 = (androidx.camera.camera2.pipe.compat.CameraStateOpen) r0
            androidx.camera.camera2.pipe.compat.CameraDeviceWrapper r0 = r0.getCameraDevice()
            r4 = r0
            goto L16
        L15:
            r4 = r2
        L16:
            java.lang.Object r1 = r10.lock
            monitor-enter(r1)
            androidx.camera.camera2.pipe.compat.AndroidCameraState$ClosingInfo r0 = r10.pendingClose     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L23
            r10.pendingClose = r12     // Catch: java.lang.Throwable -> L88
            boolean r0 = r10.opening     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L24
        L23:
            r12 = r2
        L24:
            monitor-exit(r1)
            if (r12 == 0) goto L87
            androidx.camera.camera2.pipe.CameraError r0 = r12.m996getErrorCodemVEW8x0()
            if (r0 == 0) goto L45
            androidx.camera.camera2.pipe.compat.ClosedReason r0 = r12.getReason()
            androidx.camera.camera2.pipe.compat.ClosedReason r1 = androidx.camera.camera2.pipe.compat.ClosedReason.CAMERA2_EXCEPTION
            if (r0 == r1) goto L45
            androidx.camera.camera2.pipe.internal.CameraErrorListener r0 = r10.cameraErrorListener
            java.lang.String r1 = r10.cameraId
            androidx.camera.camera2.pipe.CameraError r3 = r12.m996getErrorCodemVEW8x0()
            int r3 = r3.m478unboximpl()
            r5 = 0
            r0.mo1038onCameraError3M5Xam4(r1, r3, r5)
        L45:
            kotlinx.coroutines.b.bn<androidx.camera.camera2.pipe.compat.CameraState> r0 = r10._state
            androidx.camera.camera2.pipe.compat.CameraStateClosing r1 = new androidx.camera.camera2.pipe.compat.CameraStateClosing
            androidx.camera.camera2.pipe.CameraError r3 = r12.m996getErrorCodemVEW8x0()
            r1.<init>(r3, r2)
            r0.e(r1)
            androidx.camera.camera2.pipe.compat.ClosedReason r0 = r12.getReason()
            androidx.camera.camera2.pipe.compat.ClosedReason r1 = androidx.camera.camera2.pipe.compat.ClosedReason.CAMERA2_CLOSED
            if (r0 == r1) goto L7d
            androidx.camera.camera2.pipe.compat.Camera2Quirks r0 = r10.camera2Quirks
            java.lang.String r1 = r10.cameraId
            androidx.camera.camera2.pipe.CameraError r2 = r12.m996getErrorCodemVEW8x0()
            r10.m989shouldReopenCameraWhenClosing_z0IXec(r0, r1, r2)
            androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r3 = r10.camera2DeviceCloser
            androidx.camera.camera2.pipe.compat.AudioRestrictionController r7 = r10.audioRestrictionController
            androidx.camera.camera2.pipe.compat.Camera2Quirks r0 = r10.camera2Quirks
            java.lang.String r1 = r10.cameraId
            androidx.camera.camera2.pipe.CameraError r2 = r12.m996getErrorCodemVEW8x0()
            r10.m988shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(r0, r1, r2)
            r8 = 0
            r9 = 0
            r6 = r10
            r5 = r11
            r3.closeCamera(r4, r5, r6, r7, r8, r9)
            goto L7e
        L7d:
            r6 = r10
        L7e:
            kotlinx.coroutines.b.bn<androidx.camera.camera2.pipe.compat.CameraState> r10 = r6._state
            androidx.camera.camera2.pipe.compat.CameraStateClosed r11 = r6.computeClosedState(r12)
            r10.e(r11)
        L87:
            return
        L88:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraState.closeWith(android.hardware.camera2.CameraDevice, androidx.camera.camera2.pipe.compat.AndroidCameraState$ClosingInfo):void");
    }

    /* renamed from: closeWith-8PWMtlg, reason: not valid java name */
    private final void m987closeWith8PWMtlg(Throwable th, int i2) {
        closeWith(null, new ClosingInfo(ClosedReason.CAMERA2_EXCEPTION, 0L, CameraError.m471boximpl(i2), th, 2, null));
    }

    private final CameraStateClosed computeClosedState(ClosingInfo closingInfo) {
        h.o.a aVarZ;
        h.o.a aVarZ2;
        long jMo1117nowvQl9yQU = this.timeSource.mo1117nowvQl9yQU();
        TimestampNs timestampNs = this.openTimestampNanos;
        long jM995getClosingTimestampvQl9yQU = closingInfo.m995getClosingTimestampvQl9yQU();
        h.o.a aVarZ3 = null;
        if (timestampNs != null) {
            long j2 = this.attemptTimestampNanos;
            long jM1128unboximpl = timestampNs.m1128unboximpl();
            h.o.c cVar = h.o.a.f48264a;
            aVarZ = h.o.a.z(h.o.c.j(jM1128unboximpl - j2, h.o.d.f48270a));
        } else {
            aVarZ = null;
        }
        if (timestampNs != null) {
            long j3 = this.requestTimestampNanos;
            long jM1128unboximpl2 = timestampNs.m1128unboximpl();
            h.o.c cVar2 = h.o.a.f48264a;
            aVarZ2 = h.o.a.z(h.o.c.j(jM1128unboximpl2 - j3, h.o.d.f48270a));
        } else {
            aVarZ2 = null;
        }
        if (timestampNs != null) {
            long jM1128unboximpl3 = timestampNs.m1128unboximpl();
            h.o.c cVar3 = h.o.a.f48264a;
            aVarZ3 = h.o.a.z(h.o.c.j(jM995getClosingTimestampvQl9yQU - jM1128unboximpl3, h.o.d.f48270a));
        }
        h.o.c cVar4 = h.o.a.f48264a;
        long j4 = h.o.c.j(jMo1117nowvQl9yQU - jM995getClosingTimestampvQl9yQU, h.o.d.f48270a);
        String str = this.cameraId;
        ClosedReason reason = closingInfo.getReason();
        int i2 = this.attemptNumber;
        CameraError cameraErrorM996getErrorCodemVEW8x0 = closingInfo.m996getErrorCodemVEW8x0();
        return new CameraStateClosed(str, reason, Integer.valueOf(i2 - 1), aVarZ, closingInfo.getException(), aVarZ2, aVarZ3, h.o.a.z(j4), cameraErrorM996getErrorCodemVEW8x0, null);
    }

    /* renamed from: shouldCreateEmptyCaptureSessionBeforeClosing-_z0IXec, reason: not valid java name */
    private final boolean m988shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(Camera2Quirks camera2Quirks, String str, CameraError cameraError) {
        camera2Quirks.m1052xfcf3eba9(str);
        return false;
    }

    /* renamed from: shouldReopenCameraWhenClosing-_z0IXec, reason: not valid java name */
    private final boolean m989shouldReopenCameraWhenClosing_z0IXec(Camera2Quirks camera2Quirks, String str, CameraError cameraError) {
        m988shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(camera2Quirks, str, cameraError);
        return false;
    }

    public final boolean awaitCameraDeviceClosed$camera_camera2_pipe(long j2) {
        return this.cameraDeviceClosed.await(j2, TimeUnit.MILLISECONDS);
    }

    public final Object awaitClosed(h.c.e<? super ab> eVar) {
        Object objI = ai.i(getState(), new AnonymousClass2(null), eVar);
        return objI == h.c.a.a.f48038a ? objI : ab.f48028a;
    }

    public final void close() {
        CameraState cameraState = (CameraState) this._state.d();
        CameraDeviceWrapper cameraDevice = cameraState instanceof CameraStateOpen ? ((CameraStateOpen) cameraState).getCameraDevice() : null;
        closeWith(cameraDevice != null ? (CameraDevice) cameraDevice.unwrapAs(CameraDevice.class) : null, new ClosingInfo(ClosedReason.APP_CLOSED, 0L, null, null, 14, null));
    }

    public final void closeWith$camera_camera2_pipe(Throwable th) {
        x.f(th, "throwable");
        int iM481fromPVuDhNw$camera_camera2_pipe = CameraError.Companion.m481fromPVuDhNw$camera_camera2_pipe(th);
        if (CameraError.m474equalsimpl0(iM481fromPVuDhNw$camera_camera2_pipe, CameraError.Companion.m494getERROR_UNDETERMINEDv7Vf74A())) {
            return;
        }
        m987closeWith8PWMtlg(th, iM481fromPVuDhNw$camera_camera2_pipe);
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String m990getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    public final CameraMetadata getMetadata() {
        return this.metadata;
    }

    public final ch<CameraState> getState() {
        return this._state;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        x.f(cameraDevice, "cameraDevice");
        if (!x.n(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()).concat(": onClosed"));
        }
        this.cameraDeviceClosed.countDown();
        synchronized (this.lock) {
            if (!this.shouldDelayFinalizing) {
                onFinalized$camera_camera2_pipe(cameraDevice);
                return;
            }
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                android.util.Log.i(Log.TAG, this + "#onClosed: Delaying finalizing.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        x.f(cameraDevice, "cameraDevice");
        if (!x.n(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection(CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()).concat("#onDisconnected"));
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()).concat(": onDisconnected"));
        }
        this.cameraDeviceClosed.countDown();
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_DISCONNECTED, 0L, CameraError.m471boximpl(CameraError.Companion.m484getERROR_CAMERA_DISCONNECTEDv7Vf74A()), null, 10, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i2) {
        x.f(cameraDevice, "cameraDevice");
        if (!x.n(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection(CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()) + "#onError-" + i2);
        int iM479fromPVuDhNw$camera_camera2_pipe = CameraError.Companion.m479fromPVuDhNw$camera_camera2_pipe(i2);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()) + ": onError " + CameraError.m477toStringimpl(iM479fromPVuDhNw$camera_camera2_pipe));
        }
        this.cameraDeviceClosed.countDown();
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_ERROR, 0L, CameraError.m471boximpl(iM479fromPVuDhNw$camera_camera2_pipe), null, 10, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i2);
        }
        Trace.endSection();
    }

    public final void onFinalized$camera_camera2_pipe(CameraDevice cameraDevice) {
        x.f(cameraDevice, "cameraDevice");
        Trace.beginSection(CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()).concat("#onFinalized"));
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(": onFinalized"));
        }
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_CLOSED, 0L, null, null, 14, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Camera2SystemState camera2SystemState = this.camera2SystemState;
        String id = cameraDevice.getId();
        x.e(id, "getId(...)");
        CameraId.m547constructorimpl(id);
        camera2SystemState.m1054onCameraClosedEfqyGwQ(id);
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        ClosingInfo closingInfo;
        ClosingInfo closingInfo2;
        String str;
        x.f(cameraDevice, "cameraDevice");
        if (!x.n(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        long jMo1117nowvQl9yQU = this.timeSource.mo1117nowvQl9yQU();
        this.openTimestampNanos = TimestampNs.m1120boximpl(jMo1117nowvQl9yQU);
        Trace.beginSection(CameraId.m552toStringimpl(m990getCameraIdDz_R5H8()).concat("#onOpened"));
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            long j2 = this.requestTimestampNanos;
            h.o.c cVar = h.o.a.f48264a;
            h.o.d dVar = h.o.d.f48270a;
            long j3 = h.o.c.j(jMo1117nowvQl9yQU - j2, dVar);
            long j4 = h.o.c.j(jMo1117nowvQl9yQU - this.attemptTimestampNanos, dVar);
            if (this.attemptNumber == 1) {
                String strM552toStringimpl = CameraId.m552toStringimpl(m990getCameraIdDz_R5H8());
                String str2 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j3, h.o.d.f48272c))}, 1));
                x.e(str2, "format(...)");
                str = "Opened " + strM552toStringimpl + " in " + str2;
            } else {
                String strM552toStringimpl2 = CameraId.m552toStringimpl(m990getCameraIdDz_R5H8());
                h.o.d dVar2 = h.o.d.f48272c;
                String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j3, dVar2))}, 1));
                x.e(str3, "format(...)");
                String str4 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j4, dVar2))}, 1));
                x.e(str4, "format(...)");
                str = "Opened " + strM552toStringimpl2 + " in " + str3 + " (" + str4 + " total) after " + this.attemptNumber + " attempts.";
            }
            android.util.Log.i(Log.TAG, str);
        }
        synchronized (this.lock) {
            closingInfo = this.pendingClose;
            if (closingInfo == null) {
                this.opening = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (closingInfo != null) {
            Camera2DeviceCloser camera2DeviceCloser = this.camera2DeviceCloser;
            AudioRestrictionController audioRestrictionController = this.audioRestrictionController;
            m989shouldReopenCameraWhenClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo.m996getErrorCodemVEW8x0());
            m988shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo.m996getErrorCodemVEW8x0());
            Camera2DeviceCloser.CC.closeCamera$default(camera2DeviceCloser, null, cameraDevice, this, audioRestrictionController, false, false, 1, null);
            return;
        }
        AndroidCameraDevice androidCameraDevice = new AndroidCameraDevice(this.metadata, cameraDevice, this.cameraId, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads, null);
        this.audioRestrictionController.addListener(androidCameraDevice);
        AndroidCameraDevice androidCameraDevice2 = androidCameraDevice;
        this._state.e(new CameraStateOpen(androidCameraDevice2));
        synchronized (this.lock) {
            this.opening = false;
            closingInfo2 = this.pendingClose;
        }
        if (closingInfo2 != null) {
            this._state.e(new CameraStateClosing(closingInfo2.m996getErrorCodemVEW8x0(), null));
            Camera2DeviceCloser camera2DeviceCloser2 = this.camera2DeviceCloser;
            AudioRestrictionController audioRestrictionController2 = this.audioRestrictionController;
            m989shouldReopenCameraWhenClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo2.m996getErrorCodemVEW8x0());
            m988shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo2.m996getErrorCodemVEW8x0());
            camera2DeviceCloser2.closeCamera(androidCameraDevice2, cameraDevice, this, audioRestrictionController2, false, false);
            this._state.e(computeClosedState(closingInfo2));
        }
        Trace.endSection();
    }

    public String toString() {
        return "CameraState-" + this.debugId;
    }

    /* compiled from: WazeSource */
    final class ClosingInfo {
        private final long closingTimestamp;
        private final CameraError errorCode;
        private final Throwable exception;
        private final ClosedReason reason;

        public /* synthetic */ ClosingInfo(ClosedReason closedReason, long j2, CameraError cameraError, Throwable th, int i2, o oVar) {
            this(closedReason, (i2 & 2) != 0 ? new SystemTimeSource().mo1117nowvQl9yQU() : j2, (i2 & 4) != 0 ? null : cameraError, (i2 & 8) != 0 ? null : th, null);
        }

        /* renamed from: copy-fgCNvVg$default, reason: not valid java name */
        public static /* synthetic */ ClosingInfo m991copyfgCNvVg$default(ClosingInfo closingInfo, ClosedReason closedReason, long j2, CameraError cameraError, Throwable th, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                closedReason = closingInfo.reason;
            }
            if ((i2 & 2) != 0) {
                j2 = closingInfo.closingTimestamp;
            }
            if ((i2 & 4) != 0) {
                cameraError = closingInfo.errorCode;
            }
            if ((i2 & 8) != 0) {
                th = closingInfo.exception;
            }
            return closingInfo.m994copyfgCNvVg(closedReason, j2, cameraError, th);
        }

        public final ClosedReason component1() {
            return this.reason;
        }

        /* renamed from: component2-vQl9yQU, reason: not valid java name */
        public final long m992component2vQl9yQU() {
            return this.closingTimestamp;
        }

        /* renamed from: component3-mVEW8x0, reason: not valid java name */
        public final CameraError m993component3mVEW8x0() {
            return this.errorCode;
        }

        public final Throwable component4() {
            return this.exception;
        }

        /* renamed from: copy-fgCNvVg, reason: not valid java name */
        public final ClosingInfo m994copyfgCNvVg(ClosedReason closedReason, long j2, CameraError cameraError, Throwable th) {
            x.f(closedReason, "reason");
            return new ClosingInfo(closedReason, j2, cameraError, th, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosingInfo)) {
                return false;
            }
            ClosingInfo closingInfo = (ClosingInfo) obj;
            return this.reason == closingInfo.reason && TimestampNs.m1123equalsimpl0(this.closingTimestamp, closingInfo.closingTimestamp) && x.n(this.errorCode, closingInfo.errorCode) && x.n(this.exception, closingInfo.exception);
        }

        /* renamed from: getClosingTimestamp-vQl9yQU, reason: not valid java name */
        public final long m995getClosingTimestampvQl9yQU() {
            return this.closingTimestamp;
        }

        /* renamed from: getErrorCode-mVEW8x0, reason: not valid java name */
        public final CameraError m996getErrorCodemVEW8x0() {
            return this.errorCode;
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final ClosedReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            CameraError cameraError = this.errorCode;
            int iM1124hashCodeimpl = (((iHashCode + TimestampNs.m1124hashCodeimpl(this.closingTimestamp)) * 31) + (cameraError == null ? 0 : cameraError.m478unboximpl())) * 31;
            Throwable th = this.exception;
            return iM1124hashCodeimpl + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ClosingInfo(reason=" + this.reason + ", closingTimestamp=" + TimestampNs.m1127toStringimpl(this.closingTimestamp) + ", errorCode=" + this.errorCode + ", exception=" + this.exception + ")";
        }

        public /* synthetic */ ClosingInfo(ClosedReason closedReason, long j2, CameraError cameraError, Throwable th, o oVar) {
            this(closedReason, j2, cameraError, th);
        }

        private ClosingInfo(ClosedReason closedReason, long j2, CameraError cameraError, Throwable th) {
            x.f(closedReason, "reason");
            this.reason = closedReason;
            this.closingTimestamp = j2;
            this.errorCode = cameraError;
            this.exception = th;
        }
    }

    public /* synthetic */ AndroidCameraState(String str, CameraMetadata cameraMetadata, int i2, long j2, TimeSource timeSource, CameraErrorListener cameraErrorListener, Camera2DeviceCloser camera2DeviceCloser, Camera2Quirks camera2Quirks, Camera2SystemState camera2SystemState, Threads threads, AudioRestrictionController audioRestrictionController, CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, o oVar) {
        this(str, cameraMetadata, i2, j2, timeSource, cameraErrorListener, camera2DeviceCloser, camera2Quirks, camera2SystemState, threads, audioRestrictionController, stateCallback, captureSessionListener);
    }

    public /* synthetic */ AndroidCameraState(String str, CameraMetadata cameraMetadata, int i2, long j2, TimeSource timeSource, CameraErrorListener cameraErrorListener, Camera2DeviceCloser camera2DeviceCloser, Camera2Quirks camera2Quirks, Camera2SystemState camera2SystemState, Threads threads, AudioRestrictionController audioRestrictionController, CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, int i3, o oVar) {
        this(str, cameraMetadata, i2, j2, timeSource, cameraErrorListener, camera2DeviceCloser, camera2Quirks, camera2SystemState, threads, audioRestrictionController, (i3 & 2048) != 0 ? null : stateCallback, (i3 & 4096) != 0 ? null : captureSessionListener, null);
    }
}
