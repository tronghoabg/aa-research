package com.waze.t.b;

/* loaded from: classes5.dex */
public final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40661a;

    /* renamed from: b, reason: collision with root package name */
    int f40662b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f40663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f40663c = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40661a = obj;
        this.f40662b |= Integer.MIN_VALUE;
        return this.f40663c.emit(null, this);
    }
}
