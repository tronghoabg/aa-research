package androidx.media3.datasource;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i2, byte[] bArr, long j2, long j3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j4 = blockSize;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            cipher.init(i2, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), DomExceptionUtils.SEPARATOR)[0]), new IvParameterSpec(getInitializationVector(j2, j5)));
            if (i3 != 0) {
                updateInPlace(new byte[i3], 0, i3);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static long getFNV64Hash(String str) {
        long j2 = 0;
        if (str != null) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                long jCharAt = j2 ^ str.charAt(i2);
                j2 = jCharAt + jCharAt + jCharAt + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
            }
        }
        return j2;
    }

    private byte[] getInitializationVector(long j2, long j3) {
        return ByteBuffer.allocate(16).putLong(j2).putLong(j3).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        try {
            return this.cipher.update(bArr, i2, i3, bArr2, i4);
        } catch (ShortBufferException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void update(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        do {
            int i5 = this.pendingXorBytes;
            if (i5 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i2, i3, bArr2, i4);
                if (i3 != iNonFlushingUpdate) {
                    int i6 = i3 - iNonFlushingUpdate;
                    int i7 = 0;
                    an.u(i6 < this.blockSize);
                    int i8 = i4 + iNonFlushingUpdate;
                    int i9 = this.blockSize - i6;
                    this.pendingXorBytes = i9;
                    an.u(nonFlushingUpdate(this.zerosBlock, 0, i9, this.flushedBlock, 0) == this.blockSize);
                    while (i7 < i6) {
                        bArr2[i8] = this.flushedBlock[i7];
                        i7++;
                        i8++;
                    }
                    return;
                }
                return;
            }
            bArr2[i4] = (byte) (bArr[i2] ^ this.flushedBlock[this.blockSize - i5]);
            i4++;
            i2++;
            this.pendingXorBytes = i5 - 1;
            i3--;
        } while (i3 != 0);
    }

    public void updateInPlace(byte[] bArr, int i2, int i3) {
        update(bArr, i2, i3, bArr, i2);
    }

    public AesFlushingCipher(int i2, byte[] bArr, String str, long j2) {
        this(i2, bArr, getFNV64Hash(str), j2);
    }
}
