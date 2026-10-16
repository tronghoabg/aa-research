package androidx.camera.camera2.pipe.internal;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraDevicesImpl$getCameraIds$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraDevicesImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesImpl$getCameraIds$1(CameraDevicesImpl cameraDevicesImpl, e<? super CameraDevicesImpl$getCameraIds$1> eVar) {
        super(eVar);
        this.this$0 = cameraDevicesImpl;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo445getCameraIdsiAq86To(null, this);
    }
}
