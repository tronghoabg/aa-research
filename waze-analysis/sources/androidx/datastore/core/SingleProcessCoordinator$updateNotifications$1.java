package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SingleProcessCoordinator$updateNotifications$1 extends g implements p<l<? super ab>, e<? super ab>, Object> {
    int label;

    SingleProcessCoordinator$updateNotifications$1(e<? super SingleProcessCoordinator$updateNotifications$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SingleProcessCoordinator$updateNotifications$1(eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(l<? super ab> lVar, e<? super ab> eVar) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        return ab.f48028a;
    }
}
