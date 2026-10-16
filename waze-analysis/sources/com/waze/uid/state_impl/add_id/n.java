package com.waze.uid.state_impl.add_id;

import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44590a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f44591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f44591b = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new n(this.f44591b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44590a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f44590a = 1;
            if (com.waze.uid.d.q.f44463a.a().f44471i.c().collect(new m(this.f44591b), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
