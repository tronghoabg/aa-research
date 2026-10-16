package J5;

import Va.M6;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f5680c = new u(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f5681a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5682b;

    public u(long j8, long j10) {
        this.f5681a = j8;
        this.f5682b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f5681a == uVar.f5681a && this.f5682b == uVar.f5682b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5681a) * 31) + ((int) this.f5682b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f5681a);
        sb2.append(", position=");
        return M6.s(sb2, this.f5682b, "]");
    }
}
