package com.waze.sharedrive.c;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f38155b;

    /* renamed from: c, reason: collision with root package name */
    int f38156c;

    /* renamed from: d, reason: collision with root package name */
    y f38157d;

    /* renamed from: e, reason: collision with root package name */
    String f38158e;

    /* renamed from: f, reason: collision with root package name */
    aq f38159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y yVar, h.c.e eVar) {
        super(eVar);
        this.f38155b = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38154a = obj;
        this.f38156c |= Integer.MIN_VALUE;
        return y.l(this.f38155b, null, null, null, this);
    }
}
