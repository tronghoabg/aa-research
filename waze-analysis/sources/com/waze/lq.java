package com.waze;

/* loaded from: classes5.dex */
public final class lq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25456a;

    /* renamed from: b, reason: collision with root package name */
    int f25457b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f25458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f25458c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25456a = obj;
        this.f25457b |= Integer.MIN_VALUE;
        return this.f25458c.emit(null, this);
    }
}
