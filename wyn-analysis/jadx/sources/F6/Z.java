package f6;

import A7.AbstractC0279p0;
import E5.InterfaceC0453h;
import com.applovin.impl.Z0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class Z implements InterfaceC0453h {

    /* renamed from: f, reason: collision with root package name */
    public static final Z0 f35016f = new Z0(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f35017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35019c;

    /* renamed from: d, reason: collision with root package name */
    public final E5.T[] f35020d;

    /* renamed from: e, reason: collision with root package name */
    public int f35021e;

    public Z(String str, E5.T... tArr) {
        AbstractC4256a.e(tArr.length > 0);
        this.f35018b = str;
        this.f35020d = tArr;
        this.f35017a = tArr.length;
        int iF = u6.k.f(tArr[0].f3238l);
        this.f35019c = iF == -1 ? u6.k.f(tArr[0].k) : iF;
        String str2 = tArr[0].f3230c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i5 = tArr[0].f3232e | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i10 = 1; i10 < tArr.length; i10++) {
            String str3 = tArr[i10].f3230c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a(i10, "languages", tArr[0].f3230c, tArr[i10].f3230c);
                return;
            } else {
                if (i5 != (tArr[i10].f3232e | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    a(i10, "role flags", Integer.toBinaryString(tArr[0].f3232e), Integer.toBinaryString(tArr[i10].f3232e));
                    return;
                }
            }
        }
    }

    public static void a(int i5, String str, String str2, String str3) {
        StringBuilder sbR = AbstractC0279p0.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbR.append(str3);
        sbR.append("' (track ");
        sbR.append(i5);
        sbR.append(")");
        AbstractC4256a.p("TrackGroup", "", new IllegalStateException(sbR.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass()) {
            Z z2 = (Z) obj;
            if (this.f35018b.equals(z2.f35018b) && Arrays.equals(this.f35020d, z2.f35020d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f35021e == 0) {
            this.f35021e = N0.a.c(527, 31, this.f35018b) + Arrays.hashCode(this.f35020d);
        }
        return this.f35021e;
    }
}
