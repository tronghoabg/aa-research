package com.waze.car_lib.j;

/* loaded from: classes5.dex */
public final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20177a;

    /* renamed from: b, reason: collision with root package name */
    int f20178b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f20179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(af afVar, h.c.e eVar) {
        super(eVar);
        this.f20179c = afVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20177a = obj;
        this.f20178b |= Integer.MIN_VALUE;
        return this.f20179c.emit(null, this);
    }
}
