package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class az extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39489a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bb f39490b;

    /* renamed from: c, reason: collision with root package name */
    int f39491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(bb bbVar, h.c.e eVar) {
        super(eVar);
        this.f39490b = bbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39489a = obj;
        this.f39491c |= Integer.MIN_VALUE;
        return this.f39490b.a(null, this);
    }
}
