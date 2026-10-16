package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14431a;

    /* renamed from: b, reason: collision with root package name */
    int f14432b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f14433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f14433c = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14431a = obj;
        this.f14432b |= Integer.MIN_VALUE;
        return this.f14433c.emit(null, this);
    }
}
