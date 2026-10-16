package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cu extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ db f34369b;

    /* renamed from: c, reason: collision with root package name */
    int f34370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cu(db dbVar, h.c.e eVar) {
        super(eVar);
        this.f34369b = dbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34368a = obj;
        this.f34370c |= Integer.MIN_VALUE;
        return db.c(this.f34369b, this);
    }
}
