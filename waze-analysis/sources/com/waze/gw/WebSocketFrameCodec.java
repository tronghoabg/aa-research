package com.waze.gw;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
final class WebSocketFrameCodec {
    static final int MAX_MESSAGE_BYTES = 512;
    static final int OPCODE_CLOSE = 8;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_PING = 9;
    static final int OPCODE_PONG = 10;
    static final int OPCODE_TEXT = 1;

    interface ControlSink {
        void send(int i2, byte[] bArr) throws IOException;
    }

    private WebSocketFrameCodec() {
    }

    static byte[] encodeClientFrame(int i2, byte[] bArr, byte[] bArr2) throws IOException {
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr2 == null || bArr2.length != 4) {
            throw new IOException("invalid WebSocket mask");
        }
        if (bArr.length > 65535) {
            throw new IOException("WebSocket payload too large");
        }
        int i3 = 2;
        byte[] bArr3 = new byte[(bArr.length <= 125 ? 2 : 4) + 4 + bArr.length];
        bArr3[0] = (byte) ((i2 & 15) | 128);
        if (bArr.length <= 125) {
            bArr3[1] = (byte) (bArr.length | 128);
        } else {
            bArr3[1] = -2;
            bArr3[2] = (byte) ((bArr.length >>> 8) & 255);
            bArr3[3] = (byte) (bArr.length & 255);
            i3 = 4;
        }
        System.arraycopy(bArr2, 0, bArr3, i3, 4);
        int i4 = i3 + 4;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr3[i4 + i5] = (byte) (bArr[i5] ^ bArr2[i5 & 3]);
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        throw new java.net.ProtocolException("invalid WebSocket control frame");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e2, code lost:
    
        throw new java.net.ProtocolException("unexpected WebSocket continuation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0103, code lost:
    
        throw new java.net.ProtocolException("WebSocket HLP message exceeds 512 bytes");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static byte[] readTextMessage(java.io.InputStream r16, com.waze.gw.WebSocketFrameCodec.ControlSink r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.WebSocketFrameCodec.readTextMessage(java.io.InputStream, com.waze.gw.WebSocketFrameCodec$ControlSink):byte[]");
    }

    private static int readRequired(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("WebSocket EOF");
        }
        return i2;
    }

    private static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = inputStream.read(bArr, i2, bArr.length - i2);
            if (i3 < 0) {
                throw new EOFException("WebSocket EOF in payload");
            }
            if (i3 != 0) {
                i2 += i3;
            }
        }
    }
}
