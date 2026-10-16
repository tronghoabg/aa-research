package com.waze.car_lib.j;

/* loaded from: classes5.dex */
public final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20172a;

    /* renamed from: b, reason: collision with root package name */
    int f20173b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f20174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f20174c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20172a = obj;
        this.f20173b |= Integer.MIN_VALUE;
        return this.f20174c.emit(null, this);
    }
}
