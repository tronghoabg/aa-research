package ad;

import D6.z1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import x6.C4470a;
import x6.C4478i;

/* renamed from: ad.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1360e {

    /* renamed from: a, reason: collision with root package name */
    public final String f17568a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17569b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17570c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f17571d;

    /* renamed from: e, reason: collision with root package name */
    public final C1359d f17572e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17573f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17574g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17575h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17576i;

    public C1360e(C4478i c4478i) {
        z1 z1Var = c4478i.f47737a;
        this.f17568a = z1Var.f2549a;
        this.f17569b = z1Var.f2550b;
        this.f17570c = c4478i.toString();
        z1 z1Var2 = c4478i.f47737a;
        if (z1Var2.f2552d != null) {
            this.f17571d = new HashMap();
            for (String str : z1Var2.f2552d.keySet()) {
                this.f17571d.put(str, z1Var2.f2552d.getString(str));
            }
        } else {
            this.f17571d = new HashMap();
        }
        C4470a c4470a = c4478i.f47738b;
        if (c4470a != null) {
            this.f17572e = new C1359d(c4470a);
        }
        this.f17573f = z1Var2.f2553e;
        this.f17574g = z1Var2.f2554f;
        this.f17575h = z1Var2.f2555g;
        this.f17576i = z1Var2.f2556h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1360e)) {
            return false;
        }
        C1360e c1360e = (C1360e) obj;
        return Objects.equals(this.f17568a, c1360e.f17568a) && this.f17569b == c1360e.f17569b && Objects.equals(this.f17570c, c1360e.f17570c) && Objects.equals(this.f17572e, c1360e.f17572e) && Objects.equals(this.f17571d, c1360e.f17571d) && Objects.equals(this.f17573f, c1360e.f17573f) && Objects.equals(this.f17574g, c1360e.f17574g) && Objects.equals(this.f17575h, c1360e.f17575h) && Objects.equals(this.f17576i, c1360e.f17576i);
    }

    public final int hashCode() {
        return Objects.hash(this.f17568a, Long.valueOf(this.f17569b), this.f17570c, this.f17572e, this.f17573f, this.f17574g, this.f17575h, this.f17576i);
    }

    public C1360e(String str, long j8, String str2, Map map, C1359d c1359d, String str3, String str4, String str5, String str6) {
        this.f17568a = str;
        this.f17569b = j8;
        this.f17570c = str2;
        this.f17571d = map;
        this.f17572e = c1359d;
        this.f17573f = str3;
        this.f17574g = str4;
        this.f17575h = str5;
        this.f17576i = str6;
    }
}
