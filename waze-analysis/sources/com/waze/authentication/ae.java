package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15691a;

    /* renamed from: b, reason: collision with root package name */
    Object f15692b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f15693c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ah f15694d;

    /* renamed from: e, reason: collision with root package name */
    int f15695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f15694d = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15693c = obj;
        this.f15695e |= Integer.MIN_VALUE;
        return this.f15694d.a(null, this);
    }
}
