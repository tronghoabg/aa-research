package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class io extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40254a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ip f40255b;

    /* renamed from: c, reason: collision with root package name */
    int f40256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    io(ip ipVar, h.c.e eVar) {
        super(eVar);
        this.f40255b = ipVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40254a = obj;
        this.f40256c |= Integer.MIN_VALUE;
        return this.f40255b.c(null, 0, null, null, this);
    }
}
