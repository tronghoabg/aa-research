package com.waze.car_lib.r;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21450a;

    /* renamed from: b, reason: collision with root package name */
    int f21451b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21452c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ eh f21453d;

    /* renamed from: e, reason: collision with root package name */
    int f21454e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.av.d.k f21455f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.car_lib.screens.core.l f21456g;

    /* renamed from: h, reason: collision with root package name */
    Bitmap f21457h;

    /* renamed from: i, reason: collision with root package name */
    h.k f21458i;

    /* renamed from: j, reason: collision with root package name */
    Integer f21459j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dw(eh ehVar, h.c.e eVar) {
        super(eVar);
        this.f21453d = ehVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21452c = obj;
        this.f21454e |= Integer.MIN_VALUE;
        return this.f21453d.l(null, null, 0, null, null, this);
    }
}
