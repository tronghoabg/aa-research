package com.waze.car_lib.r;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class eb extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eh f21488b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.b.ed f21489c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f21490d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f21491e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f21492f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bm f21493g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f21494h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.l f21495i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eb(eh ehVar, com.waze.map.b.ed edVar, Context context, kotlinx.coroutines.af afVar, int i2, kotlinx.coroutines.b.bm bmVar, kotlinx.coroutines.b.k kVar, com.waze.car_lib.screens.core.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f21488b = ehVar;
        this.f21489c = edVar;
        this.f21490d = context;
        this.f21491e = afVar;
        this.f21492f = i2;
        this.f21493g = bmVar;
        this.f21494h = kVar;
        this.f21495i = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new eb(this.f21488b, this.f21489c, this.f21490d, this.f21491e, this.f21492f, this.f21493g, this.f21494h, this.f21495i, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((eb) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21487a == 0) {
            e.b.c.b(obj);
            eh ehVar = this.f21488b;
            this.f21487a = 1;
            if (ehVar.f21525b.b().collect(new ea(ehVar, this.f21489c, this.f21490d, this.f21491e, this.f21492f, this.f21493g, this.f21494h, this.f21495i), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
