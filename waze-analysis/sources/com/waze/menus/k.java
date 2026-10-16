package com.waze.menus;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private String f29734a;

    /* renamed from: b, reason: collision with root package name */
    private String f29735b;

    /* renamed from: c, reason: collision with root package name */
    private int f29736c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29737d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.shared_infra.h.c f29738e;

    /* renamed from: f, reason: collision with root package name */
    private String f29739f;

    /* renamed from: g, reason: collision with root package name */
    private String f29740g;

    private k(String str, String str2, int i2, boolean z) {
        this.f29734a = str;
        this.f29735b = str2;
        this.f29736c = i2;
        this.f29737d = z;
        this.f29738e = com.waze.shared_infra.h.c.f37873a;
    }

    public final int c() {
        return this.f29736c;
    }

    public final com.waze.shared_infra.h.c d() {
        return this.f29738e;
    }

    public final String e() {
        return this.f29740g;
    }

    public final String f() {
        return this.f29735b;
    }

    public final String g() {
        return this.f29734a;
    }

    public final String h() {
        return this.f29739f;
    }

    public final void i(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "<set-?>");
        this.f29738e = cVar;
    }

    public final void j(String str) {
        this.f29740g = str;
    }

    public final void k(String str) {
        this.f29735b = str;
    }

    public final void l(String str) {
        this.f29734a = str;
    }

    public final void m(String str) {
        this.f29739f = str;
    }

    public final boolean n() {
        return this.f29737d;
    }

    public /* synthetic */ k(String str, int i2, boolean z) {
        this(str, "", i2, z);
    }

    public /* synthetic */ k(String str, String str2, int i2) {
        this(str, str2, i2, false);
    }
}
