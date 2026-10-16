package com.waze.sound.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f39495b;

    /* renamed from: c, reason: collision with root package name */
    int f39496c;

    /* renamed from: d, reason: collision with root package name */
    String f39497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f39495b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39494a = obj;
        this.f39496c |= Integer.MIN_VALUE;
        return this.f39495b.c(this);
    }
}
