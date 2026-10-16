package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22726a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f22727b;

    /* renamed from: c, reason: collision with root package name */
    int f22728c;

    /* renamed from: d, reason: collision with root package name */
    String f22729d;

    /* renamed from: e, reason: collision with root package name */
    String f22730e;

    /* renamed from: f, reason: collision with root package name */
    String f22731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22727b = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22726a = obj;
        this.f22728c |= Integer.MIN_VALUE;
        return this.f22727b.i(this);
    }
}
