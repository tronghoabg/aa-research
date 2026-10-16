package com.waze.gw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* loaded from: classes10.dex */
final class HlpFrameCodec {
    static final int MAX_FRAME_BYTES = 512;
    private int length;
    private final byte[] line = new byte[511];
    private boolean overflow;

    interface Listener {
        void onFrame(String str);

        void onMalformedUtf8();

        void onOversizedFrame();
    }

    HlpFrameCodec() {
    }

    static byte[] encode(String str) throws IOException {
        if (str == null) {
            throw new IOException("null HLP frame");
        }
        byte[] bArrStrictUtf8 = strictUtf8(str);
        if (bArrStrictUtf8.length + 1 > 512) {
            throw new IOException("HLP frame exceeds 512 bytes");
        }
        byte[] bArr = new byte[bArrStrictUtf8.length + 1];
        System.arraycopy(bArrStrictUtf8, 0, bArr, 0, bArrStrictUtf8.length);
        bArr[bArrStrictUtf8.length] = 10;
        return bArr;
    }

    private static byte[] strictUtf8(String str) throws IOException {
        try {
            StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
            ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str));
            byte[] bArr = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (CharacterCodingException e2) {
            throw new IOException("invalid UTF-16/UTF-8 input", e2);
        }
    }

    void reset() {
        this.length = 0;
        this.overflow = false;
    }

    void accept(byte[] bArr, int i2, Listener listener) {
        if (bArr == null || listener == null) {
            return;
        }
        int iMax = Math.max(0, Math.min(i2, bArr.length));
        for (int i3 = 0; i3 < iMax; i3++) {
            int i4 = bArr[i3] & 255;
            if (i4 == 10) {
                if (this.overflow) {
                    listener.onOversizedFrame();
                } else {
                    int i5 = this.length;
                    if (i5 > 0 && this.line[i5 - 1] == 13) {
                        i5--;
                    }
                    try {
                        listener.onFrame(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(this.line, 0, i5)).toString());
                    } catch (CharacterCodingException e2) {
                        listener.onMalformedUtf8();
                    }
                }
                reset();
            } else if (!this.overflow) {
                if (this.length >= this.line.length) {
                    this.overflow = true;
                } else {
                    byte[] bArr2 = this.line;
                    int i6 = this.length;
                    this.length = i6 + 1;
                    bArr2[i6] = (byte) i4;
                }
            }
        }
    }
}
