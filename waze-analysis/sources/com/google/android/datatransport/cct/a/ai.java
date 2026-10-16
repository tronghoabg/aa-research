package com.google.android.datatransport.cct.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private long f3944a;

    /* renamed from: b, reason: collision with root package name */
    private long f3945b;

    /* renamed from: c, reason: collision with root package name */
    private z f3946c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f3947d;

    /* renamed from: e, reason: collision with root package name */
    private String f3948e;

    /* renamed from: f, reason: collision with root package name */
    private List f3949f;

    /* renamed from: g, reason: collision with root package name */
    private ap f3950g;

    /* renamed from: h, reason: collision with root package name */
    private byte f3951h;

    public final aj a() {
        if (this.f3951h == 3) {
            return new v(this.f3944a, this.f3945b, this.f3946c, this.f3947d, this.f3948e, this.f3949f, this.f3950g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f3951h & 1) == 0) {
            sb.append(" requestTimeMs");
        }
        if ((this.f3951h & 2) == 0) {
            sb.append(" requestUptimeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(z zVar) {
        this.f3946c = zVar;
    }

    public final void c(List list) {
        this.f3949f = list;
    }

    public final void d(ap apVar) {
        this.f3950g = apVar;
    }

    public final void e(long j2) {
        this.f3944a = j2;
        this.f3951h = (byte) (this.f3951h | 1);
    }

    public final void f(long j2) {
        this.f3945b = j2;
        this.f3951h = (byte) (this.f3951h | 2);
    }

    public final void g(int i2) {
        this.f3947d = Integer.valueOf(i2);
    }

    public final void h(String str) {
        this.f3948e = str;
    }
}
