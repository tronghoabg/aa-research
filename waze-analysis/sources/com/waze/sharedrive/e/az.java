package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class az extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f38380a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38381b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bc f38382c;

    /* renamed from: d, reason: collision with root package name */
    int f38383d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.sharedrive.c.a.l f38384e;

    /* renamed from: f, reason: collision with root package name */
    h.o.f f38385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f38382c = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38381b = obj;
        this.f38383d |= Integer.MIN_VALUE;
        return this.f38382c.k(null, null, this);
    }
}
