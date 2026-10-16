package i8;

import Va.M6;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f36910a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36911b;

    public l(int i5, long j8) {
        this.f36910a = i5;
        this.f36911b = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f36910a == lVar.f36910a && this.f36911b == lVar.f36911b;
    }

    public final int hashCode() {
        long j8 = this.f36911b;
        return ((int) (j8 ^ (j8 >>> 32))) ^ ((this.f36910a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f36910a);
        sb2.append(", eventTimestamp=");
        return M6.s(sb2, this.f36911b, "}");
    }
}
