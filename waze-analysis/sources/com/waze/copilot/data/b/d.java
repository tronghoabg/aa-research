package com.waze.copilot.data.b;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22974a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f22975b;

    /* renamed from: c, reason: collision with root package name */
    int f22976c;

    /* renamed from: d, reason: collision with root package name */
    aq f22977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, h.c.e eVar) {
        super(eVar);
        this.f22975b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22974a = obj;
        this.f22976c |= Integer.MIN_VALUE;
        return this.f22975b.c(this);
    }
}
