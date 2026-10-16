package com.google.firebase.sessions;

/* loaded from: classes4.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10786a;

    /* renamed from: b, reason: collision with root package name */
    int f10787b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f10788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f10788c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10786a = obj;
        this.f10787b |= Integer.MIN_VALUE;
        return this.f10788c.emit(null, this);
    }
}
