package com.waze.o.d.a;

/* loaded from: classes5.dex */
public final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32867a;

    /* renamed from: b, reason: collision with root package name */
    int f32868b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f32869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, h.c.e eVar) {
        super(eVar);
        this.f32869c = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32867a = obj;
        this.f32868b |= Integer.MIN_VALUE;
        return this.f32869c.emit(null, this);
    }
}
