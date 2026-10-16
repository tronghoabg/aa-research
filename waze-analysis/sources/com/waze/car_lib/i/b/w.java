package com.waze.car_lib.i.b;

/* loaded from: classes5.dex */
public final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20035a;

    /* renamed from: b, reason: collision with root package name */
    int f20036b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f20037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i iVar, h.c.e eVar) {
        super(eVar);
        this.f20037c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20035a = obj;
        this.f20036b |= Integer.MIN_VALUE;
        return this.f20037c.emit(null, this);
    }
}
