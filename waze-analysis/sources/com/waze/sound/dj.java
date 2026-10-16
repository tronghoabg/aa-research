package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39778a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39779b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dr f39780c;

    /* renamed from: d, reason: collision with root package name */
    int f39781d;

    /* renamed from: e, reason: collision with root package name */
    String f39782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dj(dr drVar, h.c.e eVar) {
        super(eVar);
        this.f39780c = drVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39779b = obj;
        this.f39781d |= Integer.MIN_VALUE;
        return dr.l(this.f39780c, null, null, null, null, this);
    }
}
