package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f16985b;

    /* renamed from: c, reason: collision with root package name */
    int f16986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(y yVar, h.c.e eVar) {
        super(eVar);
        this.f16985b = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16984a = obj;
        this.f16986c |= Integer.MIN_VALUE;
        return this.f16985b.c(this);
    }
}
