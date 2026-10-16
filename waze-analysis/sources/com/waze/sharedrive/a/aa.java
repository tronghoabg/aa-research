package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38012a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38013b;

    /* renamed from: c, reason: collision with root package name */
    int f38014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38013b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38012a = obj;
        this.f38014c |= Integer.MIN_VALUE;
        return this.f38013b.h(null, null, this);
    }
}
