package androidx.camera.camera2.adapter;

import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseCamera;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraControlAdapter implements CameraControlInternal {
    private final Camera2CameraControl camera2cameraControl;
    private final CameraProperties cameraProperties;
    private final EvCompControl evCompControl;
    private final FlashControl flashControl;
    private final FocusMeteringControl focusMeteringControl;
    private final LowLightBoostControl lowLightBoostControl;
    private final StillCaptureRequestControl stillCaptureRequestControl;
    private final UseCaseThreads threads;
    private final TorchControl torchControl;
    private final UseCaseManager useCaseManager;
    private final VideoUsageControl videoUsageControl;
    private final ZoomControl zoomControl;
    private final ZslControl zslControl;

    public static /* synthetic */ Void $r8$lambda$_U_T4yQVYsP1g9IqObAFhPRG_pc(Result3A result3A) {
        return null;
    }

    public CameraControlAdapter(CameraProperties cameraProperties, EvCompControl evCompControl, FlashControl flashControl, FocusMeteringControl focusMeteringControl, StillCaptureRequestControl stillCaptureRequestControl, TorchControl torchControl, LowLightBoostControl lowLightBoostControl, ZoomControl zoomControl, ZslControl zslControl, Camera2CameraControl camera2CameraControl, UseCaseManager useCaseManager, UseCaseThreads useCaseThreads, VideoUsageControl videoUsageControl) {
        x.f(cameraProperties, "cameraProperties");
        x.f(evCompControl, "evCompControl");
        x.f(flashControl, "flashControl");
        x.f(focusMeteringControl, "focusMeteringControl");
        x.f(stillCaptureRequestControl, "stillCaptureRequestControl");
        x.f(torchControl, "torchControl");
        x.f(lowLightBoostControl, "lowLightBoostControl");
        x.f(zoomControl, "zoomControl");
        x.f(zslControl, "zslControl");
        x.f(camera2CameraControl, "camera2cameraControl");
        x.f(useCaseManager, "useCaseManager");
        x.f(useCaseThreads, "threads");
        x.f(videoUsageControl, "videoUsageControl");
        this.cameraProperties = cameraProperties;
        this.evCompControl = evCompControl;
        this.flashControl = flashControl;
        this.focusMeteringControl = focusMeteringControl;
        this.stillCaptureRequestControl = stillCaptureRequestControl;
        this.torchControl = torchControl;
        this.lowLightBoostControl = lowLightBoostControl;
        this.zoomControl = zoomControl;
        this.zslControl = zslControl;
        this.camera2cameraControl = camera2CameraControl;
        this.useCaseManager = useCaseManager;
        this.threads = useCaseThreads;
        this.videoUsageControl = videoUsageControl;
    }

    private static final Void cancelFocusAndMetering$lambda$0$0(Result3A result3A) {
        return null;
    }

    static final bm enableLowLightBoostAsync$lambda$3(l lVar, Object obj) {
        return (bm) lVar.invoke(obj);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(Config config) {
        x.f(config, "config");
        this.camera2cameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.Companion.from(config).build());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(SessionConfig.Builder builder) {
        x.f(builder, "sessionConfigBuilder");
        this.zslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Void> cancelFocusAndMetering() {
        CompletableDeferred completableDeferredJ = bo.j();
        CoroutineAdaptersKt.propagateTo(this.focusMeteringControl.cancelFocusAndMeteringAsync(), completableDeferredJ, new l() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return null;
            }
        });
        bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default((am) completableDeferredJ, (Object) null, 1, (Object) null));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.camera2cameraControl.clearCaptureRequestOptions();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearZslConfig() {
        this.zslControl.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.videoUsageControl.decrementUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Void> enableLowLightBoostAsync(final boolean z) throws Throwable {
        bm<Void> bmVarAsVoidListenableFuture;
        if (!CameraMetadata.Companion.getSupportsLowLightBoost(this.cameraProperties.getMetadata())) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Unable to enable/disable low-light boost due to it is not supported.");
            }
            bm<Void> bmVarImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("Low-light boost is not supported!"));
            x.e(bmVarImmediateFailedFuture, "immediateFailedFuture(...)");
            return bmVarImmediateFailedFuture;
        }
        Integer value = this.torchControl.getTorchStateLiveData().getValue();
        if (value != null && value.intValue() == 1) {
            bmVarAsVoidListenableFuture = CoroutineAdaptersKt.asVoidListenableFuture(TorchControl.setTorchAsync$default(this.torchControl, false, false, false, 6, null));
        } else {
            ab abVar = ab.f48028a;
            CompletableDeferred completableDeferredH = bo.h(abVar);
            completableDeferredH.a(abVar);
            bmVarAsVoidListenableFuture = CoroutineAdaptersKt.asVoidListenableFuture(completableDeferredH);
        }
        final l lVar = new l() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CoroutineAdaptersKt.asVoidListenableFuture(LowLightBoostControl.setLowLightBoostAsync$default(this.f$0.lowLightBoostControl, z, false, 2, null));
            }
        };
        bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(Futures.transformAsync(bmVarAsVoidListenableFuture, new AsyncFunction() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final bm apply(Object obj) {
                return CameraControlAdapter.enableLowLightBoostAsync$lambda$3(lVar, obj);
            }
        }, CameraXExecutors.directExecutor()));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Void> enableTorch(boolean z) {
        Integer value;
        if (!CameraMetadata.Companion.getSupportsLowLightBoost(this.cameraProperties.getMetadata()) || ((value = this.lowLightBoostControl.getLowLightBoostStateLiveData().getValue()) != null && value.intValue() == -1)) {
            bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asVoidListenableFuture(TorchControl.setTorchAsync$default(this.torchControl, z, false, false, 6, null)));
            x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
            return bmVarNonCancellationPropagating;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Unable to enable/disable torch when low-light boost is on.");
        }
        bm<Void> bmVarImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
        x.e(bmVarImmediateFailedFuture, "immediateFailedFuture(...)");
        return bmVarImmediateFailedFuture;
    }

    public final Camera2CameraControl getCamera2cameraControl() {
        return this.camera2cameraControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public bm<CameraCapturePipeline> getCameraCapturePipelineAsync(final int i2, final int i3) {
        final UseCaseCamera camera = this.useCaseManager.getCamera();
        if (camera == null) {
            bm<CameraCapturePipeline> bmVarImmediateFailedFuture = Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
            x.e(bmVarImmediateFailedFuture, "immediateFailedFuture(...)");
            return bmVarImmediateFailedFuture;
        }
        final af sequentialScope = this.threads.getSequentialScope();
        bm<CameraCapturePipeline> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.camera.camera2.adapter.CameraControlAdapter$getCameraCapturePipelineAsync$$inlined$future$1$1, reason: invalid class name */
            public final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ UseCaseCamera $camera$inlined;
                final /* synthetic */ int $captureMode$inlined;
                final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
                final /* synthetic */ int $flashType$inlined;
                int I$0;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ CameraControlAdapter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(CallbackToFutureAdapter.Completer completer, e eVar, UseCaseCamera useCaseCamera, int i2, CameraControlAdapter cameraControlAdapter, int i3) {
                    super(2, eVar);
                    this.$completer = completer;
                    this.$camera$inlined = useCaseCamera;
                    this.$captureMode$inlined = i2;
                    this.this$0 = cameraControlAdapter;
                    this.$flashType$inlined = i3;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new AnonymousClass1(this.$completer, eVar, this.$camera$inlined, this.$captureMode$inlined, this.this$0, this.$flashType$inlined);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    CallbackToFutureAdapter.Completer completer;
                    Object objAwaitFlashModeUpdate;
                    UseCaseCamera useCaseCamera;
                    int i2;
                    CallbackToFutureAdapter.Completer completer2;
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i3 = this.label;
                    if (i3 == 0) {
                        c.b(obj);
                        completer = this.$completer;
                        UseCaseCamera useCaseCamera2 = this.$camera$inlined;
                        int i4 = this.$captureMode$inlined;
                        FlashControl flashControl = this.this$0.flashControl;
                        this.L$0 = completer;
                        this.L$1 = useCaseCamera2;
                        this.I$0 = i4;
                        this.label = 1;
                        objAwaitFlashModeUpdate = flashControl.awaitFlashModeUpdate(this);
                        if (objAwaitFlashModeUpdate != aVar) {
                            useCaseCamera = useCaseCamera2;
                            i2 = i4;
                        }
                        return aVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CallbackToFutureAdapter.Completer completer3 = (CallbackToFutureAdapter.Completer) this.L$0;
                        c.b(obj);
                        completer2 = completer3;
                        completer2.set(obj);
                        return ab.f48028a;
                    }
                    i2 = this.I$0;
                    UseCaseCamera useCaseCamera3 = (UseCaseCamera) this.L$1;
                    CallbackToFutureAdapter.Completer completer4 = (CallbackToFutureAdapter.Completer) this.L$0;
                    c.b(obj);
                    objAwaitFlashModeUpdate = obj;
                    completer = completer4;
                    useCaseCamera = useCaseCamera3;
                    int iIntValue = ((Number) objAwaitFlashModeUpdate).intValue();
                    int i5 = this.$flashType$inlined;
                    this.L$0 = completer;
                    this.L$1 = null;
                    this.label = 2;
                    Object cameraCapturePipeline = useCaseCamera.getCameraCapturePipeline(i2, iIntValue, i5, this);
                    if (cameraCapturePipeline != aVar) {
                        CallbackToFutureAdapter.Completer completer5 = completer;
                        obj = cameraCapturePipeline;
                        completer2 = completer5;
                        completer2.set(obj);
                        return ab.f48028a;
                    }
                    return aVar;
                }
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                x.f(completer, "completer");
                return aj.z(sequentialScope, null, null, new AnonymousClass1(completer, null, camera, i2, this, i3), 3);
            }
        });
        x.e(future, "getFuture(...)");
        return future;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.flashControl.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config getInteropConfig() {
        return this.camera2cameraControl.getCaptureRequestOptions();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public SessionConfig getSessionConfig() {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isWarnEnabled(Log.TAG)) {
            android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "TODO: getSessionConfig is not yet supported");
        }
        SessionConfig sessionConfigDefaultEmptySessionConfig = SessionConfig.defaultEmptySessionConfig();
        x.e(sessionConfigDefaultEmptySessionConfig, "defaultEmptySessionConfig(...)");
        return sessionConfigDefaultEmptySessionConfig;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.videoUsageControl.incrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        return this.videoUsageControl.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.zslControl.isZslDisabledByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Integer> setExposureCompensationIndex(int i2) {
        bm<Integer> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default(EvCompControl.updateAsync$default(this.evCompControl, i2, false, 2, null), (Object) null, 1, (Object) null));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i2) {
        FlashControl.setFlashAsync$default(this.flashControl, i2, false, 2, null);
        this.zslControl.setZslDisabledByFlashMode(i2 == 1 || i2 == 0);
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Void> setLinearZoom(float f2) {
        return this.zoomControl.setLinearZoom(f2);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.flashControl.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Void> setTorchStrengthLevel(int i2) {
        bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asVoidListenableFuture(this.torchControl.setTorchStrengthLevelAsync(i2)));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    @Override // androidx.camera.core.CameraControl
    public bm<Void> setZoomRatio(float f2) {
        return this.zoomControl.setZoomRatio(f2);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z) {
        this.zslControl.setZslDisabledByUserCaseConfig(z);
    }

    @Override // androidx.camera.core.CameraControl
    public bm<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        x.f(focusMeteringAction, "action");
        bm<FocusMeteringResult> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(FocusMeteringControl.startFocusAndMetering$default(this.focusMeteringControl, focusMeteringAction, 0L, 2, null));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public bm<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i2, int i3) {
        x.f(list, "captureConfigs");
        return this.stillCaptureRequestControl.issueCaptureRequests(list, i2, i3);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public /* synthetic */ CameraControlInternal getImplementation() {
        return this;
    }
}
