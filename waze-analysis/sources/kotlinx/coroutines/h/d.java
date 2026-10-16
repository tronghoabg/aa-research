package kotlinx.coroutines.h;

import h.ab;
import h.g.a.q;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.dl;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements kotlinx.coroutines.k, dl {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.l f52021a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f52022b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f52023c;

    public d(h hVar, kotlinx.coroutines.l lVar, Object obj) {
        this.f52023c = hVar;
        this.f52021a = lVar;
        this.f52022b = obj;
    }

    @Override // kotlinx.coroutines.k
    public final Object a(Throwable th) {
        return this.f52021a.a(th);
    }

    @Override // kotlinx.coroutines.k
    public final void b(Object obj) {
        this.f52021a.b(obj);
    }

    @Override // kotlinx.coroutines.k
    public final void c(h.g.a.l lVar) {
        this.f52021a.c(lVar);
    }

    @Override // kotlinx.coroutines.k
    public final /* bridge */ /* synthetic */ void d(Object obj, q qVar) {
        int i2 = ai.f51347a;
        final h hVar = this.f52023c;
        hVar.f52029a.d(this.f52022b);
        h.g.a.l lVar = new h.g.a.l() { // from class: kotlinx.coroutines.h.c
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                hVar.unlock(this.f52022b);
                return ab.f48028a;
            }
        };
        kotlinx.coroutines.l lVar2 = this.f52021a;
        lVar2.y((ab) obj, lVar2.f51368a, new com.waze.main_screen.c.d.a(lVar, 18));
    }

    @Override // kotlinx.coroutines.k
    public final /* bridge */ /* synthetic */ void e(kotlinx.coroutines.ab abVar, Object obj) {
        this.f52021a.e(abVar, (ab) obj);
    }

    @Override // kotlinx.coroutines.k
    public final boolean f(Throwable th) {
        return this.f52021a.f(th);
    }

    @Override // kotlinx.coroutines.k
    public final boolean g() {
        return this.f52021a.g();
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return this.f52021a.getContext();
    }

    @Override // kotlinx.coroutines.k
    public final boolean h() {
        return this.f52021a.h();
    }

    @Override // kotlinx.coroutines.k
    public final /* bridge */ /* synthetic */ Object i(Object obj, q qVar) {
        int i2 = ai.f51347a;
        final h hVar = this.f52023c;
        q qVar2 = new q() { // from class: kotlinx.coroutines.h.b
            @Override // h.g.a.q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i3 = ai.f51347a;
                h hVar2 = hVar;
                kotlinx.a.d dVar = hVar2.f52029a;
                Object obj5 = this.f52022b;
                dVar.d(obj5);
                hVar2.unlock(obj5);
                return ab.f48028a;
            }
        };
        Object objI = this.f52021a.i((ab) obj, qVar2);
        if (objI != null) {
            hVar.f52029a.d(this.f52022b);
        }
        return objI;
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        this.f52021a.resumeWith(obj);
    }

    @Override // kotlinx.coroutines.dl
    public final void z(kotlinx.coroutines.e.e eVar, int i2) {
        this.f52021a.z(eVar, i2);
    }
}
