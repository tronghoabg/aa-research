package com.waze.modules.c;

import com.waze.bg.e.a.gi;
import com.waze.bg.e.a.hz;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class dr extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f30111a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f30112b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ds f30113c;

    /* renamed from: d, reason: collision with root package name */
    int f30114d;

    /* renamed from: e, reason: collision with root package name */
    ce f30115e;

    /* renamed from: f, reason: collision with root package name */
    dd f30116f;

    /* renamed from: g, reason: collision with root package name */
    hz f30117g;

    /* renamed from: h, reason: collision with root package name */
    hz f30118h;

    /* renamed from: i, reason: collision with root package name */
    gi f30119i;

    /* renamed from: j, reason: collision with root package name */
    gi f30120j;

    /* renamed from: k, reason: collision with root package name */
    hz f30121k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dr(ds dsVar, h.c.e eVar) {
        super(eVar);
        this.f30113c = dsVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30112b = obj;
        this.f30114d |= Integer.MIN_VALUE;
        return this.f30113c.a(null, this);
    }
}
