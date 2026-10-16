package com.bytedance.sdk.openadsdk.utils;

import com.applovin.shadow.okio.Utf8;
import java.security.SecureRandom;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public class ue {
    private static final ThreadLocal<SecureRandom> uef = new ThreadLocal<>();

    public static String uef() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = uef;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b5 = (byte) (bArr[6] & 15);
        bArr[6] = b5;
        bArr[6] = (byte) (b5 | 64);
        byte b10 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = b10;
        bArr[8] = (byte) (b10 | 128);
        long j8 = 0;
        long j10 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            j10 = (j10 << 8) | (bArr[i5] & ForkServer.ERROR);
        }
        for (int i10 = 8; i10 < 16; i10++) {
            j8 = (j8 << 8) | (bArr[i10] & ForkServer.ERROR);
        }
        return new UUID(j10, j8).toString();
    }
}
