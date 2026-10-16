package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40396a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40397b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f40398c;

    /* renamed from: d, reason: collision with root package name */
    int f40399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f40398c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40397b = obj;
        this.f40399d |= Integer.MIN_VALUE;
        return this.f40398c.d(null, null, this);
    }
}
