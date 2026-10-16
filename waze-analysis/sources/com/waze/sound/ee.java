package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ee extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39893a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39894b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ el f39895c;

    /* renamed from: d, reason: collision with root package name */
    int f39896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ee(el elVar, h.c.e eVar) {
        super(eVar);
        this.f39895c = elVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39894b = obj;
        this.f39896d |= Integer.MIN_VALUE;
        Object objH = el.h(this.f39895c, null, null, null, this);
        return objH == h.c.a.a.f48038a ? objH : h.m.d(objH);
    }
}
