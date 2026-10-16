package com.waze.sharedrive.d;

/* loaded from: classes7.dex */
public final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38187a;

    /* renamed from: b, reason: collision with root package name */
    int f38188b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f38189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38189c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38187a = obj;
        this.f38188b |= Integer.MIN_VALUE;
        return this.f38189c.emit(null, this);
    }
}
