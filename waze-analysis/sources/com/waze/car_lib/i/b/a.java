package com.waze.car_lib.i.b;

/* loaded from: classes5.dex */
public final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19934a;

    /* renamed from: b, reason: collision with root package name */
    int f19935b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f19936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, h.c.e eVar) {
        super(eVar);
        this.f19936c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19934a = obj;
        this.f19935b |= Integer.MIN_VALUE;
        return this.f19936c.emit(null, this);
    }
}
