package L0;

import A7.AbstractC0279p0;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6789b = {18, 20, 17, 15};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6790c = {Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143, 32767, 8191};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6791d = {32767, 8191, Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143};

    /* renamed from: a, reason: collision with root package name */
    public final long f6792a;

    public /* synthetic */ a(long j8) {
        this.f6792a = j8;
    }

    public static long a(int i5, int i10, long j8) {
        int iE = e(j8);
        int iD = d(j8);
        if (i10 < 0 || i5 < 0) {
            throw new IllegalArgumentException(N0.a.e("minHeight(", i10, ") and minWidth(", i5, ") must be >= 0").toString());
        }
        if (iE < i5 && iE != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + iE + ") must be >= minWidth(" + i5 + ')').toString());
        }
        if (iD >= i10 || iD == Integer.MAX_VALUE) {
            return AbstractC4345a.m(i5, iE, i10, iD);
        }
        throw new IllegalArgumentException(("maxHeight(" + iD + ") must be >= minHeight(" + i10 + ')').toString());
    }

    public static final boolean b(long j8) {
        int i5 = (int) (3 & j8);
        return (((int) (j8 >> (f6789b[i5] + 31))) & f6791d[i5]) != 0;
    }

    public static final boolean c(long j8) {
        return (((int) (j8 >> 33)) & f6790c[(int) (3 & j8)]) != 0;
    }

    public static final int d(long j8) {
        int i5 = (int) (3 & j8);
        int i10 = ((int) (j8 >> (f6789b[i5] + 31))) & f6791d[i5];
        return i10 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i10 - 1;
    }

    public static final int e(long j8) {
        int i5 = ((int) (j8 >> 33)) & f6790c[(int) (3 & j8)];
        return i5 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i5 - 1;
    }

    public static final int f(long j8) {
        int i5 = (int) (3 & j8);
        return ((int) (j8 >> f6789b[i5])) & f6791d[i5];
    }

    public static final int g(long j8) {
        return ((int) (j8 >> 2)) & f6790c[(int) (3 & j8)];
    }

    public static String h(long j8) {
        int iE = e(j8);
        String strValueOf = iE == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iE);
        int iD = d(j8);
        String strValueOf2 = iD != Integer.MAX_VALUE ? String.valueOf(iD) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(g(j8));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(f(j8));
        sb2.append(", maxHeight = ");
        return AbstractC0279p0.n(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6792a == ((a) obj).f6792a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f6792a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return h(this.f6792a);
    }
}
