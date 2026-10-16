package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ek extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f36436a;

    /* renamed from: b, reason: collision with root package name */
    boolean f36437b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f36438c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fi f36439d;

    /* renamed from: e, reason: collision with root package name */
    int f36440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ek(fi fiVar, h.c.e eVar) {
        super(eVar);
        this.f36439d = fiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36438c = obj;
        this.f36440e |= Integer.MIN_VALUE;
        return this.f36439d.ai(null, this);
    }
}
