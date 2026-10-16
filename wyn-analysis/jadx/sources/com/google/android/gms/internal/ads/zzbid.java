package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbid implements Callable {
    static final /* synthetic */ zzbid zza = new zzbid();

    private /* synthetic */ zzbid() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
