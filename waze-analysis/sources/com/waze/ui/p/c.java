package com.waze.ui.p;

/* loaded from: classes7.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f43185a;

    /* renamed from: b, reason: collision with root package name */
    int f43186b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f43187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f43187c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f43185a = obj;
        this.f43186b |= Integer.MIN_VALUE;
        return this.f43187c.emit(null, this);
    }
}
