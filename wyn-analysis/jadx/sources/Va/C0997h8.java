package Va;

import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.List;
import org.json.JSONObject;

/* renamed from: Va.h8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0997h8 {

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f14247g = {28000, 58323, 28696, 49483, 55504, 22123, 50585, 29938, 57913, 4450, 'p', 36575, 7438, 44123, 14997, 51653, 'a', 36573, 7432, 44115, 14990, 51679, 22528, 59227, 30101, 1245, 'v', 36567, 7449, 44109, 15038, 51679, 22552, 59206, 30101, 1244, 'w', 36571, 7454, 44140, 14993, 51667, 22531, 59201, 30135, 1227, 37656, 8798, 45197, 16340};

    /* renamed from: h, reason: collision with root package name */
    public static int f14248h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14249i = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f14250a;

    /* renamed from: b, reason: collision with root package name */
    public ISAdQualityAdType f14251b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f14252c;

    /* renamed from: d, reason: collision with root package name */
    public List f14253d;

    /* renamed from: e, reason: collision with root package name */
    public String f14254e;

    /* renamed from: f, reason: collision with root package name */
    public String f14255f;

    public static String b(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14247g[i5 + i11] ^ (i11 * 2153064368548843198L)) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final JSONObject a() {
        int i5 = f14248h + 27;
        int i10 = i5 % 128;
        f14249i = i10;
        if (i5 % 2 == 0) {
            int i11 = 0 / 0;
        }
        f14248h = (i10 + 37) % 128;
        return this.f14252c;
    }
}
