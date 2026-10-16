package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private long f3934a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f3935b;

    /* renamed from: c, reason: collision with root package name */
    private ab f3936c;

    /* renamed from: d, reason: collision with root package name */
    private long f3937d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f3938e;

    /* renamed from: f, reason: collision with root package name */
    private String f3939f;

    /* renamed from: g, reason: collision with root package name */
    private long f3940g;

    /* renamed from: h, reason: collision with root package name */
    private ao f3941h;

    /* renamed from: i, reason: collision with root package name */
    private ac f3942i;

    /* renamed from: j, reason: collision with root package name */
    private byte f3943j;

    public final ah a() {
        if (this.f3943j == 7) {
            return new u(this.f3934a, this.f3935b, this.f3936c, this.f3937d, this.f3938e, this.f3939f, this.f3940g, this.f3941h, this.f3942i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f3943j & 1) == 0) {
            sb.append(" eventTimeMs");
        }
        if ((this.f3943j & 2) == 0) {
            sb.append(" eventUptimeMs");
        }
        if ((this.f3943j & 4) == 0) {
            sb.append(" timezoneOffsetSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ab abVar) {
        this.f3936c = abVar;
    }

    public final void c(Integer num) {
        this.f3935b = num;
    }

    public final void d(long j2) {
        this.f3934a = j2;
        this.f3943j = (byte) (this.f3943j | 1);
    }

    public final void e(long j2) {
        this.f3937d = j2;
        this.f3943j = (byte) (this.f3943j | 2);
    }

    public final void f(ac acVar) {
        this.f3942i = acVar;
    }

    public final void g(ao aoVar) {
        this.f3941h = aoVar;
    }

    final void h(byte[] bArr) {
        this.f3938e = bArr;
    }

    final void i(String str) {
        this.f3939f = str;
    }

    public final void j(long j2) {
        this.f3940g = j2;
        this.f3943j = (byte) (this.f3943j | 4);
    }
}
