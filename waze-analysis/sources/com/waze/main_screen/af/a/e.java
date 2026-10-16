package com.waze.main_screen.af.a;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25765a;

    /* renamed from: b, reason: collision with root package name */
    int f25766b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f25767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f25767c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25765a = obj;
        this.f25766b |= Integer.MIN_VALUE;
        return this.f25767c.emit(null, this);
    }
}
