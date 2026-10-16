package com.waze;

/* loaded from: classes5.dex */
public final class ey extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23743a;

    /* renamed from: b, reason: collision with root package name */
    int f23744b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f23745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f23745c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23743a = obj;
        this.f23744b |= Integer.MIN_VALUE;
        return this.f23745c.emit(null, this);
    }
}
