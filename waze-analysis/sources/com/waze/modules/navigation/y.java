package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30506a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f30507b;

    /* renamed from: c, reason: collision with root package name */
    int f30508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f30507b = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30506a = obj;
        this.f30508c |= Integer.MIN_VALUE;
        return this.f30507b.a(null, null, false, null, null, null, this);
    }
}
