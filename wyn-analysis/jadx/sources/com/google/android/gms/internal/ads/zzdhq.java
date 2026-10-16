package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import D6.K0;
import D6.y1;

/* loaded from: classes3.dex */
public final class zzdhq implements y6.f, R6.a, zzdcz, InterfaceC0358a, zzdfq, zzddt, zzdey, F6.o, zzddp, zzdlg {
    private final zzdgp zza = new zzdgp(this, null);
    private zzetk zzb;
    private zzeto zzc;
    private zzfgm zzd;
    private zzfjr zze;

    private static void zzs(Object obj, zzdhp zzdhpVar) {
        if (obj != null) {
            zzdhpVar.zza(obj);
        }
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        zzs(this.zzb, zzdgu.zza);
        zzs(this.zzc, zzdhh.zza);
    }

    @Override // R6.a
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdhn.zza);
    }

    @Override // y6.f
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgh
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzetk) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(final zzcbw zzcbwVar, final String str, final String str2) {
        zzs(this.zzb, new zzdhp(zzcbwVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfjr) obj).zzd(zzcbwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
        zzs(this.zzb, zzdgr.zza);
        zzs(this.zze, zzdhj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzs(this.zzb, zzdgv.zza);
    }

    @Override // F6.o
    public final void zzdT() {
        zzs(this.zzd, zzdhb.zza);
    }

    @Override // F6.o
    public final void zzdU(final int i5) {
        zzs(this.zzd, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgn
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgm) obj).zzdU(i5);
            }
        });
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzs(this.zzb, zzdgx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        zzs(this.zzb, zzdgq.zza);
        zzs(this.zze, zzdhi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzs(this.zzb, zzdgy.zza);
        zzs(this.zze, zzdho.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzs(this.zzb, zzdgw.zza);
        zzs(this.zzc, zzdhg.zza);
        zzs(this.zze, zzdhm.zza);
        zzs(this.zzd, zzdhf.zza);
    }

    @Override // F6.o
    public final void zzdv() {
        zzs(this.zzd, zzdhc.zza);
    }

    @Override // F6.o
    public final void zzdw() {
        zzs(this.zzd, zzdhd.zza);
    }

    @Override // F6.o
    public final void zzdx() {
        zzs(this.zzd, zzdhe.zza);
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
        zzs(this.zzb, zzdgs.zza);
        zzs(this.zze, zzdhk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
        zzs(this.zzb, zzdgt.zza);
        zzs(this.zze, zzdhl.zza);
    }

    @Override // F6.o
    public final void zzh() {
        zzs(this.zzd, zzdha.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final K0 k02) {
        zzs(this.zze, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgl
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfjr) obj).zzj(k02);
            }
        });
        zzs(this.zzb, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgm
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzetk) obj).zzj(k02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        zzs(this.zzd, zzdgz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final y1 y1Var) {
        zzs(this.zzb, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzetk) obj).zzm(y1Var);
            }
        });
        zzs(this.zze, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgj
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfjr) obj).zzm(y1Var);
            }
        });
        zzs(this.zzd, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgk
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgm) obj).zzm(y1Var);
            }
        });
    }

    public final zzdgp zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzetk zzetkVar) {
        this.zzb = zzetkVar;
    }

    public final /* synthetic */ void zzp(zzeto zzetoVar) {
        this.zzc = zzetoVar;
    }

    public final /* synthetic */ void zzq(zzfgm zzfgmVar) {
        this.zzd = zzfgmVar;
    }

    public final /* synthetic */ void zzr(zzfjr zzfjrVar) {
        this.zze = zzfjrVar;
    }
}
