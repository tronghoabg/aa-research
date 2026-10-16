package com.waze.ce;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f22160b;

    /* renamed from: c, reason: collision with root package name */
    int f22161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f22160b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22159a = obj;
        this.f22161c |= Integer.MIN_VALUE;
        return this.f22160b.c(null, null, this);
    }
}
