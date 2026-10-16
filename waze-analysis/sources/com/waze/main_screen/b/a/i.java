package com.waze.main_screen.b.a;

/* loaded from: classes6.dex */
public final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25879a;

    /* renamed from: b, reason: collision with root package name */
    int f25880b;

    /* renamed from: c, reason: collision with root package name */
    Object f25881c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j f25882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, h.c.e eVar) {
        super(eVar);
        this.f25882d = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25879a = obj;
        this.f25880b |= Integer.MIN_VALUE;
        return this.f25882d.emit(null, this);
    }
}
