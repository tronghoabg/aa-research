package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzgml implements zzglm {
    private final zzggd zza;
    private final zzgpe zzb;
    private final zzgop zzc;
    private final ExecutorService zzd;
    private final zzgpj zze;
    private final zzgqo zzf;
    private final Object zzg = new Object();
    private final String zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final boolean zzl;
    private zzgmk zzm;

    public zzgml(zzggd zzggdVar, zzino zzinoVar, zzgpe zzgpeVar, zzgop zzgopVar, zzgpj zzgpjVar, zzgqo zzgqoVar, zzgdq zzgdqVar, ExecutorService executorService) {
        this.zza = zzggdVar;
        this.zzb = zzgpeVar;
        this.zzc = zzgopVar;
        this.zzd = executorService;
        this.zze = zzgpjVar;
        this.zzf = zzgqoVar;
        this.zzh = zzgdqVar.zzd();
        this.zzi = zzgdqVar.zzm();
        this.zzj = zzgdqVar.zzl();
        this.zzk = zzgdqVar.zzb();
        this.zzl = zzgdqVar.zzc();
    }

    private final p8.p zzs() {
        return zzhcf.zzk(this.zzc.zzf(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmf
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzo((byte[]) obj);
                return null;
            }
        }, zzhcw.zza());
    }

    private final void zzt(zzave zzaveVar, byte[] bArr, boolean z2) {
        zzgqm zzgqmVarZza = this.zzf.zza(20102);
        try {
            try {
                zzgqmVarZza.zza();
                synchronized (this.zzg) {
                    this.zzm = zzgmk.zza(zzaveVar, bArr, z2);
                }
                zzgqmVarZza.zzc();
            } catch (zzavc e7) {
                e = e7;
                zzgqmVarZza.zzb(e);
                throw new zzgln(2, e);
            } catch (zzavg e10) {
                e = e10;
                zzgqmVarZza.zzb(e);
                throw new zzgln(2, e);
            } catch (Throwable th) {
                zzgqmVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgqmVarZza.zzc();
            throw th2;
        }
    }

    private final String zzu(Map map) throws zzavg, zzavc {
        String strZzb;
        zzgqo zzgqoVar = this.zzf;
        try {
            zzgqoVar.zza(20110).zza();
            synchronized (this.zzg) {
                try {
                    zzgmk zzgmkVar = this.zzm;
                    if (zzgmkVar == null) {
                        zzgqoVar.zzb(20109);
                        strZzb = "";
                    } else {
                        strZzb = zzgmkVar.zzb(map);
                    }
                } finally {
                }
            }
            return strZzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final String zza() {
        synchronized (this.zzg) {
            try {
                zzgmk zzgmkVar = this.zzm;
                if (zzgmkVar == null) {
                    return "3.893135394.-1";
                }
                return zzgmkVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zzb() {
        if (this.zzl) {
            return zzs();
        }
        zzhbx zzhbxVarZzw = zzhbx.zzw(this.zzc.zzb());
        ExecutorService executorService = this.zzd;
        return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzg(zzhbxVarZzw, Throwable.class, zzgmj.zza, executorService), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzglz
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzi((zzggb) obj);
            }
        }, executorService), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzj((Throwable) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zzc(final Context context) {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhcf.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgmc
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhcf.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgmd
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzg) {
                try {
                    zzgmk zzgmkVar = this.zzm;
                    if (zzgmkVar != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        zzgmkVar.zzc(map);
                    } else {
                        this.zzf.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzavc | zzavg e7) {
            this.zzf.zzd(20104, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgml.zzh(java.util.Map):void");
    }

    public final /* synthetic */ p8.p zzi(zzggb zzggbVar) {
        if (zzggbVar != null) {
            this.zza.zzd(zzggbVar.zzd());
        }
        if (this.zzb.zzb(zzggbVar)) {
            return zzhcf.zzk(this.zzc.zze(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgme
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzn((byte[]) obj);
                    return null;
                }
            }, zzhcw.zza());
        }
        this.zzf.zzb(20103);
        throw new zzgln(1);
    }

    public final /* synthetic */ p8.p zzj(Throwable th) {
        return this.zzk ? zzs() : zzhcf.zzc(th);
    }

    public final /* synthetic */ String zzk(final Context context) throws zzavg, zzavc {
        final HashMap map = new HashMap();
        this.zzf.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(map, context);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    public final /* synthetic */ String zzl(final Context context, String str, final View view, final Activity activity) throws zzavg, zzavc {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zzf.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgmh
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    public final /* synthetic */ String zzm(final Context context, final String str, final View view, Activity activity) throws zzavg, zzavc {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zzf.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgmi
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    public final /* synthetic */ Void zzn(byte[] bArr) {
        zzt(zzgmo.zzc(), bArr, false);
        return null;
    }

    public final /* synthetic */ Void zzo(byte[] bArr) {
        zzt(zzgmo.zzc(), bArr, true);
        return null;
    }

    public final /* synthetic */ void zzp(Map map, Context context) {
        map.putAll(this.zze.zzb());
        zzh(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzq(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    public final /* synthetic */ void zzr(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzd());
        zzh(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
