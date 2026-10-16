package androidx.concurrent.futures;

import h.c.e;
import h.g.a.l;
import h.g.b.u;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1 extends u implements l<e, Object> {
    SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, am.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.l
    public final Object invoke(e eVar) {
        return ((am) this.receiver).c(eVar);
    }
}
