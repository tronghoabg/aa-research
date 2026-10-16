package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fx extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40054a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40055b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f40056c;

    /* renamed from: d, reason: collision with root package name */
    int f40057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fx(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f40056c = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40055b = obj;
        this.f40057d |= Integer.MIN_VALUE;
        return gb.f(this.f40056c, this);
    }
}
