package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzgzl extends zzgzn {
    private zzgzl(zzgzj zzgzjVar, Character ch) {
        super(zzgzjVar, ch);
        zzgtr.zza(zzgzjVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    public final void zza(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        int i11 = 0;
        zzgtr.zzo(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & ForkServer.ERROR;
            int i14 = bArr[i11 + 1] & ForkServer.ERROR;
            int i15 = bArr[i11 + 2] & ForkServer.ERROR;
            zzgzj zzgzjVar = this.zzb;
            int i16 = (i14 << 8) | (i13 << 16) | i15;
            appendable.append(zzgzjVar.zza(i16 >>> 18));
            appendable.append(zzgzjVar.zza((i16 >>> 12) & 63));
            appendable.append(zzgzjVar.zza((i16 >>> 6) & 63));
            appendable.append(zzgzjVar.zza(i16 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zze(appendable, bArr, i11, i10 - i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgzj zzgzjVar = this.zzb;
        if (!zzgzjVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgzm(N0.a.d(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i5 = 0;
        int i10 = 0;
        while (i5 < charSequenceZzg.length()) {
            int i11 = i10 + 1;
            int iZzc = (zzgzjVar.zzc(charSequenceZzg.charAt(i5 + 1)) << 12) | (zzgzjVar.zzc(charSequenceZzg.charAt(i5)) << 18);
            bArr[i10] = (byte) (iZzc >>> 16);
            int i12 = i5 + 2;
            if (i12 < charSequenceZzg.length()) {
                int i13 = i5 + 3;
                int iZzc2 = iZzc | (zzgzjVar.zzc(charSequenceZzg.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iZzc2 >>> 8) & 255);
                if (i13 < charSequenceZzg.length()) {
                    i5 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iZzc2 | zzgzjVar.zzc(charSequenceZzg.charAt(i13))) & 255);
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

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final zzgzo zzc(zzgzj zzgzjVar, Character ch) {
        return new zzgzl(zzgzjVar, ch);
    }

    public zzgzl(String str, String str2, Character ch) {
        this(new zzgzj(str, str2.toCharArray()), ch);
    }
}
