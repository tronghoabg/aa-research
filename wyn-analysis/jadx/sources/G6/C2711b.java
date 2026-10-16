package g6;

import E5.InterfaceC0453h;
import android.net.Uri;
import com.applovin.impl.Z0;
import java.util.Arrays;
import u6.v;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2711b implements InterfaceC0453h {

    /* renamed from: f, reason: collision with root package name */
    public static final C2711b f35767f = new C2711b(new C2710a[0], 0, -9223372036854775807L, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C2710a f35768g;

    /* renamed from: h, reason: collision with root package name */
    public static final Z0 f35769h;

    /* renamed from: a, reason: collision with root package name */
    public final int f35770a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35771b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35772c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35773d;

    /* renamed from: e, reason: collision with root package name */
    public final C2710a[] f35774e;

    static {
        int iMax = Math.max(0, 0);
        int[] iArrCopyOf = Arrays.copyOf(new int[0], iMax);
        Arrays.fill(iArrCopyOf, 0, iMax, 0);
        int iMax2 = Math.max(0, 0);
        long[] jArrCopyOf = Arrays.copyOf(new long[0], iMax2);
        Arrays.fill(jArrCopyOf, 0, iMax2, -9223372036854775807L);
        f35768g = new C2710a(0L, 0, -1, iArrCopyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), jArrCopyOf, 0L, false);
        f35769h = new Z0(22);
    }

    public C2711b(C2710a[] c2710aArr, long j8, long j10, int i5) {
        this.f35771b = j8;
        this.f35772c = j10;
        this.f35770a = c2710aArr.length + i5;
        this.f35774e = c2710aArr;
        this.f35773d = i5;
    }

    public final C2710a a(int i5) {
        int i10 = this.f35773d;
        return i5 < i10 ? f35768g : this.f35774e[i5 - i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2711b.class != obj.getClass()) {
            return false;
        }
        C2711b c2711b = (C2711b) obj;
        int i5 = v.f46721a;
        return this.f35770a == c2711b.f35770a && this.f35771b == c2711b.f35771b && this.f35772c == c2711b.f35772c && this.f35773d == c2711b.f35773d && Arrays.equals(this.f35774e, c2711b.f35774e);
    }

    public final int hashCode() {
        return (((((((this.f35770a * 961) + ((int) this.f35771b)) * 31) + ((int) this.f35772c)) * 31) + this.f35773d) * 31) + Arrays.hashCode(this.f35774e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f35771b);
        sb2.append(", adGroups=[");
        int i5 = 0;
        while (true) {
            C2710a[] c2710aArr = this.f35774e;
            if (i5 >= c2710aArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(c2710aArr[i5].f35759a);
            sb2.append(", ads=[");
            for (int i10 = 0; i10 < c2710aArr[i5].f35763e.length; i10++) {
                sb2.append("ad(state=");
                int i11 = c2710aArr[i5].f35763e[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(c2710aArr[i5].f35764f[i10]);
                sb2.append(')');
                if (i10 < c2710aArr[i5].f35763e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i5 < c2710aArr.length - 1) {
                sb2.append(", ");
            }
            i5++;
        }
    }
}
