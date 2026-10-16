package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ay extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22739a;

    /* renamed from: b, reason: collision with root package name */
    Object f22740b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22741c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ be f22742d;

    /* renamed from: e, reason: collision with root package name */
    int f22743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22742d = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22741c = obj;
        this.f22743e |= Integer.MIN_VALUE;
        return this.f22742d.k(null, null, this);
    }
}
