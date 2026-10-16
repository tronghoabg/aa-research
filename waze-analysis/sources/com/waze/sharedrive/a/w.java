package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38036a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38037b;

    /* renamed from: c, reason: collision with root package name */
    int f38038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38037b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38036a = obj;
        this.f38038c |= Integer.MIN_VALUE;
        return this.f38037b.d(null, null, this);
    }
}
