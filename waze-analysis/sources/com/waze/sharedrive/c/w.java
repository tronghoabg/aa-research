package com.waze.sharedrive.c;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38148a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f38149b;

    /* renamed from: c, reason: collision with root package name */
    int f38150c;

    /* renamed from: d, reason: collision with root package name */
    y f38151d;

    /* renamed from: e, reason: collision with root package name */
    String f38152e;

    /* renamed from: f, reason: collision with root package name */
    aq f38153f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(y yVar, h.c.e eVar) {
        super(eVar);
        this.f38149b = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38148a = obj;
        this.f38150c |= Integer.MIN_VALUE;
        return y.j(this.f38149b, null, null, this);
    }
}
