package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
abstract class zzhl {
    int[] zza;
    private final int zzb;

    public zzhl(byte[] bArr, int i5) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhk.zza(bArr);
        this.zzb = i5;
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i5) {
        int[] iArrZza = zza(zzhk.zza(bArr), i5);
        int[] iArr = (int[]) iArrZza.clone();
        zzhk.zza(iArr);
        for (int i10 = 0; i10 < iArrZza.length; i10++) {
            iArrZza[i10] = iArrZza[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] zza(int[] iArr, int i5);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int iRemaining = byteBuffer2.remaining();
            int i5 = iRemaining / 64;
            int i10 = i5 + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer byteBufferZza = zza(bArr, this.zzb + i11);
                if (i11 == i5) {
                    zzxv.zza(byteBuffer, byteBuffer2, byteBufferZza, iRemaining % 64);
                } else {
                    zzxv.zza(byteBuffer, byteBuffer2, byteBufferZza, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException(AbstractC3256n.g(zza(), "The nonce length (in bytes) must be "));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
