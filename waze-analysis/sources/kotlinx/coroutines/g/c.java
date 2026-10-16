package kotlinx.coroutines.g;

import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f51979a;

    public c(long j2) {
        this.f51979a = j2;
    }

    public static final /* synthetic */ void a(final c cVar, final l lVar) {
        long j2 = cVar.f51979a;
        if (j2 <= 0) {
            lVar.i(ab.f48028a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.g.a
            @Override // java.lang.Runnable
            public final void run() {
                lVar.j(cVar, ab.f48028a);
            }
        };
        x.d(lVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        k kVar = (k) lVar;
        h.c.j jVarE = kVar.e();
        kVar.g(aj.s(jVarE).b(j2, runnable, jVarE));
    }
}
