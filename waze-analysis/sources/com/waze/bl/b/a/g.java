package com.waze.bl.b.a;

/* loaded from: classes7.dex */
public final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16903a;

    /* renamed from: b, reason: collision with root package name */
    int f16904b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f16905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f16905c = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16903a = obj;
        this.f16904b |= Integer.MIN_VALUE;
        return this.f16905c.emit(null, this);
    }
}
