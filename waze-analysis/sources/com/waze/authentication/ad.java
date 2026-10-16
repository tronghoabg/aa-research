package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15687a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15688b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f15689c;

    /* renamed from: d, reason: collision with root package name */
    int f15690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f15689c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15688b = obj;
        this.f15690d |= Integer.MIN_VALUE;
        return this.f15689c.g(null, this);
    }
}
