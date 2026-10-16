package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends ar {

    /* renamed from: a, reason: collision with root package name */
    private m f5045a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5046b;

    public g(m mVar, int i2) {
        this.f5045a = mVar;
        this.f5046b = i2;
    }

    @Override // com.google.android.gms.common.internal.as
    public final void a(int i2, IBinder iBinder, Bundle bundle) {
        com.google.android.gms.common.api.internal.av.n(this.f5045a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f5045a.O(i2, iBinder, bundle, this.f5046b);
        this.f5045a = null;
    }

    @Override // com.google.android.gms.common.internal.as
    public final void b(int i2, IBinder iBinder, t tVar) {
        m mVar = this.f5045a;
        com.google.android.gms.common.api.internal.av.n(mVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        com.google.android.gms.common.api.internal.av.m(tVar);
        m.L(mVar, tVar);
        a(i2, iBinder, tVar.f5089a);
    }

    @Override // com.google.android.gms.common.internal.as
    public final void c() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
