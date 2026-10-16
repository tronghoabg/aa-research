package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
final class zzenu implements zzdnw {
    private final Context zza;
    private final H6.a zzb;
    private final p8.p zzc;
    private final zzfkn zzd;
    private final zzclb zze;
    private final zzflg zzf;
    private final zzbqa zzg;
    private final boolean zzh;
    private final zzekz zzi;
    private final zzdzt zzj;

    public zzenu(Context context, H6.a aVar, p8.p pVar, zzfkn zzfknVar, zzclb zzclbVar, zzflg zzflgVar, boolean z2, zzbqa zzbqaVar, zzekz zzekzVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = pVar;
        this.zzd = zzfknVar;
        this.zze = zzclbVar;
        this.zzf = zzflgVar;
        this.zzg = zzbqaVar;
        this.zzh = z2;
        this.zzi = zzekzVar;
        this.zzj = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z2, Context context, zzddm zzddmVar) {
        boolean z10;
        zzdmi zzdmiVar = (zzdmi) zzhcf.zzt(this.zzc);
        zzclb zzclbVar = this.zze;
        zzclbVar.zzag(true);
        boolean z11 = this.zzh;
        boolean z12 = false;
        boolean zZzc = z11 ? this.zzg.zzc(false) : false;
        U u10 = C6.n.f1857D.f1863c;
        boolean zI = U.i(this.zza);
        if (!z11) {
            z10 = z12;
        } else if (this.zzg.zzd()) {
            z12 = true;
            z10 = z12;
        } else {
            z10 = false;
            z12 = true;
        }
        float fZze = z12 ? this.zzg.zze() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        zzfkn zzfknVar = this.zzd;
        C6.g gVar = new C6.g(zZzc, zI, z10, fZze, z2, zzfknVar.zzO, false);
        if (zzddmVar != null) {
            zzddmVar.zzb();
        }
        zzdnl zzdnlVarZzj = zzdmiVar.zzj();
        int i5 = zzfknVar.zzQ;
        H6.a aVar = this.zzb;
        String str = zzfknVar.zzB;
        zzfks zzfksVar = zzfknVar.zzs;
        Xd.c.t(context, new AdOverlayInfoParcel(zzdnlVarZzj, zzclbVar, i5, aVar, str, gVar, zzfksVar.zzb, zzfksVar.zza, this.zzf.zzg, zzddmVar, zzfknVar.zzb() ? this.zzi : null, zzclbVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzd;
    }
}
