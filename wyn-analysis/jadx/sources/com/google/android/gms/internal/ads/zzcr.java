package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzcr implements zzcs {
    final /* synthetic */ zzcu zza;
    private final float[] zzb;
    private float[] zzc;
    private float[] zzd;
    private float[] zze;
    private double zzf;
    private double zzg;
    private double zzh;

    public zzcr(zzcu zzcuVar) {
        Objects.requireNonNull(zzcuVar);
        this.zza = zzcuVar;
        this.zzb = new float[zzcuVar.zzh()];
        this.zzc = new float[zzcuVar.zzh() * zzcuVar.zzg()];
        this.zzd = new float[zzcuVar.zzh() * zzcuVar.zzg()];
        this.zze = new float[zzcuVar.zzh() * zzcuVar.zzg()];
    }

    private final int zzs(float[] fArr, int i5, int i10, int i11) {
        int i12 = 255;
        int i13 = 0;
        double d3 = 0.0d;
        double d5 = 1.0d;
        int i14 = i10;
        while (true) {
            double d10 = i12;
            double d11 = i13;
            if (i14 > i11) {
                this.zzf = d5 / d11;
                this.zzg = d3 / d10;
                return i13;
            }
            int i15 = 0;
            double dAbs = 0.0d;
            while (i15 < i14) {
                int iZzg = this.zza.zzg() * i5;
                dAbs += Math.abs(fArr[iZzg + i15] - fArr[(iZzg + i14) + i15]);
                i15++;
                i12 = i12;
            }
            int i16 = i12;
            double d12 = d11 * dAbs;
            double d13 = i14;
            double d14 = d5 * d13;
            if (d12 < d14) {
                d5 = dAbs;
            }
            if (d12 < d14) {
                i13 = i14;
            }
            double d15 = d10 * dAbs;
            double d16 = d13 * d3;
            if (d15 > d16) {
                d3 = dAbs;
            }
            i12 = d15 > d16 ? i14 : i16;
            i14++;
        }
    }

    private final float[] zzt(float[] fArr, int i5, int i10) {
        zzcu zzcuVar = this.zza;
        int length = fArr.length / zzcuVar.zzg();
        return i5 + i10 <= length ? fArr : Arrays.copyOf(fArr, M6.C(length, 3, 2, i10) * zzcuVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzb(int i5, long j8, long j10) {
        int i10 = 0;
        while (true) {
            zzcu zzcuVar = this.zza;
            if (i10 >= zzcuVar.zzg()) {
                return;
            }
            float[] fArr = this.zzd;
            int iZzg = zzcuVar.zzg();
            int iZzj = zzcuVar.zzj();
            float[] fArr2 = this.zze;
            int iZzg2 = (zzcuVar.zzg() * i5) + i10;
            long jZzl = (zzcuVar.zzl() + 1) * j10;
            long jZzm = jZzl - (zzcuVar.zzm() * j8);
            long jZzl2 = jZzl - (zzcuVar.zzl() * j10);
            fArr[(iZzj * iZzg) + i10] = ((jZzm * fArr2[iZzg2]) + ((jZzl2 - jZzm) * fArr2[iZzg2 + zzcuVar.zzg()])) / jZzl2;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final boolean zzc() {
        double d3 = this.zzf;
        return d3 != 0.0d && this.zza.zzn() != 0 && this.zzg <= d3 * 3.0d && d3 + d3 > this.zzh * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzd(int i5, int i10) {
        int iZzg;
        int i11 = 0;
        while (true) {
            zzcu zzcuVar = this.zza;
            if (i11 >= zzcuVar.zzh() / i10) {
                return;
            }
            double d3 = 0.0d;
            int i12 = 0;
            while (true) {
                iZzg = zzcuVar.zzg() * i10;
                if (i12 < iZzg) {
                    d3 += this.zzc[(iZzg * i11) + (zzcuVar.zzg() * i5) + i12];
                    i12++;
                }
            }
            this.zzb[i11] = (float) (d3 / iZzg);
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
        this.zzh = 0.0d;
        this.zzf = 0.0d;
        this.zzg = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzh(int i5, int i10, int i11, int i12, int i13) {
        float[] fArr = this.zzd;
        float[] fArr2 = this.zzc;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i5; i18++) {
                fArr[i17] = ((fArr2[i16] * i18) + (fArr2[i15] * (i5 - i18))) / i5;
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
            this.zzc[i5 + i11] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzn(ByteBuffer byteBuffer, int i5) {
        zzcu zzcuVar = this.zza;
        byteBuffer.asFloatBuffer().get(this.zzc, zzcuVar.zzi() * zzcuVar.zzg(), i5 / 4);
        byteBuffer.position(byteBuffer.position() + i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzo(ByteBuffer byteBuffer, int i5) {
        zzcu zzcuVar = this.zza;
        byteBuffer.asFloatBuffer().put(this.zzd, 0, zzcuVar.zzg() * i5);
        byteBuffer.position((i5 * 4 * zzcuVar.zzg()) + byteBuffer.position());
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
