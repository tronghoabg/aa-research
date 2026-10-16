package Q9;

import A7.C0237b0;
import Fe.e;
import g2.C2690k;
import md.n0;
import od.C3698k;
import od.C3712o1;
import od.D0;
import od.K0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9911a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9912b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9913c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9914d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9915e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9916f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9917g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9918h;

    public /* synthetic */ a() {
    }

    public b a() {
        String strF = this.f9912b == 0 ? " registrationStatus" : "";
        if (((Long) this.f9917g) == null) {
            strF = strF.concat(" expiresInSecs");
        }
        if (((Long) this.f9918h) == null) {
            strF = N0.a.f(strF, " tokenCreationEpochInSecs");
        }
        if (strF.isEmpty()) {
            return new b((String) this.f9913c, this.f9912b, (String) this.f9914d, (String) this.f9915e, ((Long) this.f9917g).longValue(), ((Long) this.f9918h).longValue(), (String) this.f9916f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public String toString() {
        switch (this.f9911a) {
            case 1:
                C0237b0 c0237b0S = Ba.c.S(this);
                c0237b0S.h("defaultPort", String.valueOf(this.f9912b));
                c0237b0S.f((C3712o1) this.f9913c, "proxyDetector");
                c0237b0S.f((n0) this.f9914d, "syncContext");
                c0237b0S.f((C2690k) this.f9915e, "serviceConfigParser");
                c0237b0S.f((K0) this.f9916f, "scheduledExecutorService");
                c0237b0S.f((C3698k) this.f9917g, "channelLogger");
                c0237b0S.f((D0) this.f9918h, "executor");
                c0237b0S.f(null, "overrideAuthority");
                return c0237b0S.toString();
            default:
                return super.toString();
        }
    }

    public a(Integer num, C3712o1 c3712o1, n0 n0Var, C2690k c2690k, K0 k02, C3698k c3698k, D0 d02) {
        this.f9912b = num.intValue();
        e.t(c3712o1, "proxyDetector not set");
        this.f9913c = c3712o1;
        this.f9914d = n0Var;
        this.f9915e = c2690k;
        this.f9916f = k02;
        this.f9917g = c3698k;
        this.f9918h = d02;
    }
}
