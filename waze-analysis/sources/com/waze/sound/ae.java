package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39409a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39410b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f39411c;

    /* renamed from: d, reason: collision with root package name */
    int f39412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(af afVar, h.c.e eVar) {
        super(eVar);
        this.f39411c = afVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39410b = obj;
        this.f39412d |= Integer.MIN_VALUE;
        return this.f39411c.emit(null, this);
    }
}
