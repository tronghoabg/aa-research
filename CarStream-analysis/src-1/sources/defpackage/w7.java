package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class w7 {
    public static volatile int a = -1;
    public static volatile boolean b = false;
    public static volatile String c = "";
    public static volatile String d = "";
    public static volatile long e = 0;
    public static volatile String f = "[]";
    public static volatile String g = "[]";
    public static volatile int h = 0;
    public static volatile boolean i = false;
    public static volatile long r;
    public static volatile List j = new ArrayList();
    public static volatile boolean k = false;
    public static final CopyOnWriteArrayList l = new CopyOnWriteArrayList();
    public static final String[][] m = {new String[]{"widget", "VietMap", "VietMap", "vn.vietmap.live"}, new String[]{"gofa", "Gofa", "Gofa", "com.gofa.mobile"}, new String[]{"waze", "Waze", "Waze", "com.waze"}, new String[]{"wyn", "Wyn", "Wyn", "com.wynauto.wyn"}, new String[]{"carstream", "CarStream", "CarStream", "com.carstream.tech"}, new String[]{"frida", "Broadcast frida", "VietMap", "vn.vietmap.live"}};
    public static final Pattern n = Pattern.compile("imageId=(\\w+|null),\\s*distance=(-?\\d+).*?imageBase64Data=(null|[A-Za-z0-9+/=]+)");
    public static final String[] o = new String[2];
    public static final List[] p = new List[2];
    public static final HashMap q = new HashMap();
    public static final ConcurrentHashMap s = new ConcurrentHashMap();
    public static final ConcurrentHashMap t = new ConcurrentHashMap();

    public static void a(v7 v7Var) {
        if (v7Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = l;
            if (copyOnWriteArrayList.contains(v7Var)) {
                return;
            }
            copyOnWriteArrayList.add(v7Var);
        }
    }

    public static String b(String str, String str2) {
        if (str != null && !str.isEmpty() && !"null".equals(str)) {
            return str;
        }
        if (str2 == null || str2.length() <= 8 || "null".equals(str2)) {
            return null;
        }
        return "b" + str2.length() + "#" + str2.hashCode();
    }

    public static void c(List list, int i2) {
        i = true;
        a = i2;
        b = false;
        if (list == null) {
            list = new ArrayList();
        }
        j = list;
        e = System.currentTimeMillis();
        h++;
        f();
    }

    public static Bitmap d(String str) {
        if (str != null && !str.isEmpty() && !"null".equals(str)) {
            HashMap map = q;
            Bitmap bitmap = (Bitmap) map.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                if (bitmapDecodeByteArray != null) {
                    if (map.size() >= 24) {
                        map.clear();
                    }
                    map.put(str, bitmapDecodeByteArray);
                }
                return bitmapDecodeByteArray;
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        return null;
    }

    public static void e() {
        a = -1;
        b = false;
        c = "";
        d = "";
        f = "[]";
        g = "[]";
        j = new ArrayList();
        i = false;
        h = 0;
        e = 0L;
        f();
    }

    public static void f() {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            try {
                ((v7) it.next()).a();
            } catch (Exception unused) {
            }
        }
    }

    public static int g() {
        if (a > 0 && System.currentTimeMillis() - e <= 30000) {
            return a;
        }
        return -1;
    }

    public static int h(u7 u7Var) {
        long[] jArr;
        if (u7Var == null || u7Var.b <= 0) {
            return 0;
        }
        if (i) {
            return u7Var.b;
        }
        int i2 = cb.d;
        if (i2 <= 0) {
            return u7Var.b;
        }
        long j2 = r;
        String str = u7Var.d;
        if (str != null && (jArr = (long[]) s.get(str)) != null) {
            j2 = jArr[1];
        }
        return Math.max(0, u7Var.b - ((int) (((i2 / 3.6f) * (SystemClock.elapsedRealtime() - j2)) / 1000.0f)));
    }

    public static String i(ContextWrapper contextWrapper, String str) {
        if ("waze".equals(str)) {
            return yc.a(contextWrapper);
        }
        for (String[] strArr : m) {
            if (strArr[0].equals(str)) {
                return strArr[3];
            }
        }
        return "";
    }

    public static List j(String str) throws JSONException {
        ArrayList arrayList;
        if (str == null || str.isEmpty() || "null".equals(str) || "[]".equals(str)) {
            return new ArrayList();
        }
        int i2 = 0;
        while (true) {
            List[] listArr = p;
            String[] strArr = o;
            if (i2 >= 2) {
                if (str.contains("\"imageId\"") || str.contains("\"distance\"")) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i3);
                            u7 u7Var = new u7();
                            u7Var.a = jSONObject.isNull("imageId") ? null : jSONObject.optString("imageId", null);
                            u7Var.b = jSONObject.optInt("distance", 0);
                            String strOptString = jSONObject.isNull("imageBase64") ? null : jSONObject.optString("imageBase64", null);
                            u7Var.c = d(strOptString);
                            u7Var.d = b(u7Var.a, strOptString);
                            arrayList2.add(u7Var);
                        }
                    } catch (Exception e2) {
                        String.valueOf(e2);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = new ArrayList();
                    Matcher matcher = n.matcher(str);
                    while (matcher.find()) {
                        u7 u7Var2 = new u7();
                        u7Var2.a = "null".equals(matcher.group(1)) ? null : matcher.group(1);
                        try {
                            u7Var2.b = Integer.parseInt(matcher.group(2));
                        } catch (NumberFormatException unused) {
                            u7Var2.b = 0;
                        }
                        String strGroup = "null".equals(matcher.group(3)) ? null : matcher.group(3);
                        u7Var2.c = d(strGroup);
                        u7Var2.d = b(u7Var2.a, strGroup);
                        arrayList.add(u7Var2);
                    }
                }
                strArr[1] = strArr[0];
                listArr[1] = listArr[0];
                strArr[0] = str;
                listArr[0] = arrayList;
                return arrayList;
            }
            if (str.equals(strArr[i2])) {
                return listArr[i2];
            }
            i2++;
        }
    }

    public static String[] k(Context context) {
        String strG = xc.g(context, "vietmapSource", "widget");
        String[][] strArr = m;
        for (String[] strArr2 : strArr) {
            if (strArr2[0].equals(strG)) {
                return strArr2;
            }
        }
        return strArr[0];
    }

    public static int l() {
        if (h == 0) {
            return 1;
        }
        return System.currentTimeMillis() - e > 30000 ? 2 : 3;
    }
}
