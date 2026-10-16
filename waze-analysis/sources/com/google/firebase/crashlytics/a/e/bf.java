package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private String f9431a;

    /* renamed from: b, reason: collision with root package name */
    private String f9432b;

    /* renamed from: c, reason: collision with root package name */
    private int f9433c;

    /* renamed from: d, reason: collision with root package name */
    private String f9434d;

    /* renamed from: e, reason: collision with root package name */
    private String f9435e;

    /* renamed from: f, reason: collision with root package name */
    private String f9436f;

    /* renamed from: g, reason: collision with root package name */
    private String f9437g;

    /* renamed from: h, reason: collision with root package name */
    private String f9438h;

    /* renamed from: i, reason: collision with root package name */
    private String f9439i;

    /* renamed from: j, reason: collision with root package name */
    private ct f9440j;

    /* renamed from: k, reason: collision with root package name */
    private bi f9441k;

    /* renamed from: l, reason: collision with root package name */
    private be f9442l;
    private byte m = 1;

    bf(cu cuVar) {
        this.f9431a = cuVar.m();
        this.f9432b = cuVar.k();
        this.f9433c = cuVar.a();
        this.f9434d = cuVar.l();
        this.f9435e = cuVar.j();
        this.f9436f = cuVar.i();
        this.f9437g = cuVar.f();
        this.f9438h = cuVar.g();
        this.f9439i = cuVar.h();
        this.f9440j = cuVar.e();
        this.f9441k = cuVar.d();
        this.f9442l = cuVar.b();
    }

    public final cu a() {
        if (this.m == 1 && this.f9431a != null && this.f9432b != null && this.f9434d != null && this.f9438h != null && this.f9439i != null) {
            return new ab(this.f9431a, this.f9432b, this.f9433c, this.f9434d, this.f9435e, this.f9436f, this.f9437g, this.f9438h, this.f9439i, this.f9440j, this.f9441k, this.f9442l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9431a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f9432b == null) {
            sb.append(" gmpAppId");
        }
        if (this.m == 0) {
            sb.append(" platform");
        }
        if (this.f9434d == null) {
            sb.append(" installationUuid");
        }
        if (this.f9438h == null) {
            sb.append(" buildVersion");
        }
        if (this.f9439i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(be beVar) {
        this.f9442l = beVar;
    }

    public final void c(String str) {
        this.f9437g = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildVersion");
        }
        this.f9438h = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayVersion");
        }
        this.f9439i = str;
    }

    public final void f(String str) {
        this.f9436f = str;
    }

    public final void g(String str) {
        this.f9435e = str;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        this.f9432b = str;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null installationUuid");
        }
        this.f9434d = str;
    }

    public final void j(bi biVar) {
        this.f9441k = biVar;
    }

    public final void k(int i2) {
        this.f9433c = i2;
        this.m = (byte) 1;
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null sdkVersion");
        }
        this.f9431a = str;
    }

    public final void m(ct ctVar) {
        this.f9440j = ctVar;
    }
}
