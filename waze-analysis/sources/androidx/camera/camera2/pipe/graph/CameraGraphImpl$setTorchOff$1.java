package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Result3A;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraGraphImpl$setTorchOff$1 extends g implements p<af, e<? super am<? extends Result3A>>, Object> {
    final /* synthetic */ AeMode $aeMode;
    int label;
    final /* synthetic */ CameraGraphImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$setTorchOff$1(CameraGraphImpl cameraGraphImpl, AeMode aeMode, e<? super CameraGraphImpl$setTorchOff$1> eVar) {
        super(2, eVar);
        this.this$0 = cameraGraphImpl;
        this.$aeMode = aeMode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CameraGraphImpl$setTorchOff$1(this.this$0, this.$aeMode, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(af afVar, e<? super am<Result3A>> eVar) {
        return ((CameraGraphImpl$setTorchOff$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        CameraGraphImpl cameraGraphImpl = this.this$0;
        return cameraGraphImpl.controller3A.m1149setTorchOffNqN7i0k(this.$aeMode);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super am<? extends Result3A>> eVar) {
        return invoke2(afVar, (e<? super am<Result3A>>) eVar);
    }
}
