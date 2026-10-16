package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fv extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40046a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f40048c;

    /* renamed from: d, reason: collision with root package name */
    int f40049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fv(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f40048c = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40047b = obj;
        this.f40049d |= Integer.MIN_VALUE;
        return this.f40048c.w(null, this);
    }
}
