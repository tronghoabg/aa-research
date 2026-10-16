package com.waze.car_lib.m;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20328a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f20329b;

    /* renamed from: c, reason: collision with root package name */
    int f20330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, e eVar) {
        super(eVar);
        this.f20329b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20328a = obj;
        this.f20330c |= Integer.MIN_VALUE;
        return this.f20329b.b(null, this);
    }
}
