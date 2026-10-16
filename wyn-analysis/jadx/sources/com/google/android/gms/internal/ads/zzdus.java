package com.google.android.gms.internal.ads;

import Va.M6;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdus implements zzbpx {
    private final zzbnm zza;
    private final zzdvf zzb;
    private final zzimt zzc;

    public zzdus(zzdql zzdqlVar, zzdqb zzdqbVar, zzdvf zzdvfVar, zzimt zzimtVar) {
        this.zza = zzdqlVar.zzg(zzdqbVar.zzS());
        this.zzb = zzdvfVar;
        this.zzc = zzimtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbnc) this.zzc.zzb(), str);
        } catch (RemoteException e7) {
            String strT = M6.t(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
            int i5 = G6.L.f4523b;
            H6.l.g(strT, e7);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
