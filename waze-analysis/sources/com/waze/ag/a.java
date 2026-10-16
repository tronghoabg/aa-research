package com.waze.ag;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f14052b;

    /* renamed from: c, reason: collision with root package name */
    int f14053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, e eVar) {
        super(eVar);
        this.f14052b = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14051a = obj;
        this.f14053c |= Integer.MIN_VALUE;
        return this.f14052b.a(this);
    }
}
