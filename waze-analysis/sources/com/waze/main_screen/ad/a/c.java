package com.waze.main_screen.ad.a;

/* loaded from: classes6.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25695a;

    /* renamed from: b, reason: collision with root package name */
    int f25696b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f25697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f25697c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25695a = obj;
        this.f25696b |= Integer.MIN_VALUE;
        return this.f25697c.emit(null, this);
    }
}
