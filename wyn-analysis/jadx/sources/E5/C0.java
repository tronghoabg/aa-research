package E5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class C0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f3013c;

    /* renamed from: a, reason: collision with root package name */
    public final long f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3015b;

    static {
        C0 c02 = new C0(0L, 0L);
        new C0(Long.MAX_VALUE, Long.MAX_VALUE);
        new C0(Long.MAX_VALUE, 0L);
        new C0(0L, Long.MAX_VALUE);
        f3013c = c02;
    }

    public C0(long j8, long j10) {
        AbstractC4256a.e(j8 >= 0);
        AbstractC4256a.e(j10 >= 0);
        this.f3014a = j8;
        this.f3015b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0.class == obj.getClass()) {
            C0 c02 = (C0) obj;
            if (this.f3014a == c02.f3014a && this.f3015b == c02.f3015b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3014a) * 31) + ((int) this.f3015b);
    }
}
