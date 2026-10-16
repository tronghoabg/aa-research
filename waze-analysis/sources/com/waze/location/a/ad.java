package com.waze.location.a;

import com.waze.navigate.ei;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25182a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25183b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f25184c;

    ad(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ad adVar = new ad((h.c.e) obj4);
        adVar.f25182a = (ei) obj;
        adVar.f25183b = (String) obj2;
        adVar.f25184c = (String) obj3;
        return adVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return ((ei) this.f25182a) == ei.f31311b ? (String) this.f25183b : (String) this.f25184c;
    }
}
