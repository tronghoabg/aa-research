package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* loaded from: classes3.dex */
public final class zzclr {
    public static final zzclb zza(final Context context, final zzcnl zzcnlVar, final String str, final boolean z2, final boolean z10, final zzbaw zzbawVar, final zzbke zzbkeVar, final H6.a aVar, zzbjm zzbjmVar, final C6.h hVar, final C6.a aVar2, final zzbhw zzbhwVar, final zzfkn zzfknVar, final zzfkq zzfkqVar, final zzekz zzekzVar, final zzflk zzflkVar, final zzdzt zzdztVar) throws zzclq {
        zzbix.zza(context);
        try {
            final zzbjm zzbjmVar2 = null;
            zzguj zzgujVar = new zzguj(context, zzcnlVar, str, z2, z10, zzbawVar, zzbkeVar, aVar, zzbjmVar2, hVar, aVar2, zzbhwVar, zzfknVar, zzfkqVar, zzflkVar, zzdztVar, zzekzVar) { // from class: com.google.android.gms.internal.ads.zzcln
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcnl zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzbaw zzf;
                private final /* synthetic */ zzbke zzg;
                private final /* synthetic */ H6.a zzh;
                private final /* synthetic */ C6.h zzi;
                private final /* synthetic */ C6.a zzj;
                private final /* synthetic */ zzbhw zzk;
                private final /* synthetic */ zzfkn zzl;
                private final /* synthetic */ zzfkq zzm;
                private final /* synthetic */ zzflk zzn;
                private final /* synthetic */ zzdzt zzo;
                private final /* synthetic */ zzekz zzp;

                {
                    this.zzi = hVar;
                    this.zzj = aVar2;
                    this.zzk = zzbhwVar;
                    this.zzl = zzfknVar;
                    this.zzm = zzfkqVar;
                    this.zzn = zzflkVar;
                    this.zzo = zzdztVar;
                    this.zzp = zzekzVar;
                }

                @Override // com.google.android.gms.internal.ads.zzguj
                public final Object zza() {
                    zzcnl zzcnlVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z11 = this.zzd;
                    boolean z12 = this.zze;
                    zzekz zzekzVar2 = this.zzp;
                    zzdzt zzdztVar2 = this.zzo;
                    C6.h hVar2 = this.zzi;
                    C6.a aVar3 = this.zzj;
                    zzbhw zzbhwVar2 = this.zzk;
                    zzfkn zzfknVar2 = this.zzl;
                    zzfkq zzfkqVar2 = this.zzm;
                    zzflk zzflkVar2 = this.zzn;
                    zzbaw zzbawVar2 = this.zzf;
                    zzbke zzbkeVar2 = this.zzg;
                    H6.a aVar4 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i5 = zzcme.zza;
                        zzclx zzclxVar = new zzclx(new zzcme(new zzcnd(context2), zzcnlVar2, str2, z11, z12, zzbawVar2, zzbkeVar2, aVar4, null, hVar2, aVar3, zzbhwVar2, zzfknVar2, zzfkqVar2, zzflkVar2), zzdztVar2);
                        zzclxVar.setWebViewClient(C6.n.f1857D.f1866f.i(zzclxVar, zzbhwVar2, z12, zzekzVar2));
                        zzclxVar.setWebChromeClient(new zzcla(zzclxVar));
                        return zzclxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = zzgujVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzclb) objZza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzclq("Webview initialization failed.", th2);
        }
    }

    public static final p8.p zzb(final Context context, final H6.a aVar, final String str, final zzbaw zzbawVar, final C6.a aVar2, final zzekz zzekzVar, final zzflk zzflkVar, final zzdzt zzdztVar) {
        return zzhcf.zzf(new zzhbm() { // from class: com.google.android.gms.internal.ads.zzclp
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final p8.p zza() throws zzclq {
                zzclr zzclrVar = C6.n.f1857D.f1864d;
                Context context2 = context;
                zzcnl zzcnlVarZzb = zzcnl.zzb();
                C6.a aVar3 = aVar2;
                zzbhw zzbhwVarZza = zzbhw.zza();
                zzekz zzekzVar2 = zzekzVar;
                zzflk zzflkVar2 = zzflkVar;
                zzdzt zzdztVar2 = zzdztVar;
                zzclb zzclbVarZza = zzclr.zza(context2, zzcnlVarZzb, "", false, false, zzbawVar, null, aVar, null, null, aVar3, zzbhwVarZza, null, null, zzekzVar2, zzflkVar2, zzdztVar2);
                final zzcgc zzcgcVarZza = zzcgc.zza((Object) zzclbVarZza);
                zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzclo
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    public final /* synthetic */ void zza(boolean z2, int i5, String str2, String str3) {
                        zzcgcVarZza.zzb();
                    }
                });
                zzclbVarZza.loadUrl(str);
                return zzcgcVarZza;
            }
        }, zzcfy.zzf);
    }
}
