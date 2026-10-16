package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f38203a;

    /* renamed from: b, reason: collision with root package name */
    Object f38204b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f38205c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f38206d;

    /* renamed from: e, reason: collision with root package name */
    int f38207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(aq aqVar, h.c.e eVar) {
        super(eVar);
        this.f38206d = aqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38205c = obj;
        this.f38207e |= Integer.MIN_VALUE;
        return this.f38206d.k(false, this);
    }
}
