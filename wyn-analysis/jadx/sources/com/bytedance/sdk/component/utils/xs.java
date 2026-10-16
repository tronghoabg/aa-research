package com.bytedance.sdk.component.utils;

import A7.AbstractC0279p0;
import N0.a;
import android.content.Context;
import com.qonversion.android.sdk.internal.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class xs {

    /* renamed from: com.bytedance.sdk.component.utils.xs$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static final class uef implements Comparator<File> {
        private uef() {
        }

        private int uef(long j8, long j10) {
            if (j8 < j10) {
                return -1;
            }
            return j8 == j10 ? 0 : 1;
        }

        public /* synthetic */ uef(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return uef(file.lastModified(), file2.lastModified());
        }
    }

    private static void ivm(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static void lw(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j8;
        long length = file.length();
        if (length == 0) {
            ivm(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j8 = length - 1;
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(j8);
            byte b5 = randomAccessFile.readByte();
            randomAccessFile.seek(j8);
            randomAccessFile.write(b5);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    public static byte[] moa(File file) {
        FileInputStream fileInputStream;
        long length;
        Long lValueOf;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                length = file.length();
                lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[lValueOf.intValue()];
                if (fileInputStream.read(bArr) == length) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    return bArr;
                }
            } catch (Throwable unused3) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    public static File oa(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = a.f(absolutePath, str2);
            }
        }
        File file = new File(a.f(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File uef(Context context, File file, String str) {
        if (file != null) {
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused) {
                return new File(file, str);
            }
        }
        if (tpx.uef(context)) {
            return new File(file, str);
        }
        return new File(file, str + Constants.USER_ID_SEPARATOR + tpx.yo(context));
    }

    public static void yo(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        yo(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    public static File uef(Context context, String str, String str2) {
        String strUef = uef(context);
        if (!tpx.uef(context)) {
            StringBuilder sbQ = AbstractC0279p0.q(str, Constants.USER_ID_SEPARATOR);
            sbQ.append(tpx.yo(context));
            str = sbQ.toString();
        }
        if (strUef != null) {
            String str3 = File.separator;
            if (!strUef.endsWith(str3)) {
                strUef = a.f(strUef, str3);
            }
        }
        String strF = a.f(strUef, str);
        File file = new File(strF);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strF, str2);
    }

    public static void oa(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            lw(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File uef(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (!tpx.uef(context)) {
            StringBuilder sbQ = AbstractC0279p0.q(str, Constants.USER_ID_SEPARATOR);
            sbQ.append(tpx.yo(context));
            str = sbQ.toString();
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = a.f(absolutePath, str2);
            }
        }
        File file = new File(a.f(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String uef(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> uef(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new uef(null));
        return listAsList;
    }
}
