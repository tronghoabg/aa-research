package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.compat.VirtualCamera;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2CameraController$detachSessionAndCamera$job$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    final /* synthetic */ VirtualCamera $camera;
    final /* synthetic */ CaptureSessionState $session;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraController$detachSessionAndCamera$job$1(CaptureSessionState captureSessionState, VirtualCamera virtualCamera, h.c.e<? super Camera2CameraController$detachSessionAndCamera$job$1> eVar) {
        super(2, eVar);
        this.$session = captureSessionState;
        this.$camera = virtualCamera;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2CameraController$detachSessionAndCamera$job$1(this.$session, this.$camera, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((Camera2CameraController$detachSessionAndCamera$job$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        CaptureSessionState captureSessionState = this.$session;
        if (captureSessionState != null) {
            captureSessionState.shutdown();
        }
        VirtualCamera virtualCamera = this.$camera;
        if (virtualCamera != null) {
            VirtualCamera.CC.m1106disconnectTPqeGZw$default(virtualCamera, null, 1, null);
        }
        return ab.f48028a;
    }
}
