package com.waze.reports_v2.c;

import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f34152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f34153b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f34154c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.e.c f34155d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Instant f34156e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f34157f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.ac f34158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ad adVar, String str, com.waze.sharedui.e.c cVar, Instant instant, String str2, com.waze.reports_v2.b.ac acVar, h.c.e eVar) {
        super(1, eVar);
        this.f34153b = adVar;
        this.f34154c = str;
        this.f34155d = cVar;
        this.f34156e = instant;
        this.f34157f = str2;
        this.f34158g = acVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new ab(this.f34153b, this.f34154c, this.f34155d, this.f34156e, this.f34157f, this.f34158g, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ab) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34152a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        ad adVar = this.f34153b;
        String str = this.f34154c;
        com.waze.sharedui.e.c cVar = this.f34155d;
        Instant instant = this.f34156e;
        String str2 = this.f34157f;
        com.waze.reports_v2.b.ac acVar = this.f34158g;
        this.f34152a = 1;
        Object objA = adVar.f34167c.a(str, cVar, instant, adVar.d(), str2, acVar, this);
        return objA == aVar ? aVar : objA;
    }
}
