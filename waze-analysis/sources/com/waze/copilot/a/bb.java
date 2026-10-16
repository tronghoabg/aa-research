package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22754a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f22755b;

    /* renamed from: c, reason: collision with root package name */
    int f22756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22755b = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22754a = obj;
        this.f22756c |= Integer.MIN_VALUE;
        return this.f22755b.m(null, this);
    }
}
