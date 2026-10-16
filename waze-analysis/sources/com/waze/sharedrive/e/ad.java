package com.waze.sharedrive.e;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f38301a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38302b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f38303c;

    /* renamed from: d, reason: collision with root package name */
    int f38304d;

    /* renamed from: e, reason: collision with root package name */
    Bitmap f38305e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.shared_infra.h.c f38306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f38303c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38302b = obj;
        this.f38304d |= Integer.MIN_VALUE;
        return this.f38303c.k(null, null, null, null, this);
    }
}
