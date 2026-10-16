package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbch implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbci zza;

    public zzbch(zzbci zzbciVar) {
        Objects.requireNonNull(zzbciVar);
        this.zza = zzbciVar;
    }

    public final void onOpActiveChanged(String str, int i5, String str2, boolean z2) {
        if (z2) {
            zzbci zzbciVar = this.zza;
            zzbciVar.zze(System.currentTimeMillis());
            zzbciVar.zzh(true);
            return;
        }
        zzbci zzbciVar2 = this.zza;
        long jZzf = zzbciVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbciVar2.zzf()) {
            zzbciVar2.zzg(jCurrentTimeMillis - zzbciVar2.zzf());
        }
        zzbciVar2.zzh(false);
    }
}
