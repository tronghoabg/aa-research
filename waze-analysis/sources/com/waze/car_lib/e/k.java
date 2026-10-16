package com.waze.car_lib.e;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19290a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f19291b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f19292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(p pVar, kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f19291b = pVar;
        this.f19292c = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f19291b, this.f19292c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19290a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            p pVar = this.f19291b;
            pVar.f19309e.a("Cluster screen resumed. Recollecting cluster ui state");
            this.f19290a = 1;
            if (this.f19292c.collect(new j(pVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
