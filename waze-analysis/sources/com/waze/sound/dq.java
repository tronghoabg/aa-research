package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39801a;

    /* renamed from: b, reason: collision with root package name */
    int f39802b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f39803c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ dr f39804d;

    /* renamed from: e, reason: collision with root package name */
    int f39805e;

    /* renamed from: f, reason: collision with root package name */
    ak f39806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dq(dr drVar, h.c.e eVar) {
        super(eVar);
        this.f39804d = drVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39803c = obj;
        this.f39805e |= Integer.MIN_VALUE;
        return this.f39804d.G(null, null, this);
    }
}
