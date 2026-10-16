package com.waze.reports_v2.presentation.a;

import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ay extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34690a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ az f34691b;

    /* renamed from: c, reason: collision with root package name */
    int f34692c;

    /* renamed from: d, reason: collision with root package name */
    dj f34693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(az azVar, h.c.e eVar) {
        super(eVar);
        this.f34691b = azVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34690a = obj;
        this.f34692c |= Integer.MIN_VALUE;
        return this.f34691b.g(null, null, this);
    }
}
