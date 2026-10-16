package com.waze.map;

import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f28939a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28940b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fi f28941c;

    /* renamed from: d, reason: collision with root package name */
    int f28942d;

    /* renamed from: e, reason: collision with root package name */
    Rect f28943e;

    /* renamed from: f, reason: collision with root package name */
    gb f28944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fh(fi fiVar, h.c.e eVar) {
        super(eVar);
        this.f28941c = fiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28940b = obj;
        this.f28942d |= Integer.MIN_VALUE;
        return this.f28941c.emit(null, this);
    }
}
