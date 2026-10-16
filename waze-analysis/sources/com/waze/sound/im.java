package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class im extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ip f40244b;

    /* renamed from: c, reason: collision with root package name */
    int f40245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    im(ip ipVar, h.c.e eVar) {
        super(eVar);
        this.f40244b = ipVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40243a = obj;
        this.f40245c |= Integer.MIN_VALUE;
        return this.f40244b.a(null, 0, null, this);
    }
}
