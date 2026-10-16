package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzebv extends zzbrz {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfqg zzd;
    final /* synthetic */ zzcgd zze;
    final /* synthetic */ zzece zzf;

    public zzebv(zzece zzeceVar, Object obj, String str, long j8, zzfqg zzfqgVar, zzcgd zzcgdVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j8;
        this.zzd = zzfqgVar;
        this.zze = zzcgdVar;
        Objects.requireNonNull(zzeceVar);
        this.zzf = zzeceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zze() {
        synchronized (this.zza) {
            zzece zzeceVar = this.zzf;
            String str = this.zzb;
            C6.n.f1857D.k.getClass();
            zzeceVar.zzm(str, true, "", (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzeceVar.zzr().zzb(str);
            zzeceVar.zzs().zzb(str);
            zzfqt zzfqtVarZzt = zzeceVar.zzt();
            zzfqg zzfqgVar = this.zzd;
            zzfqgVar.zzd(true);
            zzfqtVarZzt.zzb(zzfqgVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzece zzeceVar = this.zzf;
            String str2 = this.zzb;
            C6.n.f1857D.k.getClass();
            zzeceVar.zzm(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzeceVar.zzr().zzc(str2, "error");
            zzeceVar.zzs().zzc(str2, "error");
            zzfqt zzfqtVarZzt = zzeceVar.zzt();
            zzfqg zzfqgVar = this.zzd;
            zzfqgVar.zzk(str);
            zzfqgVar.zzd(false);
            zzfqtVarZzt.zzb(zzfqgVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}
