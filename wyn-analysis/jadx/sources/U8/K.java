package U8;

import A7.AbstractC0279p0;
import java.util.List;

/* loaded from: classes4.dex */
public final class K extends O0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12418b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12419c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12420d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f12421e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12422f;

    /* renamed from: g, reason: collision with root package name */
    public final L f12423g;

    /* renamed from: h, reason: collision with root package name */
    public final C0879l0 f12424h;

    /* renamed from: i, reason: collision with root package name */
    public final C0877k0 f12425i;

    /* renamed from: j, reason: collision with root package name */
    public final O f12426j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12427l;

    public K(String str, String str2, String str3, long j8, Long l10, boolean z2, L l11, C0879l0 c0879l0, C0877k0 c0877k0, O o7, List list, int i5) {
        this.f12417a = str;
        this.f12418b = str2;
        this.f12419c = str3;
        this.f12420d = j8;
        this.f12421e = l10;
        this.f12422f = z2;
        this.f12423g = l11;
        this.f12424h = c0879l0;
        this.f12425i = c0877k0;
        this.f12426j = o7;
        this.k = list;
        this.f12427l = i5;
    }

    public final J a() {
        J j8 = new J();
        j8.f12405a = this.f12417a;
        j8.f12406b = this.f12418b;
        j8.f12407c = this.f12419c;
        j8.f12408d = this.f12420d;
        j8.f12409e = this.f12421e;
        j8.f12410f = this.f12422f;
        j8.f12411g = this.f12423g;
        j8.f12412h = this.f12424h;
        j8.f12413i = this.f12425i;
        j8.f12414j = this.f12426j;
        j8.k = this.k;
        j8.f12415l = this.f12427l;
        j8.f12416m = (byte) 7;
        return j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        K k = (K) ((O0) obj);
        if (!this.f12417a.equals(k.f12417a)) {
            return false;
        }
        if (!this.f12418b.equals(k.f12418b)) {
            return false;
        }
        String str = k.f12419c;
        String str2 = this.f12419c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f12420d != k.f12420d) {
            return false;
        }
        Long l10 = k.f12421e;
        Long l11 = this.f12421e;
        if (l11 == null) {
            if (l10 != null) {
                return false;
            }
        } else if (!l11.equals(l10)) {
            return false;
        }
        if (this.f12422f != k.f12422f || !this.f12423g.equals(k.f12423g)) {
            return false;
        }
        C0879l0 c0879l0 = k.f12424h;
        C0879l0 c0879l02 = this.f12424h;
        if (c0879l02 == null) {
            if (c0879l0 != null) {
                return false;
            }
        } else if (!c0879l02.equals(c0879l0)) {
            return false;
        }
        C0877k0 c0877k0 = k.f12425i;
        C0877k0 c0877k02 = this.f12425i;
        if (c0877k02 == null) {
            if (c0877k0 != null) {
                return false;
            }
        } else if (!c0877k02.equals(c0877k0)) {
            return false;
        }
        O o7 = k.f12426j;
        O o10 = this.f12426j;
        if (o10 == null) {
            if (o7 != null) {
                return false;
            }
        } else if (!o10.equals(o7)) {
            return false;
        }
        List list = k.k;
        List list2 = this.k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.f12427l == k.f12427l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f12417a.hashCode() ^ 1000003) * 1000003) ^ this.f12418b.hashCode()) * 1000003;
        String str = this.f12419c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f12420d;
        int i5 = (iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l10 = this.f12421e;
        int iHashCode3 = (((((i5 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f12422f ? 1231 : 1237)) * 1000003) ^ this.f12423g.hashCode()) * 1000003;
        C0879l0 c0879l0 = this.f12424h;
        int iHashCode4 = (iHashCode3 ^ (c0879l0 == null ? 0 : c0879l0.hashCode())) * 1000003;
        C0877k0 c0877k0 = this.f12425i;
        int iHashCode5 = (iHashCode4 ^ (c0877k0 == null ? 0 : c0877k0.hashCode())) * 1000003;
        O o7 = this.f12426j;
        int iHashCode6 = (iHashCode5 ^ (o7 == null ? 0 : o7.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f12427l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f12417a);
        sb2.append(", identifier=");
        sb2.append(this.f12418b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f12419c);
        sb2.append(", startedAt=");
        sb2.append(this.f12420d);
        sb2.append(", endedAt=");
        sb2.append(this.f12421e);
        sb2.append(", crashed=");
        sb2.append(this.f12422f);
        sb2.append(", app=");
        sb2.append(this.f12423g);
        sb2.append(", user=");
        sb2.append(this.f12424h);
        sb2.append(", os=");
        sb2.append(this.f12425i);
        sb2.append(", device=");
        sb2.append(this.f12426j);
        sb2.append(", events=");
        sb2.append(this.k);
        sb2.append(", generatorType=");
        return AbstractC0279p0.j(this.f12427l, "}", sb2);
    }
}
