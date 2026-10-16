package com.waze.main_screen.j.a;

/* loaded from: classes6.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26468a;

    /* renamed from: b, reason: collision with root package name */
    int f26469b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f26470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f26470c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26468a = obj;
        this.f26469b |= Integer.MIN_VALUE;
        return this.f26470c.emit(null, this);
    }
}
