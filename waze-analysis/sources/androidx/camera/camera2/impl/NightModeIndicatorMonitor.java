package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import h.g.b.x;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class NightModeIndicatorMonitor implements Request.Listener, UseCaseCameraControl {
    private final NightModeIndicatorMonitor$_nightModeIndicator$1 _nightModeIndicator;
    private UseCaseCameraRequestControl _requestControl;
    private final boolean isSupported;
    private final AtomicInteger nightModeIndicatorAtomic;
    private final LiveData<Integer> nightModeIndicatorLiveData;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(NightModeIndicatorMonitor nightModeIndicatorMonitor);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.camera.camera2.impl.NightModeIndicatorMonitor$_nightModeIndicator$1] */
    public NightModeIndicatorMonitor(CameraMetadata cameraMetadata, final ComboRequestListener comboRequestListener) {
        x.f(comboRequestListener, "requestListener");
        this.isSupported = cameraMetadata != null && Build.VERSION.SDK_INT >= 36 && cameraMetadata.getResultKeys().contains(CaptureResult.EXTENSION_NIGHT_MODE_INDICATOR);
        this.nightModeIndicatorAtomic = new AtomicInteger(0);
        ?? r4 = new MutableLiveData<Integer>() { // from class: androidx.camera.camera2.impl.NightModeIndicatorMonitor$_nightModeIndicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // androidx.lifecycle.LiveData
            protected void onActive() {
                if (this.this$0.isSupported()) {
                    ComboRequestListener comboRequestListener2 = comboRequestListener;
                    NightModeIndicatorMonitor nightModeIndicatorMonitor = this.this$0;
                    ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                    x.e(scheduledExecutorServiceMainThreadExecutor, "mainThreadExecutor(...)");
                    comboRequestListener2.addListener(nightModeIndicatorMonitor, scheduledExecutorServiceMainThreadExecutor);
                }
            }

            @Override // androidx.lifecycle.LiveData
            protected void onInactive() {
                if (this.this$0.isSupported()) {
                    comboRequestListener.removeListener(this.this$0);
                }
            }
        };
        this._nightModeIndicator = r4;
        this.nightModeIndicatorLiveData = (LiveData) r4;
    }

    private final void setLiveDataValue(int i2) {
        if (this.nightModeIndicatorAtomic.getAndSet(i2) != i2) {
            boolean zIsMainThread = Threads.isMainThread();
            NightModeIndicatorMonitor$_nightModeIndicator$1 nightModeIndicatorMonitor$_nightModeIndicator$1 = this._nightModeIndicator;
            if (zIsMainThread) {
                nightModeIndicatorMonitor$_nightModeIndicator$1.setValue(Integer.valueOf(i2));
            } else {
                nightModeIndicatorMonitor$_nightModeIndicator$1.postValue(Integer.valueOf(i2));
            }
        }
    }

    public final LiveData<Integer> getNightModeIndicatorLiveData() {
        return this.nightModeIndicatorLiveData;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onAborted(Request request) {
        x.f(request, "request");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public /* synthetic */ void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m854$default$onCompleteCcXjc1I(this, requestMetadata, j2, frameInfo);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public /* synthetic */ void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        Request.Listener.CC.m855$default$onFailedCcXjc1I(this, requestMetadata, j2, requestFailure);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public /* synthetic */ void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        Request.Listener.CC.m856$default$onPartialCaptureResultCcXjc1I(this, requestMetadata, j2, frameMetadata);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w */
    public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceAborted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public /* synthetic */ void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceCreated(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public /* synthetic */ void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[PHI: r3
  0x0039: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:11:0x0033, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo195onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata r1, long r2, androidx.camera.camera2.pipe.FrameInfo r4) {
        /*
            r0 = this;
            java.lang.String r2 = "requestMetadata"
            h.g.b.x.f(r1, r2)
            java.lang.String r1 = "totalCaptureResult"
            h.g.b.x.f(r4, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 36
            if (r1 < r2) goto L3d
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r1 = r0._requestControl
            if (r1 == 0) goto L3d
            androidx.camera.camera2.pipe.FrameMetadata r1 = r4.getMetadata()
            android.hardware.camera2.CaptureResult$Key r2 = com.bumptech.glide.load.n$$ExternalSyntheticApiModelOutline0.m13513m()
            java.lang.String r3 = "EXTENSION_NIGHT_MODE_INDICATOR"
            h.g.b.x.e(r2, r3)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 0
            if (r1 == 0) goto L3a
            r3 = 1
            if (r1 == r3) goto L39
            r3 = 2
            if (r1 == r3) goto L39
            goto L3a
        L39:
            r2 = r3
        L3a:
            r0.setLiveDataValue(r2)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.NightModeIndicatorMonitor.mo195onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata, long, androidx.camera.camera2.pipe.FrameInfo):void");
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        setLiveDataValue(0);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        if (useCaseCameraRequestControl == null) {
            setLiveDataValue(0);
        }
    }
}
