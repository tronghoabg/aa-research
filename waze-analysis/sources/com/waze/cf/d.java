package com.waze.cf;

/* loaded from: classes7.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22226a;

    /* renamed from: b, reason: collision with root package name */
    int f22227b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f22228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f22228c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22226a = obj;
        this.f22227b |= Integer.MIN_VALUE;
        return this.f22228c.emit(null, this);
    }
}
