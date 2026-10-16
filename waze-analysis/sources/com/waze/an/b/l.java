package com.waze.an.b;

import h.ab;
import h.g.a.p;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f14647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f14649c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f14650d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f14651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlinx.coroutines.b.k kVar, h.c.e eVar, o oVar, aq aqVar) {
        super(2, eVar);
        this.f14648b = kVar;
        this.f14649c = oVar;
        this.f14650d = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        l lVar = new l(this.f14648b, eVar, this.f14649c, this.f14650d);
        lVar.f14651e = obj;
        return lVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14647a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f14651e;
            this.f14647a = 1;
            if (this.f14648b.collect(new k(lVar, this.f14649c, this.f14650d), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
