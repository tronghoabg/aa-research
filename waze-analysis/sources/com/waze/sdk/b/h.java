package com.waze.sdk.b;

import android.support.v4.media.a.x;
import com.waze.sdk.bd;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f35281a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35282b;

    h(m mVar, int i2, byte[] bArr) {
        this.f35282b = i2;
        Objects.requireNonNull(mVar);
        this.f35281a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f35282b;
        m mVar = this.f35281a;
        if (i2 == 0) {
            mVar.V();
            return;
        }
        x xVar = new x(mVar.r);
        xVar.e(3, (mVar.u + System.currentTimeMillis()) - mVar.v, 1.0f);
        mVar.r = xVar.a();
        bd.d().N("com.spotify.music", mVar.r);
        mVar.w.postDelayed(this, 100L);
    }

    h(m mVar, int i2) {
        this.f35282b = i2;
        Objects.requireNonNull(mVar);
        this.f35281a = mVar;
    }
}
