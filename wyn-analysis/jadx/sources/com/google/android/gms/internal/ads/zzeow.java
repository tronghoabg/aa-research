package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzeow {
    private final zzhcy zzc;
    private zzepm zzf;
    private final String zzh;
    private final int zzi;
    private final zzepl zzj;
    private zzfkn zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    private boolean zzl = false;

    public zzeow(zzfky zzfkyVar, zzepl zzeplVar, zzhcy zzhcyVar) {
        this.zzi = zzfkyVar.zzb.zzb.zzr;
        this.zzj = zzeplVar;
        this.zzc = zzhcyVar;
        this.zzh = zzeps.zzb(zzfkyVar);
        List list = zzfkyVar.zzb.zza;
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.put((zzfkn) list.get(i5), Integer.valueOf(i5));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfkn) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z2) {
        try {
            for (zzfkn zzfknVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfknVar);
                int iIntValue = num != null ? num.intValue() : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                if (z2 || !this.zze.contains(zzfknVar.zzat)) {
                    int i5 = this.zzg;
                    if (iIntValue < i5) {
                        return true;
                    }
                    if (iIntValue > i5) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfkn) it.next());
                if ((num != null ? num.intValue() : com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzepm zzepmVar = this.zzf;
        if (zzepmVar != null) {
            this.zzc.zza(zzepmVar);
        } else {
            this.zzc.zzb(new zzepp(3, this.zzh));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.zzav == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.zzl = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.zzd.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.zzfkn) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfkn zza() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.zze()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.List r1 = r6.zzb     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzfkn r2 = (com.google.android.gms.internal.ads.zzfkn) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.zzat     // Catch: java.lang.Throwable -> L2b
            java.util.Set r4 = r6.zze     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.zzav     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.zzl = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.List r3 = r6.zzd     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzfkn r0 = (com.google.android.gms.internal.ads.zzfkn) r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r0
        L43:
            monitor-exit(r6)
            r0 = 0
            return r0
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeow.zza():com.google.android.gms.internal.ads.zzfkn");
    }

    public final synchronized void zzb(zzepm zzepmVar, zzfkn zzfknVar) {
        this.zzl = false;
        this.zzd.remove(zzfknVar);
        if (zzd()) {
            zzepmVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfknVar);
        int iIntValue = num != null ? num.intValue() : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        if (iIntValue > this.zzg) {
            this.zzj.zzf(zzfknVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = iIntValue;
        this.zzf = zzepmVar;
        this.zzk = zzfknVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized void zzc(Throwable th, zzfkn zzfknVar) {
        this.zzl = false;
        this.zzd.remove(zzfknVar);
        this.zze.remove(zzfknVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
