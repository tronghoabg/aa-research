package com.waze;

/* loaded from: classes5.dex */
public final class me extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29622a;

    /* renamed from: b, reason: collision with root package name */
    int f29623b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f29624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f29624c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29622a = obj;
        this.f29623b |= Integer.MIN_VALUE;
        return this.f29624c.emit(null, this);
    }
}
