package com.waze.sound;

/* loaded from: classes7.dex */
public final class fj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40014a;

    /* renamed from: b, reason: collision with root package name */
    int f40015b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dn f40016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(dn dnVar, h.c.e eVar) {
        super(eVar);
        this.f40016c = dnVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40014a = obj;
        this.f40015b |= Integer.MIN_VALUE;
        return this.f40016c.emit(null, this);
    }
}
