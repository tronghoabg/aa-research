package com.google.android.gms.internal.ads;

import G6.U;
import android.os.Binder;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zzehl {
    private final zzhcp zza;
    private final zzegq zzb;
    private final zzimt zzc;

    public zzehl(zzhcp zzhcpVar, zzegq zzegqVar, zzimt zzimtVar) {
        this.zza = zzhcpVar;
        this.zzb = zzegqVar;
        this.zzc = zzimtVar;
    }

    private final p8.p zzg(final zzcbk zzcbkVar, zzehb zzehbVar, final zzehb zzehbVar2, final zzhbn zzhbnVar) {
        p8.p pVarZzh;
        String str = zzcbkVar.zzd;
        U u10 = C6.n.f1857D.f1863c;
        if (U.e(str)) {
            pVarZzh = zzhcf.zzc(new zzegz(1));
        } else {
            pVarZzh = zzhcf.zzh(zzehbVar.zza(zzcbkVar), ExecutionException.class, zzehk.zza, this.zza);
        }
        zzhcp zzhcpVar = this.zza;
        return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzj(zzhbx.zzw(pVarZzh), zzehd.zza, zzhcpVar), zzhbnVar, zzhcpVar), zzegz.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzehbVar2, zzcbkVar, zzhbnVar, (zzegz) obj);
            }
        }, zzhcpVar);
    }

    public final p8.p zza(final zzcbk zzcbkVar) {
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                String str = new String(zzgzt.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzcbk zzcbkVar2 = zzcbkVar;
                zzcbkVar2.zzj = str;
                return zzhcf.zza(zzcbkVar2);
            }
        };
        final zzegq zzegqVar = this.zzb;
        Objects.requireNonNull(zzegqVar);
        return zzg(zzcbkVar, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ p8.p zza(zzcbk zzcbkVar2) {
                return zzegqVar.zza(zzcbkVar2);
            }
        }, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehg
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ p8.p zza(zzcbk zzcbkVar2) {
                return this.zza.zzd(zzcbkVar2);
            }
        }, zzhbnVar);
    }

    public final p8.p zzb(zzcbk zzcbkVar) {
        return zzg(zzcbkVar, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ p8.p zza(zzcbk zzcbkVar2) {
                return this.zza.zze(zzcbkVar2);
            }
        }, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ p8.p zza(zzcbk zzcbkVar2) {
                return this.zza.zzf(zzcbkVar2);
            }
        }, zzehh.zza);
    }

    public final /* synthetic */ p8.p zzc(zzehb zzehbVar, zzcbk zzcbkVar, zzhbn zzhbnVar, zzegz zzegzVar) {
        return zzhcf.zzj(zzehbVar.zza(zzcbkVar), zzhbnVar, this.zza);
    }

    public final /* synthetic */ p8.p zzd(zzcbk zzcbkVar) {
        return ((zzeiq) this.zzc.zzb()).zzc(zzcbkVar, Binder.getCallingUid());
    }

    public final /* synthetic */ p8.p zze(zzcbk zzcbkVar) {
        return this.zzb.zzd(zzcbkVar.zzh);
    }

    public final /* synthetic */ p8.p zzf(zzcbk zzcbkVar) {
        return ((zzeiq) this.zzc.zzb()).zzd(zzcbkVar.zzh);
    }
}
