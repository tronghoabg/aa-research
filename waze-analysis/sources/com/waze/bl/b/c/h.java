package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16942a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f16943b;

    /* renamed from: c, reason: collision with root package name */
    int f16944c;

    /* renamed from: d, reason: collision with root package name */
    i f16945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f16943b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16942a = obj;
        this.f16944c |= Integer.MIN_VALUE;
        return i.a(this.f16943b, this);
    }
}
