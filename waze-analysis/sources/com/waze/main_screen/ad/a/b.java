package com.waze.main_screen.ad.a;

/* loaded from: classes6.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25692a;

    /* renamed from: b, reason: collision with root package name */
    int f25693b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f25694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, h.c.e eVar) {
        super(eVar);
        this.f25694c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25692a = obj;
        this.f25693b |= Integer.MIN_VALUE;
        return this.f25694c.emit(null, this);
    }
}
