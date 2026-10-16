package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.InputStream;
import java.security.MessageDigest;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f24490a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i5 = inputStream.read(bArr, 0, 4096);
                        if (i5 == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i5);
                        }
                    }
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (!str.equals(strA)) {
                            throw new RuntimeException(N0.a.h("md5 check failed file: local md5:", strA, " expect md5:", str));
                        }
                    } catch (Exception e7) {
                        throw new RuntimeException("md5 check failed:" + e7.getMessage(), e7);
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("md5 check failed:" + e10.getMessage(), e10);
                }
            } finally {
                CloseableUtils.close(inputStream);
            }
        } catch (Exception e11) {
            throw new RuntimeException("md5 check failed:" + e11.getMessage(), e11);
        }
    }

    private static String a(byte[] bArr, int i5) {
        if (bArr != null) {
            if (i5 <= bArr.length) {
                int i10 = i5 << 1;
                char[] cArr = new char[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < i5; i12++) {
                    byte b5 = bArr[i12];
                    int i13 = b5 & ForkServer.ERROR;
                    int i14 = i11 + 1;
                    char[] cArr2 = f24490a;
                    cArr[i11] = cArr2[i13 >> 4];
                    i11 += 2;
                    cArr[i14] = cArr2[b5 & 15];
                }
                return new String(cArr, 0, i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
