package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzgzk extends zzgzn {
    final char[] zza;

    private zzgzk(zzgzj zzgzjVar) {
        super(zzgzjVar, null);
        this.zza = new char[512];
        zzgtr.zza(zzgzjVar.zzf().length == 16);
        for (int i5 = 0; i5 < 256; i5++) {
            this.zza[i5] = zzgzjVar.zza(i5 >>> 4);
            this.zza[i5 | 256] = zzgzjVar.zza(i5 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    public final void zza(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        zzgtr.zzo(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & ForkServer.ERROR;
            char[] cArr = this.zza;
            appendable.append(cArr[i12]);
            appendable.append(cArr[i12 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgzm(N0.a.d(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i5 = 0;
        int i10 = 0;
        while (i5 < charSequence.length()) {
            zzgzj zzgzjVar = this.zzb;
            bArr[i10] = (byte) (zzgzjVar.zzc(charSequence.charAt(i5 + 1)) | (zzgzjVar.zzc(charSequence.charAt(i5)) << 4));
            i5 += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final zzgzo zzc(zzgzj zzgzjVar, Character ch) {
        return new zzgzk(zzgzjVar);
    }

    public zzgzk(String str, String str2) {
        this(new zzgzj("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
