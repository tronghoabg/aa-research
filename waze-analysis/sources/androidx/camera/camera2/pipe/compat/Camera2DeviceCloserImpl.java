package androidx.camera.camera2.pipe.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.am;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.concurrent.CountDownLatch;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceCloserImpl implements Camera2DeviceCloser {
    private static final long CAMERA_CLOSE_TIMEOUT;
    public static final Companion Companion = new Companion(null);
    private final Camera2Quirks camera2Quirks;
    private final RetryingCameraStateOpener retryingCameraStateOpener;
    private final Threads threads;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.g implements l<h.c.e<? super ab>, Object> {
        final /* synthetic */ CameraDevice $cameraDevice;
        final /* synthetic */ am $cameraDeviceClosed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CameraDevice cameraDevice, am amVar, h.c.e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.$cameraDevice = cameraDevice;
            this.$cameraDeviceClosed = amVar;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(h.c.e<?> eVar) {
            return new AnonymousClass1(this.$cameraDevice, this.$cameraDeviceClosed, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(h.c.e<? super ab> eVar) {
            return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            CameraDeviceWrapperKt.closeWithTrace(this.$cameraDevice);
            this.$cameraDeviceClosed.f48101a = true;
            return ab.f48028a;
        }
    }

    static {
        h.o.c cVar = h.o.a.f48264a;
        CAMERA_CLOSE_TIMEOUT = h.o.c.i(7, h.o.d.f48273d);
    }

    public Camera2DeviceCloserImpl(Threads threads, Camera2Quirks camera2Quirks, RetryingCameraStateOpener retryingCameraStateOpener) {
        x.f(threads, "threads");
        x.f(camera2Quirks, "camera2Quirks");
        x.f(retryingCameraStateOpener, "retryingCameraStateOpener");
        this.threads = threads;
        this.camera2Quirks = camera2Quirks;
        this.retryingCameraStateOpener = retryingCameraStateOpener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeCameraDevice(CameraDevice cameraDevice, AndroidCameraState androidCameraState) {
        String id = cameraDevice.getId();
        x.e(id, "getId(...)");
        am amVar = new am();
        if (((ab) this.threads.m1119runBlockingCheckedOrNullVtjQ1oo(CAMERA_CLOSE_TIMEOUT, new AnonymousClass1(cameraDevice, amVar, null))) == null && Log.INSTANCE.getERROR_LOGGABLE()) {
            android.util.Log.e(Log.TAG, "Failed to close CameraDevice(" + id + ") after " + h.o.a.y(CAMERA_CLOSE_TIMEOUT) + ". The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        x.e(id2, "getId(...)");
        CameraId.m547constructorimpl(id2);
        if (this.camera2Quirks.m1053shouldWaitForCameraDeviceOnClosedEfqyGwQ$camera_camera2_pipe(id2) && amVar.f48101a) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Waiting for OnClosed from ".concat(CameraId.m552toStringimpl(id2)));
            }
            if (androidCameraState.awaitCameraDeviceClosed$camera_camera2_pipe(2000L)) {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Received OnClosed for ".concat(CameraId.m552toStringimpl(id2)));
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, d.a(id2, "Failed to close ", " after 2000ms!"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createCaptureSession(CameraDeviceWrapper cameraDeviceWrapper) throws InterruptedException {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final kotlinx.a.a aVarE = h.e.b.e(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (cameraDeviceWrapper.createCaptureSession(i.d(surface), new CameraCaptureSessionWrapper.StateCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$createCaptureSession$callback$1
            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onActive(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
                x.f(cameraCaptureSessionWrapper, "session");
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onCaptureQueueEmpty(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
                x.f(cameraCaptureSessionWrapper, "session");
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onClosed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
                x.f(cameraCaptureSessionWrapper, "session");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Empty capture session closed");
                }
                if (aVarE.b(false, true)) {
                    surface.release();
                    surfaceTexture.release();
                }
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onConfigureFailed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
                x.f(cameraCaptureSessionWrapper, "session");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Empty capture session configure failed");
                }
                if (aVarE.b(false, true)) {
                    surface.release();
                    surfaceTexture.release();
                }
                countDownLatch.countDown();
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onConfigured(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) throws Exception {
                x.f(cameraCaptureSessionWrapper, "session");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Empty capture session configured. Closing it");
                }
                Camera2DeviceCloserImpl$createCaptureSession$callback$1$$ExternalSyntheticAutoCloseableDispatcher0.m(cameraCaptureSessionWrapper);
                countDownLatch.countDown();
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onReady(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
                x.f(cameraCaptureSessionWrapper, "session");
            }

            @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
            public void onSessionDisconnected() {
            }

            @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
            public void onSessionFinalized() {
            }
        })) {
            countDownLatch.await();
            return;
        }
        if (Log.INSTANCE.getERROR_LOGGABLE()) {
            android.util.Log.e(Log.TAG, "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        }
        if (aVarE.b(false, true)) {
            surface.release();
            surfaceTexture.release();
        }
    }

    private final k<CameraDeviceWrapper, AndroidCameraState> handleQuirksBeforeClosing(CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, AndroidCameraState androidCameraState, boolean z, boolean z2) {
        AwaitOpenCameraResult awaitOpenCameraResult;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, a.a(cameraDevice, "handleQuirksBeforeClosing(", ")"));
        }
        String strMo985getCameraIdDz_R5H8 = cameraDeviceWrapper.mo985getCameraIdDz_R5H8();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Reopening camera device");
                }
                closeCameraDevice(cameraDevice, androidCameraState);
                awaitOpenCameraResult = this.retryingCameraStateOpener.mo1091openAndAwaitCameraWithRetry0r8Bogc(strMo985getCameraIdDz_R5H8, this);
            } finally {
            }
        } else {
            awaitOpenCameraResult = new AwaitOpenCameraResult(cameraDeviceWrapper, androidCameraState);
        }
        if (awaitOpenCameraResult.getCameraDeviceWrapper() == null || awaitOpenCameraResult.getAndroidCameraState() == null) {
            if (!Log.INSTANCE.getERROR_LOGGABLE()) {
                return null;
            }
            android.util.Log.e(Log.TAG, "Failed to retain an opened camera device!");
            return null;
        }
        if (z2) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Creating an empty capture session before closing " + CameraId.m552toStringimpl(strMo985getCameraIdDz_R5H8));
                }
                createCaptureSession(awaitOpenCameraResult.getCameraDeviceWrapper());
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Created an empty capture session.");
                }
            } finally {
            }
        }
        return new k<>(awaitOpenCameraResult.getCameraDeviceWrapper(), awaitOpenCameraResult.getAndroidCameraState());
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceCloser
    public void closeCamera(CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, AndroidCameraState androidCameraState, AudioRestrictionController audioRestrictionController, boolean z, boolean z2) {
        x.f(androidCameraState, "androidCameraState");
        x.f(audioRestrictionController, "audioRestrictionController");
        CameraDevice cameraDevice2 = cameraDeviceWrapper != null ? (CameraDevice) cameraDeviceWrapper.unwrapAs(CameraDevice.class) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                closeCameraDevice(cameraDevice, androidCameraState);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        x.e(id, "getId(...)");
        CameraId.m547constructorimpl(id);
        if (cameraDevice != null && !x.n(id, cameraDevice.getId())) {
            throw new IllegalStateException("Unwrapped camera device has camera ID " + id + ", but the wrapped camera device has camera ID " + cameraDevice.getId() + "!");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            audioRestrictionController.removeListener(cameraDeviceWrapper);
        }
        CameraDevice cameraDevice3 = cameraDevice2;
        k<CameraDeviceWrapper, AndroidCameraState> kVarHandleQuirksBeforeClosing = handleQuirksBeforeClosing(cameraDeviceWrapper, cameraDevice3, androidCameraState, z, z2);
        if (kVarHandleQuirksBeforeClosing == null) {
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                android.util.Log.e(Log.TAG, "Failed to handle quirks before closing the camera device!");
            }
            cameraDeviceWrapper.onDeviceClosing();
            cameraDeviceWrapper.onDeviceClosed();
            androidCameraState.onFinalized$camera_camera2_pipe(cameraDevice3);
            return;
        }
        CameraDeviceWrapper cameraDeviceWrapper2 = (CameraDeviceWrapper) kVarHandleQuirksBeforeClosing.a();
        AndroidCameraState androidCameraState2 = (AndroidCameraState) kVarHandleQuirksBeforeClosing.b();
        Object objUnwrapAs = cameraDeviceWrapper2.unwrapAs((Class<Object>) CameraDevice.class);
        if (objUnwrapAs == null) {
            throw new IllegalStateException("Required value was null.");
        }
        cameraDeviceWrapper.onDeviceClosing();
        closeCameraDevice((CameraDevice) objUnwrapAs, androidCameraState2);
        cameraDeviceWrapper.onDeviceClosed();
        if (z) {
            androidCameraState.onFinalized$camera_camera2_pipe(cameraDevice3);
        }
    }

    public final Threads getThreads() {
        return this.threads;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCAMERA_CLOSE_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m1022getCAMERA_CLOSE_TIMEOUTUwyO8pc() {
            return Camera2DeviceCloserImpl.CAMERA_CLOSE_TIMEOUT;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
