package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.graph.GraphListener;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VirtualCameraState implements VirtualCamera {
    private CameraState _lastState;
    private final bm<CameraState> _stateFlow;
    private final k<CameraState> _states;
    private final String cameraId;
    private boolean closed;
    private VirtualAndroidCameraDevice currentVirtualAndroidCamera;
    private final int debugId;
    private final GraphListener graphListener;
    private br job;
    private final Object lock;
    private final af scope;
    private Token wakelockToken;

    private VirtualCameraState(String str, GraphListener graphListener, af afVar) {
        x.f(str, "cameraId");
        x.f(graphListener, "graphListener");
        x.f(afVar, "scope");
        this.cameraId = str;
        this.graphListener = graphListener;
        this.scope = afVar;
        this.debugId = VirtualCameraKt.getVirtualCameraDebugIds().e();
        this.lock = new Object();
        bm<CameraState> bmVarE = bu.e(1, 3, null, 4);
        this._stateFlow = bmVarE;
        this._states = ai.y(bmVarE);
        CameraStateUnopened cameraStateUnopened = CameraStateUnopened.INSTANCE;
        this._lastState = cameraStateUnopened;
        if (!bmVarE.c(cameraStateUnopened)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitState(CameraState cameraState) {
        this._lastState = cameraState;
        if (this._stateFlow.c(cameraState)) {
            return;
        }
        throw new IllegalStateException("Failed to emit " + cameraState + " in " + this);
    }

    public final Object connect$camera_camera2_pipe(k<? extends CameraState> kVar, Token token, h.c.e<? super ab> eVar) {
        synchronized (this.lock) {
            if (this.closed) {
                token.release();
                return ab.f48028a;
            }
            this.job = aj.z(this.scope, null, null, new VirtualCameraState$connect$2$1(kVar, this, null), 3);
            this.wakelockToken = token;
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.compat.VirtualCamera
    /* renamed from: disconnect-TPqeGZw */
    public void mo1105disconnectTPqeGZw(CameraError cameraError) {
        synchronized (this.lock) {
            if (!this.closed) {
                int i2 = 1;
                this.closed = true;
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Disconnecting " + this);
                }
                VirtualAndroidCameraDevice virtualAndroidCameraDevice = this.currentVirtualAndroidCamera;
                if (virtualAndroidCameraDevice != null) {
                    virtualAndroidCameraDevice.disconnect$camera_camera2_pipe();
                }
                br brVar = this.job;
                if (brVar != null) {
                    brVar.s(null);
                }
                Token token = this.wakelockToken;
                if (token != null) {
                    token.release();
                }
                if (!(getValue() instanceof CameraStateClosed)) {
                    if (!(this._lastState instanceof CameraStateClosing)) {
                        emitState(new CameraStateClosing(null, i2, 0 == true ? 1 : 0));
                    }
                    emitState(new CameraStateClosed(this.cameraId, ClosedReason.APP_DISCONNECTED, null, null, null, null, null, null, cameraError, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, null));
                }
            }
        }
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String m1108getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    public final GraphListener getGraphListener() {
        return this.graphListener;
    }

    public final af getScope() {
        return this.scope;
    }

    @Override // androidx.camera.camera2.pipe.compat.VirtualCamera
    public k<CameraState> getState() {
        return this._states;
    }

    @Override // androidx.camera.camera2.pipe.compat.VirtualCamera
    public CameraState getValue() {
        CameraState cameraState;
        synchronized (this.lock) {
            cameraState = this._lastState;
        }
        return cameraState;
    }

    public String toString() {
        return "VirtualCamera-" + this.debugId;
    }

    public /* synthetic */ VirtualCameraState(String str, GraphListener graphListener, af afVar, o oVar) {
        this(str, graphListener, afVar);
    }
}
