package com.waze.uid.activities;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f44097a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f44098b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f44099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(q qVar, h.c.e eVar) {
        super(3, eVar);
        this.f44099c = qVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        l lVar = new l(this.f44099c, (h.c.e) obj3);
        lVar.f44097a = zBooleanValue;
        lVar.f44098b = (com.waze.uid.b.n) obj2;
        return lVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f44097a;
        com.waze.uid.b.n nVar = (com.waze.uid.b.n) this.f44098b;
        if (!z) {
            if ((nVar != null ? nVar.b() : null) == com.waze.uid.b.o.f44168a) {
                return this.f44099c.q();
            }
        }
        return null;
    }
}
