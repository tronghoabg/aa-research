package com.waze.network.f;

import i.b.l.lb;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32330a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f32331b;

    /* renamed from: c, reason: collision with root package name */
    int f32332c;

    /* renamed from: d, reason: collision with root package name */
    StringBuilder f32333d;

    /* renamed from: e, reason: collision with root package name */
    StringBuilder f32334e;

    /* renamed from: f, reason: collision with root package name */
    lb f32335f;

    /* renamed from: g, reason: collision with root package name */
    lb f32336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(w wVar, h.c.e eVar) {
        super(eVar);
        this.f32331b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32330a = obj;
        this.f32332c |= Integer.MIN_VALUE;
        return this.f32331b.o(null, this);
    }
}
