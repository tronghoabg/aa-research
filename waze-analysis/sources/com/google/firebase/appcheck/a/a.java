package com.google.firebase.appcheck.a;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.api.internal.av;
import com.google.e.a.e.ai;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.firebase.appcheck.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8834a = "com.google.firebase.appcheck.a.a";

    /* renamed from: b, reason: collision with root package name */
    private final String f8835b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8836c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8837d;

    a(String str, long j2, long j3) {
        av.k(str);
        this.f8835b = str;
        this.f8837d = j2;
        this.f8836c = j3;
    }

    public static a e(String str) {
        av.m(str);
        Map mapA = com.google.firebase.appcheck.a.a.b.a(str);
        long jI = i(mapA, "iat");
        return new a(str, (i(mapA, "exp") - jI) * 1000, jI * 1000);
    }

    static a f(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new a(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e2) {
            Log.e(f8834a, "Could not deserialize token: ".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }

    public static a h(ai aiVar) {
        long jI;
        av.m(aiVar);
        try {
            jI = (long) (Double.parseDouble(aiVar.e().replace(CmcdData.STREAMING_FORMAT_SS, "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map mapA = com.google.firebase.appcheck.a.a.b.a(aiVar.f());
            jI = 1000 * (i(mapA, "exp") - i(mapA, "iat"));
        }
        return new a(aiVar.f(), jI, System.currentTimeMillis());
    }

    private static long i(Map map, String str) {
        av.m(map);
        av.k(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // com.google.firebase.appcheck.b
    public final long a() {
        return this.f8836c + this.f8837d;
    }

    @Override // com.google.firebase.appcheck.b
    public final String b() {
        return this.f8835b;
    }

    final long c() {
        return this.f8837d;
    }

    final long d() {
        return this.f8836c;
    }

    final String g() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.f8835b);
            jSONObject.put("receivedAt", this.f8836c);
            jSONObject.put("expiresIn", this.f8837d);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(f8834a, "Could not serialize token: ".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }
}
