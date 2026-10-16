package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class az extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40553a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f40554b;

    /* renamed from: c, reason: collision with root package name */
    int f40555c;

    /* renamed from: d, reason: collision with root package name */
    ba f40556d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(ba baVar, h.c.e eVar) {
        super(eVar);
        this.f40554b = baVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40553a = obj;
        this.f40555c |= Integer.MIN_VALUE;
        return ba.i(this.f40554b, this);
    }
}
