package com.waze.main_screen.k.a;

import com.waze.an.c.ad;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f26512a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26513b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f26514c;

    /* renamed from: d, reason: collision with root package name */
    int f26515d;

    /* renamed from: e, reason: collision with root package name */
    ad f26516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(u uVar, h.c.e eVar) {
        super(eVar);
        this.f26514c = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26513b = obj;
        this.f26515d |= Integer.MIN_VALUE;
        return u.e(this.f26514c, null, this);
    }
}
