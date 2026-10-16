package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ij extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19708a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ il f19709b;

    /* renamed from: c, reason: collision with root package name */
    int f19710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ij(il ilVar, h.c.e eVar) {
        super(eVar);
        this.f19709b = ilVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19708a = obj;
        this.f19710c |= Integer.MIN_VALUE;
        return il.c(this.f19709b, this);
    }
}
