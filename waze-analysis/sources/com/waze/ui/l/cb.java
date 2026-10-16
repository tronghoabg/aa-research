package com.waze.ui.l;

/* loaded from: classes7.dex */
public final class cb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42660a;

    /* renamed from: b, reason: collision with root package name */
    int f42661b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cc f42662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(cc ccVar, h.c.e eVar) {
        super(eVar);
        this.f42662c = ccVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42660a = obj;
        this.f42661b |= Integer.MIN_VALUE;
        return this.f42662c.emit(null, this);
    }
}
