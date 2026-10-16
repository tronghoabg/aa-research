package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jx extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40350a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f40351b;

    jx(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        jx jxVar = new jx(eVar);
        jxVar.f40351b = obj;
        return jxVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((jx) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40350a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f40351b;
            jw jwVar = new jw(adVar, 0);
            ih.a().c(jwVar);
            this.f40350a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new com.waze.reports_v2.presentation.bq(jwVar, 18), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
