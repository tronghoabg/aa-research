package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class aq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19382a;

    /* renamed from: b, reason: collision with root package name */
    int f19383b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19384c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19382a = obj;
        this.f19383b |= Integer.MIN_VALUE;
        return this.f19384c.emit(null, this);
    }
}
