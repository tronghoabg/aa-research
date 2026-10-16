package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzbgh extends zzbfz {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbgh(int i5) {
        int i10 = i5 >> 3;
        this.zzc = (i5 & 7) > 0 ? i10 + 1 : i10;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i5 = this.zzc;
                if (length > i5) {
                    length = i5;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i10 = this.zzd & 7;
                if (i10 > 0) {
                    long j8 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j8 <<= 8;
                        }
                        j8 += bArr[i11] & ForkServer.ERROR;
                    }
                    long j10 = j8 >>> (8 - i10);
                    while (true) {
                        i5--;
                        if (i5 < 0) {
                            break;
                        }
                        bArr[i5] = (byte) (255 & j10);
                        j10 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
