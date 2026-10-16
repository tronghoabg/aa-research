package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f13610a;

    /* renamed from: b, reason: collision with root package name */
    Object f13611b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f13612c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f13613d;

    /* renamed from: e, reason: collision with root package name */
    int f13614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(h hVar, h.c.e eVar) {
        super(eVar);
        this.f13613d = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13612c = obj;
        this.f13614e |= Integer.MIN_VALUE;
        return this.f13613d.a(null, null, null, false, this);
    }
}
