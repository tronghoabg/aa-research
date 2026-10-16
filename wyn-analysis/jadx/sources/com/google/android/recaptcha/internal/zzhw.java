package com.google.android.recaptcha.internal;

import java.io.IOException;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzhw extends zzhy {
    public zzhw(String str, String str2, Character ch) {
        zzhv zzhvVar = new zzhv(str, str2.toCharArray());
        super(zzhvVar, ch);
        zzgx.zza(zzhvVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzhy, com.google.android.recaptcha.internal.zzhz
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzhx {
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzhx(AbstractC3256n.g(charSequenceZze.length(), "Invalid input length "));
        }
        int i5 = 0;
        int i10 = 0;
        while (i5 < charSequenceZze.length()) {
            int i11 = i10 + 1;
            int iZzb = (this.zza.zzb(charSequenceZze.charAt(i5)) << 18) | (this.zza.zzb(charSequenceZze.charAt(i5 + 1)) << 12);
            bArr[i10] = (byte) (iZzb >>> 16);
            int i12 = i5 + 2;
            if (i12 < charSequenceZze.length()) {
                int i13 = i5 + 3;
                int iZzb2 = iZzb | (this.zza.zzb(charSequenceZze.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iZzb2 >>> 8) & 255);
                if (i13 < charSequenceZze.length()) {
                    i5 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZze.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i5 = i13;
                }
            } else {
                i5 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzhy, com.google.android.recaptcha.internal.zzhz
    public final void zzb(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        int i11 = 0;
        zzgx.zzd(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & ForkServer.ERROR;
            int i14 = ((bArr[i11 + 1] & ForkServer.ERROR) << 8) | (i13 << 16) | (bArr[i11 + 2] & ForkServer.ERROR);
            appendable.append(this.zza.zza(i14 >>> 18));
            appendable.append(this.zza.zza((i14 >>> 12) & 63));
            appendable.append(this.zza.zza((i14 >>> 6) & 63));
            appendable.append(this.zza.zza(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzf(appendable, bArr, i11, i10 - i11);
        }
    }
}
