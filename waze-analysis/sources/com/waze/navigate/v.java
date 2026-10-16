package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31819a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f31820b;

    /* renamed from: c, reason: collision with root package name */
    int f31821c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.av.d.k f31822d;

    /* renamed from: e, reason: collision with root package name */
    String f31823e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.av.d.k f31824f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(af afVar, h.c.e eVar) {
        super(eVar);
        this.f31820b = afVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31819a = obj;
        this.f31821c |= Integer.MIN_VALUE;
        return af.f(this.f31820b, null, this);
    }
}
