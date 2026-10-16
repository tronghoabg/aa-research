package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.ProjectionService;
import com.carstream.tech.core.speed.SpeedBubble;
import com.carstream.tech.core.speed.SpeedCard;
import com.carstream.tech.core.speed.SpeedDial;
import com.carstream.tech.core.speed.SpeedLiquid;
import com.carstream.tech.core.speed.SpeedNeon;
import com.carstream.tech.core.speed.SpeedPill;
import com.carstream.tech.core.speed.SpeedRail;
import com.carstream.tech.core.speed.SpeedRuler;
import com.carstream.tech.core.speed.SpeedSpokes;
import com.carstream.tech.phone.MainActivity;
import com.google.android.gms.car.CarActivityServiceProxy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class w1 {
    public static MediaPlayer a;
    public static Class c;
    public static String e;
    public static final String[] b = {"com.google.android.projection.gearhead", "com.google.android.projection.bumblebee"};
    public static final t8[] d = {new t8("pill", "Thanh ngang"), new t8("card", "Thẻ cụm"), new t8("dial", "Đồng hồ kim"), new t8("neon", "Neon"), new t8("rail", "Cột dọc"), new t8("spokes", "Vòng nan"), new t8("liquid", "Mực dâng"), new t8("ruler", "Thước ngắm")};

    public static String a(String str) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setConnectTimeout(10000);
                httpURLConnection2.setReadTimeout(20000);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setRequestProperty("User-Agent", "VLC/3.0.20 LibVLC/3.0.20");
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode >= 400) {
                    throw new Exception("HTTP " + responseCode);
                }
                InputStream inputStream = httpURLConnection2.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i = 0;
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 <= 0 || (i = i + i2) > 8388608) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                inputStream.close();
                String string = byteArrayOutputStream.toString("UTF-8");
                httpURLConnection2.disconnect();
                return string;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return "tệp tải về rỗng";
        }
        String lowerCase = strTrim.toLowerCase();
        if (lowerCase.startsWith("<!doctype") || lowerCase.startsWith("<html") || lowerCase.startsWith("<?xml")) {
            return "đường dẫn trả về một trang web, không phải tệp M3U";
        }
        if (strTrim.contains("#EXTINF")) {
            return "có dòng kênh nhưng không có địa chỉ http nào đọc được";
        }
        String strTrim2 = strTrim.replaceAll("\\s+", " ").trim();
        if (strTrim2.length() > 60) {
            strTrim2 = ad.c(strTrim2.substring(0, 60), "…");
        }
        return ad.d("đây không phải danh sách M3U — tải về được: “", strTrim2, "”");
    }

    public static int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static void d(byte[] bArr, long[] jArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            jArr[i2] = (c(i + 4, bArr) & 4294967295L) | ((c(i, bArr) & 4294967295L) << 32);
            i += 8;
        }
    }

    public static TextView e(MainActivity mainActivity, String str, int i, View.OnClickListener onClickListener) {
        TextView textView = new TextView(mainActivity);
        textView.setText(str);
        textView.setTextSize(2, 16.0f);
        textView.setTextColor(d8.k());
        textView.setGravity(17);
        textView.setBackground(k1.t(i, k(mainActivity, 14)));
        textView.setOnClickListener(onClickListener);
        textView.setClickable(true);
        k1.B(textView, i, false, k(mainActivity, 14));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, k(mainActivity, 52));
        layoutParams.topMargin = k(mainActivity, 14);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public static String f(CarScreen carScreen) throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        File file = new File(carScreen.getFilesDir(), "iptv.json");
        if (!file.exists()) {
            return "[]";
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) Math.min(randomAccessFile.length(), 8388608L)];
                randomAccessFile.readFully(bArr);
                String str = new String(bArr, "UTF-8");
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                }
                return str;
            } catch (Exception unused2) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 == null) {
                    return "[]";
                }
                try {
                    randomAccessFile2.close();
                    return "[]";
                } catch (Exception unused3) {
                    return "[]";
                }
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    public static byte[] g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static SpeedBubble h(Context context, String str) {
        return "card".equals(str) ? new SpeedCard(context) : "dial".equals(str) ? new SpeedDial(context) : "neon".equals(str) ? new SpeedNeon(context) : "rail".equals(str) ? new SpeedRail(context) : "spokes".equals(str) ? new SpeedSpokes(context) : "liquid".equals(str) ? new SpeedLiquid(context) : "ruler".equals(str) ? new SpeedRuler(context) : new SpeedPill(context);
    }

    public static String i(String str) {
        return (str != null ? str.replace("; wv", "").replace("Version/4.0 ", "") : "").replaceFirst("\\(Linux; Android[^)]*\\)", "(Windows NT 10.0; Win64; x64)").replace(" Mobile Safari", " Safari");
    }

    public static void j() {
        MediaPlayer mediaPlayer = a;
        a = null;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Throwable unused) {
            }
            try {
                mediaPlayer.release();
            } catch (Throwable unused2) {
            }
        }
    }

    public static int k(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r5.contains("network") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject l(android.content.Context r10) {
        /*
            java.lang.String r0 = "ok"
            java.lang.String r1 = "network"
            java.lang.String r2 = "gps"
            java.lang.String r3 = "nofix"
            boolean r4 = defpackage.cb.b(r10)     // Catch: java.lang.Throwable -> Ldd
            if (r4 != 0) goto L15
            java.lang.String r10 = "denied"
            org.json.JSONObject r10 = v(r10)     // Catch: java.lang.Throwable -> Ldd
            return r10
        L15:
            java.lang.String r4 = "location"
            java.lang.Object r10 = r10.getSystemService(r4)     // Catch: java.lang.Throwable -> Ldd
            android.location.LocationManager r10 = (android.location.LocationManager) r10     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r4 = "nohw"
            if (r10 != 0) goto L26
            org.json.JSONObject r10 = v(r4)     // Catch: java.lang.Throwable -> Ldd
            return r10
        L26:
            java.util.List r5 = r10.getAllProviders()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L39
            boolean r6 = r5.contains(r2)     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto L3e
            boolean r5 = r5.contains(r1)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L39
            goto L3e
        L39:
            org.json.JSONObject r10 = v(r4)     // Catch: java.lang.Throwable -> Ldd
            return r10
        L3e:
            r4 = 0
            r5 = 1
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L59
            r7 = 28
            if (r6 < r7) goto L4b
            boolean r5 = defpackage.d.t(r10)     // Catch: java.lang.Throwable -> L59
            goto L59
        L4b:
            boolean r6 = r10.isProviderEnabled(r2)     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L59
            boolean r6 = r10.isProviderEnabled(r1)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L58
            goto L59
        L58:
            r5 = r4
        L59:
            if (r5 != 0) goto L62
            java.lang.String r10 = "off"
            org.json.JSONObject r10 = v(r10)     // Catch: java.lang.Throwable -> Ldd
            return r10
        L62:
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> Ldd
            r2 = 0
        L67:
            r5 = 2
            if (r4 >= r5) goto L85
            r5 = r1[r4]     // Catch: java.lang.Throwable -> Ldd
            android.location.Location r5 = r10.getLastKnownLocation(r5)     // Catch: java.lang.SecurityException -> L82 java.lang.Throwable -> Ldd
            if (r5 != 0) goto L73
            goto L82
        L73:
            if (r2 == 0) goto L81
            long r6 = r5.getTime()     // Catch: java.lang.Throwable -> Ldd
            long r8 = r2.getTime()     // Catch: java.lang.Throwable -> Ldd
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L82
        L81:
            r2 = r5
        L82:
            int r4 = r4 + 1
            goto L67
        L85:
            if (r2 != 0) goto L8c
            org.json.JSONObject r10 = v(r3)     // Catch: java.lang.Throwable -> Ldd
            return r10
        L8c:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldd
            r10.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "state"
            r10.put(r1, r0)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "lat"
            double r4 = r2.getLatitude()     // Catch: java.lang.Throwable -> Ldd
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)     // Catch: java.lang.Throwable -> Ldd
            double r4 = (double) r4     // Catch: java.lang.Throwable -> Ldd
            double r4 = r4 / r6
            r10.put(r1, r4)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "lon"
            double r4 = r2.getLongitude()     // Catch: java.lang.Throwable -> Ldd
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)     // Catch: java.lang.Throwable -> Ldd
            double r4 = (double) r4     // Catch: java.lang.Throwable -> Ldd
            double r4 = r4 / r6
            r10.put(r1, r4)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "t"
            long r4 = r2.getTime()     // Catch: java.lang.Throwable -> Ldd
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r10.put(r1, r4)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "acc"
            float r2 = r2.getAccuracy()     // Catch: java.lang.Throwable -> Ldd
            int r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> Ldd
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = defpackage.w1.e     // Catch: java.lang.Throwable -> Ldd
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto Lda
            goto Ldc
        Lda:
            defpackage.w1.e = r0     // Catch: java.lang.Throwable -> Ldd
        Ldc:
            return r10
        Ldd:
            org.json.JSONObject r10 = v(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1.l(android.content.Context):org.json.JSONObject");
    }

    public static void m(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void n(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static String o(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e2);
                    string = "<" + str2 + " threw " + e2.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int p(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void q(long j, byte[] bArr, int i) {
        m(bArr, (int) (j >>> 32), i);
        m(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static CarActivityServiceProxy r(ProjectionService projectionService) throws IllegalAccessException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (c == null) {
            Context applicationContext = projectionService.getApplicationContext();
            Exception e2 = null;
            for (int i = 0; i < 2; i++) {
                String str = b[i];
                if (!applicationContext.getPackageName().equals(str)) {
                    try {
                        applicationContext = applicationContext.createPackageContext(str, 3);
                    } catch (Exception e3) {
                        e2 = e3;
                    }
                }
                Class<?> clsLoadClass = applicationContext.getClassLoader().loadClass("com.google.android.gms.car.DynamicApiFactory");
                clsLoadClass.getMethod("initialize", Context.class).invoke(null, applicationContext);
                c = clsLoadClass;
                applicationContext.getPackageName();
            }
            throw new IllegalStateException("Khong tim thay app Android Auto tren may nay", e2);
        }
        return (CarActivityServiceProxy) c.getMethod("newCarActivityServiceProxy", Context.class).invoke(null, projectionService);
    }

    public static Uri s(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("chuong", "raw", context.getPackageName());
            if (identifier != 0) {
                return Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
            }
        } catch (Throwable unused) {
        }
        try {
            Uri defaultUri = RingtoneManager.getDefaultUri(1);
            return defaultUri != null ? defaultUri : RingtoneManager.getDefaultUri(2);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void t(MainActivity mainActivity, c1 c1Var) {
        Context applicationContext = mainActivity.getApplicationContext();
        ArrayList arrayListZ = z(applicationContext);
        Handler handler = new Handler(Looper.getMainLooper());
        if (arrayListZ.isEmpty()) {
            handler.post(new f(c1Var, 20));
        } else {
            new Thread(new s5(arrayListZ, applicationContext, handler, c1Var), "iptv-tai").start();
        }
    }

    public static void u(Context context, ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str != null && !str.trim().isEmpty()) {
                jSONArray.put(str.trim());
            }
        }
        xc.p(context, "iptvUrls", jSONArray.toString());
    }

    public static JSONObject v(String str) {
        if (!str.equals(e)) {
            e = str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", str);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String w(int i) {
        return i == 6 ? "chuong" : i == 4 ? "bao-thuc" : i == 12 ? "dan-duong" : i == 16 ? "tro-ly" : i == 1 ? "nhac" : String.valueOf(i);
    }

    public static String x(String str) {
        try {
            String strSubstring = str.substring(str.indexOf("//") + 2);
            int iIndexOf = strSubstring.indexOf(47);
            if (iIndexOf > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            return strSubstring.startsWith("www.") ? strSubstring.substring(4) : strSubstring;
        } catch (Exception unused) {
            return str;
        }
    }

    public static TextView y(Activity activity, String str, int i, int i2) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(2, i);
        textView.setTextColor(i2);
        textView.setTypeface(d8.d(0, activity, "fonts/BeVietnamPro-Regular.ttf"));
        textView.setIncludeFontPadding(true);
        textView.setPadding(0, k(activity, 3), 0, k(activity, 3));
        return textView;
    }

    public static ArrayList z(Context context) {
        ArrayList arrayList = new ArrayList();
        String strG = xc.g(context, "iptvUrls", "");
        if (strG == null || strG.trim().isEmpty()) {
            String string = context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getString(xc.h("iptvUrl"), "");
            if (string != null && !string.trim().isEmpty()) {
                arrayList.add(string.trim());
                u(context, arrayList);
            }
        } else {
            try {
                JSONArray jSONArray = new JSONArray(strG);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String strTrim = jSONArray.optString(i, "").trim();
                    if (!strTrim.isEmpty() && !arrayList.contains(strTrim)) {
                        arrayList.add(strTrim);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
