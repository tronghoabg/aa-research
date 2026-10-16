package com.waze.car_lib.b.b;

import com.waze.reports_v2.b.at;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19013a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f19014b;

    /* renamed from: c, reason: collision with root package name */
    int f19015c;

    /* renamed from: d, reason: collision with root package name */
    c f19016d;

    /* renamed from: e, reason: collision with root package name */
    at f19017e;

    /* renamed from: f, reason: collision with root package name */
    String f19018f;

    /* renamed from: g, reason: collision with root package name */
    String f19019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, e eVar) {
        super(eVar);
        this.f19014b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19013a = obj;
        this.f19015c |= Integer.MIN_VALUE;
        return c.b(this.f19014b, null, this);
    }
}
