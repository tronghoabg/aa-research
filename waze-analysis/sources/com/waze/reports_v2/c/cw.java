package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34373a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ db f34374b;

    /* renamed from: c, reason: collision with root package name */
    int f34375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cw(db dbVar, h.c.e eVar) {
        super(eVar);
        this.f34374b = dbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34373a = obj;
        this.f34375c |= Integer.MIN_VALUE;
        return this.f34374b.d(this);
    }
}
