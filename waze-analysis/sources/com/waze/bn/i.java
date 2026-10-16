package com.waze.bn;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f17159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f17160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar) {
        super(2, eVar);
        this.f17160b = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f17160b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17159a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f17159a = 1;
            if (aj.q(this.f17160b.f17163c.a(), this) == aVar) {
                return aVar;
            }
        }
        j jVar = this.f17160b;
        if (jVar.f17164d.d() instanceof d) {
            jVar.f17161a.e("Activation job finished, setting state to Roaming");
            jVar.f17164d.e(e.f17151a);
        } else {
            jVar.f17161a.g("Roaming activation job completed while state is NOT Pending");
        }
        return ab.f48028a;
    }
}
