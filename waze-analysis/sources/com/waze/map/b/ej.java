package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ej extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28255a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fd f28256b;

    /* renamed from: c, reason: collision with root package name */
    int f28257c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.google_assistant.ah f28258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ej(fd fdVar, h.c.e eVar) {
        super(eVar);
        this.f28256b = fdVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28255a = obj;
        this.f28257c |= Integer.MIN_VALUE;
        return this.f28256b.d(null, null, this);
    }
}
