package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private long f9517a;

    /* renamed from: b, reason: collision with root package name */
    private String f9518b;

    /* renamed from: c, reason: collision with root package name */
    private ce f9519c;

    /* renamed from: d, reason: collision with root package name */
    private ch f9520d;

    /* renamed from: e, reason: collision with root package name */
    private ci f9521e;

    /* renamed from: f, reason: collision with root package name */
    private cn f9522f;

    /* renamed from: g, reason: collision with root package name */
    private byte f9523g = 1;

    cf(co coVar) {
        this.f9517a = coVar.a();
        this.f9518b = coVar.g();
        this.f9519c = coVar.b();
        this.f9520d = coVar.d();
        this.f9521e = coVar.e();
        this.f9522f = coVar.f();
    }

    public final co a() {
        String str;
        ce ceVar;
        ch chVar;
        if (this.f9523g == 1 && (str = this.f9518b) != null && (ceVar = this.f9519c) != null && (chVar = this.f9520d) != null) {
            return new al(this.f9517a, str, ceVar, chVar, this.f9521e, this.f9522f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9523g == 0) {
            sb.append(" timestamp");
        }
        if (this.f9518b == null) {
            sb.append(" type");
        }
        if (this.f9519c == null) {
            sb.append(" app");
        }
        if (this.f9520d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ce ceVar) {
        this.f9519c = ceVar;
    }

    public final void c(ch chVar) {
        this.f9520d = chVar;
    }

    public final void d(ci ciVar) {
        this.f9521e = ciVar;
    }

    public final void e(cn cnVar) {
        this.f9522f = cnVar;
    }

    public final void f(long j2) {
        this.f9517a = j2;
        this.f9523g = (byte) 1;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f9518b = str;
    }
}
