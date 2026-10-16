package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class zzcbr {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcfy.zza.zzc(new zzcbp(this, context));
    }

    public final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
