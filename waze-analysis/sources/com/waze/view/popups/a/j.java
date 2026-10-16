package com.waze.view.popups.a;

/* loaded from: classes7.dex */
public final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45208a;

    /* renamed from: b, reason: collision with root package name */
    int f45209b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f45210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f45210c = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45208a = obj;
        this.f45209b |= Integer.MIN_VALUE;
        return this.f45210c.emit(null, this);
    }
}
