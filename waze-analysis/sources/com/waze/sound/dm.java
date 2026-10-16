package com.waze.sound;

/* loaded from: classes7.dex */
public final class dm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39788a;

    /* renamed from: b, reason: collision with root package name */
    int f39789b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dn f39790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(dn dnVar, h.c.e eVar) {
        super(eVar);
        this.f39790c = dnVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39788a = obj;
        this.f39789b |= Integer.MIN_VALUE;
        return this.f39790c.emit(null, this);
    }
}
