package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Base64;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.core.license.NativeGuard;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class p9 {
    public static volatile byte[] c;
    public static volatile String d;
    public static volatile boolean e;
    public static boolean i;
    public static boolean j;
    public static volatile boolean k;
    public static volatile boolean l;
    public static final String[] a = {"yt_adblock", "yt_hide_header", "yt_nav", "yt_open_first", "yt_prefer_h264", "yt_sheet_bridge", "yt_sponsorblock", "yt_autofull", "yt_nonstop", "yt_chrome", "yt_mini", "tt_clean", "tt_nav", "vtv_adblock", "vtv_autofull", "vtv_channels", "vtv_clean", "vtv_consent", "vtv_portrait", "iptv_page", "media_page", "web_input", "playstate", "dpad", "fpt_core", "fpt_adblock", "fpt_clean", "fpt_gon", "fpt_nav", "fpt_player", "fpt_touch"};
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Set f = Collections.synchronizedSet(new HashSet());
    public static final ConcurrentHashMap g = new ConcurrentHashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor();

    public static byte[] a(String str, String str2, boolean z) throws IOException, o9 {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ad.c(a6.a, xc.b("ZAwo7C3sUIh26Tg="))).openConnection();
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(6000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(("{\"token\":\"" + str + "\",\"name\":\"" + str2 + "\"" + (z ? ",\"skv\":1" : "") + "}").getBytes("UTF-8"));
        outputStream.close();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            httpURLConnection.disconnect();
            if (responseCode != 426) {
                return null;
            }
            throw new o9();
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        inputStream.close();
        httpURLConnection.disconnect();
        if (!l) {
            l = true;
        }
        return Base64.decode(byteArray, 0);
    }

    public static void b(Context context, String str, byte[] bArr) {
        try {
            File fileC = c(context, str);
            File parentFile = fileC.getParentFile();
            parentFile.mkdirs();
            File file = new File(parentFile, str + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            if (file.renameTo(fileC)) {
                b.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static File c(Context context, String str) {
        return new File(new File(context.getFilesDir(), "vault2"), ad.c(str, ".bin"));
    }

    public static String d(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, 12);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, 12, bArr2.length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArrCopyOfRange));
        return new String(cipher.doFinal(bArrCopyOfRange2), "UTF-8");
    }

    public static void e(Context context, String str, boolean z) {
        if (str.matches("[a-z0-9_]{1,40}")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File fileC = c(context, str);
            if (z || !fileC.exists() || jCurrentTimeMillis - fileC.lastModified() >= 60000) {
                Long l2 = (Long) g.get(str);
                if ((z || l2 == null || jCurrentTimeMillis - l2.longValue() >= 60000) && f.add(str)) {
                    h.execute(new h(context, str, 13, false));
                }
            }
        }
    }

    public static String f(CarScreen carScreen, String str) {
        byte[] byteArray;
        File fileC;
        ConcurrentHashMap concurrentHashMap = b;
        int i2 = 0;
        while (true) {
            if (i2 >= 31) {
                break;
            }
            if (a[i2].equals(str)) {
                try {
                    String str2 = (String) concurrentHashMap.get(str);
                    if (str2 != null) {
                        return str2;
                    }
                    byte[] bArrH = h(carScreen);
                    if (!i) {
                        i = true;
                    }
                    if (bArrH == null) {
                        bArrH = g(carScreen);
                    }
                    if (bArrH != null) {
                        try {
                            fileC = c(carScreen, str);
                        } catch (Throwable unused) {
                        }
                        if (!fileC.exists() || fileC.length() < 28) {
                            byteArray = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileC);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i3 = fileInputStream.read(bArr);
                                if (i3 <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i3);
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            fileInputStream.close();
                        }
                        if (byteArray == null) {
                            e(carScreen.getApplicationContext(), str, false);
                            return null;
                        }
                        try {
                            String strD = d(bArrH, byteArray);
                            concurrentHashMap.put(str, strD);
                            return strD;
                        } catch (Throwable unused2) {
                            byte[] bArrG = g(carScreen);
                            if (bArrG != null && !Arrays.equals(bArrG, bArrH)) {
                                try {
                                    String strD2 = d(bArrG, byteArray);
                                    concurrentHashMap.put(str, strD2);
                                    if (!j) {
                                        j = true;
                                    }
                                    return strD2;
                                } catch (Throwable unused3) {
                                    c(carScreen, str).delete();
                                    e(carScreen.getApplicationContext(), str, false);
                                    return null;
                                }
                            }
                            c(carScreen, str).delete();
                            e(carScreen.getApplicationContext(), str, false);
                            return null;
                        }
                    }
                } catch (Throwable unused4) {
                }
            } else {
                i2++;
            }
        }
        return null;
    }

    public static byte[] g(CarScreen carScreen) {
        String strReplaceAll;
        try {
            strReplaceAll = xc.l(carScreen).getString(xc.h("licenseKey"), "").trim().toUpperCase().replaceAll("[^A-Z0-9]", "");
        } catch (Throwable unused) {
        }
        if (strReplaceAll.isEmpty()) {
            c = null;
            d = null;
            return null;
        }
        byte[] bArr = c;
        if (bArr != null && strReplaceAll.equals(d)) {
            return bArr;
        }
        byte[] bArrC = NativeGuard.c(c5.c().getBytes("UTF-8"), strReplaceAll.getBytes("UTF-8"));
        if (bArrC == null || bArrC.length != 32) {
            if (!e) {
                e = true;
            }
            return null;
        }
        c = bArrC;
        d = strReplaceAll;
        return bArrC;
    }

    public static byte[] h(Context context) {
        String strP;
        try {
            String strG = xc.g(context, "scriptKey", "");
            if (!strG.isEmpty() && (strP = ec.p(strG)) != null && strP.length() == 64) {
                byte[] bArr = new byte[32];
                for (int i2 = 0; i2 < 32; i2++) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) Integer.parseInt(strP.substring(i3, i3 + 2), 16);
                }
                return bArr;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(ContextWrapper contextWrapper) {
        String str;
        boolean z;
        String[] strArr;
        Context applicationContext = contextWrapper.getApplicationContext();
        try {
            str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = "";
        }
        if (str.isEmpty() || str.equals(xc.g(applicationContext, "vaultVer", ""))) {
            z = false;
        } else {
            xc.p(applicationContext, "vaultVer", str);
            z = true;
        }
        int i2 = 0;
        while (true) {
            strArr = a;
            if (i2 >= 31) {
                try {
                    break;
                } catch (Throwable th) {
                    String.valueOf(th);
                    return;
                }
            }
            e(applicationContext, strArr[i2], z);
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < 31; i3++) {
            String str2 = strArr[i3];
            if (!c(applicationContext, str2).exists()) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(str2);
            }
        }
        sb.length();
    }
}
