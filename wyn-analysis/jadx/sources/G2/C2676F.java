package g2;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import l8.AbstractC3437s;
import l8.e0;
import l8.j0;

/* renamed from: g2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2676F {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f35533a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f35534b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35535c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35536d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35537e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35538f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f35539g;

    /* renamed from: h, reason: collision with root package name */
    public final String f35540h;

    /* renamed from: i, reason: collision with root package name */
    public final String f35541i;

    /* renamed from: j, reason: collision with root package name */
    public final String f35542j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f35543l;

    public C2676F(C2675E c2675e) {
        this.f35533a = j0.a(c2675e.f35522a);
        this.f35534b = c2675e.f35523b.g();
        String str = c2675e.f35525d;
        int i5 = Q1.x.f9724a;
        this.f35535c = str;
        this.f35536d = c2675e.f35526e;
        this.f35537e = c2675e.f35527f;
        this.f35539g = c2675e.f35528g;
        this.f35540h = c2675e.f35529h;
        this.f35538f = c2675e.f35524c;
        this.f35541i = c2675e.f35530i;
        this.f35542j = c2675e.k;
        this.k = c2675e.f35532l;
        this.f35543l = c2675e.f35531j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2676F.class != obj.getClass()) {
            return false;
        }
        C2676F c2676f = (C2676F) obj;
        if (this.f35538f != c2676f.f35538f) {
            return false;
        }
        j0 j0Var = this.f35533a;
        j0Var.getClass();
        if (!AbstractC3437s.f(c2676f.f35533a, j0Var) || !this.f35534b.equals(c2676f.f35534b)) {
            return false;
        }
        int i5 = Q1.x.f9724a;
        return Objects.equals(this.f35536d, c2676f.f35536d) && Objects.equals(this.f35535c, c2676f.f35535c) && Objects.equals(this.f35537e, c2676f.f35537e) && Objects.equals(this.f35543l, c2676f.f35543l) && Objects.equals(this.f35539g, c2676f.f35539g) && Objects.equals(this.f35542j, c2676f.f35542j) && Objects.equals(this.k, c2676f.k) && Objects.equals(this.f35540h, c2676f.f35540h) && Objects.equals(this.f35541i, c2676f.f35541i);
    }

    public final int hashCode() {
        int iHashCode = (this.f35534b.hashCode() + ((this.f35533a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        String str = this.f35536d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f35535c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35537e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f35538f) * 31;
        String str4 = this.f35543l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f35539g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f35542j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f35540h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f35541i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
