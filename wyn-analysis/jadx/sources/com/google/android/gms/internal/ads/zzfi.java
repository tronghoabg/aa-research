package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzfi {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzfi() {
        throw null;
    }

    private final Object zzf() {
        zzgtr.zzi(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i5 = this.zzc;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.zzc = (i5 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized void zza(long j8, Object obj) {
        try {
            if (this.zzd > 0) {
                if (j8 <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                    zzb();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i5 = length + length;
                long[] jArr = new long[i5];
                Object[] objArr = new Object[i5];
                int i10 = this.zzc;
                int i11 = length - i10;
                System.arraycopy(this.zza, i10, jArr, 0, i11);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i11);
                int i12 = this.zzc;
                if (i12 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i11, i12);
                    System.arraycopy(this.zzb, 0, objArr, i11, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i13 = this.zzc;
            int i14 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i13 + i14) % objArr2.length;
            this.zza[length2] = j8;
            objArr2[length2] = obj;
            this.zzd = i14 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    public final synchronized Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zze(long j8) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j8 - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public zzfi(int i5) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
