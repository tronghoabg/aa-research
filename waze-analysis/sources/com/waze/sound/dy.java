package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dy extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb f39828b;

    /* renamed from: c, reason: collision with root package name */
    int f39829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dy(eb ebVar, h.c.e eVar) {
        super(eVar);
        this.f39828b = ebVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39827a = obj;
        this.f39829c |= Integer.MIN_VALUE;
        return eb.f(this.f39828b, null, this);
    }
}
