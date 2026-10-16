package com.bytedance.sdk.component.utils;

import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public class lw {
    private static final char[] uef = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String uef(byte[] bArr) {
        if (bArr != null) {
            return uef(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String uef(byte[] bArr, int i5, int i10) {
        if (bArr != null) {
            if (i5 >= 0 && i5 + i10 <= bArr.length) {
                int i11 = i10 * 2;
                char[] cArr = new char[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    byte b5 = bArr[i13 + i5];
                    int i14 = b5 & ForkServer.ERROR;
                    int i15 = i12 + 1;
                    char[] cArr2 = uef;
                    cArr[i12] = cArr2[i14 >> 4];
                    i12 += 2;
                    cArr[i15] = cArr2[b5 & 15];
                }
                return new String(cArr, 0, i11);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static String uef(File file) throws IOException {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i5 = fileInputStream.read(bArr, 0, Segment.SIZE);
                    if (i5 <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i5);
                }
                String strUef = uef(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strUef;
            } catch (Throwable unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            fileInputStream = null;
        }
    }

    public static String uef(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return uef(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
