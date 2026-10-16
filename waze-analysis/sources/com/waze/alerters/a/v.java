package com.waze.alerters.a;

/* loaded from: classes5.dex */
public final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14200a;

    /* renamed from: b, reason: collision with root package name */
    int f14201b;

    /* renamed from: c, reason: collision with root package name */
    Object f14202c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f14203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, h.c.e eVar) {
        super(eVar);
        this.f14203d = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14200a = obj;
        this.f14201b |= Integer.MIN_VALUE;
        return this.f14203d.emit(null, this);
    }
}
