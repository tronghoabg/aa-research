package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzfzl {
    final /* synthetic */ zzfzm zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfzl(zzfzm zzfzmVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfzmVar);
        this.zza = zzfzmVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfzm zzfzmVar = this.zza;
            if (zzfzmVar.zzb) {
                zzfzp zzfzpVar = zzfzmVar.zza;
                zzfzpVar.zzg(this.zzb);
                zzfzpVar.zzh(this.zzc);
                zzfzpVar.zzi(this.zzd);
                zzfzpVar.zzf(null);
                zzfzpVar.zze();
            }
        } catch (RemoteException e7) {
            Log.d("GASS", "Clearcut log failed", e7);
        }
    }

    public final zzfzl zzb(int i5) {
        this.zzc = i5;
        return this;
    }

    public final zzfzl zzc(int i5) {
        this.zzd = i5;
        return this;
    }
}
