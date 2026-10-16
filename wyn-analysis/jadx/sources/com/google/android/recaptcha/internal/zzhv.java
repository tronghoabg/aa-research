package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
final class zzhv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhv(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c10 = cArr[i5];
            boolean z2 = true;
            zzgx.zzc(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z2 = false;
            }
            zzgx.zzc(z2, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i5;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhv) {
            zzhv zzhvVar = (zzhv) obj;
            boolean z2 = zzhvVar.zzi;
            if (Arrays.equals(this.zzf, zzhvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i5) {
        return this.zzf[i5];
    }

    public final int zzb(char c10) throws zzhx {
        if (c10 > 127) {
            throw new zzhx("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b5 = this.zzg[c10];
        if (b5 != -1) {
            return b5;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzhx("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzhx("Unrecognized character: " + c10);
    }

    public final boolean zzc(int i5) {
        return this.zzh[i5 % this.zzc];
    }

    public final boolean zzd(char c10) {
        return this.zzg[61] != -1;
    }

    private zzhv(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzib.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i5 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i5;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i5];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzib.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(AbstractC3256n.g(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
