package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39910a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39911b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ei f39912c;

    /* renamed from: d, reason: collision with root package name */
    int f39913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eh(ei eiVar, h.c.e eVar) {
        super(eVar);
        this.f39912c = eiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39911b = obj;
        this.f39913d |= Integer.MIN_VALUE;
        return this.f39912c.emit(null, this);
    }
}
