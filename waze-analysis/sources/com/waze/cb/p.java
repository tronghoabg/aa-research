package com.waze.cb;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f22111b;

    /* renamed from: c, reason: collision with root package name */
    int f22112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(s sVar, h.c.e eVar) {
        super(eVar);
        this.f22111b = sVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22110a = obj;
        this.f22112c |= Integer.MIN_VALUE;
        return this.f22111b.b(this);
    }
}
