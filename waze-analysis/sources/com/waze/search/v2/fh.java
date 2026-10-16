package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f36512a;

    /* renamed from: b, reason: collision with root package name */
    int f36513b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f36514c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fi f36515d;

    /* renamed from: e, reason: collision with root package name */
    int f36516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fh(fi fiVar, h.c.e eVar) {
        super(eVar);
        this.f36515d = fiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36514c = obj;
        this.f36516e |= Integer.MIN_VALUE;
        return this.f36515d.al(false, 0, null, null, this);
    }
}
