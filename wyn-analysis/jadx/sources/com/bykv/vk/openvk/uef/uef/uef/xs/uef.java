package com.bykv.vk.openvk.uef.uef.uef.xs;

import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class uef {
    public static String uef(File file) {
        return uef(file, null);
    }

    public static String uef(File file, String str) throws NoSuchAlgorithmException, IOException {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i5 = bufferedInputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
                if (i5 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i5);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return uef(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static String uef(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArr.length * 2];
            int i5 = 0;
            for (byte b5 : bArr) {
                int i10 = i5 + 1;
                cArr2[i5] = cArr[(b5 >>> 4) & 15];
                i5 += 2;
                cArr2[i10] = cArr[b5 & 15];
            }
            return new String(cArr2);
        }
        return "";
    }
}
