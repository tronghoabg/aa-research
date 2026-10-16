package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39769a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39770b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dr f39771c;

    /* renamed from: d, reason: collision with root package name */
    int f39772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dh(dr drVar, h.c.e eVar) {
        super(eVar);
        this.f39771c = drVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39770b = obj;
        this.f39772d |= Integer.MIN_VALUE;
        return this.f39771c.E(null, false, this);
    }
}
