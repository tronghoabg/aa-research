package com.waze.main_screen.a.b;

/* loaded from: classes6.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25588a;

    /* renamed from: b, reason: collision with root package name */
    int f25589b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f25590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f25590c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25588a = obj;
        this.f25589b |= Integer.MIN_VALUE;
        return this.f25590c.emit(null, this);
    }
}
