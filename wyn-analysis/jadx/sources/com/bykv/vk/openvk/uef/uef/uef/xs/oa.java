package com.bykv.vk.openvk.uef.uef.uef.xs;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class oa {
    private static final MessageDigest uef = uef();

    /* renamed from: oa, reason: collision with root package name */
    private static final char[] f24515oa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private oa() {
    }

    private static MessageDigest uef() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String uef(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = uef;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (oa.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return uef(bArrDigest);
    }

    public static String uef(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i5 = 0;
        for (byte b5 : bArr) {
            int i10 = i5 + 1;
            char[] cArr2 = f24515oa;
            cArr[i5] = cArr2[(b5 & 240) >> 4];
            i5 += 2;
            cArr[i10] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }
}
