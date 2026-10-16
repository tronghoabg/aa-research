package com.waze.sharedrive.d;

/* loaded from: classes7.dex */
public final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38166a;

    /* renamed from: b, reason: collision with root package name */
    int f38167b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f38168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38168c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38166a = obj;
        this.f38167b |= Integer.MIN_VALUE;
        return this.f38168c.emit(null, this);
    }
}
