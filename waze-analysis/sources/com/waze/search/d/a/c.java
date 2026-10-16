package com.waze.search.d.a;

import h.c.e;
import h.g.b.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f35605b;

    /* renamed from: c, reason: collision with root package name */
    int f35606c;

    /* renamed from: d, reason: collision with root package name */
    an f35607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, e eVar) {
        super(eVar);
        this.f35605b = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35604a = obj;
        this.f35606c |= Integer.MIN_VALUE;
        return this.f35605b.performFling(null, 0.0f, this);
    }
}
