package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f34147b;

    /* renamed from: c, reason: collision with root package name */
    int f34148c;

    /* renamed from: d, reason: collision with root package name */
    String f34149d;

    /* renamed from: e, reason: collision with root package name */
    String f34150e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.reports_v2.b.ac f34151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f34147b = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34146a = obj;
        this.f34148c |= Integer.MIN_VALUE;
        return this.f34147b.b(null, null, null, this);
    }
}
