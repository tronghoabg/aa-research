package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class u5 {
    public static final Object a = new Object();
    public static final ArrayList b = new ArrayList();
    public static final ArrayList c = new ArrayList();
    public static long d = SystemClock.elapsedRealtime();
    public static boolean e;

    public static void a() {
        synchronized (a) {
            e = false;
            d("=== bat ===");
        }
    }

    public static JSONObject b(Context context, String str, String str2) throws JSONException {
        String str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("loai", "launcher");
        jSONObject.put("token", ec.o(context));
        jSONObject.put("hwid", c5.c());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("hang", Build.MANUFACTURER);
        jSONObject2.put("model", Build.MODEL);
        jSONObject2.put("sdk", Build.VERSION.SDK_INT);
        jSONObject2.put("rom", Build.DISPLAY);
        int i = 0;
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str3 = "?";
        }
        jSONObject2.put("ver", str3);
        jSONObject.put("may", jSONObject2);
        jSONObject.put("ket_qua", str);
        if (str2 != null) {
            jSONObject.put("buoc_hong", str2);
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (a) {
            while (true) {
                try {
                    ArrayList arrayList = c;
                    if (i < arrayList.size()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("t", b.get(i));
                        jSONObject3.put("e", arrayList.get(i));
                        jSONArray.put(jSONObject3);
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jSONObject.put("su_kien", jSONArray);
        return jSONObject;
    }

    public static void c(Context context, String str, String str2) {
        synchronized (a) {
            if (!e) {
                ArrayList arrayList = c;
                if (!arrayList.isEmpty()) {
                    e = true;
                    try {
                        JSONObject jSONObjectB = b(context, str, str2);
                        arrayList.clear();
                        b.clear();
                        d = SystemClock.elapsedRealtime();
                        new Thread(new f(jSONObjectB, 21), "cnt-launcherlog").start();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static void d(String str) {
        synchronized (a) {
            try {
                if (str == null) {
                    return;
                }
                while (true) {
                    ArrayList arrayList = c;
                    if (arrayList.size() < 400) {
                        b.add(Long.valueOf(SystemClock.elapsedRealtime() - d));
                        arrayList.add(str);
                        return;
                    } else {
                        arrayList.remove(0);
                        b.remove(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
