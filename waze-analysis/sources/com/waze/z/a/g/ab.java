package com.waze.z.a.g;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f46060a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f46061b;

    /* renamed from: c, reason: collision with root package name */
    int f46062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f46061b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f46060a = obj;
        this.f46062c |= Integer.MIN_VALUE;
        return this.f46061b.b(this);
    }
}
