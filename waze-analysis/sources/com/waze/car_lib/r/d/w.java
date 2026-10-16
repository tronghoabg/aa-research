package com.waze.car_lib.r.d;

import h.ab;
import h.g.b.aq;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21333a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f21334b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f21335c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f21336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(x xVar, aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f21334b = xVar;
        this.f21335c = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        w wVar = new w(this.f21334b, this.f21335c, eVar);
        wVar.f21336d = obj;
        return wVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((w) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21333a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            af afVar = (af) this.f21336d;
            x xVar = this.f21334b;
            this.f21333a = 1;
            if (ai.d(ai.F(xVar.m.a(), xVar.r, new v(this.f21335c, afVar, xVar, null)), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
