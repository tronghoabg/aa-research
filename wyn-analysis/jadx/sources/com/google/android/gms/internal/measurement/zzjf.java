package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjv.zza(zzjcVar, "output");
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i5, List<Double> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzje)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).doubleValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZza = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZza += zzjc.zza(list.get(i11).doubleValue());
            }
            this.zza.zzc(iZza);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        zzje zzjeVar = (zzje) list;
        if (!z2) {
            while (i10 < zzjeVar.size()) {
                this.zza.zzb(i5, zzjeVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZza2 = 0;
        for (int i12 = 0; i12 < zzjeVar.size(); i12++) {
            iZza2 += zzjc.zza(zzjeVar.zzb(i12));
        }
        this.zza.zzc(iZza2);
        while (i10 < zzjeVar.size()) {
            this.zza.zzb(zzjeVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzd = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzd += zzjc.zzd(list.get(i11).intValue());
            }
            this.zza.zzc(iZzd);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i10 < zzjwVar.size()) {
                this.zza.zzb(i5, zzjwVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzd2 = 0;
        for (int i12 = 0; i12 < zzjwVar.size(); i12++) {
            iZzd2 += zzjc.zzd(zzjwVar.zzb(i12));
        }
        this.zza.zzc(iZzd2);
        while (i10 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zza(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZze = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZze += zzjc.zze(list.get(i11).intValue());
            }
            this.zza.zzc(iZze);
            while (i10 < list.size()) {
                this.zza.zza(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i10 < zzjwVar.size()) {
                this.zza.zza(i5, zzjwVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZze2 = 0;
        for (int i12 = 0; i12 < zzjwVar.size(); i12++) {
            iZze2 += zzjc.zze(zzjwVar.zzb(i12));
        }
        this.zza.zzc(iZze2);
        while (i10 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zza(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzc = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzc += zzjc.zzc(list.get(i11).longValue());
            }
            this.zza.zzc(iZzc);
            while (i10 < list.size()) {
                this.zza.zza(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i10 < zzknVar.size()) {
                this.zza.zza(i5, zzknVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzc2 = 0;
        for (int i12 = 0; i12 < zzknVar.size(); i12++) {
            iZzc2 += zzjc.zzc(zzknVar.zzb(i12));
        }
        this.zza.zzc(iZzc2);
        while (i10 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i5, List<Float> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjs)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).floatValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZza = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZza += zzjc.zza(list.get(i11).floatValue());
            }
            this.zza.zzc(iZza);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (!z2) {
            while (i10 < zzjsVar.size()) {
                this.zza.zzb(i5, zzjsVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZza2 = 0;
        for (int i12 = 0; i12 < zzjsVar.size(); i12++) {
            iZza2 += zzjc.zza(zzjsVar.zzb(i12));
        }
        this.zza.zzc(iZza2);
        while (i10 < zzjsVar.size()) {
            this.zza.zzb(zzjsVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzf = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzf += zzjc.zzf(list.get(i11).intValue());
            }
            this.zza.zzc(iZzf);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i10 < zzjwVar.size()) {
                this.zza.zzb(i5, zzjwVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzf2 = 0;
        for (int i12 = 0; i12 < zzjwVar.size(); i12++) {
            iZzf2 += zzjc.zzf(zzjwVar.zzb(i12));
        }
        this.zza.zzc(iZzf2);
        while (i10 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzd = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzd += zzjc.zzd(list.get(i11).longValue());
            }
            this.zza.zzc(iZzd);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i10 < zzknVar.size()) {
                this.zza.zzb(i5, zzknVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzd2 = 0;
        for (int i12 = 0; i12 < zzknVar.size(); i12++) {
            iZzd2 += zzjc.zzd(zzknVar.zzb(i12));
        }
        this.zza.zzc(iZzd2);
        while (i10 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zza(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzg = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzg += zzjc.zzg(list.get(i11).intValue());
            }
            this.zza.zzc(iZzg);
            while (i10 < list.size()) {
                this.zza.zza(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i10 < zzjwVar.size()) {
                this.zza.zza(i5, zzjwVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzg2 = 0;
        for (int i12 = 0; i12 < zzjwVar.size(); i12++) {
            iZzg2 += zzjc.zzg(zzjwVar.zzb(i12));
        }
        this.zza.zzc(iZzg2);
        while (i10 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zza(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZze = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZze += zzjc.zze(list.get(i11).longValue());
            }
            this.zza.zzc(iZze);
            while (i10 < list.size()) {
                this.zza.zza(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i10 < zzknVar.size()) {
                this.zza.zza(i5, zzknVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZze2 = 0;
        for (int i12 = 0; i12 < zzknVar.size(); i12++) {
            iZze2 += zzjc.zze(zzknVar.zzb(i12));
        }
        this.zza.zzc(iZze2);
        while (i10 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzk(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzh = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzh += zzjc.zzh(list.get(i11).intValue());
            }
            this.zza.zzc(iZzh);
            while (i10 < list.size()) {
                this.zza.zzk(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i10 < zzjwVar.size()) {
                this.zza.zzk(i5, zzjwVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzh2 = 0;
        for (int i12 = 0; i12 < zzjwVar.size(); i12++) {
            iZzh2 += zzjc.zzh(zzjwVar.zzb(i12));
        }
        this.zza.zzc(iZzh2);
        while (i10 < zzjwVar.size()) {
            this.zza.zzk(zzjwVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzf = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzf += zzjc.zzf(list.get(i11).longValue());
            }
            this.zza.zzc(iZzf);
            while (i10 < list.size()) {
                this.zza.zzh(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i10 < zzknVar.size()) {
                this.zza.zzh(i5, zzknVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzf2 = 0;
        for (int i12 = 0; i12 < zzknVar.size(); i12++) {
            iZzf2 += zzjc.zzf(zzknVar.zzb(i12));
        }
        this.zza.zzc(iZzf2);
        while (i10 < zzknVar.size()) {
            this.zza.zzh(zzknVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzd(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzj = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzj += zzjc.zzj(list.get(i11).intValue());
            }
            this.zza.zzc(iZzj);
            while (i10 < list.size()) {
                this.zza.zzc(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i10 < zzjwVar.size()) {
                this.zza.zzd(i5, zzjwVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzj2 = 0;
        for (int i12 = 0; i12 < zzjwVar.size(); i12++) {
            iZzj2 += zzjc.zzj(zzjwVar.zzb(i12));
        }
        this.zza.zzc(iZzj2);
        while (i10 < zzjwVar.size()) {
            this.zza.zzc(zzjwVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzc(i5, 2);
            int iZzg = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzg += zzjc.zzg(list.get(i11).longValue());
            }
            this.zza.zzc(iZzg);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i10 < zzknVar.size()) {
                this.zza.zzb(i5, zzknVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzc(i5, 2);
        int iZzg2 = 0;
        for (int i12 = 0; i12 < zzknVar.size(); i12++) {
            iZzg2 += zzjc.zzg(zzknVar.zzb(i12));
        }
        this.zza.zzc(iZzg2);
        while (i10 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i10));
            i10++;
        }
    }

    public static zzjf zza(zzjc zzjcVar) {
        zzjf zzjfVar = zzjcVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, boolean z2) throws IOException {
        this.zza.zza(i5, z2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, List<Boolean> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzii)) {
            if (z2) {
                this.zza.zzc(i5, 2);
                int iZza = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    iZza += zzjc.zza(list.get(i11).booleanValue());
                }
                this.zza.zzc(iZza);
                while (i10 < list.size()) {
                    this.zza.zzb(list.get(i10).booleanValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zza(i5, list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        zzii zziiVar = (zzii) list;
        if (z2) {
            this.zza.zzc(i5, 2);
            int iZza2 = 0;
            for (int i12 = 0; i12 < zziiVar.size(); i12++) {
                iZza2 += zzjc.zza(zziiVar.zzb(i12));
            }
            this.zza.zzc(iZza2);
            while (i10 < zziiVar.size()) {
                this.zza.zzb(zziiVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zziiVar.size()) {
            this.zza.zza(i5, zziiVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i5, int i10) throws IOException {
        this.zza.zza(i5, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i5, int i10) throws IOException {
        this.zza.zza(i5, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i5, int i10) throws IOException {
        this.zza.zzk(i5, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i5, int i10) throws IOException {
        this.zza.zzd(i5, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i5, long j8) throws IOException {
        this.zza.zzb(i5, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i5, long j8) throws IOException {
        this.zza.zzb(i5, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i5, long j8) throws IOException {
        this.zza.zzh(i5, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i5, Object obj, zzlu zzluVar) throws IOException {
        this.zza.zza(i5, (zzlc) obj, zzluVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, zzik zzikVar) throws IOException {
        this.zza.zza(i5, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i5, List<?> list, zzlu zzluVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzb(i5, list.get(i10), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i5, int i10) throws IOException {
        this.zza.zzb(i5, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, List<zzik> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zza(i5, list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i5, long j8) throws IOException {
        this.zza.zza(i5, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int i5) throws IOException {
        this.zza.zzc(i5, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, double d3) throws IOException {
        this.zza.zzb(i5, d3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i5, List<String> list) throws IOException {
        int i10 = 0;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i10 < list.size()) {
                Object objZza = zzkjVar.zza(i10);
                if (objZza instanceof String) {
                    this.zza.zza(i5, (String) objZza);
                } else {
                    this.zza.zza(i5, (zzik) objZza);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zza(i5, list.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int i5) throws IOException {
        this.zza.zzc(i5, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, int i10) throws IOException {
        this.zza.zzb(i5, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, long j8) throws IOException {
        this.zza.zza(i5, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, float f10) throws IOException {
        this.zza.zzb(i5, f10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, Object obj, zzlu zzluVar) throws IOException {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzc(i5, 3);
        zzluVar.zza((zzlu) obj, (zznb) zzjcVar.zza);
        zzjcVar.zzc(i5, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, List<?> list, zzlu zzluVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zza(i5, list.get(i10), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final <K, V> void zza(int i5, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i5, 2);
            this.zza.zzc(zzku.zza(zzktVar, entry.getKey(), entry.getValue()));
            zzku.zza(this.zza, zzktVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, Object obj) throws IOException {
        if (obj instanceof zzik) {
            this.zza.zzb(i5, (zzik) obj);
        } else {
            this.zza.zza(i5, (zzlc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i5, String str) throws IOException {
        this.zza.zza(i5, str);
    }
}
