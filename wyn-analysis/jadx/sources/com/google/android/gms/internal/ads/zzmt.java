package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzmt {
    private final zzqh zza;
    private final zzabr zzb;
    private final zzms zzf;
    private final zzno zzi;
    private final zzea zzj;
    private boolean zzk;
    private zzzg zzl = new zzzg(0);
    private final IdentityHashMap zzd = new IdentityHashMap();
    private final Map zze = new HashMap();
    private final List zzc = new ArrayList();
    private final HashMap zzg = new HashMap();
    private final Set zzh = new HashSet();

    public zzmt(zzms zzmsVar, zzno zznoVar, zzea zzeaVar, zzqh zzqhVar, zzabr zzabrVar) {
        this.zza = zzqhVar;
        this.zzb = zzabrVar;
        this.zzf = zzmsVar;
        this.zzi = zznoVar;
        this.zzj = zzeaVar;
    }

    private final void zzr() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            zzmq zzmqVar = (zzmq) it.next();
            if (zzmqVar.zzc.isEmpty()) {
                zzs(zzmqVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzmq zzmqVar) {
        zzmp zzmpVar = (zzmp) this.zzg.get(zzmqVar);
        if (zzmpVar != null) {
            zzmpVar.zza.zzs(zzmpVar.zzb);
        }
    }

    private final void zzt(int i5, int i10) {
        while (true) {
            i10--;
            if (i10 < i5) {
                return;
            }
            zzmq zzmqVar = (zzmq) this.zzc.remove(i10);
            this.zze.remove(zzmqVar.zzb);
            zzu(i10, -zzmqVar.zza.zzA().zza());
            zzmqVar.zze = true;
            if (this.zzk) {
                zzw(zzmqVar);
            }
        }
    }

    private final void zzu(int i5, int i10) {
        while (true) {
            List list = this.zzc;
            if (i5 >= list.size()) {
                return;
            }
            ((zzmq) list.get(i5)).zzd += i10;
            i5++;
        }
    }

    private final void zzv(zzmq zzmqVar) {
        zzxg zzxgVar = zzmqVar.zza;
        zzxm zzxmVar = new zzxm() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzxm
            public final /* synthetic */ void zza(zzxn zzxnVar, zzbf zzbfVar) {
                this.zza.zzi(zzxnVar, zzbfVar);
            }
        };
        zzmo zzmoVar = new zzmo(this, zzmqVar);
        this.zzg.put(zzmqVar, new zzmp(zzxgVar, zzxmVar, zzmoVar));
        zzxgVar.zzm(new Handler(zzfm.zzf(), null), zzmoVar);
        zzxgVar.zzo(new Handler(zzfm.zzf(), null), zzmoVar);
        zzxgVar.zzq(zzxmVar, this.zza, this.zzb);
    }

    private final void zzw(zzmq zzmqVar) {
        if (zzmqVar.zze && zzmqVar.zzc.isEmpty()) {
            zzmp zzmpVar = (zzmp) this.zzg.remove(zzmqVar);
            zzmpVar.getClass();
            zzxn zzxnVar = zzmpVar.zza;
            zzxnVar.zzt(zzmpVar.zzb);
            zzmo zzmoVar = zzmpVar.zzc;
            zzxnVar.zzn(zzmoVar);
            zzxnVar.zzp(zzmoVar);
            this.zzh.remove(zzmqVar);
        }
    }

    public final zzbf zza(int i5, int i10, List list) {
        zzgtr.zza(i5 >= 0 && i5 <= i10 && i10 <= zzc());
        zzgtr.zza(list.size() == i10 - i5);
        for (int i11 = i5; i11 < i10; i11++) {
            ((zzmq) this.zzc.get(i11)).zza.zzB((zzak) list.get(i11 - i5));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzk;
    }

    public final int zzc() {
        return this.zzc.size();
    }

    public final void zzd() {
        zzgtr.zzi(!this.zzk);
        int i5 = 0;
        while (true) {
            List list = this.zzc;
            if (i5 >= list.size()) {
                this.zzk = true;
                return;
            }
            zzmq zzmqVar = (zzmq) list.get(i5);
            zzv(zzmqVar);
            this.zzh.add(zzmqVar);
            i5++;
        }
    }

    public final zzxj zze(zzxl zzxlVar, zzabm zzabmVar, long j8) {
        int i5 = zzna.zzb;
        Pair pair = (Pair) zzxlVar.zza;
        Object obj = pair.first;
        zzxl zzxlVarZza = zzxlVar.zza(pair.second);
        zzmq zzmqVar = (zzmq) this.zze.get(obj);
        zzmqVar.getClass();
        this.zzh.add(zzmqVar);
        zzmp zzmpVar = (zzmp) this.zzg.get(zzmqVar);
        if (zzmpVar != null) {
            zzmpVar.zza.zzr(zzmpVar.zzb);
        }
        zzmqVar.zzc.add(zzxlVarZza);
        zzxd zzxdVarZzD = zzmqVar.zza.zzH(zzxlVarZza, zzabmVar, j8);
        this.zzd.put(zzxdVarZzD, zzmqVar);
        zzr();
        return zzxdVarZzD;
    }

    public final void zzf(zzxj zzxjVar) {
        IdentityHashMap identityHashMap = this.zzd;
        zzmq zzmqVar = (zzmq) identityHashMap.remove(zzxjVar);
        zzmqVar.getClass();
        zzmqVar.zza.zzE(zzxjVar);
        zzmqVar.zzc.remove(((zzxd) zzxjVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzmqVar);
    }

    public final void zzg() {
        for (zzmp zzmpVar : this.zzg.values()) {
            try {
                zzmpVar.zza.zzt(zzmpVar.zzb);
            } catch (RuntimeException e7) {
                zzeh.zzf("MediaSourceList", "Failed to release child source.", e7);
            }
            zzxn zzxnVar = zzmpVar.zza;
            zzmo zzmoVar = zzmpVar.zzc;
            zzxnVar.zzn(zzmoVar);
            zzxnVar.zzp(zzmoVar);
        }
        this.zzg.clear();
        this.zzh.clear();
        this.zzk = false;
    }

    public final zzbf zzh() {
        List list = this.zzc;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int iZza = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzmq zzmqVar = (zzmq) list.get(i5);
            zzmqVar.zzd = iZza;
            iZza += zzmqVar.zza.zzA().zza();
        }
        return new zzna(list, this.zzl);
    }

    public final /* synthetic */ void zzi(zzxn zzxnVar, zzbf zzbfVar) {
        this.zzf.zzo();
    }

    public final /* synthetic */ zzno zzj() {
        return this.zzi;
    }

    public final /* synthetic */ zzea zzk() {
        return this.zzj;
    }

    public final zzbf zzl(List list, zzzg zzzgVar) {
        List list2 = this.zzc;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzzgVar);
    }

    public final zzbf zzm(int i5, List list, zzzg zzzgVar) {
        if (!list.isEmpty()) {
            this.zzl = zzzgVar;
            for (int i10 = i5; i10 < list.size() + i5; i10++) {
                zzmq zzmqVar = (zzmq) list.get(i10 - i5);
                if (i10 > 0) {
                    zzmq zzmqVar2 = (zzmq) this.zzc.get(i10 - 1);
                    zzmqVar.zzc(zzmqVar2.zza.zzA().zza() + zzmqVar2.zzd);
                } else {
                    zzmqVar.zzc(0);
                }
                zzu(i10, zzmqVar.zza.zzA().zza());
                this.zzc.add(i10, zzmqVar);
                this.zze.put(zzmqVar.zzb, zzmqVar);
                if (this.zzk) {
                    zzv(zzmqVar);
                    if (this.zzd.isEmpty()) {
                        this.zzh.add(zzmqVar);
                    } else {
                        zzs(zzmqVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i5, int i10, zzzg zzzgVar) {
        boolean z2 = false;
        if (i5 >= 0 && i5 <= i10 && i10 <= zzc()) {
            z2 = true;
        }
        zzgtr.zza(z2);
        this.zzl = zzzgVar;
        zzt(i5, i10);
        return zzh();
    }

    public final zzbf zzo(int i5, int i10, int i11, zzzg zzzgVar) {
        zzgtr.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzzg zzzgVar) {
        int iZzc = zzc();
        if (zzzgVar.zza() != iZzc) {
            zzzgVar = zzzgVar.zzg().zzf(0, iZzc);
        }
        this.zzl = zzzgVar;
        return zzh();
    }

    public final zzzg zzq() {
        return this.zzl;
    }
}
