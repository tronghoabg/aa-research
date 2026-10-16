package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC1713b;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbrt implements InterfaceC1713b {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzbrv zzb;

    public zzbrt(zzbrv zzbrvVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbrvVar);
        this.zzb = zzbrvVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e7) {
            this.zza.zzd(e7);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) {
        this.zza.zzd(new RuntimeException(N0.a.d(i5, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i5).length() + 23))));
    }
}
