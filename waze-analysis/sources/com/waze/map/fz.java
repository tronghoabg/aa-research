package com.waze.map;

/* loaded from: classes6.dex */
public final class fz extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29035a;

    /* renamed from: b, reason: collision with root package name */
    int f29036b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fx f29037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(fx fxVar, h.c.e eVar) {
        super(eVar);
        this.f29037c = fxVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29035a = obj;
        this.f29036b |= Integer.MIN_VALUE;
        return this.f29037c.emit(null, this);
    }
}
