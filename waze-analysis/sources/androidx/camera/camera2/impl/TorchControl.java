package androidx.camera.camera2.impl;

import android.os.Build;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.compat.Api35Compat;
import androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class TorchControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;
    private final MutableLiveData<Integer> _torchState;
    private final MutableLiveData<Integer> _torchStrength;
    private CompletableDeferred<ab> _updateTorchStateSignal;
    private CompletableDeferred<ab> _updateTorchStrengthSignal;
    private final int defaultTorchStrength;
    private final boolean hasFlashUnit;
    private final boolean isTorchStrengthSupported;
    private final int maxTorchStrength;
    private final State3AControl state3AControl;
    private final UseCaseThreads threads;
    private TorchMode torchMode;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(TorchControl torchControl);
    }

    public TorchControl(CameraProperties cameraProperties, State3AControl state3AControl, UseCaseThreads useCaseThreads) {
        x.f(cameraProperties, "cameraProperties");
        x.f(state3AControl, "state3AControl");
        x.f(useCaseThreads, "threads");
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        this.hasFlashUnit = FlashAvailabilityCheckerKt.isFlashAvailable(cameraProperties, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
        this._torchState = new MutableLiveData<>(0);
        this.isTorchStrengthSupported = CameraMetadata.Companion.getSupportsTorchStrength(cameraProperties.getMetadata());
        int defaultTorchStrengthLevel = CameraMetadata.Companion.getDefaultTorchStrengthLevel(cameraProperties.getMetadata());
        this.defaultTorchStrength = defaultTorchStrengthLevel;
        this.maxTorchStrength = CameraMetadata.Companion.getMaxTorchStrengthLevel(cameraProperties.getMetadata());
        this._torchStrength = new MutableLiveData<>(Integer.valueOf(defaultTorchStrengthLevel));
    }

    private final CompletableDeferred<ab> createFailureResult(CompletableDeferred<ab> completableDeferred, Exception exc) {
        completableDeferred.b(exc);
        return completableDeferred;
    }

    /* renamed from: isFlashUnitOn-RaJ5uN0, reason: not valid java name */
    private final boolean m262isFlashUnitOnRaJ5uN0(int i2) {
        return !TorchMode.m271equalsimpl0(i2, TorchMode.Companion.m275getOFFIRs_R8());
    }

    private final void setLiveDataValue(MutableLiveData<Integer> mutableLiveData, int i2) {
        if (Threads.isMainThread()) {
            mutableLiveData.setValue(Integer.valueOf(i2));
        } else {
            mutableLiveData.postValue(Integer.valueOf(i2));
        }
    }

    public static /* synthetic */ am setTorchAsync$default(TorchControl torchControl, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        return torchControl.setTorchAsync(z, z2 | (!((i2 & 2) == 0)), z3 & ((i2 & 4) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setTorchAsync_Oup_wC0$lambda$1$3(CompletableDeferred completableDeferred, Throwable th) {
        ab abVar = ab.f48028a;
        completableDeferred.a(abVar);
        return abVar;
    }

    private final void stopRunningTaskInternal() {
        stopTorchStateTask();
        stopTorchStrengthTask();
    }

    private final void stopTorchStateTask() {
        CompletableDeferred<ab> completableDeferred = this._updateTorchStateSignal;
        if (completableDeferred != null) {
            createFailureResult(completableDeferred, new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this._updateTorchStateSignal = null;
    }

    private final void stopTorchStrengthTask() {
        CompletableDeferred<ab> completableDeferred = this._updateTorchStrengthSignal;
        if (completableDeferred != null) {
            createFailureResult(completableDeferred, new CameraControl.OperationCanceledException("There is a new torch strength being set"));
        }
        this._updateTorchStrengthSignal = null;
    }

    /* renamed from: updateTorchState-RaJ5uN0, reason: not valid java name */
    private final void m264updateTorchStateRaJ5uN0(int i2) {
        this.torchMode = TorchMode.m268boximpl(i2);
        setLiveDataValue(this._torchState, TorchMode.m271equalsimpl0(i2, TorchMode.Companion.m276getONIRs_R8()) ? 1 : 0);
    }

    private final am<ab> updateTorchStrengthLevelAsync(int i2) {
        am parametersAsync$default;
        final CompletableDeferred<ab> completableDeferredJ = bo.j();
        if (Build.VERSION.SDK_INT < 35 || !this.isTorchStrengthSupported) {
            createFailureResult(completableDeferredJ, new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
        } else {
            if (this._updateTorchStrengthSignal != null) {
                stopTorchStrengthTask();
            }
            this._updateTorchStrengthSignal = completableDeferredJ;
            completableDeferredJ.bY(new l() { // from class: androidx.camera.camera2.impl.TorchControl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TorchControl.updateTorchStrengthLevelAsync$lambda$0(this.f$0, (Throwable) obj);
                }
            });
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Api35Compat.setFlashStrengthLevel(linkedHashMap, i2);
            UseCaseCameraRequestControl requestControl = getRequestControl();
            if (requestControl == null || (parametersAsync$default = UseCaseCameraRequestControl.CC.setParametersAsync$default(requestControl, linkedHashMap, null, null, 6, null)) == null) {
                createFailureResult(completableDeferredJ, new CameraControl.OperationCanceledException("Camera is not active."));
            } else {
                parametersAsync$default.bY(new l() { // from class: androidx.camera.camera2.impl.TorchControl$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TorchControl.updateTorchStrengthLevelAsync$lambda$1(completableDeferredJ, (Throwable) obj);
                    }
                });
            }
        }
        return completableDeferredJ;
    }

    static final ab updateTorchStrengthLevelAsync$lambda$0(TorchControl torchControl, Throwable th) {
        torchControl._updateTorchStrengthSignal = null;
        return ab.f48028a;
    }

    static final ab updateTorchStrengthLevelAsync$lambda$1(CompletableDeferred completableDeferred, Throwable th) {
        ab abVar = ab.f48028a;
        completableDeferred.a(abVar);
        return abVar;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    /* renamed from: getTorchMode-MnUA4hI$camera_camera2, reason: not valid java name */
    public final TorchMode m265getTorchModeMnUA4hI$camera_camera2() {
        return this.torchMode;
    }

    public final LiveData<Integer> getTorchStateLiveData() {
        return this._torchState;
    }

    public final LiveData<Integer> getTorchStrengthLiveData() {
        return this._torchStrength;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        stopRunningTaskInternal();
        if (this.torchMode != null) {
            m264updateTorchStateRaJ5uN0(TorchMode.Companion.m275getOFFIRs_R8());
            setTorchAsync$default(this, false, false, false, 6, null);
            this.torchMode = null;
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        if (this.torchMode != null) {
            Integer value = getTorchStateLiveData().getValue();
            setTorchAsync$default(this, value != null && value.intValue() == 1, false, false, 4, null);
        }
    }

    public final am<ab> setTorchAsync(boolean z, boolean z2, boolean z3) {
        return m266setTorchAsyncOup_wC0$camera_camera2(z ? TorchMode.Companion.m276getONIRs_R8() : TorchMode.Companion.m275getOFFIRs_R8(), z2, z3);
    }

    /* renamed from: setTorchAsync-Oup_wC0$camera_camera2, reason: not valid java name */
    public final am<ab> m266setTorchAsyncOup_wC0$camera_camera2(int i2, boolean z, boolean z2) {
        int iM307getONbOjpiJc;
        am<Result3A> amVarMo253setTorchOffAsyncMtizInI;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "TorchControl#setTorchAsync: torch mode = ".concat(TorchMode.m273toStringimpl(i2)));
        }
        final CompletableDeferred<ab> completableDeferredJ = bo.j();
        if (!z2 && !this.hasFlashUnit) {
            createFailureResult(completableDeferredJ, new IllegalStateException("No flash unit"));
            return completableDeferredJ;
        }
        UseCaseCameraRequestControl requestControl = getRequestControl();
        if (requestControl != null) {
            m264updateTorchStateRaJ5uN0(i2);
            if (z) {
                stopTorchStateTask();
            } else {
                CompletableDeferred<ab> completableDeferred = this._updateTorchStateSignal;
                if (completableDeferred != null) {
                    CoroutineAdaptersKt.propagateTo(completableDeferredJ, completableDeferred);
                }
            }
            this._updateTorchStateSignal = completableDeferredJ;
            this.state3AControl.setPreferredAeModeAsync(m262isFlashUnitOnRaJ5uN0(i2) ? 1 : null);
            AeMode aeModeM305fromIntOrNullkQd0u18 = AeMode.Companion.m305fromIntOrNullkQd0u18(this.state3AControl.getFinalSupportedAeMode());
            if (aeModeM305fromIntOrNullkQd0u18 != null) {
                iM307getONbOjpiJc = aeModeM305fromIntOrNullkQd0u18.m303unboximpl();
            } else {
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "TorchControl#setTorchAsync: Failed to convert ae mode of value " + this.state3AControl.getFinalSupportedAeMode() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
                }
                iM307getONbOjpiJc = AeMode.Companion.m307getONbOjpiJc();
            }
            if (m262isFlashUnitOnRaJ5uN0(i2)) {
                if (TorchMode.m271equalsimpl0(i2, TorchMode.Companion.m276getONIRs_R8())) {
                    Integer value = getTorchStrengthLiveData().getValue();
                    if (value != null) {
                        updateTorchStrengthLevelAsync(value.intValue());
                    }
                } else {
                    updateTorchStrengthLevelAsync(this.defaultTorchStrength);
                }
                amVarMo253setTorchOffAsyncMtizInI = requestControl.setTorchOnAsync();
            } else {
                amVarMo253setTorchOffAsyncMtizInI = requestControl.mo253setTorchOffAsyncMtizInI(iM307getONbOjpiJc);
            }
            amVarMo253setTorchOffAsyncMtizInI.bY(new l() { // from class: androidx.camera.camera2.impl.TorchControl$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TorchControl.setTorchAsync_Oup_wC0$lambda$1$3(completableDeferredJ, (Throwable) obj);
                }
            });
        } else {
            createFailureResult(completableDeferredJ, new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return completableDeferredJ;
    }

    /* renamed from: setTorchMode-UuNXre8$camera_camera2, reason: not valid java name */
    public final void m267setTorchModeUuNXre8$camera_camera2(TorchMode torchMode) {
        this.torchMode = torchMode;
    }

    public final am<ab> setTorchStrengthLevelAsync(int i2) {
        if (!this.isTorchStrengthSupported) {
            CompletableDeferred<ab> completableDeferredJ = bo.j();
            createFailureResult(completableDeferredJ, new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return completableDeferredJ;
        }
        if (i2 <= 0 || i2 > this.maxTorchStrength) {
            CompletableDeferred<ab> completableDeferredJ2 = bo.j();
            createFailureResult(completableDeferredJ2, new IllegalArgumentException("The given torch strength level is invalid."));
            return completableDeferredJ2;
        }
        setLiveDataValue(this._torchStrength, i2);
        Integer value = getTorchStateLiveData().getValue();
        return (value != null && value.intValue() == 1) ? updateTorchStrengthLevelAsync(i2) : bo.h(ab.f48028a);
    }

    /* compiled from: WazeSource */
    @a
    public final class TorchMode {
        public static final Companion Companion = new Companion(null);
        private static final int OFF = 0;
        private static final int ON = 1;
        private static final int USED_AS_FLASH = 2;
        private final int value;

        private /* synthetic */ TorchMode(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ TorchMode m268boximpl(int i2) {
            return new TorchMode(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m270equalsimpl(int i2, Object obj) {
            return (obj instanceof TorchMode) && i2 == ((TorchMode) obj).m274unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m271equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m273toStringimpl(int i2) {
            return "TorchMode(value=" + i2 + ")";
        }

        public boolean equals(Object obj) {
            return m270equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m273toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m274unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getOFF-IRs_-R8, reason: not valid java name */
            public final int m275getOFFIRs_R8() {
                return TorchMode.OFF;
            }

            /* renamed from: getON-IRs_-R8, reason: not valid java name */
            public final int m276getONIRs_R8() {
                return TorchMode.ON;
            }

            /* renamed from: getUSED_AS_FLASH-IRs_-R8, reason: not valid java name */
            public final int m277getUSED_AS_FLASHIRs_R8() {
                return TorchMode.USED_AS_FLASH;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m269constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m272hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* renamed from: getTorchMode-MnUA4hI$camera_camera2$annotations, reason: not valid java name */
    public static /* synthetic */ void m261getTorchModeMnUA4hI$camera_camera2$annotations() {
    }
}
