package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bx extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34300a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ by f34301b;

    /* renamed from: c, reason: collision with root package name */
    int f34302c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.reports_v2.b.at f34303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(by byVar, h.c.e eVar) {
        super(eVar);
        this.f34301b = byVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34300a = obj;
        this.f34302c |= Integer.MIN_VALUE;
        return this.f34301b.a(null, this);
    }
}
