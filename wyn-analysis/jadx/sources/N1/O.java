package N1;

import A7.AbstractC0279p0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final int f8073a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8075c;

    /* renamed from: d, reason: collision with root package name */
    public final C0765n[] f8076d;

    /* renamed from: e, reason: collision with root package name */
    public int f8077e;

    static {
        Q1.x.E(0);
        Q1.x.E(1);
    }

    public O(String str, C0765n... c0765nArr) {
        Q1.k.c(c0765nArr.length > 0);
        this.f8074b = str;
        this.f8076d = c0765nArr;
        this.f8073a = c0765nArr.length;
        int iH = C.h(c0765nArr[0].f8232n);
        this.f8075c = iH == -1 ? C.h(c0765nArr[0].f8231m) : iH;
        String str2 = c0765nArr[0].f8223d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i5 = c0765nArr[0].f8225f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i10 = 1; i10 < c0765nArr.length; i10++) {
            String str3 = c0765nArr[i10].f8223d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i10, "languages", c0765nArr[0].f8223d, c0765nArr[i10].f8223d);
                return;
            } else {
                if (i5 != (c0765nArr[i10].f8225f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i10, "role flags", Integer.toBinaryString(c0765nArr[0].f8225f), Integer.toBinaryString(c0765nArr[i10].f8225f));
                    return;
                }
            }
        }
    }

    public static void b(int i5, String str, String str2, String str3) {
        StringBuilder sbR = AbstractC0279p0.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbR.append(str3);
        sbR.append("' (track ");
        sbR.append(i5);
        sbR.append(")");
        Q1.k.l("TrackGroup", "", new IllegalStateException(sbR.toString()));
    }

    public final int a(C0765n c0765n) {
        int i5 = 0;
        while (true) {
            C0765n[] c0765nArr = this.f8076d;
            if (i5 >= c0765nArr.length) {
                return -1;
            }
            if (c0765n == c0765nArr[i5]) {
                return i5;
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class == obj.getClass()) {
            O o7 = (O) obj;
            if (this.f8074b.equals(o7.f8074b) && Arrays.equals(this.f8076d, o7.f8076d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8077e == 0) {
            this.f8077e = Arrays.hashCode(this.f8076d) + N0.a.c(527, 31, this.f8074b);
        }
        return this.f8077e;
    }
}
