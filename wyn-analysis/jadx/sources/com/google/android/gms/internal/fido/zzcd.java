package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzcd(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c10 = cArr[i5];
            boolean z2 = true;
            zzap.zzd(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z2 = false;
            }
            zzap.zzd(z2, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i5;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i5) {
        return this.zzf[i5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    public final zzcd zzb() {
        int i5;
        boolean z2;
        for (char c10 : this.zzf) {
            if (zzad.zza(c10)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z2 = false;
                        break;
                    }
                    char c11 = cArr[i10];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        z2 = true;
                        break;
                    }
                    i10++;
                }
                if (z2) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.zzf.length];
                int i11 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i11 >= cArr3.length) {
                        break;
                    }
                    char c12 = cArr3[i11];
                    if (zzad.zza(c12)) {
                        c12 ^= 32;
                    }
                    cArr2[i11] = (char) c12;
                    i11++;
                }
                zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzcdVar.zzh) {
                    return zzcdVar;
                }
                byte[] bArr = zzcdVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i5 = 65; i5 <= 90; i5++) {
                    int i12 = i5 | 32;
                    byte[] bArr2 = zzcdVar.zzg;
                    byte b5 = bArr2[i5];
                    byte b10 = bArr2[i12];
                    if (b5 == -1) {
                        bArrCopyOf[i5] = b10;
                    } else {
                        char c13 = (char) i5;
                        char c14 = (char) i12;
                        if (b10 != -1) {
                            throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                        }
                        bArrCopyOf[i12] = b5;
                    }
                }
                return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, bArrCopyOf, true);
            }
        }
        return this;
    }

    public final boolean zzc(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i5 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i5;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i5];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzcj.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z2;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(AbstractC3256n.g(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
