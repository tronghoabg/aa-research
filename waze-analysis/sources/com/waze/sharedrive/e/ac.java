package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f38296a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38297b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f38298c;

    /* renamed from: d, reason: collision with root package name */
    int f38299d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.sharedrive.c.a.m f38300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f38298c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38297b = obj;
        this.f38299d |= Integer.MIN_VALUE;
        return ah.e(this.f38298c, null, this);
    }
}
