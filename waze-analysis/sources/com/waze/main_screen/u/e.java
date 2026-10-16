package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27697b;

    /* renamed from: c, reason: collision with root package name */
    int f27698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(h hVar, h.c.e eVar) {
        super(eVar);
        this.f27697b = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27696a = obj;
        this.f27698c |= Integer.MIN_VALUE;
        return this.f27697b.d(null, this);
    }
}
