package com.google.android.gms.f;

import android.os.Bundle;
import com.google.android.gms.o.ag;
import com.google.e.a.e.ai;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements com.google.android.gms.o.s {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5259a;

    public /* synthetic */ w(int i2) {
        this.f5259a = i2;
    }

    @Override // com.google.android.gms.o.s
    public final com.google.android.gms.o.t a(Object obj) {
        int i2 = this.f5259a;
        if (i2 == 0) {
            return aa.c((Bundle) obj);
        }
        if (i2 == 1) {
            int i3 = com.google.firebase.appcheck.debug.a.b.f8884a;
            return ag.c(com.google.firebase.appcheck.a.a.h((ai) obj));
        }
        if (i2 == 2) {
            return ag.c(com.google.firebase.appcheck.a.a.h((ai) obj));
        }
        return ag.c(null);
    }
}
