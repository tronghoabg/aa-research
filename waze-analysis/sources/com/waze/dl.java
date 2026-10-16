package com.waze;

/* loaded from: classes5.dex */
public final class dl extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23564a;

    /* renamed from: b, reason: collision with root package name */
    int f23565b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f23566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f23566c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23564a = obj;
        this.f23565b |= Integer.MIN_VALUE;
        return this.f23566c.emit(null, this);
    }
}
