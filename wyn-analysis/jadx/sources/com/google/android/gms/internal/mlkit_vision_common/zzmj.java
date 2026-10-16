package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1725n;
import com.google.android.gms.common.internal.C1729s;
import com.google.android.gms.tasks.Task;
import g1.C2668d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r7.C3934d;
import vf.AbstractC4345a;
import ya.c;
import ya.f;
import ya.k;
import ya.n;

/* loaded from: classes4.dex */
public final class zzmj {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, final k kVar, zzmc zzmcVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        f fVarA = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        };
        fVarA.getClass();
        this.zzg = f.b(callable);
        f fVarA2 = f.a();
        kVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        };
        fVarA2.getClass();
        this.zzh = f.b(callable2);
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? C3934d.d(context, (String) zzrVar.get(str), false) : -1;
    }

    private static synchronized zzp zzd() {
        try {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            C2668d c2668dX = AbstractC4345a.x(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i5 = 0; i5 < c2668dX.f35497a.size(); i5++) {
                Locale locale = c2668dX.f35497a.get(i5);
                C1725n c1725n = c.f48043a;
                zzmVar.zzb(locale.toLanguageTag());
            }
            zzp zzpVarZzc = zzmVar.zzc();
            zza = zzpVarZzc;
            return zzpVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String zza() throws Exception {
        return C1729s.f26680c.a(this.zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String strZzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(strZzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && jElapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(jElapsedRealtime));
        int i5 = zzmtVar.zza;
        int i10 = zzmtVar.zzb;
        int i11 = zzmtVar.zzc;
        int i12 = zzmtVar.zzd;
        int i13 = zzmtVar.zze;
        long j8 = zzmtVar.zzf;
        int i14 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        zzinVar.zzd(i5 != -1 ? i5 != 35 ? i5 != 842094169 ? i5 != 16 ? i5 != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP);
        zzinVar.zzf(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP);
        zzinVar.zzc(Integer.valueOf(i11));
        zzinVar.zze(Integer.valueOf(i12));
        zzinVar.zzg(Integer.valueOf(i13));
        zzinVar.zzb(Long.valueOf(j8));
        zzinVar.zzh(Integer.valueOf(i14));
        zziq zziqVarZzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zziqVarZzj);
        final zzmb zzmbVarZze = zzmk.zze(zziwVar);
        final String strA = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : C1729s.f26680c.a(this.zzi);
        n.f48065a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzmbVarZze, zzivVar, strA);
            }
        });
    }
}
