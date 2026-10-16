package com.waze.sharedrive.e;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38395a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f38396b;

    /* renamed from: c, reason: collision with root package name */
    int f38397c;

    /* renamed from: d, reason: collision with root package name */
    Bitmap f38398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f38396b = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38395a = obj;
        this.f38397c |= Integer.MIN_VALUE;
        return bc.e(this.f38396b, null, null, this);
    }
}
