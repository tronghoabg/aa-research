package com.waze.sdk;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am extends an {
    @Override // com.waze.sdk.an
    final String H() {
        return String.valueOf(T()).concat("(transport)");
    }

    @Override // com.waze.sdk.an
    public final void I(int i2) {
        new Handler(Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.bc(20));
    }

    @Override // com.waze.sdk.an
    public final void J() {
        com.waze.sdk.b.m.v();
        com.waze.sdk.b.m.ag();
    }

    @Override // com.waze.sdk.an
    final boolean K() {
        return true;
    }
}
