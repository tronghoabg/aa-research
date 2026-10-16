package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzidv implements zzihs {
    private final zzidu zza;

    private zzidv(zzidu zziduVar) {
        zziduVar.getClass();
        this.zza = zziduVar;
        zziduVar.zza = this;
    }

    public static zzidv zza(zzidu zziduVar) {
        Object obj = zziduVar.zza;
        return obj != null ? (zzidv) obj : new zzidv(zziduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzA(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzifn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzg(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzu(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z2) {
            while (i10 < zzifnVar.size()) {
                this.zza.zzg(i5, zzifnVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzifnVar.size(); i14++) {
            zzifnVar.zzc(i14);
            i13 += 8;
        }
        zziduVar2.zzr(i13);
        while (i10 < zzifnVar.size()) {
            zziduVar2.zzu(zzifnVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzB(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieg)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zze(i5, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzs(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzieg zziegVar = (zzieg) list;
        if (!z2) {
            while (i10 < zziegVar.size()) {
                this.zza.zze(i5, Float.floatToRawIntBits(zziegVar.zzf(i10)));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zziegVar.size(); i14++) {
            zziegVar.zzf(i14);
            i13 += 4;
        }
        zziduVar2.zzr(i13);
        while (i10 < zziegVar.size()) {
            zziduVar2.zzs(Float.floatToRawIntBits(zziegVar.zzf(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzC(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzidw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzg(i5, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzidw zzidwVar = (zzidw) list;
        if (!z2) {
            while (i10 < zzidwVar.size()) {
                this.zza.zzg(i5, Double.doubleToRawLongBits(zzidwVar.zzf(i10)));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzidwVar.size(); i14++) {
            zzidwVar.zzf(i14);
            i13 += 8;
        }
        zziduVar2.zzr(i13);
        while (i10 < zzidwVar.size()) {
            zziduVar2.zzu(Double.doubleToRawLongBits(zzidwVar.zzf(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzD(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieq)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzc(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int iZzG = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzG += zzidu.zzG(((Integer) list.get(i11)).intValue());
            }
            zziduVar.zzr(iZzG);
            while (i10 < list.size()) {
                zziduVar.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z2) {
            while (i10 < zzieqVar.size()) {
                this.zza.zzc(i5, zzieqVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int iZzG2 = 0;
        for (int i12 = 0; i12 < zzieqVar.size(); i12++) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i12));
        }
        zziduVar2.zzr(iZzG2);
        while (i10 < zzieqVar.size()) {
            zziduVar2.zzq(zzieqVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzE(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzidb)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzp(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzidb zzidbVar = (zzidb) list;
        if (!z2) {
            while (i10 < zzidbVar.size()) {
                this.zza.zzh(i5, zzidbVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzidbVar.size(); i14++) {
            zzidbVar.zzf(i14);
            i13++;
        }
        zziduVar2.zzr(i13);
        while (i10 < zzidbVar.size()) {
            zziduVar2.zzp(zzidbVar.zzf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzF(int i5, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzifk)) {
            while (i10 < list.size()) {
                this.zza.zzi(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzifk zzifkVar = (zzifk) list;
        while (i10 < list.size()) {
            Object objZzc = zzifkVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzi(i5, (String) objZzc);
            } else {
                this.zza.zzj(i5, (zzidl) objZzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzG(int i5, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzj(i5, (zzidl) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzH(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieq)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzd(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzF += zzidu.zzF(((Integer) list.get(i11)).intValue());
            }
            zziduVar.zzr(iZzF);
            while (i10 < list.size()) {
                zziduVar.zzr(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z2) {
            while (i10 < zzieqVar.size()) {
                this.zza.zzd(i5, zzieqVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzieqVar.size(); i12++) {
            iZzF2 += zzidu.zzF(zzieqVar.zzf(i12));
        }
        zziduVar2.zzr(iZzF2);
        while (i10 < zzieqVar.size()) {
            zziduVar2.zzr(zzieqVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzI(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieq)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zze(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzs(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z2) {
            while (i10 < zzieqVar.size()) {
                this.zza.zze(i5, zzieqVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzieqVar.size(); i14++) {
            zzieqVar.zzf(i14);
            i13 += 4;
        }
        zziduVar2.zzr(i13);
        while (i10 < zzieqVar.size()) {
            zziduVar2.zzs(zzieqVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzJ(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzifn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzg(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzu(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z2) {
            while (i10 < zzifnVar.size()) {
                this.zza.zzg(i5, zzifnVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzifnVar.size(); i14++) {
            zzifnVar.zzc(i14);
            i13 += 8;
        }
        zziduVar2.zzr(i13);
        while (i10 < zzifnVar.size()) {
            zziduVar2.zzu(zzifnVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzK(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieq)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zzidu zziduVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zziduVar.zzd(i5, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            zzidu zziduVar2 = this.zza;
            zziduVar2.zzb(i5, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzF += zzidu.zzF((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zziduVar2.zzr(iZzF);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zziduVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z2) {
            while (i10 < zzieqVar.size()) {
                zzidu zziduVar3 = this.zza;
                int iZzf = zzieqVar.zzf(i10);
                zziduVar3.zzd(i5, (iZzf >> 31) ^ (iZzf + iZzf));
                i10++;
            }
            return;
        }
        zzidu zziduVar4 = this.zza;
        zziduVar4.zzb(i5, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzieqVar.size(); i12++) {
            int iZzf2 = zzieqVar.zzf(i12);
            iZzF2 += zzidu.zzF((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zziduVar4.zzr(iZzF2);
        while (i10 < zzieqVar.size()) {
            int iZzf3 = zzieqVar.zzf(i10);
            zziduVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzL(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzifn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zzidu zziduVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zziduVar.zzf(i5, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            zzidu zziduVar2 = this.zza;
            zziduVar2.zzb(i5, 2);
            int iZzG = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzG += zzidu.zzG((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zziduVar2.zzr(iZzG);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zziduVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z2) {
            while (i10 < zzifnVar.size()) {
                zzidu zziduVar3 = this.zza;
                long jZzc = zzifnVar.zzc(i10);
                zziduVar3.zzf(i5, (jZzc >> 63) ^ (jZzc + jZzc));
                i10++;
            }
            return;
        }
        zzidu zziduVar4 = this.zza;
        zziduVar4.zzb(i5, 2);
        int iZzG2 = 0;
        for (int i12 = 0; i12 < zzifnVar.size(); i12++) {
            long jZzc2 = zzifnVar.zzc(i12);
            iZzG2 += zzidu.zzG((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zziduVar4.zzr(iZzG2);
        while (i10 < zzifnVar.size()) {
            long jZzc3 = zzifnVar.zzc(i10);
            zziduVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzM(int i5, zzifr zzifrVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            zziduVar.zzr(zzifs.zzc(zzifrVar, entry.getKey(), entry.getValue()));
            zzifs.zzb(zziduVar, zzifrVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzb(int i5, int i10) throws IOException {
        this.zza.zze(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzc(int i5, long j8) throws IOException {
        this.zza.zzf(i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzd(int i5, long j8) throws IOException {
        this.zza.zzg(i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zze(int i5, float f10) throws IOException {
        this.zza.zze(i5, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzf(int i5, double d3) throws IOException {
        this.zza.zzg(i5, Double.doubleToRawLongBits(d3));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzg(int i5, int i10) throws IOException {
        this.zza.zzc(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzh(int i5, long j8) throws IOException {
        this.zza.zzf(i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzi(int i5, int i10) throws IOException {
        this.zza.zzc(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzj(int i5, long j8) throws IOException {
        this.zza.zzg(i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzk(int i5, int i10) throws IOException {
        this.zza.zze(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzl(int i5, boolean z2) throws IOException {
        this.zza.zzh(i5, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzm(int i5, String str) throws IOException {
        this.zza.zzi(i5, str);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzn(int i5, zzidl zzidlVar) throws IOException {
        this.zza.zzj(i5, zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzo(int i5, int i10) throws IOException {
        this.zza.zzd(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzp(int i5, int i10) throws IOException {
        this.zza.zzd(i5, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzq(int i5, long j8) throws IOException {
        this.zza.zzf(i5, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzr(int i5, Object obj, zzigr zzigrVar) throws IOException {
        zzidu zziduVar = this.zza;
        zzicu zzicuVar = (zzicu) obj;
        zziduVar.zzb(i5, 2);
        zziduVar.zzr(zzicuVar.zzaT(zzigrVar));
        zzigrVar.zzf(zzicuVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzs(int i5, Object obj, zzigr zzigrVar) throws IOException {
        zzidu zziduVar = this.zza;
        zziduVar.zzb(i5, 3);
        zzigrVar.zzf((zzicu) obj, this);
        zziduVar.zzb(i5, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    @Deprecated
    public final void zzt(int i5) throws IOException {
        this.zza.zzb(i5, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    @Deprecated
    public final void zzu(int i5) throws IOException {
        this.zza.zzb(i5, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzv(int i5, Object obj) throws IOException {
        if (obj instanceof zzidl) {
            this.zza.zzn(i5, (zzidl) obj);
        } else {
            this.zza.zzm(i5, (zzifz) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzw(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieq)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzc(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int iZzG = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzG += zzidu.zzG(((Integer) list.get(i11)).intValue());
            }
            zziduVar.zzr(iZzG);
            while (i10 < list.size()) {
                zziduVar.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z2) {
            while (i10 < zzieqVar.size()) {
                this.zza.zzc(i5, zzieqVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int iZzG2 = 0;
        for (int i12 = 0; i12 < zzieqVar.size(); i12++) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i12));
        }
        zziduVar2.zzr(iZzG2);
        while (i10 < zzieqVar.size()) {
            zziduVar2.zzq(zzieqVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzx(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzieq)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zze(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zziduVar.zzr(i11);
            while (i10 < list.size()) {
                zziduVar.zzs(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z2) {
            while (i10 < zzieqVar.size()) {
                this.zza.zze(i5, zzieqVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzieqVar.size(); i14++) {
            zzieqVar.zzf(i14);
            i13 += 4;
        }
        zziduVar2.zzr(i13);
        while (i10 < zzieqVar.size()) {
            zziduVar2.zzs(zzieqVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzy(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzifn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int iZzG = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzG += zzidu.zzG(((Long) list.get(i11)).longValue());
            }
            zziduVar.zzr(iZzG);
            while (i10 < list.size()) {
                zziduVar.zzt(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z2) {
            while (i10 < zzifnVar.size()) {
                this.zza.zzf(i5, zzifnVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int iZzG2 = 0;
        for (int i12 = 0; i12 < zzifnVar.size(); i12++) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i12));
        }
        zziduVar2.zzr(iZzG2);
        while (i10 < zzifnVar.size()) {
            zziduVar2.zzt(zzifnVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzz(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzifn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i5, 2);
            int iZzG = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzG += zzidu.zzG(((Long) list.get(i11)).longValue());
            }
            zziduVar.zzr(iZzG);
            while (i10 < list.size()) {
                zziduVar.zzt(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z2) {
            while (i10 < zzifnVar.size()) {
                this.zza.zzf(i5, zzifnVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i5, 2);
        int iZzG2 = 0;
        for (int i12 = 0; i12 < zzifnVar.size(); i12++) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i12));
        }
        zziduVar2.zzr(iZzG2);
        while (i10 < zzifnVar.size()) {
            zziduVar2.zzt(zzifnVar.zzc(i10));
            i10++;
        }
    }
}
