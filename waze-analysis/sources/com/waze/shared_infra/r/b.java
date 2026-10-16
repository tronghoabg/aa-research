package com.waze.shared_infra.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f37954b;

    /* renamed from: c, reason: collision with root package name */
    int f37955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(l lVar, h.c.e eVar) {
        super(eVar);
        this.f37954b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37953a = obj;
        this.f37955c |= Integer.MIN_VALUE;
        return this.f37954b.a(this);
    }
}
