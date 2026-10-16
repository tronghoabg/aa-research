package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f42060a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f42061b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f42062c;

    /* renamed from: d, reason: collision with root package name */
    int f42063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, h.c.e eVar) {
        super(eVar);
        this.f42062c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42061b = obj;
        this.f42063d |= Integer.MIN_VALUE;
        return this.f42062c.mo2297onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
