package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzct implements zzcs {
    final /* synthetic */ zzcu zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzct(zzcu zzcuVar) {
        Objects.requireNonNull(zzcuVar);
        this.zza = zzcuVar;
        this.zzb = new short[zzcuVar.zzh()];
        this.zzc = new short[zzcuVar.zzh() * zzcuVar.zzg()];
        this.zzd = new short[zzcuVar.zzh() * zzcuVar.zzg()];
        this.zze = new short[zzcuVar.zzh() * zzcuVar.zzg()];
    }

    private final int zzs(short[] sArr, int i5, int i10, int i11) {
        int i12 = 1;
        int i13 = 255;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int iZzg = this.zza.zzg() * i5;
                iAbs += Math.abs(sArr[iZzg + i16] - sArr[(iZzg + i10) + i16]);
            }
            int i17 = iAbs * i14;
            int i18 = i12 * i10;
            if (i17 < i18) {
                i12 = iAbs;
            }
            if (i17 < i18) {
                i14 = i10;
            }
            int i19 = iAbs * i13;
            int i20 = i15 * i10;
            if (i19 > i20) {
                i15 = iAbs;
            }
            if (i19 > i20) {
                i13 = i10;
            }
            i10++;
        }
        this.zzf = i12 / i14;
        this.zzg = i15 / i13;
        return i14;
    }

    private final short[] zzt(short[] sArr, int i5, int i10) {
        zzcu zzcuVar = this.zza;
        int length = sArr.length / zzcuVar.zzg();
        return i5 + i10 <= length ? sArr : Arrays.copyOf(sArr, M6.C(length, 3, 2, i10) * zzcuVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzb(int i5, long j8, long j10) {
        int i10 = 0;
        while (true) {
            zzcu zzcuVar = this.zza;
            if (i10 >= zzcuVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int iZzg = zzcuVar.zzg();
            int iZzj = zzcuVar.zzj();
            short[] sArr2 = this.zze;
            int iZzg2 = (zzcuVar.zzg() * i5) + i10;
            short s10 = sArr2[iZzg2];
            short s11 = sArr2[iZzg2 + zzcuVar.zzg()];
            long jZzm = zzcuVar.zzm() * j8;
            long jZzl = zzcuVar.zzl() * j10;
            long jZzl2 = (zzcuVar.zzl() + 1) * j10;
            int i11 = i10;
            long j11 = jZzl2 - jZzl;
            long j12 = jZzl2 - jZzm;
            sArr[(iZzj * iZzg) + i11] = (short) ((((j11 - j12) * s11) + (j12 * s10)) / j11);
            i10 = i11 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final boolean zzc() {
        int i5 = this.zzf;
        return i5 != 0 && this.zza.zzn() != 0 && this.zzg <= i5 * 3 && i5 + i5 > this.zzh * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzd(int i5, int i10) {
        int iZzg;
        short[] sArr = this.zzc;
        int i11 = 0;
        while (true) {
            zzcu zzcuVar = this.zza;
            if (i11 >= zzcuVar.zzh() / i10) {
                return;
            }
            int i12 = 0;
            int i13 = 0;
            while (true) {
                iZzg = zzcuVar.zzg() * i10;
                if (i12 < iZzg) {
                    i13 += sArr[(iZzg * i11) + (zzcuVar.zzg() * i5) + i12];
                    i12++;
                }
            }
            this.zzb[i11] = (short) (i13 / iZzg);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zze(int i5, int i10, int i11) {
        return zzs(this.zzb, 0, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zzf(int i5, int i10, int i11) {
        return zzs(this.zzc, i5, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzh(int i5, int i10, int i11, int i12, int i13) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i5; i18++) {
                sArr[i17] = (short) (((sArr2[i16] * i18) + ((i5 - i18) * sArr2[i15])) / i5);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzj(int i5) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzk(int i5) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzl(int i5) {
        this.zze = zzt(this.zze, this.zza.zzk(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzm(int i5, int i10) {
        for (int i11 = 0; i11 < this.zza.zzg() * i10; i11++) {
            this.zzc[i5 + i11] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzn(ByteBuffer byteBuffer, int i5) {
        zzcu zzcuVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzcuVar.zzi() * zzcuVar.zzg(), i5 / 2);
        byteBuffer.position(byteBuffer.position() + i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzo(ByteBuffer byteBuffer, int i5) {
        zzcu zzcuVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzcuVar.zzg() * i5);
        byteBuffer.position(((i5 + i5) * zzcuVar.zzg()) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }
}
