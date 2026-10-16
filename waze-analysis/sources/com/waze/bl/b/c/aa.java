package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16920a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f16921b;

    /* renamed from: c, reason: collision with root package name */
    int f16922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f16921b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16920a = obj;
        this.f16922c |= Integer.MIN_VALUE;
        return this.f16921b.c(this);
    }
}
