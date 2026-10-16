package com.waze.main_screen.ab.a;

import com.waze.kj;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kj f25628b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f25629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(kj kjVar, m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f25628b = kjVar;
        this.f25629c = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f25628b, this.f25629c, eVar);
        cVar.f25627a = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        l lVar = (l) this.f25627a;
        if (x.n(lVar, h.f25637a)) {
            this.f25628b.p();
            this.f25629c.j();
        } else if (lVar instanceof j) {
            this.f25628b.u(((j) lVar).a());
        } else if (lVar instanceof i) {
            i iVar = (i) lVar;
            Integer numA = iVar.a();
            kj kjVar = this.f25628b;
            if (numA != null) {
                iVar.a().intValue();
                f.g(kjVar, 1);
            } else {
                kjVar.m();
            }
            this.f25629c.j();
        } else if (lVar instanceof k) {
            this.f25628b.w(((k) lVar).a());
        } else {
            if (!x.n(lVar, g.f25636a)) {
                throw new h.i();
            }
            this.f25628b.E();
        }
        return ab.f48028a;
    }
}
