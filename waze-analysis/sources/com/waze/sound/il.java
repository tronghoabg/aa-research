package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class il extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40240a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ip f40241b;

    /* renamed from: c, reason: collision with root package name */
    int f40242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    il(ip ipVar, h.c.e eVar) {
        super(eVar);
        this.f40241b = ipVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40240a = obj;
        this.f40242c |= Integer.MIN_VALUE;
        return this.f40241b.f(null, this);
    }
}
