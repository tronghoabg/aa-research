package com.waze.sound.a;

import h.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39388a;

    /* renamed from: b, reason: collision with root package name */
    Object f39389b;

    /* renamed from: c, reason: collision with root package name */
    Object f39390c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f39391d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f39392e;

    /* renamed from: f, reason: collision with root package name */
    int f39393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar) {
        super(eVar);
        this.f39392e = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39391d = obj;
        this.f39393f |= Integer.MIN_VALUE;
        Object objB = this.f39392e.b(this);
        return objB == h.c.a.a.f48038a ? objB : m.d(objB);
    }
}
