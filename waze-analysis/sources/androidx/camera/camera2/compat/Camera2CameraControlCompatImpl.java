package androidx.camera.camera2.compat;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.ComboRequestListenerKt;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import h.a.r;
import h.g.b.x;
import h.k;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class Camera2CameraControlCompatImpl implements Camera2CameraControlCompat {
    private CompletableDeferred<Void> pendingSignal;
    private CompletableDeferred<Void> updateSignal;
    private final Object lock = new Object();
    private final Object updateSignalLock = new Object();
    private Camera2ImplConfig.Builder configBuilder = new Camera2ImplConfig.Builder();

    private final CompletableDeferred<Void> cancelSignal(CompletableDeferred<Void> completableDeferred, String str) {
        completableDeferred.b(new CameraControl.OperationCanceledException(str));
        return completableDeferred;
    }

    static /* synthetic */ CompletableDeferred cancelSignal$default(Camera2CameraControlCompatImpl camera2CameraControlCompatImpl, CompletableDeferred completableDeferred, String str, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            str = "Camera2CameraControl was updated with new options.";
        }
        camera2CameraControlCompatImpl.cancelSignal(completableDeferred, str);
        return completableDeferred;
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public void addRequestOption(CaptureRequestOptions captureRequestOptions) {
        x.f(captureRequestOptions, "bundle");
        synchronized (this.lock) {
            for (Config.Option option : captureRequestOptions.listOptions()) {
                x.d(option, "null cannot be cast to non-null type androidx.camera.core.impl.Config.Option<kotlin.Any>");
                this.configBuilder.getMutableConfig().insertOption(option, Config.OptionPriority.ALWAYS_OVERRIDE, captureRequestOptions.retrieveOption(option));
            }
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public am<Void> applyAsync(UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z) {
        Camera2ImplConfig camera2ImplConfigBuild;
        Object obj = this.lock;
        CompletableDeferred<Void> completableDeferredJ = bo.j();
        synchronized (obj) {
            camera2ImplConfigBuild = this.configBuilder.build();
        }
        synchronized (this.updateSignalLock) {
            if (useCaseCameraRequestControl != null) {
                CompletableDeferred<Void> completableDeferred = this.updateSignal;
                if (z) {
                    if (completableDeferred != null) {
                        cancelSignal$default(this, completableDeferred, null, 1, null);
                    }
                } else if (completableDeferred != null) {
                    CoroutineAdaptersKt.propagateTo(completableDeferredJ, completableDeferred);
                }
                this.updateSignal = completableDeferredJ;
                useCaseCameraRequestControl.updateCamera2ConfigAsync(camera2ImplConfigBuild, r.e(new k("Camera2CameraControl.tag", Integer.valueOf(completableDeferredJ.hashCode()))));
            } else {
                CompletableDeferred<Void> completableDeferred2 = this.pendingSignal;
                if (completableDeferred2 != null) {
                    cancelSignal$default(this, completableDeferred2, null, 1, null);
                }
                this.pendingSignal = completableDeferredJ;
            }
        }
        return completableDeferredJ;
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public void cancelCurrentTask() {
        synchronized (this.updateSignalLock) {
            CompletableDeferred<Void> completableDeferred = this.updateSignal;
            if (completableDeferred != null) {
                this.updateSignal = null;
                cancelSignal(completableDeferred, "The camera control has became inactive.");
            }
            CompletableDeferred<Void> completableDeferred2 = this.pendingSignal;
            if (completableDeferred2 != null) {
                this.pendingSignal = null;
                cancelSignal(completableDeferred2, "The camera control has became inactive.");
            }
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public void clearRequestOption() {
        synchronized (this.lock) {
            this.configBuilder = new Camera2ImplConfig.Builder();
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public CaptureRequestOptions getRequestOption() {
        CaptureRequestOptions captureRequestOptionsBuild;
        synchronized (this.lock) {
            captureRequestOptionsBuild = CaptureRequestOptions.Builder.Companion.from(this.configBuilder.build()).build();
        }
        return captureRequestOptionsBuild;
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
    public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        synchronized (this.updateSignalLock) {
            CompletableDeferred<Void> completableDeferred = this.updateSignal;
            if (completableDeferred != null && ComboRequestListenerKt.containsTag(requestMetadata, "Camera2CameraControl.tag", Integer.valueOf(completableDeferred.hashCode()))) {
                completableDeferred.a(null);
                this.updateSignal = null;
                CompletableDeferred<Void> completableDeferred2 = this.pendingSignal;
                if (completableDeferred2 != null) {
                    completableDeferred2.a(null);
                    this.pendingSignal = null;
                }
            }
        }
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

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public /* synthetic */ void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m860$default$onTotalCaptureResultCcXjc1I(this, requestMetadata, j2, frameInfo);
    }
}
