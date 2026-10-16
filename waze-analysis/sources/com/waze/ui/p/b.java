package com.waze.ui.p;

/* loaded from: classes7.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f43182a;

    /* renamed from: b, reason: collision with root package name */
    int f43183b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f43184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, h.c.e eVar) {
        super(eVar);
        this.f43184c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f43182a = obj;
        this.f43183b |= Integer.MIN_VALUE;
        return this.f43184c.emit(null, this);
    }
}
