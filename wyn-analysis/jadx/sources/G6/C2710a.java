package g6;

import E5.InterfaceC0453h;
import android.net.Uri;
import com.applovin.impl.Z0;
import java.util.Arrays;
import u6.AbstractC4256a;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2710a implements InterfaceC0453h {

    /* renamed from: i, reason: collision with root package name */
    public static final Z0 f35758i = new Z0(23);

    /* renamed from: a, reason: collision with root package name */
    public final long f35759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35761c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri[] f35762d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f35763e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f35764f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35765g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f35766h;

    public C2710a(long j8, int i5, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z2) {
        AbstractC4256a.e(iArr.length == uriArr.length);
        this.f35759a = j8;
        this.f35760b = i5;
        this.f35761c = i10;
        this.f35763e = iArr;
        this.f35762d = uriArr;
        this.f35764f = jArr;
        this.f35765g = j10;
        this.f35766h = z2;
    }

    public final int a(int i5) {
        int i10;
        int i11 = i5 + 1;
        while (true) {
            int[] iArr = this.f35763e;
            if (i11 >= iArr.length || this.f35766h || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2710a.class == obj.getClass()) {
            C2710a c2710a = (C2710a) obj;
            if (this.f35759a == c2710a.f35759a && this.f35760b == c2710a.f35760b && this.f35761c == c2710a.f35761c && Arrays.equals(this.f35762d, c2710a.f35762d) && Arrays.equals(this.f35763e, c2710a.f35763e) && Arrays.equals(this.f35764f, c2710a.f35764f) && this.f35765g == c2710a.f35765g && this.f35766h == c2710a.f35766h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = ((this.f35760b * 31) + this.f35761c) * 31;
        long j8 = this.f35759a;
        int iHashCode = (Arrays.hashCode(this.f35764f) + ((Arrays.hashCode(this.f35763e) + ((((i5 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + Arrays.hashCode(this.f35762d)) * 31)) * 31)) * 31;
        long j10 = this.f35765g;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f35766h ? 1 : 0);
    }
}
