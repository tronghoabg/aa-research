package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class zzhz {
    private static final zzhz zza = new zzhw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzhz zzb = new zzhw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new zzhy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzhy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzhv zzhvVar = new zzhv("base16()", "0123456789ABCDEF".toCharArray());
        new zzhy(zzhvVar, null);
        char[] cArr = new char[512];
        zzgx.zza(zzhvVar.zzf.length == 16);
        for (int i5 = 0; i5 < 256; i5++) {
            cArr[i5] = zzhvVar.zza(i5 >>> 4);
            cArr[i5 | 256] = zzhvVar.zza(i5 & 15);
        }
    }

    public static zzhz zzg() {
        return zza;
    }

    public static zzhz zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzhx;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException;

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i5, int i10) {
        zzgx.zzd(0, i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i10));
        try {
            zzb(sb2, bArr, 0, i10);
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzhx e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
