package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18397a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18398b;

    /* renamed from: c, reason: collision with root package name */
    int f18399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f18398b = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18397a = obj;
        this.f18399c |= Integer.MIN_VALUE;
        return ae.h(this.f18398b, this);
    }
}
