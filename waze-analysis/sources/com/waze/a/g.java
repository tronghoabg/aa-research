package com.waze.a;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f13629a;

    /* renamed from: b, reason: collision with root package name */
    Object f13630b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f13631c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f13632d;

    /* renamed from: e, reason: collision with root package name */
    int f13633e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.app_nav.hub.b.k f13634f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.shared_infra.q.i f13635g;

    /* renamed from: h, reason: collision with root package name */
    aq f13636h;

    /* renamed from: i, reason: collision with root package name */
    aq f13637i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f13632d = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13631c = obj;
        this.f13633e |= Integer.MIN_VALUE;
        return this.f13632d.c(null, null, null, null, null, this);
    }
}
