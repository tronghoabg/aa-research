package com.waze.ui.z;

/* loaded from: classes7.dex */
public final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44024a;

    /* renamed from: b, reason: collision with root package name */
    int f44025b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f44026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, h.c.e eVar) {
        super(eVar);
        this.f44026c = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44024a = obj;
        this.f44025b |= Integer.MIN_VALUE;
        return this.f44026c.emit(null, this);
    }
}
