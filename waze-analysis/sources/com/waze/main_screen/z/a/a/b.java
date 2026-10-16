package com.waze.main_screen.z.a.a;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f27890a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f27891b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f27892c;

    /* renamed from: d, reason: collision with root package name */
    int f27893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, e eVar) {
        super(eVar);
        this.f27892c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27891b = obj;
        this.f27893d |= Integer.MIN_VALUE;
        return this.f27892c.a(null, null, null, null, null, this);
    }
}
