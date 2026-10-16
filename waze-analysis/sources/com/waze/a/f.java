package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f13624a;

    /* renamed from: b, reason: collision with root package name */
    Object f13625b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f13626c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f13627d;

    /* renamed from: e, reason: collision with root package name */
    int f13628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, h.c.e eVar) {
        super(eVar);
        this.f13627d = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13626c = obj;
        this.f13628e |= Integer.MIN_VALUE;
        return this.f13627d.e(null, null, null, this);
    }
}
