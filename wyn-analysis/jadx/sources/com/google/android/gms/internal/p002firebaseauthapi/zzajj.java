package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajj implements zzanf {
    private final zzajg zza;

    private zzajj(zzajg zzajgVar) {
        zzajg zzajgVar2 = (zzajg) zzakb.zza(zzajgVar, "output");
        this.zza = zzajgVar2;
        zzajgVar2.zze = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i5, List<Double> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaji)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).doubleValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZza = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZza += zzajg.zza(list.get(i11).doubleValue());
            }
            this.zza.zzn(iZza);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        zzaji zzajiVar = (zzaji) list;
        if (!z2) {
            while (i10 < zzajiVar.size()) {
                this.zza.zzb(i5, zzajiVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZza2 = 0;
        for (int i12 = 0; i12 < zzajiVar.size(); i12++) {
            iZza2 += zzajg.zza(zzajiVar.zzb(i12));
        }
        this.zza.zzn(iZza2);
        while (i10 < zzajiVar.size()) {
            this.zza.zzb(zzajiVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajz)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzi(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzc = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzc += zzajg.zzc(list.get(i11).intValue());
            }
            this.zza.zzn(iZzc);
            while (i10 < list.size()) {
                this.zza.zzl(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z2) {
            while (i10 < zzajzVar.size()) {
                this.zza.zzi(i5, zzajzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzc2 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            iZzc2 += zzajg.zzc(zzajzVar.zzb(i12));
        }
        this.zza.zzn(iZzc2);
        while (i10 < zzajzVar.size()) {
            this.zza.zzl(zzajzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajz)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzd = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzd += zzajg.zzd(list.get(i11).intValue());
            }
            this.zza.zzn(iZzd);
            while (i10 < list.size()) {
                this.zza.zzk(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z2) {
            while (i10 < zzajzVar.size()) {
                this.zza.zzh(i5, zzajzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzd2 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            iZzd2 += zzajg.zzd(zzajzVar.zzb(i12));
        }
        this.zza.zzn(iZzd2);
        while (i10 < zzajzVar.size()) {
            this.zza.zzk(zzajzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzakr)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzc = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzc += zzajg.zzc(list.get(i11).longValue());
            }
            this.zza.zzn(iZzc);
            while (i10 < list.size()) {
                this.zza.zzh(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z2) {
            while (i10 < zzakrVar.size()) {
                this.zza.zzf(i5, zzakrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzc2 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            iZzc2 += zzajg.zzc(zzakrVar.zzb(i12));
        }
        this.zza.zzn(iZzc2);
        while (i10 < zzakrVar.size()) {
            this.zza.zzh(zzakrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzf(int i5, List<Float> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajx)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzb(i5, list.get(i10).floatValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZza = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZza += zzajg.zza(list.get(i11).floatValue());
            }
            this.zza.zzn(iZza);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        zzajx zzajxVar = (zzajx) list;
        if (!z2) {
            while (i10 < zzajxVar.size()) {
                this.zza.zzb(i5, zzajxVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZza2 = 0;
        for (int i12 = 0; i12 < zzajxVar.size(); i12++) {
            iZza2 += zzajg.zza(zzajxVar.zzb(i12));
        }
        this.zza.zzn(iZza2);
        while (i10 < zzajxVar.size()) {
            this.zza.zzb(zzajxVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzg(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajz)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzi(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZze = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZze += zzajg.zze(list.get(i11).intValue());
            }
            this.zza.zzn(iZze);
            while (i10 < list.size()) {
                this.zza.zzl(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z2) {
            while (i10 < zzajzVar.size()) {
                this.zza.zzi(i5, zzajzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZze2 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            iZze2 += zzajg.zze(zzajzVar.zzb(i12));
        }
        this.zza.zzn(iZze2);
        while (i10 < zzajzVar.size()) {
            this.zza.zzl(zzajzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzh(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzakr)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzd = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzd += zzajg.zzd(list.get(i11).longValue());
            }
            this.zza.zzn(iZzd);
            while (i10 < list.size()) {
                this.zza.zzj(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z2) {
            while (i10 < zzakrVar.size()) {
                this.zza.zzh(i5, zzakrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzd2 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            iZzd2 += zzajg.zzd(zzakrVar.zzb(i12));
        }
        this.zza.zzn(iZzd2);
        while (i10 < zzakrVar.size()) {
            this.zza.zzj(zzakrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzi(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajz)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzg = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzg += zzajg.zzg(list.get(i11).intValue());
            }
            this.zza.zzn(iZzg);
            while (i10 < list.size()) {
                this.zza.zzk(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z2) {
            while (i10 < zzajzVar.size()) {
                this.zza.zzh(i5, zzajzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzg2 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            iZzg2 += zzajg.zzg(zzajzVar.zzb(i12));
        }
        this.zza.zzn(iZzg2);
        while (i10 < zzajzVar.size()) {
            this.zza.zzk(zzajzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzj(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzakr)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZze = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZze += zzajg.zze(list.get(i11).longValue());
            }
            this.zza.zzn(iZze);
            while (i10 < list.size()) {
                this.zza.zzh(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z2) {
            while (i10 < zzakrVar.size()) {
                this.zza.zzf(i5, zzakrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZze2 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            iZze2 += zzajg.zze(zzakrVar.zzb(i12));
        }
        this.zza.zzn(iZze2);
        while (i10 < zzakrVar.size()) {
            this.zza.zzh(zzakrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzk(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajz)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzj(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzh = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzh += zzajg.zzh(list.get(i11).intValue());
            }
            this.zza.zzn(iZzh);
            while (i10 < list.size()) {
                this.zza.zzm(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z2) {
            while (i10 < zzajzVar.size()) {
                this.zza.zzj(i5, zzajzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzh2 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            iZzh2 += zzajg.zzh(zzajzVar.zzb(i12));
        }
        this.zza.zzn(iZzh2);
        while (i10 < zzajzVar.size()) {
            this.zza.zzm(zzajzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzl(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzakr)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzg(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzf = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzf += zzajg.zzf(list.get(i11).longValue());
            }
            this.zza.zzn(iZzf);
            while (i10 < list.size()) {
                this.zza.zzi(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z2) {
            while (i10 < zzakrVar.size()) {
                this.zza.zzg(i5, zzakrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzf2 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            iZzf2 += zzajg.zzf(zzakrVar.zzb(i12));
        }
        this.zza.zzn(iZzf2);
        while (i10 < zzakrVar.size()) {
            this.zza.zzi(zzakrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzm(int i5, List<Integer> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajz)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzl(i5, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzj = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzj += zzajg.zzj(list.get(i11).intValue());
            }
            this.zza.zzn(iZzj);
            while (i10 < list.size()) {
                this.zza.zzn(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z2) {
            while (i10 < zzajzVar.size()) {
                this.zza.zzl(i5, zzajzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzj2 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            iZzj2 += zzajg.zzj(zzajzVar.zzb(i12));
        }
        this.zza.zzn(iZzj2);
        while (i10 < zzajzVar.size()) {
            this.zza.zzn(zzajzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzn(int i5, List<Long> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzakr)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i5, 2);
            int iZzg = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzg += zzajg.zzg(list.get(i11).longValue());
            }
            this.zza.zzn(iZzg);
            while (i10 < list.size()) {
                this.zza.zzj(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z2) {
            while (i10 < zzakrVar.size()) {
                this.zza.zzh(i5, zzakrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i5, 2);
        int iZzg2 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            iZzg2 += zzajg.zzg(zzakrVar.zzb(i12));
        }
        this.zza.zzn(iZzg2);
        while (i10 < zzakrVar.size()) {
            this.zza.zzj(zzakrVar.zzb(i10));
            i10++;
        }
    }

    public static zzajj zza(zzajg zzajgVar) {
        zzajj zzajjVar = zzajgVar.zze;
        return zzajjVar != null ? zzajjVar : new zzajj(zzajgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, boolean z2) throws IOException {
        this.zza.zzb(i5, z2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, List<Boolean> list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzain)) {
            if (z2) {
                this.zza.zzk(i5, 2);
                int iZza = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    iZza += zzajg.zza(list.get(i11).booleanValue());
                }
                this.zza.zzn(iZza);
                while (i10 < list.size()) {
                    this.zza.zzb(list.get(i10).booleanValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zzb(i5, list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        zzain zzainVar = (zzain) list;
        if (z2) {
            this.zza.zzk(i5, 2);
            int iZza2 = 0;
            for (int i12 = 0; i12 < zzainVar.size(); i12++) {
                iZza2 += zzajg.zza(zzainVar.zzb(i12));
            }
            this.zza.zzn(iZza2);
            while (i10 < zzainVar.size()) {
                this.zza.zzb(zzainVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzainVar.size()) {
            this.zza.zzb(i5, zzainVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i5, int i10) throws IOException {
        this.zza.zzh(i5, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i5, int i10) throws IOException {
        this.zza.zzh(i5, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i5, int i10) throws IOException {
        this.zza.zzj(i5, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzf(int i5, int i10) throws IOException {
        this.zza.zzl(i5, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i5, long j8) throws IOException {
        this.zza.zzh(i5, j8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i5, long j8) throws IOException {
        this.zza.zzh(i5, j8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i5, long j8) throws IOException {
        this.zza.zzg(i5, j8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i5, Object obj, zzalv zzalvVar) throws IOException {
        this.zza.zzc(i5, (zzalc) obj, zzalvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, zzaip zzaipVar) throws IOException {
        this.zza.zzc(i5, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i5, List<?> list, zzalv zzalvVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzb(i5, list.get(i10), zzalvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i5, int i10) throws IOException {
        this.zza.zzi(i5, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, List<zzaip> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzc(i5, list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i5, long j8) throws IOException {
        this.zza.zzf(i5, j8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    @Deprecated
    public final void zzb(int i5) throws IOException {
        this.zza.zzk(i5, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, double d3) throws IOException {
        this.zza.zzb(i5, d3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i5, List<String> list) throws IOException {
        int i10 = 0;
        if (list instanceof zzakn) {
            zzakn zzaknVar = (zzakn) list;
            while (i10 < list.size()) {
                Object objZza = zzaknVar.zza(i10);
                if (objZza instanceof String) {
                    this.zza.zzb(i5, (String) objZza);
                } else {
                    this.zza.zzc(i5, (zzaip) objZza);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzb(i5, list.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    @Deprecated
    public final void zza(int i5) throws IOException {
        this.zza.zzk(i5, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, int i10) throws IOException {
        this.zza.zzi(i5, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, long j8) throws IOException {
        this.zza.zzf(i5, j8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, float f10) throws IOException {
        this.zza.zzb(i5, f10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, Object obj, zzalv zzalvVar) throws IOException {
        zzajg zzajgVar = this.zza;
        zzajgVar.zzk(i5, 3);
        zzalvVar.zza((zzalv) obj, (zzanf) zzajgVar.zze);
        zzajgVar.zzk(i5, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, List<?> list, zzalv zzalvVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zza(i5, list.get(i10), zzalvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final <K, V> void zza(int i5, zzakx<K, V> zzakxVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i5, 2);
            this.zza.zzn(zzaku.zza(zzakxVar, entry.getKey(), entry.getValue()));
            zzaku.zza(this.zza, zzakxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, Object obj) throws IOException {
        if (obj instanceof zzaip) {
            this.zza.zzd(i5, (zzaip) obj);
        } else {
            this.zza.zzb(i5, (zzalc) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i5, String str) throws IOException {
        this.zza.zzb(i5, str);
    }
}
