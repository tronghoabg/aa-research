package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22128a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cd f22129b;

    /* renamed from: c, reason: collision with root package name */
    int f22130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(cd cdVar, h.c.e eVar) {
        super(eVar);
        this.f22129b = cdVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22128a = obj;
        this.f22130c |= Integer.MIN_VALUE;
        return cd.c(this.f22129b, this);
    }
}
