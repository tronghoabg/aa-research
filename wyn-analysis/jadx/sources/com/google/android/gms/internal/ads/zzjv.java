package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzjv {
    public static final /* synthetic */ int zzA = 0;
    final Context zza;
    zzdp zzb;
    zzguj zzc;
    zzguj zzd;
    zzguj zze;
    zzguj zzf;
    zzguj zzg;
    zzgti zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zznk zzn;
    zznj zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    boolean zzy;
    zzjf zzz;

    static {
        String str = zzfm.zza;
        String strZza = zzgsz.zza(Build.DEVICE);
        if (strZza.contains("emulator") || strZza.contains("emu64a") || strZza.contains("emu64x")) {
            return;
        }
        strZza.contains("generic");
    }

    public zzjv(final Context context, final zznh zznhVar) {
        zzguj zzgujVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i5 = zzjv.zzA;
                return zznhVar;
            }
        };
        zzguj zzgujVar2 = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjp
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i5 = zzjv.zzA;
                return new zzwy(context, new zzafw());
            }
        };
        zzguj zzgujVar3 = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjq
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i5 = zzjv.zzA;
                return new zzaaz(context);
            }
        };
        zzjo zzjoVar = zzjo.zza;
        zzguj zzgujVar4 = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjr
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i5 = zzjv.zzA;
                return zzabv.zzh(context);
            }
        };
        zzjn zzjnVar = zzjn.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgujVar;
        this.zzd = zzgujVar2;
        this.zze = zzgujVar3;
        this.zzf = zzjoVar;
        this.zzg = zzgujVar4;
        this.zzh = zzjnVar;
        this.zzi = zzfm.zzf();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zznk.zzc;
        this.zzo = zznj.zza;
        this.zzz = new zzjf(0.97f, 1.03f, 1000L, 1.0E-7f, zzfm.zzt(20L), zzfm.zzt(500L), 0.999f, null);
        this.zzb = zzdp.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.zzt = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i5 = zzjl.zza;
        }
        this.zzy = true;
    }
}
