package com.waze.bl.b.a;

/* loaded from: classes7.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16900a;

    /* renamed from: b, reason: collision with root package name */
    int f16901b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f16902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, h.c.e eVar) {
        super(eVar);
        this.f16902c = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16900a = obj;
        this.f16901b |= Integer.MIN_VALUE;
        return this.f16902c.emit(null, this);
    }
}
