package defpackage;

import android.util.Log;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class ahkw {
    public static JSONObject a(JSONObject jSONObject, String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(a.bq(str, "Failed adding a default object for key [", "]"), e);
        }
    }

    public static String b(String str) {
        return "cn_".concat(String.valueOf(str));
    }

    public static void c(String str, String str2, Object... objArr) {
        if (i(str, 3)) {
            Throwable thK = k(objArr);
            String strJ = j(str2, thK, objArr);
            String strB = b(str);
            if (thK != null) {
                Log.d(strB, strJ, thK);
            } else {
                Log.d(strB, strJ);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        Log.e(b(str), str2, th);
    }

    public static void e(String str, String str2) {
        Log.i(b(str), str2);
    }

    public static void f(String str, String str2, Throwable th) {
        Log.i(b(str), str2, th);
    }

    public static void g(String str, String str2, Object... objArr) {
        if (i(str, 2)) {
            Throwable thK = k(objArr);
            String strJ = j(str2, thK, objArr);
            String strB = b(str);
            if (thK != null) {
                Log.v(strB, strJ, thK);
            } else {
                Log.v(strB, strJ);
            }
        }
    }

    public static void h(String str, String str2) {
        Log.w(b(str), str2);
    }

    public static boolean i(String str, int i) {
        return Log.isLoggable(str, i);
    }

    private static String j(String str, Throwable th, Object[] objArr) {
        return (th != null || objArr.length <= 0) ? str : String.format(Locale.US, str, objArr);
    }

    private static Throwable k(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }
}
