package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class zbuo {
    static final Charset zba;
    public static final byte[] zbb;

    static {
        Charset.forName("US-ASCII");
        zba = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zbb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zbte(bArr, 0, 0, false, null).zba(0);
        } catch (zbuq e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int zba(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int zbb(int i5, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            i5 = (i5 * 31) + bArr[i12];
        }
        return i5;
    }

    public static Object zbc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static boolean zbd(zbvm zbvmVar) {
        if (zbvmVar instanceof zbsk) {
            throw null;
        }
        return false;
    }
}
