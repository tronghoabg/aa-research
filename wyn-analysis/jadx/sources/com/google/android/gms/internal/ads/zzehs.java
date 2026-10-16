package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.RemoteException;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzehs implements zzege {
    final /* synthetic */ zzehv zza;

    public zzehs(zzehv zzehvVar) {
        Objects.requireNonNull(zzehvVar);
        this.zza = zzehvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final void zza() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpN)).booleanValue()) {
            zzdzs zzdzsVarZza = this.zza.zzd().zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "ptard");
            zzdzsVarZza.zzc("ptard", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            zzdzsVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpO)).booleanValue()) {
            C6.n.f1857D.f1868h.zzh(remoteException, "Preconnect Remote");
        }
    }
}
