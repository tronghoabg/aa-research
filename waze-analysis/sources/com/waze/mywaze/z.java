package com.waze.mywaze;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30636a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f30637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f30637b = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new z(this.f30637b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f30636a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.ag.b bVar = this.f30637b.f30542d;
                this.f30636a = 1;
                obj = bVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            objA = new Integer(((Number) obj).intValue());
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        aa aaVar = this.f30637b;
        if (h.m.e(objA)) {
            aaVar.f30541c.postValue(new Integer(((Number) objA).intValue()));
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            aaVar.f30541c.postValue(new Integer(0));
            com.waze.shared_infra.i.e eVar = aa.f30539a;
            Objects.toString(thC);
            eVar.b("Failed to get unseen badge count: ".concat(thC.toString()));
        }
        return h.ab.f48028a;
    }
}
