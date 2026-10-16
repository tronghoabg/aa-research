package com.waze.cf.d;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22229a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f22230b;

    /* renamed from: c, reason: collision with root package name */
    int f22231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, e eVar) {
        super(eVar);
        this.f22230b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22229a = obj;
        this.f22231c |= Integer.MIN_VALUE;
        return this.f22230b.a(this);
    }
}
