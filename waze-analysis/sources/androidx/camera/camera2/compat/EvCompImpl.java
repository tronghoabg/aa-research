package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.CameraControl;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.k;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class EvCompImpl implements EvCompCompat {
    private final CameraProperties cameraProperties;
    private final ComboRequestListener comboRequestListener;
    private final Range<Integer> range;
    private final Rational step;
    private final boolean supported;
    private final UseCaseThreads threads;
    private Request.Listener updateListener;
    private CompletableDeferred<Integer> updateSignal;

    public EvCompImpl(CameraProperties cameraProperties, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        Integer num;
        Rational rational;
        x.f(cameraProperties, "cameraProperties");
        x.f(useCaseThreads, "threads");
        x.f(comboRequestListener, "comboRequestListener");
        this.cameraProperties = cameraProperties;
        this.threads = useCaseThreads;
        this.comboRequestListener = comboRequestListener;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        x.e(key, "CONTROL_AE_COMPENSATION_RANGE");
        Object orDefault = metadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) EvCompCompatKt.getEMPTY_RANGE());
        x.e(orDefault, "getOrDefault(...)");
        this.range = (Range) orDefault;
        Integer num2 = (Integer) getRange().getUpper();
        boolean z = false;
        if ((num2 == null || num2.intValue() != 0) && ((num = (Integer) getRange().getLower()) == null || num.intValue() != 0)) {
            z = true;
        }
        this.supported = z;
        if (getSupported()) {
            CameraMetadata metadata2 = cameraProperties.getMetadata();
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            x.e(key2, "CONTROL_AE_COMPENSATION_STEP");
            Object obj = metadata2.get((CameraCharacteristics.Key<Object>) key2);
            x.c(obj);
            rational = (Rational) obj;
        } else {
            rational = Rational.ZERO;
            x.c(rational);
        }
        this.step = rational;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab applyAsync$lambda$2$0(EvCompImpl evCompImpl, AnonymousClass3 anonymousClass3, Throwable th) {
        evCompImpl.comboRequestListener.removeListener(anonymousClass3);
        return ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.camera.camera2.compat.EvCompImpl$applyAsync$3] */
    @Override // androidx.camera.camera2.compat.EvCompCompat
    public am<Integer> applyAsync(final int i2, UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z) {
        x.f(useCaseCameraRequestControl, "requestControl");
        final CompletableDeferred<Integer> completableDeferredJ = bo.j();
        CompletableDeferred<Integer> completableDeferred = this.updateSignal;
        if (completableDeferred != null) {
            if (z) {
                completableDeferred.b(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            } else {
                CoroutineAdaptersKt.propagateTo(completableDeferredJ, completableDeferred);
            }
        }
        this.updateSignal = completableDeferredJ;
        Request.Listener listener = this.updateListener;
        if (listener != null) {
            this.comboRequestListener.removeListener(listener);
            this.updateListener = null;
        }
        UseCaseCameraRequestControl.CC.setParametersAsync$default(useCaseCameraRequestControl, r.e(new k(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i2))), null, null, 6, null);
        final ?? r11 = new Request.Listener() { // from class: androidx.camera.camera2.compat.EvCompImpl.applyAsync.3
            @Override // androidx.camera.camera2.pipe.Request.Listener
            public /* synthetic */ void onAborted(Request request) {
                x.f(request, "request");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onBufferLost-DlC0U5Y */
            public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i3) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onBufferLost-iiEMlm4 */
            public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i3, int i4) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i3) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onComplete-CcXjc1I */
            public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "result");
                FrameMetadata metadata = frameInfo.getMetadata();
                CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
                x.e(key, "CONTROL_AE_STATE");
                Integer num = (Integer) metadata.get(key);
                FrameMetadata metadata2 = frameInfo.getMetadata();
                CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
                x.e(key2, "CONTROL_AE_EXPOSURE_COMPENSATION");
                Integer num2 = (Integer) metadata2.get(key2);
                if (num == null || num2 == null) {
                    if (num2 != null) {
                        if (num2.intValue() == i2) {
                            completableDeferredJ.a(Integer.valueOf(i2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                    if (num2.intValue() == i2) {
                        completableDeferredJ.a(Integer.valueOf(i2));
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
        };
        Request.Listener listener2 = (Request.Listener) r11;
        this.comboRequestListener.addListener(listener2, this.threads.getSequentialExecutor());
        completableDeferredJ.bY(new l() { // from class: androidx.camera.camera2.compat.EvCompImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EvCompImpl.applyAsync$lambda$2$0(this.f$0, r11, (Throwable) obj);
            }
        });
        this.updateListener = listener2;
        return completableDeferredJ;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public Range<Integer> getRange() {
        return this.range;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public Rational getStep() {
        return this.step;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public boolean getSupported() {
        return this.supported;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public void stopRunningTask(Throwable th) {
        x.f(th, "throwable");
        CompletableDeferred<Integer> completableDeferred = this.updateSignal;
        if (completableDeferred != null) {
            completableDeferred.b(th);
        }
    }
}
