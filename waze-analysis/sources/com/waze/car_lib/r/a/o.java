package com.waze.car_lib.r.a;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20911a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bq f20912b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f20913c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f20914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(bq bqVar, p pVar, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f20912b = bqVar;
        this.f20913c = pVar;
        this.f20914d = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f20912b, this.f20913c, this.f20914d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20911a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bq bqVar = this.f20912b;
            this.f20911a = 1;
            if (ai.d(ai.K(bqVar, new n(this.f20913c, this.f20914d, null)), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
