package com.waze.main_screen.p;

/* loaded from: classes6.dex */
public final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27015a;

    /* renamed from: b, reason: collision with root package name */
    int f27016b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f27017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f27017c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27015a = obj;
        this.f27016b |= Integer.MIN_VALUE;
        return this.f27017c.emit(null, this);
    }
}
