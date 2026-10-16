package com.waze.car_lib.r.a;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20887a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20888b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f20889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(p pVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f20888b = pVar;
        this.f20889c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f20888b, this.f20889c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20887a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            p pVar = this.f20888b;
            boolean z = this.f20889c;
            this.f20887a = 1;
            if (pVar.f20917c.l(z, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
