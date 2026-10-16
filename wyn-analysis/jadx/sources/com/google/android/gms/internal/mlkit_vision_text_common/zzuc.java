package com.google.android.gms.internal.mlkit_vision_text_common;

import Ea.a;
import Ea.i;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1725n;
import com.google.android.gms.common.internal.C1729s;
import com.google.android.gms.tasks.Task;
import g1.C2668d;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
public final class zzuc {
    private static zzbk zza;
    private static final zzbm zzb = zzbm.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzts zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzuc(Context context, final k kVar, zzts zztsVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zztsVar;
        zzuo.zza();
        this.zzi = str;
        f fVarA = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        };
        fVarA.getClass();
        this.zzg = f.b(callable);
        f fVarA2 = f.a();
        Objects.requireNonNull(kVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        };
        fVarA2.getClass();
        this.zzh = f.b(callable2);
        zzbm zzbmVar = zzb;
        this.zzj = zzbmVar.containsKey(str) ? C3934d.d(context, (String) zzbmVar.get(str), false) : -1;
    }

    public static long zza(List list, double d3) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d3 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzbk zzi() {
        try {
            zzbk zzbkVar = zza;
            if (zzbkVar != null) {
                return zzbkVar;
            }
            C2668d c2668dX = AbstractC4345a.x(Resources.getSystem().getConfiguration());
            zzbh zzbhVar = new zzbh();
            for (int i5 = 0; i5 < c2668dX.f35497a.size(); i5++) {
                Locale locale = c2668dX.f35497a.get(i5);
                C1725n c1725n = c.f48043a;
                zzbhVar.zza(locale.toLanguageTag());
            }
            zzbk zzbkVarZzb = zzbhVar.zzb();
            zza = zzbkVarZzb;
            return zzbkVarZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return C1729s.f26680c.a(this.zzi);
    }

    private final boolean zzk(zzov zzovVar, long j8, long j10) {
        return this.zzk.get(zzovVar) == null || j8 - ((Long) this.zzk.get(zzovVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final String zzb() throws Exception {
        return C1729s.f26680c.a(this.zzi);
    }

    public final /* synthetic */ void zzc(zztr zztrVar, zzov zzovVar, String str) {
        zztrVar.zzb(zzovVar);
        String strZzd = zztrVar.zzd();
        zzsr zzsrVar = new zzsr();
        zzsrVar.zzb(this.zzc);
        zzsrVar.zzc(this.zzd);
        zzsrVar.zzh(zzi());
        zzsrVar.zzg(Boolean.TRUE);
        zzsrVar.zzl(strZzd);
        zzsrVar.zzj(str);
        zzsrVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzsrVar.zzd(10);
        zzsrVar.zzk(Integer.valueOf(this.zzj));
        zztrVar.zzc(zzsrVar);
        this.zze.zza(zztrVar);
    }

    public final void zzd(zztr zztrVar, zzov zzovVar) {
        zze(zztrVar, zzovVar, zzj());
    }

    public final void zze(final zztr zztrVar, final zzov zzovVar, final String str) {
        n.f48065a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zztrVar, zzovVar, str);
            }
        });
    }

    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            zze(zzubVar.zza(), zzovVar, zzj());
        }
    }

    public final void zzg(zzov zzovVar, i iVar) {
        zzbp zzbpVar = (zzbp) this.zzl.get(zzovVar);
        if (zzbpVar != null) {
            for (Object obj : zzbpVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzbpVar.zzc(obj));
                Collections.sort(arrayList);
                zznu zznuVar = new zznu();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zznuVar.zza(Long.valueOf(jLongValue / arrayList.size()));
                zznuVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zznuVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zznuVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zznuVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zznuVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zznw zznwVarZzg = zznuVar.zzg();
                int size = arrayList.size();
                iVar.getClass();
                zzes zzesVar = (zzes) obj;
                a aVar = iVar.f3642a;
                aVar.getClass();
                zzow zzowVar = new zzow();
                zzowVar.zze(aVar.f3635g.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
                zzep zzepVar = new zzep();
                zzepVar.zza(Integer.valueOf(size));
                zzepVar.zzc(zzesVar);
                zzepVar.zzb(zznwVarZzg);
                zzowVar.zzd(zzepVar.zze());
                zze(zzuf.zzf(zzowVar), zzovVar, zzj());
            }
            this.zzl.remove(zzovVar);
        }
    }

    public final /* synthetic */ void zzh(final zzov zzovVar, Object obj, long j8, final i iVar) {
        if (!this.zzl.containsKey(zzovVar)) {
            this.zzl.put(zzovVar, zzao.zzp());
        }
        ((zzbp) this.zzl.get(zzovVar)).zzm(obj, Long.valueOf(j8));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            n.f48065a.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzovVar, iVar);
                }
            });
        }
    }
}
