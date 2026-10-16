package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes3.dex */
final class zzps {
    private final zzbd zza;
    private zzgwt zzb = zzgwt.zzi();
    private zzgww zzc = zzgww.zza();
    private zzxl zzd;
    private zzxl zze;
    private zzxl zzf;

    public zzps(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgwv zzgwvVar = new zzgwv();
        if (this.zzb.isEmpty()) {
            zzk(zzgwvVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgwvVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgwvVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i5 = 0; i5 < this.zzb.size(); i5++) {
                zzk(zzgwvVar, (zzxl) this.zzb.get(i5), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgwvVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgwvVar.zzc();
    }

    private final void zzk(zzgwv zzgwvVar, zzxl zzxlVar, zzbf zzbfVar) {
        if (zzxlVar == null) {
            return;
        }
        if (zzbfVar.zze(zzxlVar.zza) != -1) {
            zzgwvVar.zza(zzxlVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzxlVar);
        if (zzbfVar2 != null) {
            zzgwvVar.zza(zzxlVar, zzbfVar2);
        }
    }

    private static zzxl zzl(zzbb zzbbVar, zzgwt zzgwtVar, zzxl zzxlVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = -1;
        if (!zzbbVar.zzx() && !zzbfVarZzq.zzg()) {
            iZzf = zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzfm.zzt(zzbbVar.zzu()));
        }
        int i5 = iZzf;
        for (int i10 = 0; i10 < zzgwtVar.size(); i10++) {
            zzxl zzxlVar2 = (zzxl) zzgwtVar.get(i10);
            if (zzm(zzxlVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i5)) {
                return zzxlVar2;
            }
        }
        if (zzgwtVar.isEmpty() && zzxlVar != null && zzm(zzxlVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i5)) {
            return zzxlVar;
        }
        return null;
    }

    private static boolean zzm(zzxl zzxlVar, Object obj, boolean z2, int i5, int i10, int i11) {
        if (zzxlVar.zza.equals(obj)) {
            return z2 ? zzxlVar.zzb == i5 && zzxlVar.zzc == i10 : zzxlVar.zzb == -1 && zzxlVar.zze == i11;
        }
        return false;
    }

    public final zzxl zza() {
        return this.zzd;
    }

    public final zzxl zzb() {
        return this.zze;
    }

    public final zzxl zzc() {
        return this.zzf;
    }

    public final zzxl zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list instanceof List) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzxl) objLast;
    }

    public final zzbf zze(zzxl zzxlVar) {
        return (zzbf) this.zzc.get(zzxlVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzxl zzxlVar, zzbb zzbbVar) {
        this.zzb = zzgwt.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzxl) list.get(0);
            zzxlVar.getClass();
            this.zzf = zzxlVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    public final /* synthetic */ zzgwt zzi() {
        return this.zzb;
    }
}
