package com.waze.location;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25391a;

    /* renamed from: b, reason: collision with root package name */
    int f25392b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f25393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f25393c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25391a = obj;
        this.f25392b |= Integer.MIN_VALUE;
        return this.f25393c.emit(null, this);
    }
}
