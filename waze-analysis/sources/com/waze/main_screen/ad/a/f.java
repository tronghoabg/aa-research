package com.waze.main_screen.ad.a;

/* loaded from: classes6.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25704a;

    /* renamed from: b, reason: collision with root package name */
    int f25705b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f25706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, h.c.e eVar) {
        super(eVar);
        this.f25706c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25704a = obj;
        this.f25705b |= Integer.MIN_VALUE;
        return this.f25706c.emit(null, this);
    }
}
