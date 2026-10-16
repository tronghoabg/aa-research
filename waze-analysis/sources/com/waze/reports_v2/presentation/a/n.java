package com.waze.reports_v2.presentation.a;

/* loaded from: classes7.dex */
public final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34731a;

    /* renamed from: b, reason: collision with root package name */
    int f34732b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f34733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, h.c.e eVar) {
        super(eVar);
        this.f34733c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34731a = obj;
        this.f34732b |= Integer.MIN_VALUE;
        return this.f34733c.emit(null, this);
    }
}
