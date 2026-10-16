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
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class LowLightBoostControl implements UseCaseCameraControl {
    private final MutableLiveData<Integer> _lowLightBoostState;
    private UseCaseCameraRequestControl _requestControl;
    private CompletableDeferred<ab> _updateSignal;
    private final CameraMetadata cameraMetadata;
    private am<Boolean> checkFrameRateJob;
    private final ComboRequestListener comboRequestListener;
    private boolean isLowLightBoostOn;
    private final boolean isLowLightBoostSupported;
    private final AtomicInteger lowLightBoostStateAtomic;
    private final State3AControl state3AControl;
    private final UseCaseThreads threads;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(LowLightBoostControl lowLightBoostControl);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1, reason: invalid class name and case insensitive filesystem */
    final class C01451 extends g implements p<af, e<? super Boolean>, Object> {
        final /* synthetic */ List<UseCase> $useCases;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01451(List<? extends UseCase> list, e<? super C01451> eVar) {
            super(2, eVar);
            this.$useCases = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return LowLightBoostControl.this.new C01451(this.$useCases, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Boolean> eVar) {
            return ((C01451) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return Boolean.valueOf(((Number) LowLightBoostControl.this.getSessionConfig(this.$useCases).getExpectedFrameRateRange().getUpper()).intValue() > 30);
        }
    }

    public LowLightBoostControl(CameraMetadata cameraMetadata, State3AControl state3AControl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        x.f(state3AControl, "state3AControl");
        x.f(useCaseThreads, "threads");
        x.f(comboRequestListener, "comboRequestListener");
        this.cameraMetadata = cameraMetadata;
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        this.comboRequestListener = comboRequestListener;
        boolean z = false;
        if (cameraMetadata != null && CameraMetadata.Companion.getSupportsLowLightBoost(cameraMetadata)) {
            z = true;
        }
        this.isLowLightBoostSupported = z;
        this._lowLightBoostState = new MutableLiveData<>(-1);
        this.lowLightBoostStateAtomic = new AtomicInteger(-1);
        if (z) {
            comboRequestListener.addListener(new Request.Listener() { // from class: androidx.camera.camera2.impl.LowLightBoostControl.1
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

                @Override // androidx.camera.camera2.pipe.Request.Listener
                /* renamed from: onTotalCaptureResult-CcXjc1I */
                public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                    x.f(requestMetadata, "requestMetadata");
                    x.f(frameInfo, "totalCaptureResult");
                    if (Build.VERSION.SDK_INT < 35 || LowLightBoostControl.this._requestControl == null || !LowLightBoostControl.this.isLowLightBoostOn) {
                        return;
                    }
                    FrameMetadata metadata = frameInfo.getMetadata();
                    CaptureResult.Key key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
                    x.e(key, "CONTROL_LOW_LIGHT_BOOST_STATE");
                    Integer num = (Integer) metadata.get(key);
                    if (num != null) {
                        LowLightBoostControl lowLightBoostControl = LowLightBoostControl.this;
                        lowLightBoostControl.setLiveDataValue(lowLightBoostControl._lowLightBoostState, num.intValue() != 1 ? 0 : 1);
                    }
                }
            }, useCaseThreads.getSequentialExecutor());
        }
    }

    public static final /* synthetic */ CompletableDeferred access$createFailureResult(LowLightBoostControl lowLightBoostControl, CompletableDeferred completableDeferred, Exception exc) {
        lowLightBoostControl.createFailureResult(completableDeferred, exc);
        return completableDeferred;
    }

    private final CompletableDeferred<ab> createFailureResult(CompletableDeferred<ab> completableDeferred, Exception exc) {
        completableDeferred.b(exc);
        return completableDeferred;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionConfig getSessionConfig(Collection<? extends UseCase> collection) {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            validatingBuilder.add(((UseCase) it.next()).getSessionConfig());
        }
        SessionConfig sessionConfigBuild = validatingBuilder.build();
        x.e(sessionConfigBuild, "build(...)");
        return sessionConfigBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLiveDataValue(MutableLiveData<Integer> mutableLiveData, int i2) {
        if (this.lowLightBoostStateAtomic.getAndSet(i2) != i2) {
            if (Threads.isMainThread()) {
                mutableLiveData.setValue(Integer.valueOf(i2));
            } else {
                mutableLiveData.postValue(Integer.valueOf(i2));
            }
        }
    }

    public static /* synthetic */ am setLowLightBoostAsync$default(LowLightBoostControl lowLightBoostControl, boolean z, boolean z2, int i2, Object obj) {
        return lowLightBoostControl.setLowLightBoostAsync(z, z2 | (!((i2 & 2) == 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRunningTaskInternal() {
        CompletableDeferred<ab> completableDeferred = this._updateSignal;
        if (completableDeferred != null) {
            createFailureResult(completableDeferred, new CameraControl.OperationCanceledException("There is a new enableLowLightBoost being set"));
        }
        this._updateSignal = null;
    }

    public final am<Boolean> getCheckFrameRateJob$camera_camera2() {
        return this.checkFrameRateJob;
    }

    public final LiveData<Integer> getLowLightBoostStateLiveData() {
        return this._lowLightBoostState;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final void onSessionConfigChanged(List<? extends UseCase> list) {
        x.f(list, "useCases");
        if (this.isLowLightBoostSupported) {
            if (list.isEmpty()) {
                this.checkFrameRateJob = bo.h(false);
            } else {
                this.checkFrameRateJob = aj.y(this.threads.getSequentialScope(), null, null, new C01451(list, null), 3);
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        stopRunningTaskInternal();
        setLowLightBoostAsync$default(this, false, false, 2, null);
    }

    public final void setCheckFrameRateJob$camera_camera2(am<Boolean> amVar) {
        this.checkFrameRateJob = amVar;
    }

    public final am<ab> setLowLightBoostAsync(boolean z, boolean z2) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        boolean z3 = this.isLowLightBoostSupported;
        CompletableDeferred<ab> completableDeferredJ = bo.j();
        if (z3) {
            aj.z(this.threads.getSequentialScope(), null, null, new LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(null, this, completableDeferredJ, z, z2), 3);
            return completableDeferredJ;
        }
        createFailureResult(completableDeferredJ, new IllegalStateException("Low Light Boost is not supported!"));
        return completableDeferredJ;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        if (this.isLowLightBoostOn) {
            if (useCaseCameraRequestControl != null) {
                setLowLightBoostAsync(true, false);
            } else {
                setLiveDataValue(this._lowLightBoostState, 0);
            }
        }
    }

    public static /* synthetic */ void getCheckFrameRateJob$camera_camera2$annotations() {
    }
}
