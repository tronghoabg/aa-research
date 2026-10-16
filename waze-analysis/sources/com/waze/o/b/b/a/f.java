package com.waze.o.b.b.a;

import com.waze.av.b.aa;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f32701a;

    /* renamed from: b, reason: collision with root package name */
    Object f32702b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f32703c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f32704d;

    /* renamed from: e, reason: collision with root package name */
    int f32705e;

    /* renamed from: f, reason: collision with root package name */
    aq f32706f;

    /* renamed from: g, reason: collision with root package name */
    aa f32707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f32704d = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32703c = obj;
        this.f32705e |= Integer.MIN_VALUE;
        return this.f32704d.a(null, this);
    }
}
