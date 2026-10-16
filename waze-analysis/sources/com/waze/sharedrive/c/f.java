package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38090a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38091b;

    /* renamed from: c, reason: collision with root package name */
    int f38092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38091b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38090a = obj;
        this.f38092c |= Integer.MIN_VALUE;
        return this.f38091b.a(null, null, null, this);
    }
}
