package com.waze.settings.tree;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37656a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f37657b;

    /* renamed from: c, reason: collision with root package name */
    int f37658c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.ifs.ui.x f37659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f37657b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37656a = obj;
        this.f37658c |= Integer.MIN_VALUE;
        return this.f37657b.c(null, null, this);
    }
}
