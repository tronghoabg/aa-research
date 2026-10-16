package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.C1725n;
import com.google.android.gms.common.internal.C1729s;
import com.google.android.gms.tasks.Task;
import g1.C2668d;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import r7.C3934d;
import vf.AbstractC4345a;
import xa.AbstractC4507b;
import ya.c;
import ya.f;
import ya.i;
import ya.k;
import ya.n;

/* loaded from: classes4.dex */
public final class zzsh {
    private static zzaf zza;
    private static final zzai zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrz zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zzsh(Context context, final k kVar, zzrz zzrzVar, String str) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzrzVar;
        zzsv.zza();
        this.zzi = str;
        f fVarA = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        };
        fVarA.getClass();
        this.zzg = f.b(callable);
        f fVarA2 = f.a();
        Objects.requireNonNull(kVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        };
        fVarA2.getClass();
        this.zzh = f.b(callable2);
        zzai zzaiVar = zzb;
        this.zzj = zzaiVar.containsKey(str) ? C3934d.d(context, (String) zzaiVar.get(str), false) : -1;
    }

    private static synchronized zzaf zzh() {
        try {
            zzaf zzafVar = zza;
            if (zzafVar != null) {
                return zzafVar;
            }
            C2668d c2668dX = AbstractC4345a.x(Resources.getSystem().getConfiguration());
            zzac zzacVar = new zzac();
            for (int i5 = 0; i5 < c2668dX.f35497a.size(); i5++) {
                Locale locale = c2668dX.f35497a.get(i5);
                C1725n c1725n = c.f48043a;
                zzacVar.zzb(locale.toLanguageTag());
            }
            zzaf zzafVarZzc = zzacVar.zzc();
            zza = zzafVarZzc;
            return zzafVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final zzqt zzi(String str, String str2) {
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return C1729s.f26680c.a(this.zzi);
    }

    public final String zza() throws Exception {
        return C1729s.f26680c.a(this.zzi);
    }

    public final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    public final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, AbstractC4507b abstractC4507b) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(abstractC4507b, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String strZzj = zzj();
        n.f48065a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzryVar, zzmvVar, strZzj);
            }
        });
    }

    public final void zze(zzry zzryVar, AbstractC4507b abstractC4507b, boolean z2, int i5) {
        zzsj.zzh().zzf(false);
        throw null;
    }

    public final void zzf(zzry zzryVar, AbstractC4507b abstractC4507b, zzmu zzmuVar, boolean z2, i iVar, zzna zznaVar) {
        zzsi zzsiVarZzh = zzsj.zzh();
        zzsiVarZzh.zzf(z2);
        zzsiVarZzh.zzd(iVar);
        zzsiVarZzh.zzb(zzmuVar);
        zzsiVarZzh.zza(zznaVar);
        zzg(zzryVar, abstractC4507b, zzsiVarZzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final AbstractC4507b abstractC4507b, final zzsj zzsjVar) {
        n.f48065a.execute(new Runnable(zzryVar, zzsjVar, abstractC4507b) { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            public final /* synthetic */ zzry zzb;
            public final /* synthetic */ zzsj zzc;
            public final /* synthetic */ AbstractC4507b zzd;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb, this.zzc, null);
            }
        });
    }
}
