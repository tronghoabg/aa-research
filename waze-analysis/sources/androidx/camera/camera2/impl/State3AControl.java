package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.ap;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class State3AControl implements UseCaseCameraControl, UseCaseManager.RunningUseCasesChangeListener {
    private int _flashMode;
    private Integer _preferredAeMode;
    private Integer _preferredFocusMode;
    private UseCaseCameraRequestControl _requestControl;
    private int _template;
    private boolean _tryExternalFlashAeMode;
    private final AutoFlashAEModeDisabler aeModeDisabler;
    private final CameraProperties cameraProperties;
    private long currentRevision;
    private final Object lock;
    private final List<CompletableDeferred<ab>> pendingSignals;
    private final UseCaseThreads threads;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(State3AControl state3AControl);
    }

    /* compiled from: WazeSource */
    final class StateSnapshot {
        private final int flashMode;
        private final Integer preferredAeMode;
        private final Integer preferredFocusMode;
        private final int template;
        private final boolean tryExternalFlashAeMode;

        public StateSnapshot(int i2, int i3, boolean z, Integer num, Integer num2) {
            this.flashMode = i2;
            this.template = i3;
            this.tryExternalFlashAeMode = z;
            this.preferredAeMode = num;
            this.preferredFocusMode = num2;
        }

        public static /* synthetic */ StateSnapshot copy$default(StateSnapshot stateSnapshot, int i2, int i3, boolean z, Integer num, Integer num2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = stateSnapshot.flashMode;
            }
            if ((i4 & 2) != 0) {
                i3 = stateSnapshot.template;
            }
            if ((i4 & 4) != 0) {
                z = stateSnapshot.tryExternalFlashAeMode;
            }
            if ((i4 & 8) != 0) {
                num = stateSnapshot.preferredAeMode;
            }
            if ((i4 & 16) != 0) {
                num2 = stateSnapshot.preferredFocusMode;
            }
            Integer num3 = num2;
            boolean z2 = z;
            return stateSnapshot.copy(i2, i3, z2, num, num3);
        }

        public final int component1() {
            return this.flashMode;
        }

        public final int component2() {
            return this.template;
        }

        public final boolean component3() {
            return this.tryExternalFlashAeMode;
        }

        public final Integer component4() {
            return this.preferredAeMode;
        }

        public final Integer component5() {
            return this.preferredFocusMode;
        }

        public final StateSnapshot copy(int i2, int i3, boolean z, Integer num, Integer num2) {
            return new StateSnapshot(i2, i3, z, num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateSnapshot)) {
                return false;
            }
            StateSnapshot stateSnapshot = (StateSnapshot) obj;
            return this.flashMode == stateSnapshot.flashMode && this.template == stateSnapshot.template && this.tryExternalFlashAeMode == stateSnapshot.tryExternalFlashAeMode && x.n(this.preferredAeMode, stateSnapshot.preferredAeMode) && x.n(this.preferredFocusMode, stateSnapshot.preferredFocusMode);
        }

        public final int getFlashMode() {
            return this.flashMode;
        }

        public final Integer getPreferredAeMode() {
            return this.preferredAeMode;
        }

        public final Integer getPreferredFocusMode() {
            return this.preferredFocusMode;
        }

        public final int getTemplate() {
            return this.template;
        }

        public final boolean getTryExternalFlashAeMode() {
            return this.tryExternalFlashAeMode;
        }

        public int hashCode() {
            Integer num = this.preferredAeMode;
            int iHashCode = num == null ? 0 : num.hashCode();
            int i2 = this.flashMode;
            int i3 = this.template;
            boolean z = this.tryExternalFlashAeMode;
            Integer num2 = this.preferredFocusMode;
            return (((((((i2 * 31) + i3) * 31) + State3AControl$StateSnapshot$$ExternalSyntheticBackport0.m(z)) * 31) + iHashCode) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "StateSnapshot(flashMode=" + this.flashMode + ", template=" + this.template + ", tryExternalFlashAeMode=" + this.tryExternalFlashAeMode + ", preferredAeMode=" + this.preferredAeMode + ", preferredFocusMode=" + this.preferredFocusMode + ")";
        }
    }

    public State3AControl(CameraProperties cameraProperties, AutoFlashAEModeDisabler autoFlashAEModeDisabler, UseCaseThreads useCaseThreads) {
        x.f(cameraProperties, "cameraProperties");
        x.f(autoFlashAEModeDisabler, "aeModeDisabler");
        x.f(useCaseThreads, "threads");
        this.cameraProperties = cameraProperties;
        this.aeModeDisabler = autoFlashAEModeDisabler;
        this.threads = useCaseThreads;
        this.lock = new Object();
        this.pendingSignals = new ArrayList();
        this._flashMode = 2;
        this._template = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUpdate(long j2) {
        long j3;
        StateSnapshot stateSnapshot;
        final List listAo;
        UseCaseCameraRequestControl requestControl = getRequestControl();
        if (requestControl == null) {
            failAllPendingSignals(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        synchronized (this.lock) {
            j3 = this.currentRevision;
        }
        if (j2 != j3) {
            return;
        }
        synchronized (this.lock) {
            stateSnapshot = new StateSnapshot(this._flashMode, this._template, this._tryExternalFlashAeMode, this._preferredAeMode, this._preferredFocusMode);
        }
        int finalPreferredAeMode = getFinalPreferredAeMode(stateSnapshot.getFlashMode(), stateSnapshot.getTryExternalFlashAeMode(), stateSnapshot.getPreferredAeMode());
        Integer preferredFocusMode = stateSnapshot.getPreferredFocusMode();
        try {
            am amVarSubmitParameters$default = UseCaseCameraRequestControl.CC.submitParameters$default(requestControl, r.k(new k(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(CameraMetadataIntegrationKt.getSupportedAeMode(this.cameraProperties.getMetadata(), finalPreferredAeMode))), new k(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(CameraMetadataIntegrationKt.getSupportedAfMode(this.cameraProperties.getMetadata(), preferredFocusMode != null ? preferredFocusMode.intValue() : getDefaultAfMode(stateSnapshot.getTemplate())))), new k(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(CameraMetadataIntegrationKt.getSupportedAwbMode(this.cameraProperties.getMetadata(), 1)))), null, null, 6, null);
            synchronized (this.lock) {
                listAo = i.ao(this.pendingSignals);
            }
            amVarSubmitParameters$default.bY(new l() { // from class: androidx.camera.camera2.impl.State3AControl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return State3AControl.applyUpdate$lambda$3(listAo, this, (Throwable) obj);
                }
            });
        } catch (Exception e2) {
            failAllPendingSignals(e2);
        }
    }

    static final ab applyUpdate$lambda$3(List list, State3AControl state3AControl, Throwable th) {
        if (th != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((CompletableDeferred) it.next()).b(th);
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((CompletableDeferred) it2.next()).a(ab.f48028a);
            }
        }
        synchronized (state3AControl.lock) {
            state3AControl.pendingSignals.removeAll(list);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int calculateTemplateFromUseCases(Set<? extends UseCase> set) {
        CaptureConfig repeatingCaptureConfig;
        SessionConfig validSessionConfigOrNull = new SessionConfigAdapter(set, false, 2, 0 == true ? 1 : 0).getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null || (repeatingCaptureConfig = validSessionConfigOrNull.getRepeatingCaptureConfig()) == null) {
            return 1;
        }
        Integer numValueOf = Integer.valueOf(repeatingCaptureConfig.getTemplateType());
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    private final void failAllPendingSignals(Exception exc) {
        List listAo;
        synchronized (this.lock) {
            listAo = i.ao(this.pendingSignals);
            this.pendingSignals.clear();
        }
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            ((CompletableDeferred) it.next()).b(exc);
        }
    }

    private final int getDefaultAfMode(int i2) {
        return i2 != 3 ? 4 : 3;
    }

    private final int getFinalPreferredAeMode(int i2, boolean z, Integer num) {
        int iIntValue = num != null ? num.intValue() : i2 != 0 ? i2 != 1 ? 1 : 3 : this.aeModeDisabler.getCorrectedAeMode(2);
        if (z && CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.cameraProperties.getMetadata())) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            iIntValue = 5;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "State3AControl.invalidate: trying external flash AE mode.");
            }
        }
        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "State3AControl.getFinalPreferredAeMode: preferAeMode = " + iIntValue);
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final am<ab> update() {
        CompletableDeferred<ab> completableDeferredJ = bo.j();
        ap apVar = new ap();
        synchronized (this.lock) {
            this.pendingSignals.add(completableDeferredJ);
            long j2 = this.currentRevision + 1;
            this.currentRevision = j2;
            apVar.f48104a = j2;
        }
        aj.z(this.threads.getSequentialScope(), null, null, new State3AControl$update$$inlined$confineLaunch$1(null, this, apVar), 3);
        return completableDeferredJ;
    }

    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    public final int getFinalSupportedAeMode() {
        int supportedAeMode;
        synchronized (this.lock) {
            supportedAeMode = CameraMetadataIntegrationKt.getSupportedAeMode(this.cameraProperties.getMetadata(), getFinalPreferredAeMode(this._flashMode, this._tryExternalFlashAeMode, this._preferredAeMode));
        }
        return supportedAeMode;
    }

    public final int getFlashMode() {
        int i2;
        synchronized (this.lock) {
            i2 = this._flashMode;
        }
        return i2;
    }

    public final Integer getPreferredAeMode() {
        Integer num;
        synchronized (this.lock) {
            num = this._preferredAeMode;
        }
        return num;
    }

    public final Integer getPreferredFocusMode() {
        Integer num;
        synchronized (this.lock) {
            num = this._preferredFocusMode;
        }
        return num;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final int getTemplate() {
        int i2;
        synchronized (this.lock) {
            i2 = this._template;
        }
        return i2;
    }

    public final boolean getTryExternalFlashAeMode() {
        boolean z;
        synchronized (this.lock) {
            z = this._tryExternalFlashAeMode;
        }
        return z;
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public void onRunningUseCasesChanged(Set<? extends UseCase> set) {
        x.f(set, "runningUseCases");
        aj.z(this.threads.getSequentialScope(), null, null, new State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(null, i.au(set), this), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = false;
            this._preferredAeMode = null;
            this._preferredFocusMode = null;
            this._flashMode = 2;
            this._template = 1;
        }
        update();
    }

    public final am<ab> setFlashModeAsync(int i2) {
        synchronized (this.lock) {
            this._flashMode = i2;
        }
        return update();
    }

    public final am<ab> setPreferredAeModeAsync(Integer num) {
        synchronized (this.lock) {
            this._preferredAeMode = num;
        }
        return update();
    }

    public final am<ab> setPreferredFocusModeAsync(Integer num) {
        synchronized (this.lock) {
            this._preferredFocusMode = num;
        }
        return update();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        update();
    }

    public final am<ab> setTemplateAsync(int i2) {
        synchronized (this.lock) {
            this._template = i2;
        }
        return update();
    }

    public final am<ab> setTryExternalFlashAeModeAsync(boolean z) {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = z;
        }
        return update();
    }
}
