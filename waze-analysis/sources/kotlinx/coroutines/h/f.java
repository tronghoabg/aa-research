package kotlinx.coroutines.h;

import h.ab;
import h.g.a.q;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class f extends u implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final f f52027a = new f();

    f() {
        super(3, h.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        kotlinx.coroutines.g.l lVar = (kotlinx.coroutines.g.l) obj2;
        if (obj3 == null || !hVar.holdsLock(obj3)) {
            x.d(lVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            hVar.g(new e(hVar, (kotlinx.coroutines.g.m) lVar, obj3));
        } else {
            lVar.i(i.f52031b);
        }
        return ab.f48028a;
    }
}
