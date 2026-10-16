package com.waze.main_screen.k.a;

/* loaded from: classes6.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26509a;

    /* renamed from: b, reason: collision with root package name */
    int f26510b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f26511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, h.c.e eVar) {
        super(eVar);
        this.f26511c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26509a = obj;
        this.f26510b |= Integer.MIN_VALUE;
        return this.f26511c.emit(null, this);
    }
}
