package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fs extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f40036a;

    /* renamed from: b, reason: collision with root package name */
    boolean f40037b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f40038c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gb f40039d;

    /* renamed from: e, reason: collision with root package name */
    int f40040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fs(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f40039d = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40038c = obj;
        this.f40040e |= Integer.MIN_VALUE;
        return this.f40039d.v(0, false, this);
    }
}
