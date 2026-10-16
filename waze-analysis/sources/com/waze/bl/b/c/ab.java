package com.waze.bl.b.c;

import com.waze.reports_v2.b.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16923a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f16924b;

    /* renamed from: c, reason: collision with root package name */
    int f16925c;

    /* renamed from: d, reason: collision with root package name */
    af f16926d;

    /* renamed from: e, reason: collision with root package name */
    String f16927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f16924b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16923a = obj;
        this.f16925c |= Integer.MIN_VALUE;
        return this.f16924b.b(null, null, this);
    }
}
