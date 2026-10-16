package com.waze.map.e;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28801a;

    /* renamed from: b, reason: collision with root package name */
    int f28802b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f28803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f28803c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28801a = obj;
        this.f28802b |= Integer.MIN_VALUE;
        return this.f28803c.emit(null, this);
    }
}
