package com.waze.shared_infra.coordinators;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f37837b;

    /* renamed from: c, reason: collision with root package name */
    int f37838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(s sVar, h.c.e eVar) {
        super(eVar);
        this.f37837b = sVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37836a = obj;
        this.f37838c |= Integer.MIN_VALUE;
        return s.E(this.f37837b, null, this);
    }
}
