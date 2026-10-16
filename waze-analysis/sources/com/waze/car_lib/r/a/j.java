package com.waze.car_lib.r.a;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20898b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f20899c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f20900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(p pVar, h.g.a.a aVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f20898b = pVar;
        this.f20899c = aVar;
        this.f20900d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f20898b, this.f20899c, this.f20900d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20897a == 0) {
            e.b.c.b(obj);
            p pVar = this.f20898b;
            this.f20897a = 1;
            if (pVar.f20917c.o().collect(new i(pVar, this.f20899c, this.f20900d), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
