package u5;

import A.AbstractC0213f;
import Va.M6;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4250a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46647a;

    /* renamed from: b, reason: collision with root package name */
    public final long f46648b;

    public C4250a(int i5, long j8) {
        if (i5 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f46647a = i5;
        this.f46648b = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4250a)) {
            return false;
        }
        C4250a c4250a = (C4250a) obj;
        return AbstractC0213f.b(this.f46647a, c4250a.f46647a) && this.f46648b == c4250a.f46648b;
    }

    public final int hashCode() {
        int iF = (AbstractC0213f.f(this.f46647a) ^ 1000003) * 1000003;
        long j8 = this.f46648b;
        return iF ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i5 = this.f46647a;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return M6.s(sb2, this.f46648b, "}");
    }
}
