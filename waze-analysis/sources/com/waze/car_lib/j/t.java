package com.waze.car_lib.j;

import com.waze.modules.c.dk;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f20268a;

    /* renamed from: b, reason: collision with root package name */
    boolean f20269b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f20270c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f20271d;

    /* renamed from: e, reason: collision with root package name */
    int f20272e;

    /* renamed from: f, reason: collision with root package name */
    dk f20273f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.c.e.a.a f20274g;

    /* renamed from: h, reason: collision with root package name */
    com.waze.coroutines.b f20275h;

    /* renamed from: i, reason: collision with root package name */
    com.waze.coroutines.b f20276i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(w wVar, h.c.e eVar) {
        super(eVar);
        this.f20271d = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20270c = obj;
        this.f20272e |= Integer.MIN_VALUE;
        return w.d(this.f20271d, null, null, null, 0L, false, null, this);
    }
}
