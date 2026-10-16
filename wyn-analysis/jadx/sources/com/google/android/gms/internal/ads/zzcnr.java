package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzcnr {
    private H6.a zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcnr zza(H6.a aVar) {
        this.zza = aVar;
        return this;
    }

    public final zzcnr zzb(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcnr zzc(long j8) {
        this.zzc = j8;
        return this;
    }

    public final /* synthetic */ H6.a zzd() {
        return this.zza;
    }

    public final /* synthetic */ Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ long zzf() {
        return this.zzc;
    }

    public final /* synthetic */ WeakReference zzg() {
        return this.zzd;
    }
}
