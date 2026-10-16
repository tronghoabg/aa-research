package com.waze.places.a;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f33094b;

    /* renamed from: c, reason: collision with root package name */
    int f33095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, e eVar) {
        super(eVar);
        this.f33094b = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33093a = obj;
        this.f33095c |= Integer.MIN_VALUE;
        return this.f33094b.a(null, false, this);
    }
}
