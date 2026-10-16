package com.waze.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13574a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f13575b;

    /* renamed from: c, reason: collision with root package name */
    int f13576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f13575b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13574a = obj;
        this.f13576c |= Integer.MIN_VALUE;
        return this.f13575b.b(this);
    }
}
