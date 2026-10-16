package com.waze.main_screen.ae.a;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25720a;

    /* renamed from: b, reason: collision with root package name */
    int f25721b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f25722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f25722c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25720a = obj;
        this.f25721b |= Integer.MIN_VALUE;
        return this.f25722c.emit(null, this);
    }
}
