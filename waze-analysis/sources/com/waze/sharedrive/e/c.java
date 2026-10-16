package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38473a;

    /* renamed from: b, reason: collision with root package name */
    int f38474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38475c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38473a = obj;
        this.f38474b |= Integer.MIN_VALUE;
        return this.f38475c.emit(null, this);
    }
}
