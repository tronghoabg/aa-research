package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ci extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cl f29957b;

    /* renamed from: c, reason: collision with root package name */
    int f29958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(cl clVar, h.c.e eVar) {
        super(eVar);
        this.f29957b = clVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29956a = obj;
        this.f29958c |= Integer.MIN_VALUE;
        return this.f29957b.b(null, this);
    }
}
