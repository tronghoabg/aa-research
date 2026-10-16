package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.VirtualCamera;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.core.WakeLock;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.m.k;
import java.util.Set;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActiveCamera {
    private final Set<CameraId> allCameraIds;
    private final AndroidCameraState androidCameraState;
    private VirtualCameraState current;
    private final WakeLock wakelock;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.ActiveCamera$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.camera2.pipe.compat.ActiveCamera$1$1, reason: invalid class name and collision with other inner class name */
        final class C00101 extends h.c.b.a.g implements p<CameraState, h.c.e<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            C00101(h.c.e<? super C00101> eVar) {
                super(2, eVar);
            }

            @Override // h.c.b.a.a
            public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
                C00101 c00101 = new C00101(eVar);
                c00101.L$0 = obj;
                return c00101;
            }

            @Override // h.g.a.p
            public final Object invoke(CameraState cameraState, h.c.e<? super Boolean> eVar) {
                return ((C00101) create(cameraState, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                CameraState cameraState = (CameraState) this.L$0;
                boolean z = true;
                if (!(cameraState instanceof CameraStateClosing) && !(cameraState instanceof CameraStateClosed)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return ActiveCamera.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                if (ai.i(ActiveCamera.this.androidCameraState.getState(), new C00101(null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            ActiveCamera.this.wakelock.release();
            return ab.f48028a;
        }
    }

    public ActiveCamera(AndroidCameraState androidCameraState, Set<CameraId> set, af afVar, final l<? super ActiveCamera, ab> lVar) {
        x.f(androidCameraState, "androidCameraState");
        x.f(set, "allCameraIds");
        x.f(afVar, "scope");
        x.f(lVar, "closeCallback");
        this.androidCameraState = androidCameraState;
        this.allCameraIds = set;
        h.o.c cVar = h.o.a.f48264a;
        this.wakelock = new WakeLock(afVar, h.o.c.i(1, h.o.d.f48273d), true, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.ActiveCamera$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ActiveCamera.wakelock$lambda$0(lVar, this);
            }
        }, null);
        aj.z(afVar, null, null, new AnonymousClass1(null), 3);
    }

    static final ab wakelock$lambda$0(l lVar, ActiveCamera activeCamera) {
        lVar.invoke(activeCamera);
        return ab.f48028a;
    }

    public final Token acquire() {
        return this.wakelock.acquire();
    }

    public final Object awaitClosed(h.c.e<? super ab> eVar) {
        Object objAwaitClosed = this.androidCameraState.awaitClosed(eVar);
        return objAwaitClosed == h.c.a.a.f48038a ? objAwaitClosed : ab.f48028a;
    }

    public final void close() {
        this.wakelock.release();
        this.androidCameraState.close();
    }

    public final Object connectTo(VirtualCameraState virtualCameraState, Token token, h.c.e<? super ab> eVar) {
        VirtualCameraState virtualCameraState2 = this.current;
        this.current = virtualCameraState;
        if (virtualCameraState2 != null) {
            VirtualCamera.CC.m1106disconnectTPqeGZw$default(virtualCameraState2, null, 1, null);
        }
        Object objConnect$camera_camera2_pipe = virtualCameraState.connect$camera_camera2_pipe(this.androidCameraState.getState(), token, eVar);
        return objConnect$camera_camera2_pipe == h.c.a.a.f48038a ? objConnect$camera_camera2_pipe : ab.f48028a;
    }

    public final Set<CameraId> getAllCameraIds$camera_camera2_pipe() {
        return this.allCameraIds;
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String m981getCameraIdDz_R5H8() {
        return this.androidCameraState.m990getCameraIdDz_R5H8();
    }

    public String toString() {
        String strM552toStringimpl = CameraId.m552toStringimpl(m981getCameraIdDz_R5H8());
        int iHashCode = super.hashCode();
        k.y(16);
        String string = Integer.toString(iHashCode, 16);
        x.e(string, "toString(...)");
        return "ActiveCamera(cameraId=" + strM552toStringimpl + ")@" + string;
    }
}
