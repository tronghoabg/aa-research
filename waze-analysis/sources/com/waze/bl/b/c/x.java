package com.waze.bl.b.c;

import com.waze.reports_v2.b.at;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f16987a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f16988b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f16989c;

    /* renamed from: d, reason: collision with root package name */
    int f16990d;

    /* renamed from: e, reason: collision with root package name */
    at f16991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y yVar, h.c.e eVar) {
        super(eVar);
        this.f16989c = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16988b = obj;
        this.f16990d |= Integer.MIN_VALUE;
        return this.f16989c.b(null, null, this);
    }
}
