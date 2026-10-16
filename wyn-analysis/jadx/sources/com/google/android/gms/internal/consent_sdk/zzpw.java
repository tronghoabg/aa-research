package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzpw implements zztb {
    private final zzpv zza;

    private zzpw(zzpv zzpvVar) {
        byte[] bArr = zzqs.zzb;
        this.zza = zzpvVar;
        zzpvVar.zze = this;
    }

    public static zzpw zza(zzpv zzpvVar) {
        Object obj = zzpvVar.zze;
        return obj != null ? (zzpw) obj : new zzpw(zzpvVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzA(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzre)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzl(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z2) {
            while (i10 < zzreVar.size()) {
                this.zza.zzl(i5, zzreVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzreVar.size(); i14++) {
            zzreVar.zze(i14);
            i13 += 8;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzB(int i5, int i10) throws IOException {
        this.zza.zzv(i5, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzC(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzpvVar.zzv(i5, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i5, 2);
            int iZzC = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzC += zzpv.zzC((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzpvVar2.zzw(iZzC);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzpvVar2.zzw((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z2) {
            while (i10 < zzqnVar.size()) {
                zzpv zzpvVar3 = this.zza;
                int iZze = zzqnVar.zze(i10);
                zzpvVar3.zzv(i5, (iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i5, 2);
        int iZzC2 = 0;
        for (int i12 = 0; i12 < zzqnVar.size(); i12++) {
            int iZze2 = zzqnVar.zze(i12);
            iZzC2 += zzpv.zzC((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzpvVar4.zzw(iZzC2);
        while (i10 < zzqnVar.size()) {
            int iZze3 = zzqnVar.zze(i10);
            zzpvVar4.zzw((iZze3 >> 31) ^ (iZze3 + iZze3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzD(int i5, long j8) throws IOException {
        this.zza.zzx(i5, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzE(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzre)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzpvVar.zzx(i5, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i5, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzD += zzpv.zzD((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzpvVar2.zzw(iZzD);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzpvVar2.zzy((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z2) {
            while (i10 < zzreVar.size()) {
                zzpv zzpvVar3 = this.zza;
                long jZze = zzreVar.zze(i10);
                zzpvVar3.zzx(i5, (jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i5, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzreVar.size(); i12++) {
            long jZze2 = zzreVar.zze(i12);
            iZzD2 += zzpv.zzD((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzpvVar4.zzw(iZzD2);
        while (i10 < zzreVar.size()) {
            long jZze3 = zzreVar.zze(i10);
            zzpvVar4.zzy((jZze3 >> 63) ^ (jZze3 + jZze3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzF(int i5, String str) throws IOException {
        this.zza.zzs(i5, str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzG(int i5, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzrb)) {
            while (i10 < list.size()) {
                this.zza.zzs(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzrb zzrbVar = (zzrb) list;
        while (i10 < list.size()) {
            Object objZza = zzrbVar.zza();
            if (objZza instanceof String) {
                this.zza.zzs(i5, (String) objZza);
            } else {
                this.zza.zzh(i5, (zzpm) objZza);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzH(int i5, int i10) throws IOException {
        this.zza.zzv(i5, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzI(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzv(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int iZzC = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzC += zzpv.zzC(((Integer) list.get(i11)).intValue());
            }
            zzpvVar.zzw(iZzC);
            while (i10 < list.size()) {
                zzpvVar.zzw(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z2) {
            while (i10 < zzqnVar.size()) {
                this.zza.zzv(i5, zzqnVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int iZzC2 = 0;
        for (int i12 = 0; i12 < zzqnVar.size(); i12++) {
            iZzC2 += zzpv.zzC(zzqnVar.zze(i12));
        }
        zzpvVar2.zzw(iZzC2);
        while (i10 < zzqnVar.size()) {
            zzpvVar2.zzw(zzqnVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzJ(int i5, long j8) throws IOException {
        this.zza.zzx(i5, j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzK(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzre)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzx(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzpv.zzD(((Long) list.get(i11)).longValue());
            }
            zzpvVar.zzw(iZzD);
            while (i10 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z2) {
            while (i10 < zzreVar.size()) {
                this.zza.zzx(i5, zzreVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzreVar.size(); i12++) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i12));
        }
        zzpvVar2.zzw(iZzD2);
        while (i10 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzb(int i5, boolean z2) throws IOException {
        this.zza.zzK(i5, z2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzc(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzpd)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzK(i5, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzJ(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzpd zzpdVar = (zzpd) list;
        if (!z2) {
            while (i10 < zzpdVar.size()) {
                this.zza.zzK(i5, zzpdVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzpdVar.size(); i14++) {
            zzpdVar.zze(i14);
            i13++;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzpdVar.size()) {
            zzpvVar2.zzJ(zzpdVar.zze(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzd(int i5, zzpm zzpmVar) throws IOException {
        this.zza.zzh(i5, zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zze(int i5, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzh(i5, (zzpm) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzf(int i5, double d3) throws IOException {
        this.zza.zzl(i5, Double.doubleToRawLongBits(d3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzg(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzpx)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzl(i5, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzpx zzpxVar = (zzpx) list;
        if (!z2) {
            while (i10 < zzpxVar.size()) {
                this.zza.zzl(i5, Double.doubleToRawLongBits(zzpxVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzpxVar.size(); i14++) {
            zzpxVar.zze(i14);
            i13 += 8;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzpxVar.size()) {
            zzpvVar2.zzm(Double.doubleToRawLongBits(zzpxVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzh(int i5, int i10) throws IOException {
        this.zza.zzn(i5, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzi(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzn(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzpv.zzD(((Integer) list.get(i11)).intValue());
            }
            zzpvVar.zzw(iZzD);
            while (i10 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z2) {
            while (i10 < zzqnVar.size()) {
                this.zza.zzn(i5, zzqnVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzqnVar.size(); i12++) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i12));
        }
        zzpvVar2.zzw(iZzD2);
        while (i10 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzj(int i5, int i10) throws IOException {
        this.zza.zzj(i5, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzk(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z2) {
            while (i10 < zzqnVar.size()) {
                this.zza.zzj(i5, zzqnVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzqnVar.size(); i14++) {
            zzqnVar.zze(i14);
            i13 += 4;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzl(int i5, long j8) throws IOException {
        this.zza.zzl(i5, j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzm(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzre)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzl(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z2) {
            while (i10 < zzreVar.size()) {
                this.zza.zzl(i5, zzreVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzreVar.size(); i14++) {
            zzreVar.zze(i14);
            i13 += 8;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzn(int i5, float f10) throws IOException {
        this.zza.zzj(i5, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzo(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqh)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzj(i5, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzqh zzqhVar = (zzqh) list;
        if (!z2) {
            while (i10 < zzqhVar.size()) {
                this.zza.zzj(i5, Float.floatToRawIntBits(zzqhVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzqhVar.size(); i14++) {
            zzqhVar.zze(i14);
            i13 += 4;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzqhVar.size()) {
            zzpvVar2.zzk(Float.floatToRawIntBits(zzqhVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzp(int i5, Object obj, zzsa zzsaVar) throws IOException {
        zzpv zzpvVar = this.zza;
        zzpvVar.zzu(i5, 3);
        zzsaVar.zzf((zzpa) obj, this);
        zzpvVar.zzu(i5, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzq(int i5, int i10) throws IOException {
        this.zza.zzn(i5, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzr(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzn(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzpv.zzD(((Integer) list.get(i11)).intValue());
            }
            zzpvVar.zzw(iZzD);
            while (i10 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z2) {
            while (i10 < zzqnVar.size()) {
                this.zza.zzn(i5, zzqnVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzqnVar.size(); i12++) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i12));
        }
        zzpvVar2.zzw(iZzD2);
        while (i10 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzs(int i5, long j8) throws IOException {
        this.zza.zzx(i5, j8);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzt(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzre)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzx(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzpv.zzD(((Long) list.get(i11)).longValue());
            }
            zzpvVar.zzw(iZzD);
            while (i10 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z2) {
            while (i10 < zzreVar.size()) {
                this.zza.zzx(i5, zzreVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzreVar.size(); i12++) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i12));
        }
        zzpvVar2.zzw(iZzD2);
        while (i10 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzu(int i5, zzri zzriVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            zzpvVar.zzw(zzrj.zzb(zzriVar, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzqf.zzi(zzpvVar, zzriVar.zza, 1, key);
            zzqf.zzi(zzpvVar, zzriVar.zzb, 2, value);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzv(int i5, Object obj, zzsa zzsaVar) throws IOException {
        zzpv zzpvVar = this.zza;
        zzpa zzpaVar = (zzpa) obj;
        zzpvVar.zzu(i5, 2);
        zzpvVar.zzw(zzpaVar.zzj(zzsaVar));
        zzsaVar.zzf(zzpaVar, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzw(int i5, Object obj) throws IOException {
        if (obj instanceof zzpm) {
            this.zza.zzr(i5, (zzpm) obj);
        } else {
            this.zza.zzq(i5, (zzrq) obj);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzx(int i5, int i10) throws IOException {
        this.zza.zzj(i5, i10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzy(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzqn)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzpvVar.zzw(i11);
            while (i10 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z2) {
            while (i10 < zzqnVar.size()) {
                this.zza.zzj(i5, zzqnVar.zze(i10));
                i10++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzqnVar.size(); i14++) {
            zzqnVar.zze(i14);
            i13 += 4;
        }
        zzpvVar2.zzw(i13);
        while (i10 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzz(int i5, long j8) throws IOException {
        this.zza.zzl(i5, j8);
    }
}
