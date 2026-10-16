package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzgzo {
    private static final zzgzo zza = new zzgzl("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgzo zzb = new zzgzl("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgzo zzc;

    static {
        new zzgzn("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgzn("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgzk("base16()", "0123456789ABCDEF");
    }

    public static zzgzo zzl() {
        return zza;
    }

    public static zzgzo zzm() {
        return zzb;
    }

    public static zzgzo zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm;

    public abstract int zzd(int i5);

    public abstract int zzf(int i5);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgzo zzh();

    public abstract zzgzo zzi();

    public final String zzj(byte[] bArr, int i5, int i10) {
        zzgtr.zzo(0, i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i10));
        try {
            zza(sb2, bArr, 0, i10);
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgzm e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
