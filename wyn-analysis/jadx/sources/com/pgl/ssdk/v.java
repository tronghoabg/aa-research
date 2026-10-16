package com.pgl.ssdk;

import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static String f32611a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f32612b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f32613c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f32614d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f32615e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f32616f = null;

    /* renamed from: g, reason: collision with root package name */
    private static int f32617g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static long f32618h;

    /* renamed from: i, reason: collision with root package name */
    private static long f32619i;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, PHI: r1
  0x0026: PHI (r1v3 java.io.RandomAccessFile) = (r1v2 java.io.RandomAccessFile), (r1v4 java.io.RandomAccessFile) binds: [B:8:0x001f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.pgl.ssdk.e a(java.io.File r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L22
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L22
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L23
            r4 = 0
            com.pgl.ssdk.q r2 = com.pgl.ssdk.r.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L23
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L23
            java.util.List r2 = com.pgl.ssdk.l.a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L23
            r1.close()     // Catch: java.io.IOException -> L2a
            goto L2a
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L29
            goto L26
        L22:
            r1 = r0
        L23:
            if (r1 != 0) goto L26
            goto L29
        L26:
            r1.close()     // Catch: java.io.IOException -> L29
        L29:
            r2 = r0
        L2a:
            if (r2 == 0) goto L32
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L36
        L32:
            java.util.List r2 = com.pgl.ssdk.k.a(r6)
        L36:
            if (r2 == 0) goto L46
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L46
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.v.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            int i5 = 1;
            long size = 0;
            while (true) {
                if (i5 == 1) {
                    str = "classes.dex";
                } else {
                    str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i5));
                }
                ZipEntry entry = zipFile2.getEntry(str);
                if (entry != null) {
                    try {
                        size += entry.getSize();
                        i5++;
                    } catch (IOException unused) {
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    try {
                        break;
                    } catch (IOException unused4) {
                    }
                }
            }
            zipFile2.close();
            return size;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String c() throws Throwable {
        if (TextUtils.isEmpty(f32615e) || TextUtils.isEmpty(f32611a) || TextUtils.isEmpty(f32616f) || TextUtils.isEmpty(f32612b)) {
            d();
        }
        return b();
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f32611a) || TextUtils.isEmpty(f32612b)) {
            f();
        }
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        File file = new File(strE);
        if (file.exists() && file.canRead()) {
            f32618h = file.length();
            f32619i = b(file);
            f32615e = c(file);
            if (f32617g == -1 || TextUtils.isEmpty(f32616f)) {
                Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strE);
                Integer num = (Integer) objArr[0];
                String str = (String) objArr[1];
                if (str != null) {
                    f32616f = str;
                }
                if (num != null) {
                    f32617g = num.intValue();
                }
            }
        }
    }

    public static String e() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void f() throws Throwable {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        File file = new File(strE);
        if (file.exists() && file.canRead()) {
            e eVarA = a(file);
            if (eVarA != null) {
                f32611a = a(eVarA.a());
                f32614d = eVarA.b();
            }
            f32612b = g();
        }
    }

    public static String g() {
        try {
            return a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean h() throws Throwable {
        if (TextUtils.isEmpty(f32611a) || TextUtils.isEmpty(f32612b)) {
            f();
        }
        return a();
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b5 : bArrDigest) {
                sb2.append(Integer.toHexString((b5 & ForkServer.ERROR) | 256).substring(1, 3).toUpperCase());
                sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f32611a)) {
                jSONObject.put("sign", f32611a);
            }
            if (!TextUtils.isEmpty(f32614d)) {
                jSONObject.put("subject", f32614d);
            }
            if (!TextUtils.isEmpty(f32615e)) {
                jSONObject.put("md5", f32615e);
            }
            if (!TextUtils.isEmpty(f32616f)) {
                jSONObject.put("path", f32616f);
            }
            long j8 = f32618h;
            if (j8 != 0) {
                jSONObject.put("apkSize", j8);
            }
            long j10 = f32619i;
            if (j10 != 0) {
                jSONObject.put("dexSize", j10);
            }
            int i5 = f32617g;
            if (i5 != -1) {
                jSONObject.put("code", i5);
            }
            if (!TextUtils.isEmpty(f32612b)) {
                jSONObject.put("signpm", f32612b);
            }
            jSONObject.put("rebud", a());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[1048576];
                while (true) {
                    int i5 = randomAccessFile2.read(bArr);
                    if (i5 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i5);
                }
                String string = new BigInteger(1, messageDigest.digest()).toString(16);
                while (string.length() < 32) {
                    string = "0".concat(string);
                }
                try {
                    randomAccessFile2.close();
                } catch (IOException unused) {
                }
                return string;
            } catch (IOException | NoSuchAlgorithmException unused2) {
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile == null) {
                    return "";
                }
                try {
                    randomAccessFile.close();
                    return "";
                } catch (IOException unused3) {
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean a() {
        Boolean bool = f32613c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TextUtils.isEmpty(f32612b) || TextUtils.isEmpty(f32611a)) {
            return false;
        }
        boolean z2 = !f32612b.equals(f32611a);
        f32613c = Boolean.valueOf(z2);
        return z2;
    }
}
