package com.waze.uid.state_impl.email;

import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44658a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f44659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, h.c.e eVar) {
        super(2, eVar);
        this.f44659b = rVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f44659b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44658a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f44658a = 1;
            if (aj.q(1000L, this) == aVar) {
                return aVar;
            }
        }
        this.f44659b.f44485c.w(new com.waze.uid.c.y());
        return h.ab.f48028a;
    }
}
