package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class at extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22712a;

    /* renamed from: b, reason: collision with root package name */
    Object f22713b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22714c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ au f22715d;

    /* renamed from: e, reason: collision with root package name */
    int f22716e;

    /* renamed from: f, reason: collision with root package name */
    au f22717f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.copilot.data.a.g f22718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(au auVar, h.c.e eVar) {
        super(eVar);
        this.f22715d = auVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22714c = obj;
        this.f22716e |= Integer.MIN_VALUE;
        Object objB = au.b(this.f22715d, null, null, this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
