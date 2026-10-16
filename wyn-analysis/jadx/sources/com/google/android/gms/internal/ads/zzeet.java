package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeet {
    private final zzhcp zza;
    private final zzhcp zzb;
    private final zzegd zzc;
    private final zzimt zzd;

    public zzeet(zzhcp zzhcpVar, zzhcp zzhcpVar2, zzegd zzegdVar, zzimt zzimtVar) {
        this.zza = zzhcpVar;
        this.zzb = zzhcpVar2;
        this.zzc = zzegdVar;
        this.zzd = zzimtVar;
    }

    public final p8.p zza(final zzcbk zzcbkVar) {
        p8.p pVarZzh;
        String str = zzcbkVar.zzd;
        U u10 = C6.n.f1857D.f1863c;
        if (U.e(str)) {
            pVarZzh = zzhcf.zzc(new zzegz(1));
        } else {
            pVarZzh = zzhcf.zzh(this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzees
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzcbkVar);
                }
            }), ExecutionException.class, zzeep.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzhcf.zzh(pVarZzh, zzegz.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzcbkVar, callingUid, (zzegz) obj);
            }
        }, this.zzb);
    }

    public final zzeha zzb(zzcbk zzcbkVar) {
        return (zzeha) this.zzc.zza(zzcbkVar).get(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ p8.p zzc(final zzcbk zzcbkVar, int i5, zzegz zzegzVar) {
        Bundle bundle;
        if (zzcbkVar != null && (bundle = zzcbkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhcf.zzj(((zzeiq) this.zzd.zzb()).zzb(zzcbkVar, i5), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeer
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return zzhcf.zza(new zzeha((InputStream) obj, zzcbkVar));
            }
        }, this.zzb);
    }
}
