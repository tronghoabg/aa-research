package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
final class zzjh implements zzno {
    private final zzjg zza;

    private zzjh(zzjg zzjgVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjgVar;
        zzjgVar.zza = this;
    }

    public static zzjh zza(zzjg zzjgVar) {
        zzjh zzjhVar = zzjgVar.zza;
        return zzjhVar != null ? zzjhVar : new zzjh(zzjgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzA(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlm)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z2) {
            while (i10 < zzlmVar.size()) {
                this.zza.zzh(i5, zzlmVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzlmVar.size(); i14++) {
            zzlmVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i10 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzB(int i5, int i10) throws IOException {
        this.zza.zzp(i5, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzC(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzjgVar.zzp(i5, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzx += zzjg.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzjgVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z2) {
            while (i10 < zzktVar.size()) {
                zzjg zzjgVar3 = this.zza;
                int iZze = zzktVar.zze(i10);
                zzjgVar3.zzp(i5, (iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzktVar.size(); i12++) {
            int iZze2 = zzktVar.zze(i12);
            iZzx2 += zzjg.zzx((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzktVar.size()) {
            zzjg zzjgVar4 = this.zza;
            int iZze3 = zzktVar.zze(i10);
            zzjgVar4.zzq((iZze3 >> 31) ^ (iZze3 + iZze3));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzD(int i5, long j8) throws IOException {
        this.zza.zzr(i5, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzE(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlm)) {
            if (!z2) {
                while (i10 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzjgVar.zzr(i5, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzy = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzy += zzjg.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzq(iZzy);
            while (i10 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzjgVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z2) {
            while (i10 < zzlmVar.size()) {
                zzjg zzjgVar3 = this.zza;
                long jZze = zzlmVar.zze(i10);
                zzjgVar3.zzr(i5, (jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzy2 = 0;
        for (int i12 = 0; i12 < zzlmVar.size(); i12++) {
            long jZze2 = zzlmVar.zze(i12);
            iZzy2 += zzjg.zzy((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzq(iZzy2);
        while (i10 < zzlmVar.size()) {
            zzjg zzjgVar4 = this.zza;
            long jZze3 = zzlmVar.zze(i10);
            zzjgVar4.zzs((jZze3 >> 63) ^ (jZze3 + jZze3));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzF(int i5) throws IOException {
        this.zza.zzo(i5, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzG(int i5, String str) throws IOException {
        this.zza.zzm(i5, str);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzH(int i5, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlj)) {
            while (i10 < list.size()) {
                this.zza.zzm(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzlj zzljVar = (zzlj) list;
        while (i10 < list.size()) {
            Object objZzc = zzljVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzm(i5, (String) objZzc);
            } else {
                this.zza.zze(i5, (zziv) objZzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzI(int i5, int i10) throws IOException {
        this.zza.zzp(i5, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzJ(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzp(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzx += zzjg.zzx(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                this.zza.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z2) {
            while (i10 < zzktVar.size()) {
                this.zza.zzp(i5, zzktVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzktVar.size(); i12++) {
            iZzx2 += zzjg.zzx(zzktVar.zze(i12));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzktVar.size()) {
            this.zza.zzq(zzktVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzK(int i5, long j8) throws IOException {
        this.zza.zzr(i5, j8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzL(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlm)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzr(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzy = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzy += zzjg.zzy(((Long) list.get(i11)).longValue());
            }
            this.zza.zzq(iZzy);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z2) {
            while (i10 < zzlmVar.size()) {
                this.zza.zzr(i5, zzlmVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzy2 = 0;
        for (int i12 = 0; i12 < zzlmVar.size(); i12++) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i12));
        }
        this.zza.zzq(iZzy2);
        while (i10 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzb(int i5, boolean z2) throws IOException {
        this.zza.zzd(i5, z2);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzc(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzim)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzd(i5, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzim zzimVar = (zzim) list;
        if (!z2) {
            while (i10 < zzimVar.size()) {
                this.zza.zzd(i5, zzimVar.zzf(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzimVar.size(); i14++) {
            zzimVar.zzf(i14);
            i13++;
        }
        this.zza.zzq(i13);
        while (i10 < zzimVar.size()) {
            this.zza.zzb(zzimVar.zzf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzd(int i5, zziv zzivVar) throws IOException {
        this.zza.zze(i5, zzivVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zze(int i5, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i5, (zziv) list.get(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzf(int i5, double d3) throws IOException {
        this.zza.zzh(i5, Double.doubleToRawLongBits(d3));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzg(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjx)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzjx zzjxVar = (zzjx) list;
        if (!z2) {
            while (i10 < zzjxVar.size()) {
                this.zza.zzh(i5, Double.doubleToRawLongBits(zzjxVar.zze(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzjxVar.size(); i14++) {
            zzjxVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i10 < zzjxVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzjxVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzh(int i5) throws IOException {
        this.zza.zzo(i5, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzi(int i5, int i10) throws IOException {
        this.zza.zzj(i5, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzj(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzy = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzy += zzjg.zzy(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzq(iZzy);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z2) {
            while (i10 < zzktVar.size()) {
                this.zza.zzj(i5, zzktVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzy2 = 0;
        for (int i12 = 0; i12 < zzktVar.size(); i12++) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i12));
        }
        this.zza.zzq(iZzy2);
        while (i10 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzk(int i5, int i10) throws IOException {
        this.zza.zzf(i5, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzl(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z2) {
            while (i10 < zzktVar.size()) {
                this.zza.zzf(i5, zzktVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzktVar.size(); i14++) {
            zzktVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i10 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzm(int i5, long j8) throws IOException {
        this.zza.zzh(i5, j8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzn(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlm)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzh(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z2) {
            while (i10 < zzlmVar.size()) {
                this.zza.zzh(i5, zzlmVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzlmVar.size(); i14++) {
            zzlmVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i10 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzo(int i5, float f10) throws IOException {
        this.zza.zzf(i5, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzp(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkk)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzkk zzkkVar = (zzkk) list;
        if (!z2) {
            while (i10 < zzkkVar.size()) {
                this.zza.zzf(i5, Float.floatToRawIntBits(zzkkVar.zze(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzkkVar.size(); i14++) {
            zzkkVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i10 < zzkkVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzkkVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzq(int i5, Object obj, zzmk zzmkVar) throws IOException {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzo(i5, 3);
        zzmkVar.zzj((zzlx) obj, zzjgVar.zza);
        zzjgVar.zzo(i5, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzr(int i5, int i10) throws IOException {
        this.zza.zzj(i5, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzs(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzj(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzy = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzy += zzjg.zzy(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzq(iZzy);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z2) {
            while (i10 < zzktVar.size()) {
                this.zza.zzj(i5, zzktVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzy2 = 0;
        for (int i12 = 0; i12 < zzktVar.size(); i12++) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i12));
        }
        this.zza.zzq(iZzy2);
        while (i10 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzt(int i5, long j8) throws IOException {
        this.zza.zzr(i5, j8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzu(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlm)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzr(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int iZzy = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzy += zzjg.zzy(((Long) list.get(i11)).longValue());
            }
            this.zza.zzq(iZzy);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z2) {
            while (i10 < zzlmVar.size()) {
                this.zza.zzr(i5, zzlmVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int iZzy2 = 0;
        for (int i12 = 0; i12 < zzlmVar.size(); i12++) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i12));
        }
        this.zza.zzq(iZzy2);
        while (i10 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzv(int i5, Object obj, zzmk zzmkVar) throws IOException {
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar = (zzjd) this.zza;
        zzjdVar.zzq((i5 << 3) | 2);
        zzjdVar.zzq(((zzig) zzlxVar).zza(zzmkVar));
        zzmkVar.zzj(zzlxVar, zzjdVar.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzw(int i5, Object obj) throws IOException {
        if (obj instanceof zziv) {
            zzjd zzjdVar = (zzjd) this.zza;
            zzjdVar.zzq(11);
            zzjdVar.zzp(2, i5);
            zzjdVar.zze(3, (zziv) obj);
            zzjdVar.zzq(12);
            return;
        }
        zzjg zzjgVar = this.zza;
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar2 = (zzjd) zzjgVar;
        zzjdVar2.zzq(11);
        zzjdVar2.zzp(2, i5);
        zzjdVar2.zzq(26);
        zzjdVar2.zzq(zzlxVar.zzn());
        zzlxVar.zze(zzjgVar);
        zzjdVar2.zzq(12);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzx(int i5, int i10) throws IOException {
        this.zza.zzf(i5, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzy(int i5, List list, boolean z2) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            if (!z2) {
                while (i10 < list.size()) {
                    this.zza.zzf(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z2) {
            while (i10 < zzktVar.size()) {
                this.zza.zzf(i5, zzktVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzktVar.size(); i14++) {
            zzktVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i10 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzz(int i5, long j8) throws IOException {
        this.zza.zzh(i5, j8);
    }
}
