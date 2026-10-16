package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40124a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40125b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ hl f40126c;

    /* renamed from: d, reason: collision with root package name */
    int f40127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hb(hl hlVar, h.c.e eVar) {
        super(eVar);
        this.f40126c = hlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40125b = obj;
        this.f40127d |= Integer.MIN_VALUE;
        return hl.g(this.f40126c, null, this);
    }
}
