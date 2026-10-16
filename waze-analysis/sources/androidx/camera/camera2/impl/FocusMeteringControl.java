package androidx.camera.camera2.impl;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.adapter.FrameMetadataConverter;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.ConvergenceUtils;
import com.google.d.m.a.bm;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class FocusMeteringControl implements UseCaseCameraControl, UseCaseManager.RunningUseCasesChangeListener {
    public static final long AUTO_FOCUS_TIMEOUT_DURATION = 5000;
    public static final Companion Companion = new Companion(null);
    public static final int METERING_WEIGHT_DEFAULT = 1000;
    private UseCaseCameraRequestControl _requestControl;
    private am<Result3A> activeFocusMetering3Result;
    private br autoCancelJob;
    private final List<AeMode> availableAeModes;
    private final List<AfMode> availableAfModes;
    private final CameraProperties cameraProperties;
    private CompletableDeferred<Result3A> cancelSignal;
    private br focusTimeoutJob;
    private final Integer maxAeRegionCount;
    private final Integer maxAfRegionCount;
    private final Integer maxAwbRegionCount;
    private final MeteringRegionCorrection meteringRegionCorrection;
    private Rational previewAspectRatio;
    private final State3AControl state3AControl;
    private final UseCaseThreads threads;
    private CompletableDeferred<FocusMeteringResult> updateSignal;
    private final ZoomCompat zoomCompat;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(FocusMeteringControl focusMeteringControl);
    }

    public FocusMeteringControl(CameraProperties cameraProperties, MeteringRegionCorrection meteringRegionCorrection, State3AControl state3AControl, UseCaseThreads useCaseThreads, ZoomCompat zoomCompat) {
        ArrayList arrayList;
        x.f(cameraProperties, "cameraProperties");
        x.f(meteringRegionCorrection, "meteringRegionCorrection");
        x.f(state3AControl, "state3AControl");
        x.f(useCaseThreads, "threads");
        x.f(zoomCompat, "zoomCompat");
        this.cameraProperties = cameraProperties;
        this.meteringRegionCorrection = meteringRegionCorrection;
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        this.zoomCompat = zoomCompat;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        x.e(key, "CONTROL_MAX_REGIONS_AF");
        this.maxAfRegionCount = (Integer) metadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) 0);
        CameraMetadata metadata2 = cameraProperties.getMetadata();
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        x.e(key2, "CONTROL_MAX_REGIONS_AE");
        this.maxAeRegionCount = (Integer) metadata2.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key2, (CameraCharacteristics.Key) 0);
        CameraMetadata metadata3 = cameraProperties.getMetadata();
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        x.e(key3, "CONTROL_MAX_REGIONS_AWB");
        this.maxAwbRegionCount = (Integer) metadata3.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key3, (CameraCharacteristics.Key) 0);
        CameraMetadata metadata4 = cameraProperties.getMetadata();
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        x.e(key4, "CONTROL_AE_AVAILABLE_MODES");
        int[] iArr = (int[]) metadata4.get(key4);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            ArrayList arrayList3 = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList3.add(AeMode.Companion.m305fromIntOrNullkQd0u18(i2));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.availableAeModes = arrayList;
        CameraMetadata metadata5 = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        x.e(key5, "CONTROL_AF_AVAILABLE_MODES");
        int[] iArr2 = (int[]) metadata5.get(key5);
        if (iArr2 != null) {
            ArrayList arrayList4 = new ArrayList(iArr2.length);
            for (int i3 : iArr2) {
                arrayList4.add(AfMode.Companion.m323fromIntOrNullMKXwA8g(i3));
            }
            arrayList2 = arrayList4;
        }
        this.availableAfModes = arrayList2;
    }

    private final am<Result3A> cancel3ALocksAndResetMode(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.state3AControl.setPreferredFocusModeAsync(null);
        return useCaseCameraRequestControl.cancelFocusAndMeteringAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cancelFocusAndMeteringAsync$lambda$0$0(CompletableDeferred completableDeferred, Throwable th) {
        completableDeferred.a(null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final am<Result3A> cancelFocusAndMeteringNowAsync(UseCaseCameraRequestControl useCaseCameraRequestControl, CompletableDeferred<FocusMeteringResult> completableDeferred) {
        br brVar = this.focusTimeoutJob;
        if (brVar != null) {
            brVar.s(null);
        }
        br brVar2 = this.autoCancelJob;
        if (brVar2 != null) {
            brVar2.s(null);
        }
        if (completableDeferred != null) {
            setCancelException(completableDeferred, "Cancelled by cancelFocusAndMetering()");
        }
        return cancel3ALocksAndResetMode(useCaseCameraRequestControl);
    }

    /* renamed from: getAeAwbConvergedCondition-5CBcw_o, reason: not valid java name */
    private final l<FrameMetadata, Boolean> m257getAeAwbConvergedCondition5CBcw_o(final Lock3ABehavior lock3ABehavior, final Lock3ABehavior lock3ABehavior2) {
        if (lock3ABehavior == null && lock3ABehavior2 == null) {
            return null;
        }
        return new l() { // from class: androidx.camera.camera2.impl.FocusMeteringControl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FocusMeteringControl.getAeAwbConvergedCondition_5CBcw_o$lambda$0(lock3ABehavior, lock3ABehavior2, (FrameMetadata) obj));
            }
        };
    }

    static final boolean getAeAwbConvergedCondition_5CBcw_o$lambda$0(Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, FrameMetadata frameMetadata) {
        x.f(frameMetadata, "frameMetadata");
        return ConvergenceUtils.is3AConverged(FrameMetadataConverter.INSTANCE.toCameraCaptureResult(frameMetadata), false, (lock3ABehavior != null ? 2 : 0) | (lock3ABehavior2 != null ? 4 : 0));
    }

    private final Rect getCropSensorRegion() {
        return this.zoomCompat.getCropSensorRegion();
    }

    private final Rational getDefaultAspectRatio() {
        Rational rational = this.previewAspectRatio;
        return rational == null ? new Rational(getCropSensorRegion().width(), getCropSensorRegion().height()) : rational;
    }

    /* renamed from: getSupportedAeMode-rTgdhRc, reason: not valid java name */
    private final int m258getSupportedAeModerTgdhRc(int i2) {
        List<AeMode> list = this.availableAeModes;
        return list == null ? AeMode.Companion.m306getOFFbOjpiJc() : list.contains(AeMode.m294boximpl(i2)) ? i2 : this.availableAeModes.contains(AeMode.m294boximpl(AeMode.Companion.m307getONbOjpiJc())) ? AeMode.Companion.m307getONbOjpiJc() : AeMode.Companion.m306getOFFbOjpiJc();
    }

    /* renamed from: isAfModeSupported-wvCmZyc, reason: not valid java name */
    private final boolean m259isAfModeSupportedwvCmZyc(int i2) {
        List<AfMode> list = this.availableAfModes;
        if (list == null) {
            return false;
        }
        return list.contains(AfMode.m313boximpl(i2));
    }

    private final void propagateToFocusMeteringResultDeferred(final am<Result3A> amVar, final CompletableDeferred<FocusMeteringResult> completableDeferred, final boolean z) {
        amVar.bY(new l() { // from class: androidx.camera.camera2.impl.FocusMeteringControl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FocusMeteringControl.propagateToFocusMeteringResultDeferred$lambda$0(completableDeferred, amVar, this, z, (Throwable) obj);
            }
        });
    }

    static final ab propagateToFocusMeteringResultDeferred$lambda$0(CompletableDeferred completableDeferred, am amVar, FocusMeteringControl focusMeteringControl, boolean z, Throwable th) {
        if (th != null) {
            boolean z2 = th instanceof CancellationException;
            if (z2) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                }
            } else {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                }
            }
            if (z2) {
                th = new CameraControl.OperationCanceledException("Focus/metering operation cancelled.", th);
            }
            completableDeferred.b(th);
        } else {
            Result3A result3A = (Result3A) amVar.e();
            Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                String str = Camera2Logger.TRUNCATED_TAG;
                Objects.toString(result3A);
                android.util.Log.d(str, "propagateToFocusMeteringResultDeferred: result3A = ".concat(String.valueOf(result3A)));
            }
            if (Result3A.Status.m902equalsimpl0(result3A.m898getStatusJvTi9ms(), Result3A.Status.Companion.m909getSUBMIT_FAILEDJvTi9ms())) {
                completableDeferred.b(new CameraControl.OperationCanceledException("Camera is not active."));
            } else if (Result3A.Status.m902equalsimpl0(result3A.m898getStatusJvTi9ms(), Result3A.Status.Companion.m910getTIME_LIMIT_REACHEDJvTi9ms())) {
                FocusMeteringResult focusMeteringResultCreate = FocusMeteringResult.create(false);
                x.e(focusMeteringResultCreate, "create(...)");
                completableDeferred.a(focusMeteringResultCreate);
            } else {
                completableDeferred.a(focusMeteringControl.toFocusMeteringResult(result3A, z));
            }
        }
        return ab.f48028a;
    }

    private final <T> void setCancelException(CompletableDeferred<T> completableDeferred, String str) {
        completableDeferred.b(new CameraControl.OperationCanceledException(str));
    }

    public static /* synthetic */ bm startFocusAndMetering$default(FocusMeteringControl focusMeteringControl, FocusMeteringAction focusMeteringAction, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 5000;
        }
        return focusMeteringControl.startFocusAndMetering(focusMeteringAction, j2);
    }

    private final FocusMeteringResult toFocusMeteringResult(Result3A result3A, boolean z) {
        Integer num;
        boolean z2 = false;
        if (!Result3A.Status.m902equalsimpl0(result3A.m898getStatusJvTi9ms(), Result3A.Status.Companion.m907getOKJvTi9ms())) {
            FocusMeteringResult focusMeteringResultCreate = FocusMeteringResult.create(false);
            x.e(focusMeteringResultCreate, "create(...)");
            return focusMeteringResultCreate;
        }
        FrameMetadata frameMetadata = result3A.getFrameMetadata();
        if (frameMetadata != null) {
            CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
            x.e(key, "CONTROL_AF_STATE");
            num = (Integer) frameMetadata.get(key);
        } else {
            num = null;
        }
        if (z && (!m259isAfModeSupportedwvCmZyc(AfMode.Companion.m324getAUTOvHZNRtE()) || (result3A.getFrameMetadata() != null && (num == null || num.intValue() == 4)))) {
            z2 = true;
        }
        FocusMeteringResult focusMeteringResultCreate2 = FocusMeteringResult.create(z2);
        x.e(focusMeteringResultCreate2, "create(...)");
        return focusMeteringResultCreate2;
    }

    private final void triggerAutoCancel(long j2, CompletableDeferred<FocusMeteringResult> completableDeferred, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        br brVar = this.autoCancelJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.autoCancelJob = aj.z(this.threads.getSequentialScope(), null, null, new FocusMeteringControl$triggerAutoCancel$$inlined$confineLaunch$1(null, j2, this, useCaseCameraRequestControl, completableDeferred), 3);
    }

    private final void triggerFocusTimeout(long j2, CompletableDeferred<FocusMeteringResult> completableDeferred) {
        br brVar = this.focusTimeoutJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.focusTimeoutJob = aj.z(this.threads.getSequentialScope(), null, null, new FocusMeteringControl$triggerFocusTimeout$$inlined$confineLaunch$1(null, j2, completableDeferred), 3);
    }

    public final am<Result3A> cancelFocusAndMeteringAsync() {
        final CompletableDeferred<Result3A> completableDeferredJ = bo.j();
        UseCaseCameraRequestControl requestControl = getRequestControl();
        if (requestControl != null) {
            br brVar = this.focusTimeoutJob;
            if (brVar != null) {
                brVar.s(null);
            }
            br brVar2 = this.autoCancelJob;
            if (brVar2 != null) {
                brVar2.s(null);
            }
            CompletableDeferred<FocusMeteringResult> completableDeferred = this.updateSignal;
            if (completableDeferred != null) {
                setCancelException(completableDeferred, "Cancelled by cancelFocusAndMetering()");
            }
            am<Result3A> amVar = this.activeFocusMetering3Result;
            if (amVar != null) {
                amVar.s(null);
            }
            this.activeFocusMetering3Result = null;
            CompletableDeferred<Result3A> completableDeferred2 = this.cancelSignal;
            if (completableDeferred2 != null) {
                setCancelException(completableDeferred2, "Cancelled by another cancelFocusAndMetering()");
            }
            this.cancelSignal = completableDeferredJ;
            cancelFocusAndMeteringNowAsync(requestControl, this.updateSignal).bY(new l() { // from class: androidx.camera.camera2.impl.FocusMeteringControl$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FocusMeteringControl.cancelFocusAndMeteringAsync$lambda$0$0(completableDeferredJ, (Throwable) obj);
                }
            });
        } else {
            completableDeferredJ.b(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return completableDeferredJ;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        x.f(focusMeteringAction, "action");
        Companion companion = Companion;
        List<MeteringPoint> meteringPointsAe = focusMeteringAction.getMeteringPointsAe();
        x.e(meteringPointsAe, "getMeteringPointsAe(...)");
        Integer num = this.maxAeRegionCount;
        x.e(num, "maxAeRegionCount");
        List<MeteringRectangle> listMeteringRegionsFromMeteringPoints = companion.meteringRegionsFromMeteringPoints(meteringPointsAe, num.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 2, this.meteringRegionCorrection);
        List<MeteringPoint> meteringPointsAf = focusMeteringAction.getMeteringPointsAf();
        x.e(meteringPointsAf, "getMeteringPointsAf(...)");
        Integer num2 = this.maxAfRegionCount;
        x.e(num2, "maxAfRegionCount");
        List<MeteringRectangle> listMeteringRegionsFromMeteringPoints2 = companion.meteringRegionsFromMeteringPoints(meteringPointsAf, num2.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 1, this.meteringRegionCorrection);
        List<MeteringPoint> meteringPointsAwb = focusMeteringAction.getMeteringPointsAwb();
        x.e(meteringPointsAwb, "getMeteringPointsAwb(...)");
        Integer num3 = this.maxAwbRegionCount;
        x.e(num3, "maxAwbRegionCount");
        return (listMeteringRegionsFromMeteringPoints.isEmpty() && listMeteringRegionsFromMeteringPoints2.isEmpty() && companion.meteringRegionsFromMeteringPoints(meteringPointsAwb, num3.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 4, this.meteringRegionCorrection).isEmpty()) ? false : true;
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public void onRunningUseCasesChanged(Set<? extends UseCase> set) {
        Size attachedSurfaceResolution;
        x.f(set, "runningUseCases");
        this.previewAspectRatio = null;
        for (UseCase useCase : set) {
            if ((useCase instanceof Preview) && (attachedSurfaceResolution = ((Preview) useCase).getAttachedSurfaceResolution()) != null) {
                this.previewAspectRatio = new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        this.previewAspectRatio = null;
        cancelFocusAndMeteringAsync();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.d.m.a.bm<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction r25, long r26) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FocusMeteringControl.startFocusAndMetering(androidx.camera.core.FocusMeteringAction, long):com.google.d.m.a.bm");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final PointF getFovAdjustedPoint(MeteringPoint meteringPoint, Rational rational, Rational rational2, int i2, MeteringRegionCorrection meteringRegionCorrection) {
            Rational surfaceAspectRatio = meteringPoint.getSurfaceAspectRatio();
            if (surfaceAspectRatio != null) {
                rational2 = surfaceAspectRatio;
            }
            PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, i2);
            if (x.n(rational2, rational)) {
                return new PointF(correctedPoint.x, correctedPoint.y);
            }
            if (rational2.compareTo(rational) > 0) {
                PointF pointF = new PointF(correctedPoint.x, correctedPoint.y);
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointF.y = (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y) * (1.0f / fDoubleValue);
                return pointF;
            }
            PointF pointF2 = new PointF(correctedPoint.x, correctedPoint.y);
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointF2.x = (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF2.x) * (1.0f / fDoubleValue2);
            return pointF2;
        }

        private final MeteringRectangle getMeteringRect(PointF pointF, float f2, Rect rect) {
            float f3 = rect.left;
            float fWidth = pointF.x * rect.width();
            float f4 = rect.top;
            float fHeight = pointF.y * rect.height();
            int i2 = (int) (f4 + fHeight);
            int iHeight = ((int) (rect.height() * f2)) / 2;
            int i3 = (int) (f3 + fWidth);
            int iWidth = ((int) (f2 * rect.width())) / 2;
            Rect rect2 = new Rect(i3 - iWidth, i2 - iHeight, i3 + iWidth, i2 + iHeight);
            rect2.left = n.j(rect2.left, rect.left, rect.right);
            rect2.right = n.j(rect2.right, rect.left, rect.right);
            rect2.top = n.j(rect2.top, rect.top, rect.bottom);
            rect2.bottom = n.j(rect2.bottom, rect.top, rect.bottom);
            return new MeteringRectangle(rect2, 1000);
        }

        private final boolean isValid(MeteringPoint meteringPoint) {
            return meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f;
        }

        public final List<MeteringRectangle> meteringRegionsFromMeteringPoints(List<? extends MeteringPoint> list, int i2, Rect rect, Rational rational, int i3, MeteringRegionCorrection meteringRegionCorrection) {
            x.f(list, "meteringPoints");
            x.f(rect, "cropSensorRegion");
            x.f(rational, "defaultAspectRatio");
            x.f(meteringRegionCorrection, "meteringRegionCorrection");
            if (list.isEmpty() || i2 == 0) {
                return i.h();
            }
            ArrayList arrayList = new ArrayList();
            Rational rational2 = new Rational(rect.width(), rect.height());
            Iterator<? extends MeteringPoint> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MeteringPoint next = it.next();
                if (arrayList.size() >= i2) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isDebugEnabled(Log.TAG)) {
                        android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "meteringRegionsFromMeteringPoints: maxRegionCount(" + i2 + ") reached for meteringMode(" + i3 + "), dropping remaining " + (list.size() - arrayList.size()) + " metering points.");
                        return arrayList;
                    }
                } else if (this.isValid(next)) {
                    Companion companion = this;
                    Rational rational3 = rational;
                    arrayList.add(companion.getMeteringRect(companion.getFovAdjustedPoint(next, rational2, rational3, i3, meteringRegionCorrection), next.getSize(), rect));
                    this = companion;
                    rational = rational3;
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
