package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class db extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39741a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dd f39742b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f39743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    db(dd ddVar, kotlinx.coroutines.af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f39742b = ddVar;
        this.f39743c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        db dbVar = new db(this.f39742b, this.f39743c, eVar);
        dbVar.f39741a = obj;
        return dbVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((db) create((h.p) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.navigate.em emVar = (com.waze.navigate.em) ((h.p) this.f39741a).f();
        dd ddVar = this.f39742b;
        if (h.g.b.x.n(emVar, ddVar.o)) {
            ddVar.f39750b.a("Navigation state remained the same " + emVar + ". Returning");
            return h.ab.f48028a;
        }
        ddVar.f39750b.a("Navigation state updated from " + ddVar.o + " to " + emVar + ".");
        ddVar.o = emVar;
        if ((emVar instanceof com.waze.navigate.el) && ((com.waze.navigate.el) emVar).a() == com.waze.navigate.ek.f31315b) {
            String str = ddVar.m;
            if (str != null) {
                ddVar.f39759k.e(new dv(str));
            } else {
                ddVar.f39750b.b("Received reached destination event, but route is null");
            }
        } else {
            ddVar.t();
        }
        return h.ab.f48028a;
    }
}
