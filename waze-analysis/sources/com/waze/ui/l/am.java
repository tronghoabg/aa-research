package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f42498a;

    /* renamed from: b, reason: collision with root package name */
    boolean f42499b;

    /* renamed from: c, reason: collision with root package name */
    float f42500c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f42501d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ba f42502e;

    /* renamed from: f, reason: collision with root package name */
    int f42503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(ba baVar, h.c.e eVar) {
        super(eVar);
        this.f42502e = baVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42501d = obj;
        this.f42503f |= Integer.MIN_VALUE;
        return ba.n(this.f42502e, null, null, false, 0.0f, false, 0.0f, this);
    }
}
