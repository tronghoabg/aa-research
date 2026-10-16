package com.waze.map.b;

/* loaded from: classes6.dex */
public final class eq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28274a;

    /* renamed from: b, reason: collision with root package name */
    int f28275b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28276c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28274a = obj;
        this.f28275b |= Integer.MIN_VALUE;
        return this.f28276c.emit(null, this);
    }
}
