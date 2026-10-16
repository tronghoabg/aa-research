package n7;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.AbstractC1732v;
import d7.i;
import d7.j;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.apache.tika.fork.ForkServer;
import p7.C3773c;

/* renamed from: n7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3598c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f40922a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f40923b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f40924c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f40925d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f40926e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f40927f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f40928g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f40929h;

    /* renamed from: i, reason: collision with root package name */
    public static String f40930i;

    /* renamed from: j, reason: collision with root package name */
    public static int f40931j;
    public static Boolean k;

    public static void a(Context context, Throwable th) {
        try {
            AbstractC1732v.i(context);
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i5 = 0;
        for (byte b5 : bArr) {
            int i10 = b5 & ForkServer.ERROR;
            char[] cArr2 = f40923b;
            cArr[i5] = cArr2[i10 >>> 4];
            cArr[i5 + 1] = cArr2[b5 & 15];
            i5 += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i5 = 0; i5 < length; i5++) {
            char[] cArr = f40922a;
            sb2.append(cArr[(bArr[i5] & 240) >>> 4]);
            sb2.append(cArr[bArr[i5] & 15]);
        }
        return sb2.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z2) {
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        long j8 = 0;
        while (true) {
            try {
                int i5 = inputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
                if (i5 == -1) {
                    break;
                }
                j8 += i5;
                outputStream.write(bArr, 0, i5);
            } catch (Throwable th) {
                if (z2) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th;
            }
        }
        if (z2) {
            d(inputStream);
            d(outputStream);
        }
        return j8;
    }

    public static String f() throws Throwable {
        BufferedReader bufferedReader;
        if (f40930i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f40930i = Application.getProcessName();
            } else {
                int iMyPid = f40931j;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f40931j = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String line = bufferedReader.readLine();
                        AbstractC1732v.i(line);
                        strTrim = line.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        d(bufferedReader2);
                        throw th;
                    }
                    d(bufferedReader);
                }
                f40930i = strTrim;
            }
        }
        return f40930i;
    }

    public static byte[] g(Context context, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfoC = C3773c.a(context).c(64, str);
        Signature[] signatureArr = packageInfoC.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i5++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoC.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean j(Context context, int i5) throws PackageManager.NameNotFoundException {
        if (n(context, i5, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j jVarB = j.b(context);
                jVarB.getClass();
                if (packageInfo != null) {
                    if (!j.f(packageInfo, false)) {
                        if (j.f(packageInfo, true)) {
                            if (!i.b((Context) jVarB.f34137a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        if (f40926e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z2 = true;
            }
            f40926e = Boolean.valueOf(z2);
        }
        return f40926e.booleanValue();
    }

    public static boolean l(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f40924c == null) {
            f40924c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f40924c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (p(context)) {
            return !h() || i();
        }
        return false;
    }

    public static byte[] m(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i5 = 0;
        while (i5 < length) {
            int i10 = i5 + 2;
            bArr[i5 / 2] = (byte) Integer.parseInt(str.substring(i5, i10), 16);
            i5 = i10;
        }
        return bArr;
    }

    public static boolean n(Context context, int i5, String str) {
        E0.a aVarA = C3773c.a(context);
        aVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) aVarA.f2782a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i5, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void o(StringBuilder sb2, HashMap map) {
        sb2.append("{");
        boolean z2 = true;
        for (String str : map.keySet()) {
            if (!z2) {
                sb2.append(",");
            }
            String str2 = (String) map.get(str);
            N0.a.r(sb2, "\"", str, "\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                N0.a.r(sb2, "\"", str2, "\"");
            }
            z2 = false;
        }
        sb2.append("}");
    }

    public static boolean p(Context context) {
        if (f40925d == null) {
            f40925d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f40925d.booleanValue();
    }
}
