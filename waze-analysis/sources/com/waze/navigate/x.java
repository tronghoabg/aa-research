package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f31829b;

    /* renamed from: c, reason: collision with root package name */
    int f31830c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.av.d.k f31831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(af afVar, h.c.e eVar) {
        super(eVar);
        this.f31829b = afVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31828a = obj;
        this.f31830c |= Integer.MIN_VALUE;
        return af.h(this.f31829b, null, this);
    }
}
