package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38536a;

    /* renamed from: b, reason: collision with root package name */
    int f38537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38538c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38536a = obj;
        this.f38537b |= Integer.MIN_VALUE;
        return this.f38538c.emit(null, this);
    }
}
