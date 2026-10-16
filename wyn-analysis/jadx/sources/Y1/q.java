package Y1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f16372a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16373b;

    public q(long j8, long j10) {
        this.f16372a = j8;
        this.f16373b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f16372a == qVar.f16372a && this.f16373b == qVar.f16373b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16372a) * 31) + ((int) this.f16373b);
    }
}
