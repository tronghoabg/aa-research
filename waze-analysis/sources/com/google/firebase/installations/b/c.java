package com.google.firebase.installations.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f9979a;

    /* renamed from: b, reason: collision with root package name */
    private String f9980b;

    /* renamed from: c, reason: collision with root package name */
    private String f9981c;

    /* renamed from: d, reason: collision with root package name */
    private long f9982d;

    /* renamed from: e, reason: collision with root package name */
    private long f9983e;

    /* renamed from: f, reason: collision with root package name */
    private String f9984f;

    /* renamed from: g, reason: collision with root package name */
    private byte f9985g = 3;

    /* renamed from: h, reason: collision with root package name */
    private int f9986h;

    c(d dVar) {
        this.f9979a = dVar.j();
        this.f9986h = dVar.m();
        this.f9980b = dVar.i();
        this.f9981c = dVar.l();
        this.f9982d = dVar.f();
        this.f9983e = dVar.g();
        this.f9984f = dVar.k();
    }

    public final d a() {
        if (this.f9985g == 3 && this.f9986h != 0) {
            return new d(this.f9979a, this.f9986h, this.f9980b, this.f9981c, this.f9982d, this.f9983e, this.f9984f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9986h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f9985g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f9985g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.f9980b = str;
    }

    public final void c(long j2) {
        this.f9982d = j2;
        this.f9985g = (byte) (this.f9985g | 1);
    }

    public final void d(String str) {
        this.f9979a = str;
    }

    public final void e(String str) {
        this.f9984f = str;
    }

    public final void f(String str) {
        this.f9981c = str;
    }

    public final void g(int i2) {
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f9986h = i2;
    }

    public final void h(long j2) {
        this.f9983e = j2;
        this.f9985g = (byte) (this.f9985g | 2);
    }
}
