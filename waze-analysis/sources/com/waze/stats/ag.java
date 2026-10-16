package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40506a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f40507b;

    /* renamed from: c, reason: collision with root package name */
    int f40508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(an anVar, h.c.e eVar) {
        super(eVar);
        this.f40507b = anVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40506a = obj;
        this.f40508c |= Integer.MIN_VALUE;
        return an.g(this.f40507b, null, this);
    }
}
