package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9958d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final long f9959e;

    /* renamed from: a, reason: collision with root package name */
    final String f9960a;

    /* renamed from: b, reason: collision with root package name */
    final String f9961b;

    /* renamed from: c, reason: collision with root package name */
    final long f9962c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f9959e = 604800000L;
    }

    private m(String str, String str2, long j2) {
        this.f9960a = str;
        this.f9961b = str2;
        this.f9962c = j2;
    }

    static m a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new m(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new m(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e2.toString()));
            return null;
        }
    }

    final boolean b(String str) {
        return System.currentTimeMillis() > this.f9962c + f9959e || !str.equals(this.f9961b);
    }
}
