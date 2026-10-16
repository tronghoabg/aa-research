package com.waze.nightmode;

/* loaded from: classes6.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32457a;

    /* renamed from: b, reason: collision with root package name */
    int f32458b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f32459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f32459c = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32457a = obj;
        this.f32458b |= Integer.MIN_VALUE;
        return this.f32459c.emit(null, this);
    }
}
