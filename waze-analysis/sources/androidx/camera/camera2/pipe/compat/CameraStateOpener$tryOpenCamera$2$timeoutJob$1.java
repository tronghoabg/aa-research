package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$timeoutJob$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    int label;

    CameraStateOpener$tryOpenCamera$2$timeoutJob$1(h.c.e<? super CameraStateOpener$tryOpenCamera$2$timeoutJob$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new CameraStateOpener$tryOpenCamera$2$timeoutJob$1(eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$timeoutJob$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            this.label = 1;
            if (aj.r(CameraStateOpener.Companion.m1076getCAMERA_OPEN_TIMEOUTUwyO8pc(), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
        }
        return ab.f48028a;
    }
}
