package com.waze.sharedrive.d;

/* loaded from: classes7.dex */
public final class aj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38190a;

    /* renamed from: b, reason: collision with root package name */
    int f38191b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f38192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38192c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38190a = obj;
        this.f38191b |= Integer.MIN_VALUE;
        return this.f38192c.emit(null, this);
    }
}
