package com.waze.settings.f.a;

/* loaded from: classes7.dex */
public final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37205a;

    /* renamed from: b, reason: collision with root package name */
    int f37206b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f37207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, h.c.e eVar) {
        super(eVar);
        this.f37207c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37205a = obj;
        this.f37206b |= Integer.MIN_VALUE;
        return this.f37207c.emit(null, this);
    }
}
