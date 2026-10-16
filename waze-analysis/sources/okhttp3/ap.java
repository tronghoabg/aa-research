package okhttp3;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private al f55897a;

    /* renamed from: b, reason: collision with root package name */
    private aj f55898b;

    /* renamed from: c, reason: collision with root package name */
    private int f55899c;

    /* renamed from: d, reason: collision with root package name */
    private String f55900d;

    /* renamed from: e, reason: collision with root package name */
    private y f55901e;

    /* renamed from: f, reason: collision with root package name */
    private at f55902f;

    /* renamed from: g, reason: collision with root package name */
    private aq f55903g;

    /* renamed from: h, reason: collision with root package name */
    private aq f55904h;

    /* renamed from: i, reason: collision with root package name */
    private aq f55905i;

    /* renamed from: j, reason: collision with root package name */
    private long f55906j;

    /* renamed from: k, reason: collision with root package name */
    private long f55907k;

    /* renamed from: l, reason: collision with root package name */
    private okhttp3.internal.c.e f55908l;
    private com.waze.shared_infra.coordinators.c m;

    public ap(aq aqVar) {
        h.g.b.x.f(aqVar, "response");
        this.f55899c = -1;
        this.f55897a = aqVar.i();
        this.f55898b = aqVar.h();
        this.f55899c = aqVar.a();
        this.f55900d = aqVar.d();
        this.f55901e = aqVar.f();
        this.m = aqVar.g().f();
        this.f55902f = aqVar.m();
        this.f55903g = aqVar.k();
        this.f55904h = aqVar.j();
        this.f55905i = aqVar.l();
        this.f55906j = aqVar.c();
        this.f55907k = aqVar.b();
        this.f55908l = aqVar.n();
    }

    private static final void q(String str, aq aqVar) {
        if (aqVar != null) {
            if (aqVar.m() != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (aqVar.k() != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (aqVar.j() != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (aqVar.l() != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }
    }

    public final int a() {
        return this.f55899c;
    }

    public final ap b(at atVar) {
        this.f55902f = atVar;
        return this;
    }

    public final ap c(aq aqVar) {
        q("cacheResponse", aqVar);
        this.f55904h = aqVar;
        return this;
    }

    public final ap d(int i2) {
        this.f55899c = i2;
        return this;
    }

    public final ap e(y yVar) {
        this.f55901e = yVar;
        return this;
    }

    public final ap f(z zVar) {
        h.g.b.x.f(zVar, "headers");
        this.m = zVar.f();
        return this;
    }

    public final ap g(String str) {
        h.g.b.x.f(str, "message");
        this.f55900d = str;
        return this;
    }

    public final ap h(aq aqVar) {
        q("networkResponse", aqVar);
        this.f55903g = aqVar;
        return this;
    }

    public final ap i(aq aqVar) {
        if (aqVar.m() != null) {
            throw new IllegalArgumentException("priorResponse.body != null");
        }
        this.f55905i = aqVar;
        return this;
    }

    public final ap j(aj ajVar) {
        h.g.b.x.f(ajVar, "protocol");
        this.f55898b = ajVar;
        return this;
    }

    public final ap k(long j2) {
        this.f55907k = j2;
        return this;
    }

    public final ap l(al alVar) {
        h.g.b.x.f(alVar, "request");
        this.f55897a = alVar;
        return this;
    }

    public final ap m(long j2) {
        this.f55906j = j2;
        return this;
    }

    public final aq n() {
        int i2 = this.f55899c;
        if (i2 < 0) {
            throw new IllegalStateException("code < 0: " + i2);
        }
        al alVar = this.f55897a;
        if (alVar == null) {
            throw new IllegalStateException("request == null");
        }
        aj ajVar = this.f55898b;
        if (ajVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f55900d;
        if (str != null) {
            return new aq(alVar, ajVar, str, i2, this.f55901e, this.m.h(), this.f55902f, this.f55903g, this.f55904h, this.f55905i, this.f55906j, this.f55907k, this.f55908l);
        }
        throw new IllegalStateException("message == null");
    }

    public final void o(okhttp3.internal.c.e eVar) {
        h.g.b.x.f(eVar, "deferredTrailers");
        this.f55908l = eVar;
    }

    public final ap p() {
        h.g.b.x.f("Proxy-Authenticate", HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f("OkHttp-Preemptive", "value");
        this.m.j("Proxy-Authenticate", "OkHttp-Preemptive");
        return this;
    }

    public ap() {
        this.f55899c = -1;
        this.m = new com.waze.shared_infra.coordinators.c((byte[]) null);
    }
}
