package E5;

import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class K0 implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3129a;

    /* renamed from: b, reason: collision with root package name */
    public final f6.Z f3130b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3131c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3132d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f3133e;

    public K0(f6.Z z2, boolean z10, int[] iArr, boolean[] zArr) {
        int i5 = z2.f35017a;
        this.f3129a = i5;
        boolean z11 = false;
        AbstractC4256a.e(i5 == iArr.length && i5 == zArr.length);
        this.f3130b = z2;
        if (z10 && i5 > 1) {
            z11 = true;
        }
        this.f3131c = z11;
        this.f3132d = (int[]) iArr.clone();
        this.f3133e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K0.class == obj.getClass()) {
            K0 k02 = (K0) obj;
            if (this.f3131c == k02.f3131c && this.f3130b.equals(k02.f3130b) && Arrays.equals(this.f3132d, k02.f3132d) && Arrays.equals(this.f3133e, k02.f3133e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3133e) + ((Arrays.hashCode(this.f3132d) + (((this.f3130b.hashCode() * 31) + (this.f3131c ? 1 : 0)) * 31)) * 31);
    }
}
