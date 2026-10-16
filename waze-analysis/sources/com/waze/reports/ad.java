package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33582a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f33583b;

    /* renamed from: c, reason: collision with root package name */
    int f33584c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.av.a.p f33585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f33583b = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33582a = obj;
        this.f33584c |= Integer.MIN_VALUE;
        return this.f33583b.j(null, null, this);
    }
}
