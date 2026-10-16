package com.waze.car_lib;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18919a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f18920b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f18921c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f18922d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f18923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(bd bdVar, kotlinx.coroutines.af afVar, Context context, com.waze.car_lib.i.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f18920b = bdVar;
        this.f18921c = afVar;
        this.f18922d = context;
        this.f18923e = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ay(this.f18920b, this.f18921c, this.f18922d, this.f18923e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18919a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.g.b.aq aqVar = new h.g.b.aq();
            aqVar.f48105a = h.g.b.o.i();
            bd bdVar = this.f18920b;
            this.f18919a = 1;
            if (kotlinx.coroutines.b.ai.D(bdVar.p).collect(new ax(aqVar, this.f18921c, this.f18922d, this.f18923e, bdVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
