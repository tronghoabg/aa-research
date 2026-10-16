package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzgzj {
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
    public zzgzj(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c10 = cArr[i5];
            boolean z2 = true;
            zzgtr.zzc(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z2 = false;
            }
            zzgtr.zzc(z2, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i5;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgzj) {
            zzgzj zzgzjVar = (zzgzj) obj;
            if (this.zzi == zzgzjVar.zzi && Arrays.equals(this.zzf, zzgzjVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i5) {
        return this.zzf[i5];
    }

    public final boolean zzb(int i5) {
        return this.zzh[i5 % this.zzc];
    }

    public final int zzc(char c10) throws zzgzm {
        if (c10 > 127) {
            throw new zzgzm("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b5 = this.zzg[c10];
        if (b5 != -1) {
            return b5;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzgzm("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzgzm(AbstractC0279p0.n(new StringBuilder(String.valueOf(c10).length() + 24), "Unrecognized character: ", c10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    public final zzgzj zzd() {
        boolean z2;
        int i5 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i5 >= length) {
                return this;
            }
            if (zzgsz.zzd(cArr[i5])) {
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z2 = false;
                        break;
                    }
                    if (zzgsz.zzc(cArr[i10])) {
                        z2 = true;
                        break;
                    }
                    i10++;
                }
                zzgtr.zzj(!z2, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i11 = 0; i11 < cArr.length; i11++) {
                    char c10 = cArr[i11];
                    if (zzgsz.zzd(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i11] = (char) c10;
                }
                zzgzj zzgzjVar = new zzgzj(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgzjVar.zzi) {
                    return zzgzjVar;
                }
                byte[] bArr = zzgzjVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i12 = 65; i12 <= 90; i12++) {
                    int i13 = i12 | 32;
                    byte b5 = bArr[i12];
                    byte b10 = bArr[i13];
                    if (b5 == -1) {
                        bArrCopyOf[i12] = b10;
                    } else {
                        char c11 = (char) i12;
                        char c12 = (char) i13;
                        if (b10 != -1) {
                            throw new IllegalStateException(zzgui.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i13] = b5;
                    }
                }
                return new zzgzj(zzgzjVar.zze.concat(".ignoreCase()"), zzgzjVar.zzf, bArrCopyOf, true);
            }
            i5++;
        }
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzgzj(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZza = zzhag.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = iZza;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZza);
            int i5 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i5;
            this.zzd = iZza >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i5];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzhag.zzb(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z2;
        } catch (ArithmeticException e7) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(N0.a.d(length2, "Illegal alphabet length ", new StringBuilder(String.valueOf(length2).length() + 24)), e7);
        }
    }
}
