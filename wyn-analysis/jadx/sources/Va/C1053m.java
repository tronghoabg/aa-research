package Va;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1053m extends Ba {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f14375i = {'C', 133, 'z', '|', 127, 127, 134, '|', '|', 134, '}', '|', 134, '2', 'i', 'g', 'g', '5', 'o', ':', 's', 'i', 'b', 'd', 'c', 'a', 'b', 'g', '[', 182, 182, 177, 'z', 249, 255, 253, 242, 239, 246};

    /* renamed from: j, reason: collision with root package name */
    public static int f14376j = 0;
    public static int k = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0999ha f14381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1066n f14382h;

    public C1053m(C1066n c1066n, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z2, C0999ha c0999ha) {
        this.f14382h = c1066n;
        this.f14377c = str;
        this.f14378d = jSONObject;
        this.f14379e = jSONObject2;
        this.f14380f = z2;
        this.f14381g = c0999ha;
    }

    public static String d(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14375i, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.Ba
    public final void c() throws JSONException {
        String strIntern = d("\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 13, 19, 0}, false).intern();
        String str = this.f14377c;
        boolean zEquals = str.equals(strIntern);
        C1066n c1066n = this.f14382h;
        if (zEquals) {
            int i5 = f14376j + 77;
            k = i5 % 128;
            if (i5 % 2 == 0) {
                C1066n.d(c1066n);
                throw null;
            }
            C1066n.d(c1066n);
        }
        int i10 = C1066n.f14402n;
        C1066n.f14401m = (i10 + 29) % 128;
        int i11 = c1066n.f14406j;
        int i12 = (i10 + 5) % 128;
        C1066n.f14401m = i12;
        int i13 = i12 + 69;
        C1066n.f14402n = i13 % 128;
        c1066n.f14406j = i13 % 2 == 0 ? i11 % 1 : i11 + 1;
        JSONObject jSONObjectU = Ab.u(this.f14378d);
        jSONObjectU.put(d("\u0001\u0001\u0001\u0000", new int[]{13, 4, 0, 1}, false).intern(), str);
        jSONObjectU.put(d("\u0001\u0001", new int[]{17, 2, 6, 1}, true).intern(), i11);
        String strIntern2 = d("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{19, 9, 0, 0}, false).intern();
        JSONObject jSONObject = this.f14379e;
        if (jSONObject != null) {
            strIntern2 = jSONObject.optString(AbstractC1141sa.f14606a);
            String str2 = AbstractC1141sa.f14600U;
            jSONObjectU.put(str2, jSONObject.optString(str2, null));
        }
        if (TextUtils.isEmpty(strIntern2)) {
            f14376j = (k + 11) % 128;
            strIntern2 = d("\u0000\u0001\u0001\u0001", new int[]{28, 4, 72, 0}, false).intern();
            f14376j = (k + 17) % 128;
        }
        jSONObjectU.put(AbstractC1141sa.f14608b, strIntern2);
        String str3 = AbstractC1141sa.f14610c;
        if (!jSONObjectU.has(str3)) {
            jSONObjectU.put(str3, strIntern2);
        }
        JSONObject jSONObjectC = c1066n.c(jSONObjectU, this.f14380f, true, str.equals(d("\u0000\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{32, 7, 139, 2}, false).intern()));
        C1206y c1206y = new C1206y(7);
        c1206y.f14799e = this;
        c1206y.f14798d = jSONObjectC;
        Cb.j(c1206y);
    }
}
