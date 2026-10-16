package s5;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u extends G {

    /* renamed from: a, reason: collision with root package name */
    public final long f45042a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45043b;

    /* renamed from: c, reason: collision with root package name */
    public final o f45044c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f45045d;

    /* renamed from: e, reason: collision with root package name */
    public final String f45046e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f45047f;

    public u(long j8, long j10, o oVar, Integer num, String str, ArrayList arrayList) {
        K k = K.f44964a;
        this.f45042a = j8;
        this.f45043b = j10;
        this.f45044c = oVar;
        this.f45045d = num;
        this.f45046e = str;
        this.f45047f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        u uVar = (u) ((G) obj);
        if (this.f45042a != uVar.f45042a) {
            return false;
        }
        if (this.f45043b != uVar.f45043b) {
            return false;
        }
        if (!this.f45044c.equals(uVar.f45044c)) {
            return false;
        }
        Integer num = uVar.f45045d;
        Integer num2 = this.f45045d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = uVar.f45046e;
        String str2 = this.f45046e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f45047f.equals(uVar.f45047f)) {
            return false;
        }
        Object obj2 = K.f44964a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j8 = this.f45042a;
        long j10 = this.f45043b;
        int iHashCode = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f45044c.hashCode()) * 1000003;
        Integer num = this.f45045d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f45046e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f45047f.hashCode()) * 1000003) ^ K.f44964a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f45042a + ", requestUptimeMs=" + this.f45043b + ", clientInfo=" + this.f45044c + ", logSource=" + this.f45045d + ", logSourceName=" + this.f45046e + ", logEvents=" + this.f45047f + ", qosTier=" + K.f44964a + "}";
    }
}
