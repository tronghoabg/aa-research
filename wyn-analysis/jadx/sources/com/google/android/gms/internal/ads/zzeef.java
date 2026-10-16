package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeef implements zzash {
    final /* synthetic */ zzeeg zza;

    public zzeef(zzeeg zzeegVar) {
        Objects.requireNonNull(zzeegVar);
        this.zza = zzeegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zza(int i5) {
        zzasi zzasiVarZzd;
        try {
            zzfrd zzfrdVarZza = zzfre.zza();
            zzfrdVarZza.zzh(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i5 == 0 && (zzasiVarZzd = this.zza.zzc().zzd()) != null) {
                zzfrdVarZza.zzb(zzasiVarZzd.zzb());
                zzfrdVarZza.zzc(zzasiVarZzd.zzc());
                zzfrdVarZza.zzd(zzasiVarZzd.zzd());
                zzfrdVarZza.zze(zzasiVarZzd.zze());
                zzfrdVarZza.zzf(zzasiVarZzd.zzf());
                if (!TextUtils.isEmpty(zzasiVarZzd.zza())) {
                    zzfrdVarZza.zza(zzasiVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzasiVarZzd.zzg())) {
                    zzfrdVarZza.zzg(zzasiVarZzd.zzg());
                }
            }
            zzeeg zzeegVar = this.zza;
            zzeegVar.zzc().zzc();
            zzdzt zzdztVarZzd = zzeegVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfre) zzfrdVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfY)).booleanValue()) {
                zzdzs zzdzsVarZza = zzdztVarZzd.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "irda");
                zzdzsVarZza.zzc("irdd", strEncodeToString);
                zzdzsVarZza.zzf();
            }
            ((G6.O) zzeegVar.zze()).j();
        } catch (Exception e7) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfZ)).booleanValue()) {
                zzeeg zzeegVar2 = this.zza;
                if (zzeegVar2.zzb == null) {
                    zzeegVar2.zzb = zzcaf.zzc(zzeegVar2.zzb());
                }
                zzeegVar2.zzb.zzh(e7, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzeeg zzeegVar3 = this.zza;
            if (zzeegVar3.zza == null) {
                zzeegVar3.zza = zzcaf.zza(zzeegVar3.zzb());
            }
            zzeegVar3.zza.zzh(e7, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
