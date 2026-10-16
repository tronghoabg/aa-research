package com.waze.uid.activities;

/* loaded from: classes7.dex */
public final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44102a;

    /* renamed from: b, reason: collision with root package name */
    int f44103b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f44104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, h.c.e eVar) {
        super(eVar);
        this.f44104c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44102a = obj;
        this.f44103b |= Integer.MIN_VALUE;
        return this.f44104c.emit(null, this);
    }
}
