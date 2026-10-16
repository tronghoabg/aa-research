package com.waze.main_screen.ae.a;

/* loaded from: classes6.dex */
public final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25732a;

    /* renamed from: b, reason: collision with root package name */
    int f25733b;

    /* renamed from: c, reason: collision with root package name */
    Object f25734c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j f25735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, h.c.e eVar) {
        super(eVar);
        this.f25735d = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25732a = obj;
        this.f25733b |= Integer.MIN_VALUE;
        return this.f25735d.emit(null, this);
    }
}
