package W9;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final long f15393d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f15394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15396c;

    public v(String str, String str2, long j8) {
        this.f15394a = str;
        this.f15395b = str2;
        this.f15396c = j8;
    }

    public static String a(long j8, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j8);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
            return null;
        }
    }

    public static v b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new v(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new v(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e7) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
            return null;
        }
    }
}
