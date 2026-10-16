package g2;

import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import l8.AbstractC3437s;
import l8.j0;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2682c {

    /* renamed from: a, reason: collision with root package name */
    public final String f35567a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35568b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35571e;

    /* renamed from: f, reason: collision with root package name */
    public final String f35572f;

    /* renamed from: g, reason: collision with root package name */
    public final String f35573g;

    /* renamed from: h, reason: collision with root package name */
    public final String f35574h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f35575i;

    /* renamed from: j, reason: collision with root package name */
    public final C2681b f35576j;

    public C2682c(C2680a c2680a, j0 j0Var, C2681b c2681b) {
        this.f35567a = c2680a.f35554a;
        this.f35568b = c2680a.f35555b;
        this.f35569c = c2680a.f35556c;
        this.f35570d = c2680a.f35557d;
        this.f35572f = c2680a.f35560g;
        this.f35573g = c2680a.f35561h;
        this.f35571e = c2680a.f35559f;
        this.f35574h = c2680a.f35562i;
        this.f35575i = j0Var;
        this.f35576j = c2681b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2682c.class == obj.getClass()) {
            C2682c c2682c = (C2682c) obj;
            if (this.f35567a.equals(c2682c.f35567a) && this.f35568b == c2682c.f35568b && this.f35569c.equals(c2682c.f35569c) && this.f35570d == c2682c.f35570d && this.f35571e == c2682c.f35571e) {
                j0 j0Var = this.f35575i;
                j0Var.getClass();
                if (AbstractC3437s.f(c2682c.f35575i, j0Var) && this.f35576j.equals(c2682c.f35576j)) {
                    int i5 = Q1.x.f9724a;
                    if (Objects.equals(this.f35572f, c2682c.f35572f) && Objects.equals(this.f35573g, c2682c.f35573g) && Objects.equals(this.f35574h, c2682c.f35574h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f35576j.hashCode() + ((this.f35575i.hashCode() + ((((N0.a.c((N0.a.c(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 31, this.f35567a) + this.f35568b) * 31, 31, this.f35569c) + this.f35570d) * 31) + this.f35571e) * 31)) * 31)) * 31;
        String str = this.f35572f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f35573g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35574h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
