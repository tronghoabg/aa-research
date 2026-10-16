package N1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final int f8117a;

    /* renamed from: b, reason: collision with root package name */
    public final O f8118b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8119c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8120d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f8121e;

    static {
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(3);
        Q1.x.E(4);
    }

    public U(O o7, boolean z2, int[] iArr, boolean[] zArr) {
        int i5 = o7.f8073a;
        this.f8117a = i5;
        boolean z10 = false;
        Q1.k.c(i5 == iArr.length && i5 == zArr.length);
        this.f8118b = o7;
        if (z2 && i5 > 1) {
            z10 = true;
        }
        this.f8119c = z10;
        this.f8120d = (int[]) iArr.clone();
        this.f8121e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U.class == obj.getClass()) {
            U u10 = (U) obj;
            if (this.f8119c == u10.f8119c && this.f8118b.equals(u10.f8118b) && Arrays.equals(this.f8120d, u10.f8120d) && Arrays.equals(this.f8121e, u10.f8121e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8121e) + ((Arrays.hashCode(this.f8120d) + (((this.f8118b.hashCode() * 31) + (this.f8119c ? 1 : 0)) * 31)) * 31);
    }
}
