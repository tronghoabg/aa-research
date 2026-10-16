package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
abstract class zzhkc {
    int[] zza;
    private final int zzb;

    public zzhkc(byte[] bArr, int i5) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhka.zzd(bArr);
        this.zzb = i5;
    }

    public abstract int[] zza(int[] iArr, int i5);

    public abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int iZzb = zzb();
            throw new GeneralSecurityException(N0.a.d(iZzb, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iZzb).length() + 36)));
        }
        int iRemaining = byteBuffer.remaining();
        int i5 = iRemaining / 64;
        for (int i10 = 0; i10 < i5 + 1; i10++) {
            ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i10);
            if (i10 == i5) {
                zzhzw.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
            } else {
                zzhzw.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    public final ByteBuffer zzd(byte[] bArr, int i5) {
        int[] iArrZza = zza(zzhka.zzd(bArr), i5);
        int[] iArr = (int[]) iArrZza.clone();
        zzhka.zzb(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            iArrZza[i10] = iArrZza[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
