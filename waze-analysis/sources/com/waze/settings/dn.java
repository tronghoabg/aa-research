package com.waze.settings;

/* loaded from: classes7.dex */
public final class dn extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37047a;

    /* renamed from: b, reason: collision with root package name */
    int f37048b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37049c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37047a = obj;
        this.f37048b |= Integer.MIN_VALUE;
        return this.f37049c.emit(null, this);
    }
}
