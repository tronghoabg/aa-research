package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private String f9449a;

    /* renamed from: b, reason: collision with root package name */
    private String f9450b;

    /* renamed from: c, reason: collision with root package name */
    private String f9451c;

    /* renamed from: d, reason: collision with root package name */
    private long f9452d;

    /* renamed from: e, reason: collision with root package name */
    private Long f9453e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9454f;

    /* renamed from: g, reason: collision with root package name */
    private bl f9455g;

    /* renamed from: h, reason: collision with root package name */
    private cs f9456h;

    /* renamed from: i, reason: collision with root package name */
    private cq f9457i;

    /* renamed from: j, reason: collision with root package name */
    private bo f9458j;

    /* renamed from: k, reason: collision with root package name */
    private List f9459k;

    /* renamed from: l, reason: collision with root package name */
    private int f9460l;
    private byte m = 7;

    bm(ct ctVar) {
        this.f9449a = ctVar.i();
        this.f9450b = ctVar.j();
        this.f9451c = ctVar.h();
        this.f9452d = ctVar.b();
        this.f9453e = ctVar.g();
        this.f9454f = ctVar.l();
        this.f9455g = ctVar.c();
        this.f9456h = ctVar.f();
        this.f9457i = ctVar.e();
        this.f9458j = ctVar.d();
        this.f9459k = ctVar.k();
        this.f9460l = ctVar.a();
    }

    public final ct a() {
        String str;
        String str2;
        bl blVar;
        if (this.m == 7 && (str = this.f9449a) != null && (str2 = this.f9450b) != null && (blVar = this.f9455g) != null) {
            return new ah(str, str2, this.f9451c, this.f9452d, this.f9453e, this.f9454f, blVar, this.f9456h, this.f9457i, this.f9458j, this.f9459k, this.f9460l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9449a == null) {
            sb.append(" generator");
        }
        if (this.f9450b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f9455g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(bl blVar) {
        this.f9455g = blVar;
    }

    public final void c(String str) {
        this.f9451c = str;
    }

    public final void d(boolean z) {
        this.f9454f = z;
        this.m = (byte) (this.m | 2);
    }

    public final void e(bo boVar) {
        this.f9458j = boVar;
    }

    public final void f(Long l2) {
        this.f9453e = l2;
    }

    public final void g(List list) {
        this.f9459k = list;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null generator");
        }
        this.f9449a = str;
    }

    public final void i(int i2) {
        this.f9460l = i2;
        this.m = (byte) (this.m | 4);
    }

    public final void j(byte[] bArr) {
        n(new String(bArr, cu.f9545b));
    }

    public final void k(cq cqVar) {
        this.f9457i = cqVar;
    }

    public final void l(long j2) {
        this.f9452d = j2;
        this.m = (byte) (this.m | 1);
    }

    public final void m(cs csVar) {
        this.f9456h = csVar;
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.f9450b = str;
    }
}
