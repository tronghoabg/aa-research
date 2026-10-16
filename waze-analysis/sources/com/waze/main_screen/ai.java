package com.waze.main_screen;

/* loaded from: classes6.dex */
public final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25826a;

    /* renamed from: b, reason: collision with root package name */
    int f25827b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bc f25828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f25828c = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25826a = obj;
        this.f25827b |= Integer.MIN_VALUE;
        return this.f25828c.emit(null, this);
    }
}
