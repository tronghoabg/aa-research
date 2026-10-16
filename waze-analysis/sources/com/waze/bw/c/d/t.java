package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f18166a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18167b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f18168c;

    /* renamed from: d, reason: collision with root package name */
    int f18169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, h.c.e eVar) {
        super(eVar);
        this.f18168c = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18167b = obj;
        this.f18169d |= Integer.MIN_VALUE;
        return this.f18168c.emit(null, this);
    }
}
