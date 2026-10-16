package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22872a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f22873b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f22874c;

    /* renamed from: d, reason: collision with root package name */
    int f22875d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.copilot.data.c f22876e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.mywaze.ag f22877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(eVar);
        this.f22874c = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22873b = obj;
        this.f22875d |= Integer.MIN_VALUE;
        Object objB = w.b(this.f22874c, null, null, this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
