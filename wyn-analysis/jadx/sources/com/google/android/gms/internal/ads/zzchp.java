package com.google.android.gms.internal.ads;

import android.os.Looper;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzchp implements Runnable {
    public zzchp(zzchr zzchrVar) {
        Objects.requireNonNull(zzchrVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
