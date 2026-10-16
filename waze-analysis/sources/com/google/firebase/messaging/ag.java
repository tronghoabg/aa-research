package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10130d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final long f10131e;

    /* renamed from: a, reason: collision with root package name */
    final String f10132a;

    /* renamed from: b, reason: collision with root package name */
    final String f10133b;

    /* renamed from: c, reason: collision with root package name */
    final long f10134c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f10131e = 604800000L;
    }

    private ag(String str, String str2, long j2) {
        this.f10132a = str;
        this.f10133b = str2;
        this.f10134c = j2;
    }

    static ag a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new ag(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ag(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e2.toString()));
            return null;
        }
    }

    final boolean b(String str) {
        return System.currentTimeMillis() > this.f10134c + f10131e || !str.equals(this.f10133b);
    }
}
