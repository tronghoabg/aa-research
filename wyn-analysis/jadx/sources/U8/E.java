package U8;

import java.util.List;

/* loaded from: classes4.dex */
public final class E extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12389c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12390d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12391e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12392f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12393g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12394h;

    /* renamed from: i, reason: collision with root package name */
    public final List f12395i;

    public E(int i5, String str, int i10, int i11, long j8, long j10, long j11, String str2, List list) {
        this.f12387a = i5;
        this.f12388b = str;
        this.f12389c = i10;
        this.f12390d = i11;
        this.f12391e = j8;
        this.f12392f = j10;
        this.f12393g = j11;
        this.f12394h = str2;
        this.f12395i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f12387a == ((E) r0Var).f12387a) {
                E e7 = (E) r0Var;
                if (this.f12388b.equals(e7.f12388b) && this.f12389c == e7.f12389c && this.f12390d == e7.f12390d && this.f12391e == e7.f12391e && this.f12392f == e7.f12392f && this.f12393g == e7.f12393g) {
                    String str = e7.f12394h;
                    String str2 = this.f12394h;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = e7.f12395i;
                        List list2 = this.f12395i;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f12387a ^ 1000003) * 1000003) ^ this.f12388b.hashCode()) * 1000003) ^ this.f12389c) * 1000003) ^ this.f12390d) * 1000003;
        long j8 = this.f12391e;
        int i5 = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j10 = this.f12392f;
        int i10 = (i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f12393g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f12394h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f12395i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f12387a + ", processName=" + this.f12388b + ", reasonCode=" + this.f12389c + ", importance=" + this.f12390d + ", pss=" + this.f12391e + ", rss=" + this.f12392f + ", timestamp=" + this.f12393g + ", traceFile=" + this.f12394h + ", buildIdMappingForArch=" + this.f12395i + "}";
    }
}
