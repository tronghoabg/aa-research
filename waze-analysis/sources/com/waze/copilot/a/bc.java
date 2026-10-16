package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22757a;

    /* renamed from: b, reason: collision with root package name */
    int f22758b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22759c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ be f22760d;

    /* renamed from: e, reason: collision with root package name */
    int f22761e;

    /* renamed from: f, reason: collision with root package name */
    bg f22762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22760d = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22759c = obj;
        this.f22761e |= Integer.MIN_VALUE;
        return this.f22760d.o(null, this);
    }
}
