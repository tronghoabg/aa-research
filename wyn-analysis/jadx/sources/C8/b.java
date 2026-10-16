package C8;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1907a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1908b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1909c;

    public b(String str, long j8, long j10) {
        AbstractC1732v.f(str);
        this.f1907a = str;
        this.f1909c = j8;
        this.f1908b = j10;
    }

    public static b a(a aVar) {
        long jD;
        AbstractC1732v.i(aVar);
        try {
            jD = (long) (Double.parseDouble(aVar.f1906b.replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map mapC = S3.f.C(aVar.f1905a);
            jD = 1000 * (d("exp", mapC) - d("iat", mapC));
        }
        return new b(aVar.f1905a, jD, System.currentTimeMillis());
    }

    public static b b(String str) {
        AbstractC1732v.i(str);
        Map mapC = S3.f.C(str);
        long jD = d("iat", mapC);
        return new b(str, (d("exp", mapC) - jD) * 1000, jD * 1000);
    }

    public static b c(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e7) {
            Log.e("C8.b", "Could not deserialize token: " + e7.getMessage());
            return null;
        }
    }

    public static long d(String str, Map map) {
        AbstractC1732v.i(map);
        AbstractC1732v.f(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
