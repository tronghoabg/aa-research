package z5;

import java.util.Set;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4617b {

    /* renamed from: a, reason: collision with root package name */
    public final long f48370a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48371b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f48372c;

    public C4617b(long j8, long j10, Set set) {
        this.f48370a = j8;
        this.f48371b = j10;
        this.f48372c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4617b) {
            C4617b c4617b = (C4617b) obj;
            if (this.f48370a == c4617b.f48370a && this.f48371b == c4617b.f48371b && this.f48372c.equals(c4617b.f48372c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f48370a;
        int i5 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f48371b;
        return ((i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f48372c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f48370a + ", maxAllowedDelay=" + this.f48371b + ", flags=" + this.f48372c + "}";
    }
}
