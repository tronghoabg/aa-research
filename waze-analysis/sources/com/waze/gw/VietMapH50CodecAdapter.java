package com.waze.gw;

import com.waze.gw.VietMapH50FrameCodec;
import com.waze.gw.VietMapH50Session;
import java.util.Arrays;

/* loaded from: classes10.dex */
final class VietMapH50CodecAdapter implements VietMapH50Session.FrameCodec {
    VietMapH50CodecAdapter() {
    }

    @Override // com.waze.gw.VietMapH50Session.FrameCodec
    public byte[] encode(int i2, byte[] bArr, long j2) {
        return VietMapH50FrameCodec.encodeEncryptedFrame(i2, bArr, j2);
    }

    @Override // com.waze.gw.VietMapH50Session.FrameCodec
    public VietMapH50Session.DecodedFrame decode(byte[] bArr) {
        VietMapH50FrameCodec.H50Frame h50FrameDecodeEncryptedFrame = VietMapH50FrameCodec.decodeEncryptedFrame(bArr);
        return new VietMapH50Session.DecodedFrame(h50FrameDecodeEncryptedFrame.command, h50FrameDecodeEncryptedFrame.payloadCopy());
    }

    @Override // com.waze.gw.VietMapH50Session.FrameCodec
    public int expectedCiphertextLength(byte[] bArr) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("H50 first ciphertext block must be 16 bytes");
        }
        byte[] bArrDecryptFrame = VietMapH50FrameCodec.decryptFrame(Arrays.copyOf(bArr, 16));
        if (bArrDecryptFrame[0] != VietMapH50FrameCodec.MAGIC[0] || bArrDecryptFrame[1] != VietMapH50FrameCodec.MAGIC[1]) {
            throw new IllegalArgumentException("invalid H50 magic in first block");
        }
        int i2 = (bArrDecryptFrame[7] & 255) | ((bArrDecryptFrame[6] & 255) << 8);
        if (i2 < 16 || (i2 & 15) != 0) {
            throw new IllegalArgumentException("invalid H50 declared frame length");
        }
        return i2;
    }
}
