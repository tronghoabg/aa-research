package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38045a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38046b;

    /* renamed from: c, reason: collision with root package name */
    int f38047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38046b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38045a = obj;
        this.f38047c |= Integer.MIN_VALUE;
        return this.f38046b.g(null, null, this);
    }
}
