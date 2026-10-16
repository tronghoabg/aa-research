package com.waze.main_screen.h.a;

import com.waze.main_screen.g.j;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f26442b;

    /* renamed from: c, reason: collision with root package name */
    int f26443c;

    /* renamed from: d, reason: collision with root package name */
    j f26444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f26442b = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26441a = obj;
        this.f26443c |= Integer.MIN_VALUE;
        return this.f26442b.emit(null, this);
    }
}
