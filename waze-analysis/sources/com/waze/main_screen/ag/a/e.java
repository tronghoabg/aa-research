package com.waze.main_screen.ag.a;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25814a;

    /* renamed from: b, reason: collision with root package name */
    int f25815b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f25816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f25816c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25814a = obj;
        this.f25815b |= Integer.MIN_VALUE;
        return this.f25816c.emit(null, this);
    }
}
