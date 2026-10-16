package com.bykv.vk.openvk.uef.uef.oa.moa;

import N0.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class oa {
    public static File oa(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, a.f(str2, ".temp"));
    }

    public static long uef(String str, String str2) {
        File fileYo = yo(str, str2);
        if (fileYo.exists()) {
            return fileYo.length();
        }
        File fileOa = oa(str, str2);
        if (fileOa.exists()) {
            return fileOa.length();
        }
        return 0L;
    }

    public static File yo(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void uef(RandomAccessFile randomAccessFile, byte[] bArr, int i5, int i10, String str) throws IOException {
        try {
            randomAccessFile.seek(i5);
            randomAccessFile.write(bArr, 0, i10);
        } catch (Throwable unused) {
        }
    }
}
