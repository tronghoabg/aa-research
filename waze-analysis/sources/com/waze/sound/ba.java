package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ba extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f39508a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39509b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bb f39510c;

    /* renamed from: d, reason: collision with root package name */
    int f39511d;

    /* renamed from: e, reason: collision with root package name */
    String f39512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bb bbVar, h.c.e eVar) {
        super(eVar);
        this.f39510c = bbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39509b = obj;
        this.f39511d |= Integer.MIN_VALUE;
        return this.f39510c.b(null, false, this);
    }
}
