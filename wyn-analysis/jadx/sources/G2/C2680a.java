package g2;

import java.util.HashMap;
import java.util.Locale;
import ka.AbstractC3256n;
import l8.j0;
import org.apache.tika.utils.StringUtils;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2680a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35554a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35555b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35557d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f35558e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f35559f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f35560g;

    /* renamed from: h, reason: collision with root package name */
    public String f35561h;

    /* renamed from: i, reason: collision with root package name */
    public String f35562i;

    public C2680a(String str, int i5, String str2, int i10) {
        this.f35554a = str;
        this.f35555b = i5;
        this.f35556c = str2;
        this.f35557d = i10;
    }

    public static String b(int i5, int i10, int i11, String str) {
        int i12 = Q1.x.f9724a;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i5);
        sb2.append(StringUtils.SPACE);
        sb2.append(str);
        sb2.append("/");
        sb2.append(i10);
        return N0.a.d(i11, "/", sb2);
    }

    public final C2682c a() throws NumberFormatException {
        String strB;
        C2681b c2681bA;
        HashMap map = this.f35558e;
        try {
            if (map.containsKey("rtpmap")) {
                String str = (String) map.get("rtpmap");
                int i5 = Q1.x.f9724a;
                c2681bA = C2681b.a(str);
            } else {
                int i10 = this.f35557d;
                Q1.k.c(i10 < 96);
                if (i10 == 0) {
                    strB = b(0, 8000, 1, "PCMU");
                } else if (i10 == 8) {
                    strB = b(8, 8000, 1, "PCMA");
                } else if (i10 == 10) {
                    strB = b(10, 44100, 2, "L16");
                } else {
                    if (i10 != 11) {
                        throw new IllegalStateException(AbstractC3256n.g(i10, "Unsupported static paylod type "));
                    }
                    strB = b(11, 44100, 1, "L16");
                }
                c2681bA = C2681b.a(strB);
            }
            return new C2682c(this, j0.a(map), c2681bA);
        } catch (N1.D e7) {
            throw new IllegalStateException(e7);
        }
    }
}
