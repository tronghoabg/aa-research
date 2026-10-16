package R9;

import A.AbstractC0213f;
import E4.n;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10556a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10558c;

    public b(String str, long j8, int i5) {
        this.f10556a = str;
        this.f10557b = j8;
        this.f10558c = i5;
    }

    public static n a() {
        n nVar = new n((short) 0, 3);
        nVar.f2940d = 0L;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f10556a;
        if (str == null) {
            if (bVar.f10556a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f10556a)) {
            return false;
        }
        if (this.f10557b != bVar.f10557b) {
            return false;
        }
        int i5 = bVar.f10558c;
        int i10 = this.f10558c;
        return i10 == 0 ? i5 == 0 : AbstractC0213f.b(i10, i5);
    }

    public final int hashCode() {
        String str = this.f10556a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j8 = this.f10557b;
        int i5 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        int i10 = this.f10558c;
        return (i10 != 0 ? AbstractC0213f.f(i10) : 0) ^ i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f10556a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f10557b);
        sb2.append(", responseCode=");
        int i5 = this.f10558c;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
