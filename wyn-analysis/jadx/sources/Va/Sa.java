package Va;

import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Sa {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13687c = {269, 268, 272, 273, 225, 254, 274, 262, 257};

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f13688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13689b;

    public Sa(JSONObject jSONObject, String str) {
        this.f13688a = jSONObject;
        this.f13689b = str;
    }

    public static String a(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13687c;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 157);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
