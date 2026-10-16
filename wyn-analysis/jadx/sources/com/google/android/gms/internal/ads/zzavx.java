package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import cb.AbstractC1593a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzavx {
    public static final zzavx zzb = new zzavx(new byte[0]);
    public static final Comparator zzc = new zzavw();
    public final byte[] zza;

    public zzavx(byte[] bArr) {
        this.zza = bArr;
    }

    public static zzavx zze(byte[] bArr) {
        return new zzavx(zzh(bArr, 0, bArr.length));
    }

    public static zzavx zzf(String str) {
        return zze(str.getBytes(Charset.forName(zzavv.zza("Hn2H4l0="))));
    }

    public static int zzg(byte b5) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        return b5 & (AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, iArr[5], iArr[6]) ^ (iArr[7] % 837626799));
    }

    public static byte[] zzh(byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzavx) {
            return Arrays.equals(this.zza, ((zzavx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iB = AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15);
        String string = Arrays.toString(this.zza);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + ((i16 % 981766422) ^ iB));
        sb2.append(zzavv.zza("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(string);
        sb2.append(zzavv.zza("Ng=="));
        return sb2.toString();
    }

    public final byte[] zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        return length == 0 ? new byte[0] : zzh(bArr, 0, length);
    }

    public final byte zzb(int i5) {
        int i10 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i11 = 2013725218 % 1633938701;
        int i12 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i13 = 1442767057 % 63299708;
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (((length - (i5 + 1)) | i5) >= 0) {
            return bArr[i5];
        }
        if (i5 < 0) {
            StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(i5, i10 ^ i11));
            sb2.append(zzavv.zza("Akelqh1fajntGgo="));
            sb2.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(AbstractC0279p0.f(length, AbstractC0279p0.f(i5, i12 ^ i13)));
        sb3.append(zzavv.zza("Akelqh1faDmxRUSK1T9GeQ=="));
        sb3.append(i5);
        sb3.append(zzavv.zza("Zwk="));
        sb3.append(length);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final String zzc() {
        Charset charsetForName = Charset.forName(zzavv.zza("Hn2H4l0="));
        byte[] bArr = this.zza;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final zzavx zzd(zzavx zzavxVar) {
        byte[] bArr = zzavxVar.zza;
        int length = bArr.length;
        byte[] bArr2 = this.zza;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return zze(bArr3);
    }
}
