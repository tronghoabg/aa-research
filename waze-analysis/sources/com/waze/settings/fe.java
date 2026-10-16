package com.waze.settings;

/* loaded from: classes7.dex */
public final class fe extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37247a;

    /* renamed from: b, reason: collision with root package name */
    int f37248b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37249c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37247a = obj;
        this.f37248b |= Integer.MIN_VALUE;
        return this.f37249c.emit(null, this);
    }
}
