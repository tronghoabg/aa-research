package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f16001a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f16002b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f16003c;

    /* renamed from: d, reason: collision with root package name */
    int f16004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, h.c.e eVar) {
        super(eVar);
        this.f16003c = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16002b = obj;
        this.f16004d |= Integer.MIN_VALUE;
        return this.f16003c.a(0, this);
    }
}
