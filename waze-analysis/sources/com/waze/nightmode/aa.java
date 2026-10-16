package com.waze.nightmode;

/* loaded from: classes6.dex */
public final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32440a;

    /* renamed from: b, reason: collision with root package name */
    int f32441b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f32442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f32442c = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32440a = obj;
        this.f32441b |= Integer.MIN_VALUE;
        return this.f32442c.emit(null, this);
    }
}
