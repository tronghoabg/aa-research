package com.waze.main_screen.p.a.b.b;

/* loaded from: classes6.dex */
public final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26927a;

    /* renamed from: b, reason: collision with root package name */
    int f26928b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f26929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(m mVar, h.c.e eVar) {
        super(eVar);
        this.f26929c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26927a = obj;
        this.f26928b |= Integer.MIN_VALUE;
        return this.f26929c.emit(null, this);
    }
}
