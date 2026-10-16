package com.waze.main_screen.k.a;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26517a;

    /* renamed from: b, reason: collision with root package name */
    int f26518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f26519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f26519c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26517a = obj;
        this.f26518b |= Integer.MIN_VALUE;
        return this.f26519c.emit(null, this);
    }
}
