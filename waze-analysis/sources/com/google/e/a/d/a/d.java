package com.google.e.a.d.a;

import com.google.e.a.a.a.s;
import com.google.firebase.sessions.ap;
import com.google.firebase.sessions.w;
import h.g.b.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {
    public static com.google.e.a.a a(String str) {
        return new c(str, i());
    }

    public static boolean b(String str) {
        return i().containsAlias(str);
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] d(byte[]... bArr) throws GeneralSecurityException {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i4, length);
                    i4 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i2].length;
            if (i3 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i3 += length2;
            i2++;
        }
    }

    public static final byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return f(bArr, 0, bArr2, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (bArr.length - i3 < i2 || bArr2.length - i3 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i2] ^ bArr2[i4]);
        }
        return bArr3;
    }

    public static final ap g() {
        Object objF = s.c(com.google.firebase.b.f8908a).f(ap.class);
        x.e(objF, "get(...)");
        return (ap) objF;
    }

    public static final w h() {
        Object objF = s.c(com.google.firebase.b.f8908a).f(w.class);
        x.e(objF, "get(...)");
        return (w) objF;
    }

    private static KeyStore i() throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
