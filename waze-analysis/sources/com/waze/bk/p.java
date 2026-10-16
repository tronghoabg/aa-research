package com.waze.bk;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f16876a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f16877b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f16878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f16877b = rVar;
        this.f16878c = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f16877b, this.f16878c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f16876a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f16876a = 1;
            if (aj.q(150L, this) == aVar) {
                return aVar;
            }
        }
        this.f16878c.run();
        return ab.f48028a;
    }
}
