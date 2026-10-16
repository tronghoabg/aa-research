package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import io.github.muntashirakon.adb.AdbAuthenticationFailedException;
import io.github.muntashirakon.adb.AdbPairingRequiredException;
import io.github.muntashirakon.adb.android.AdbMdns;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static volatile a0 a;
    public static volatile z b;
    public static volatile String h;
    public static volatile String i;
    public static volatile AdbMdns k;
    public static WifiManager.MulticastLock l;
    public static final byte[] c = {6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 11};
    public static final byte[] d = {6, 3, 85, 4, 3};
    public static volatile boolean e = false;
    public static volatile long f = 0;
    public static volatile boolean g = false;
    public static volatile int j = -1;
    public static volatile long m = 0;
    public static volatile long n = 0;

    public static boolean a(Throwable th) {
        while (th != null) {
            if ((th instanceof AdbPairingRequiredException) || (th instanceof AdbAuthenticationFailedException)) {
                return true;
            }
            if (th.getCause() == th) {
                return false;
            }
            th = th.getCause();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0.b(android.content.Context):void");
    }

    public static boolean c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = activeNetwork == null ? null : connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(1);
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean d(Context context) {
        return new File(context.getFilesDir(), "adb-da-ghep").exists();
    }

    public static byte[] e(int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(i2);
        int length = bArr.length;
        if (length < 128) {
            byteArrayOutputStream.write(length);
        } else {
            byte[] byteArray = BigInteger.valueOf(length).toByteArray();
            int i3 = (byteArray.length <= 1 || byteArray[0] != 0) ? 0 : 1;
            byteArrayOutputStream.write(128 | (byteArray.length - i3));
            byteArrayOutputStream.write(byteArray, i3, byteArray.length - i3);
        }
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] f(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = fileInputStream.read(bArr, i2, length - i2);
                if (i3 >= 0) {
                    i2 += i3;
                }
            }
            return bArr;
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void g(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        try {
            fileOutputStream.write(bArr);
        } finally {
            fileOutputStream.close();
        }
    }

    public static synchronized void h(Context context, boolean z) {
        try {
            if (l == null) {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    return;
                }
                WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock("cs-mdns");
                l = multicastLockCreateMulticastLock;
                multicastLockCreateMulticastLock.setReferenceCounted(false);
            }
            if (z && !l.isHeld()) {
                l.acquire();
            } else if (!z && l.isHeld()) {
                l.release();
            }
        } catch (Throwable unused) {
        }
    }

    public static int i(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "adb_wifi_enabled", -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static synchronized z j(Context context) {
        if (b != null) {
            return b;
        }
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, "adb-khoa.der");
        File file2 = new File(filesDir, "adb-chung.der");
        if (file.exists() && file2.exists()) {
            try {
                b = new z(KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(f(file))), CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(f(file2))));
                return b;
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        Certificate certificateS = s(keyPairGenerateKeyPair.getPublic(), keyPairGenerateKeyPair.getPrivate());
        g(file, keyPairGenerateKeyPair.getPrivate().getEncoded());
        g(file2, certificateS.getEncoded());
        b = new z(keyPairGenerateKeyPair.getPrivate(), certificateS);
        return b;
    }

    public static synchronized void k() {
        if (e) {
            return;
        }
        e = true;
        try {
            HiddenApiBypass.addHiddenApiExemptions("L");
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public static long l(Context context) {
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return 0L;
            }
            File file = new File(externalFilesDir, "helper-trangthai.txt");
            if (!file.exists()) {
                return 0L;
            }
            String strTrim = new String(f(file), "UTF-8").trim();
            int iIndexOf = strTrim.indexOf(32);
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            return Long.parseLong(strTrim);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static byte[] m(byte[]... bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte[] bArr2 : bArr) {
            byteArrayOutputStream.write(bArr2, 0, bArr2.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        r1 = android.provider.Settings.Global.getInt(r10.getContentResolver(), "adb_enabled", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        if (r(r11) != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(android.content.Context r10, defpackage.a0 r11) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0.n(android.content.Context, a0):boolean");
    }

    public static void o(Context context, String str, String str2) {
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                File file = new File(externalFilesDir, "helper-diag.txt");
                if (file.exists()) {
                    for (String str3 : new String(f(file), "UTF-8").split("\n")) {
                        String strTrim = str3.trim();
                        if (strTrim.length() != 0) {
                            u5.d("helper: " + strTrim);
                            if (strTrim.contains("LOI") || strTrim.contains("CHET")) {
                                str2 = strTrim;
                            }
                        }
                    }
                }
            }
            u5.d("cuoi: dangNoi=" + k1.f() + (h != null ? " loiChay=" + h : ""));
        } catch (Throwable unused) {
        }
        u5.c(context, str, str2);
    }

    public static synchronized a0 p(Context context) {
        try {
            if (a == null) {
                k();
                a = new a0(j(context));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static void q(Context context) {
        try {
            new File(context.getFilesDir(), "adb-da-ghep").delete();
        } catch (Throwable unused) {
        }
        h = null;
        u.d = null;
    }

    public static boolean r(a0 a0Var) {
        boolean zA;
        RuntimeException runtimeException;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Thread[] threadArr = new Thread[32];
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = i2 * 883;
            Thread thread = new Thread(new x(32768 + i3, Math.min(i3 + 33651, 61000), listSynchronizedList), ad.b(i2, "cs-quet-"));
            threadArr[i2] = thread;
            thread.start();
        }
        for (int i4 = 0; i4 < 32; i4++) {
            try {
                threadArr[i4].join(12000L);
            } catch (Throwable unused) {
            }
        }
        ArrayList arrayList = new ArrayList(listSynchronizedList);
        Collections.sort(arrayList);
        u5.d("quet loopback: " + arrayList.size() + " cong mo");
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            Integer num = (Integer) obj;
            i5++;
            if (i5 > 24) {
                break;
            }
            try {
                a0Var.setHostAddress("127.0.0.1");
            } finally {
                if (!zA) {
                }
            }
            if (a0Var.connect("127.0.0.1", num.intValue())) {
                i = "127.0.0.1";
                j = num.intValue();
                u5.d("QUET: noi duoc qua 127.0.0.1:" + num);
                return true;
            }
            continue;
        }
        return false;
    }

    public static Certificate s(PublicKey publicKey, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte[] bArrE = e(48, m(c, new byte[]{5, 0}));
        byte[] bArrE2 = e(48, e(49, e(48, m(d, e(12, "CarStream".getBytes("UTF-8"))))));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrE3 = e(48, m(e(160, e(2, BigInteger.valueOf(2L).toByteArray())), e(2, new BigInteger(64, new SecureRandom()).abs().toByteArray()), bArrE, bArrE2, e(48, m(e(23, simpleDateFormat.format(new Date(jCurrentTimeMillis - 86400000)).getBytes("UTF-8")), e(23, simpleDateFormat.format(new Date(jCurrentTimeMillis + 946080000000L)).getBytes("UTF-8")))), bArrE2, publicKey.getEncoded()));
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(bArrE3);
        return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(e(48, m(bArrE3, bArrE, e(3, m(new byte[]{0}, signature.sign()))))));
    }

    public static boolean t(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                return wifiManager.isWifiEnabled();
            }
        } catch (Throwable unused) {
        }
        return c(context);
    }
}
