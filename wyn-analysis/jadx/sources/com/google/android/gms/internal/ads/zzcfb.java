package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzcfb implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcgd zzb;

    public zzcfb(zzcfc zzcfcVar, Context context, zzcgd zzcgdVar) {
        this.zza = context;
        this.zzb = zzcgdVar;
        Objects.requireNonNull(zzcfcVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (d7.g | d7.h | IOException | IllegalStateException e7) {
            this.zzb.zzd(e7);
            H6.l.d("Exception while getting advertising Id info", e7);
        }
    }
}
