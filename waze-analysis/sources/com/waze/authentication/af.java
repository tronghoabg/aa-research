package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15696a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15697b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f15698c;

    /* renamed from: d, reason: collision with root package name */
    int f15699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f15698c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15697b = obj;
        this.f15699d |= Integer.MIN_VALUE;
        return this.f15698c.b(this);
    }
}
