package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzewj implements zzfcq {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final G6.N zze;
    private final String zzf;
    private final zzdae zzg;

    public zzewj(Context context, Bundle bundle, String str, String str2, G6.N n10, String str3, zzdae zzdaeVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = n10;
        this.zzf = str3;
        this.zzg = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!((G6.O) this.zze).D()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.D());
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgL)).booleanValue()) {
            try {
                U u10 = C6.n.f1857D.f1863c;
                bundle.putString("_app_id", U.M(this.zza));
            } catch (RemoteException | RuntimeException e7) {
                C6.n.f1857D.f1868h.zzh(e7, "AppStatsSignal_AppId");
            }
        }
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzdae zzdaeVar = this.zzg;
            bundle2.putLong("dload", zzdaeVar.zzc(str));
            bundle2.putInt("pcc", zzdaeVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlr)).booleanValue()) {
            C6.n nVar = C6.n.f1857D;
            if (nVar.f1868h.zzo() > 0) {
                bundle.putInt("nrwv", nVar.f1868h.zzo());
            }
        }
    }
}
