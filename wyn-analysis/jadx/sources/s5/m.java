package s5;

/* loaded from: classes3.dex */
public final class m extends AbstractC4001a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f45015a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45017c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45018d;

    /* renamed from: e, reason: collision with root package name */
    public final String f45019e;

    /* renamed from: f, reason: collision with root package name */
    public final String f45020f;

    /* renamed from: g, reason: collision with root package name */
    public final String f45021g;

    /* renamed from: h, reason: collision with root package name */
    public final String f45022h;

    /* renamed from: i, reason: collision with root package name */
    public final String f45023i;

    /* renamed from: j, reason: collision with root package name */
    public final String f45024j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f45025l;

    public m(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f45015a = num;
        this.f45016b = str;
        this.f45017c = str2;
        this.f45018d = str3;
        this.f45019e = str4;
        this.f45020f = str5;
        this.f45021g = str6;
        this.f45022h = str7;
        this.f45023i = str8;
        this.f45024j = str9;
        this.k = str10;
        this.f45025l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4001a) {
            AbstractC4001a abstractC4001a = (AbstractC4001a) obj;
            Integer num = this.f45015a;
            if (num != null ? num.equals(((m) abstractC4001a).f45015a) : ((m) abstractC4001a).f45015a == null) {
                String str = this.f45016b;
                if (str != null ? str.equals(((m) abstractC4001a).f45016b) : ((m) abstractC4001a).f45016b == null) {
                    String str2 = this.f45017c;
                    if (str2 != null ? str2.equals(((m) abstractC4001a).f45017c) : ((m) abstractC4001a).f45017c == null) {
                        String str3 = this.f45018d;
                        if (str3 != null ? str3.equals(((m) abstractC4001a).f45018d) : ((m) abstractC4001a).f45018d == null) {
                            String str4 = this.f45019e;
                            if (str4 != null ? str4.equals(((m) abstractC4001a).f45019e) : ((m) abstractC4001a).f45019e == null) {
                                String str5 = this.f45020f;
                                if (str5 != null ? str5.equals(((m) abstractC4001a).f45020f) : ((m) abstractC4001a).f45020f == null) {
                                    String str6 = this.f45021g;
                                    if (str6 != null ? str6.equals(((m) abstractC4001a).f45021g) : ((m) abstractC4001a).f45021g == null) {
                                        String str7 = this.f45022h;
                                        if (str7 != null ? str7.equals(((m) abstractC4001a).f45022h) : ((m) abstractC4001a).f45022h == null) {
                                            String str8 = this.f45023i;
                                            if (str8 != null ? str8.equals(((m) abstractC4001a).f45023i) : ((m) abstractC4001a).f45023i == null) {
                                                String str9 = this.f45024j;
                                                if (str9 != null ? str9.equals(((m) abstractC4001a).f45024j) : ((m) abstractC4001a).f45024j == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(((m) abstractC4001a).k) : ((m) abstractC4001a).k == null) {
                                                        String str11 = this.f45025l;
                                                        if (str11 != null ? str11.equals(((m) abstractC4001a).f45025l) : ((m) abstractC4001a).f45025l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f45015a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f45016b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f45017c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f45018d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f45019e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f45020f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f45021g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f45022h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f45023i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f45024j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f45025l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f45015a);
        sb2.append(", model=");
        sb2.append(this.f45016b);
        sb2.append(", hardware=");
        sb2.append(this.f45017c);
        sb2.append(", device=");
        sb2.append(this.f45018d);
        sb2.append(", product=");
        sb2.append(this.f45019e);
        sb2.append(", osBuild=");
        sb2.append(this.f45020f);
        sb2.append(", manufacturer=");
        sb2.append(this.f45021g);
        sb2.append(", fingerprint=");
        sb2.append(this.f45022h);
        sb2.append(", locale=");
        sb2.append(this.f45023i);
        sb2.append(", country=");
        sb2.append(this.f45024j);
        sb2.append(", mccMnc=");
        sb2.append(this.k);
        sb2.append(", applicationBuild=");
        return wg.b.c(sb2, this.f45025l, "}");
    }
}
