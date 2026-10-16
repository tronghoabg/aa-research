package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ct extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34365a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ db f34366b;

    /* renamed from: c, reason: collision with root package name */
    int f34367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ct(db dbVar, h.c.e eVar) {
        super(eVar);
        this.f34366b = dbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34365a = obj;
        this.f34367c |= Integer.MIN_VALUE;
        return db.b(this.f34366b, this);
    }
}
