package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f20335a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20336b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f20337c;

    /* renamed from: d, reason: collision with root package name */
    int f20338d;

    /* renamed from: e, reason: collision with root package name */
    b f20339e;

    /* renamed from: f, reason: collision with root package name */
    String f20340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, h.c.e eVar) {
        super(eVar);
        this.f20337c = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20336b = obj;
        this.f20338d |= Integer.MIN_VALUE;
        return b.a(this.f20337c, null, false, this);
    }
}
