package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f40515a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40516b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ an f40517c;

    /* renamed from: d, reason: collision with root package name */
    int f40518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(an anVar, h.c.e eVar) {
        super(eVar);
        this.f40517c = anVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40516b = obj;
        this.f40518d |= Integer.MIN_VALUE;
        return an.i(this.f40517c, false, this);
    }
}
