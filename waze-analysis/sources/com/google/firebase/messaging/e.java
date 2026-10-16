package com.google.firebase.messaging;

import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements com.google.android.gms.o.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10194b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f10195c;

    public /* synthetic */ e(Object obj, Object obj2, int i2) {
        this.f10195c = i2;
        this.f10193a = obj;
        this.f10194b = obj2;
    }

    @Override // com.google.android.gms.o.k
    public final void a(com.google.android.gms.o.t tVar) {
        int i2 = this.f10195c;
        Object obj = this.f10194b;
        if (i2 != 0) {
            com.google.android.play.core.b.i.r((com.google.android.play.core.b.i) this.f10193a, (com.google.android.gms.o.w) obj);
        } else {
            ((f) this.f10193a).f((Intent) obj);
        }
    }
}
