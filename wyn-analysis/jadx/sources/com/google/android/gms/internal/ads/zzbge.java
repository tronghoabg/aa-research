package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public final class zzbge extends zzbfz {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(StringUtils.SPACE);
        int length = strArrSplit.length;
        int i5 = 4;
        if (length == 1) {
            int iZza = zzbgd.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int iZza2 = zzbgd.zza(strArrSplit[i10]);
                    int i11 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b5 = (byte) i11;
                    byte b10 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b5, b10}[0];
                    bArr[i12 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    int iZza3 = zzbgd.zza(strArrSplit[i13]);
                    bArr[i13] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArrArray);
                byte[] bArrDigest = this.zzb.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i5 = length2;
                }
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i5);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
