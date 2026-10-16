package com.waze.settings;

/* loaded from: classes7.dex */
public final class fp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37269a;

    /* renamed from: b, reason: collision with root package name */
    int f37270b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37271c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37269a = obj;
        this.f37270b |= Integer.MIN_VALUE;
        return this.f37271c.emit(null, this);
    }
}
