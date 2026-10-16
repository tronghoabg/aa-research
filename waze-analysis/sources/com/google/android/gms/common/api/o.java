package com.google.android.gms.common.api;

import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private Looper f4876a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.datatransport.cct.e f4877b;

    public final p a() {
        if (this.f4877b == null) {
            this.f4877b = new com.google.android.datatransport.cct.e();
        }
        if (this.f4876a == null) {
            this.f4876a = Looper.getMainLooper();
        }
        return new p(this.f4877b, this.f4876a);
    }

    public final void b(com.google.android.datatransport.cct.e eVar) {
        this.f4877b = eVar;
    }
}
