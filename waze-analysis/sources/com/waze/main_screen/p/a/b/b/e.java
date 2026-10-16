package com.waze.main_screen.p.a.b.b;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26950a;

    /* renamed from: b, reason: collision with root package name */
    int f26951b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f26952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, h.c.e eVar) {
        super(eVar);
        this.f26952c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26950a = obj;
        this.f26951b |= Integer.MIN_VALUE;
        return this.f26952c.emit(null, this);
    }
}
