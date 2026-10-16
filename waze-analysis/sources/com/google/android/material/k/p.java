package com.google.android.material.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private d f6682a;

    /* renamed from: b, reason: collision with root package name */
    private d f6683b;

    /* renamed from: c, reason: collision with root package name */
    private d f6684c;

    /* renamed from: d, reason: collision with root package name */
    private d f6685d;

    /* renamed from: e, reason: collision with root package name */
    private f f6686e;

    /* renamed from: f, reason: collision with root package name */
    private f f6687f;

    /* renamed from: g, reason: collision with root package name */
    private f f6688g;

    /* renamed from: h, reason: collision with root package name */
    private f f6689h;

    /* renamed from: i, reason: collision with root package name */
    private f f6690i;

    /* renamed from: j, reason: collision with root package name */
    private f f6691j;

    /* renamed from: k, reason: collision with root package name */
    private f f6692k;

    /* renamed from: l, reason: collision with root package name */
    private f f6693l;

    public p(r rVar) {
        this.f6690i = new n();
        this.f6691j = new n();
        this.f6692k = new n();
        this.f6693l = new n();
        this.f6682a = new a(0.0f);
        this.f6683b = new a(0.0f);
        this.f6684c = new a(0.0f);
        this.f6685d = new a(0.0f);
        this.f6686e = new f();
        this.f6687f = new f();
        this.f6688g = new f();
        this.f6689h = new f();
        this.f6690i = rVar.f6702i;
        this.f6691j = rVar.f6703j;
        this.f6692k = rVar.f6704k;
        this.f6693l = rVar.f6705l;
        this.f6682a = rVar.f6694a;
        this.f6683b = rVar.f6695b;
        this.f6684c = rVar.f6696c;
        this.f6685d = rVar.f6697d;
        this.f6686e = rVar.f6698e;
        this.f6687f = rVar.f6699f;
        this.f6688g = rVar.f6700g;
        this.f6689h = rVar.f6701h;
    }

    private static void F(f fVar) {
        if (fVar instanceof n) {
            float f2 = ((n) fVar).f6681a;
        } else if (fVar instanceof e) {
            float f3 = ((e) fVar).f6650a;
        }
    }

    public final void B(f fVar) {
        this.f6693l = fVar;
        F(fVar);
    }

    public final void C(f fVar) {
        this.f6692k = fVar;
        F(fVar);
    }

    public final void D(f fVar) {
        this.f6690i = fVar;
        F(fVar);
    }

    public final void E(f fVar) {
        this.f6691j = fVar;
        F(fVar);
    }

    public final r i() {
        return new r(this, null);
    }

    public final void j(f fVar) {
        this.f6688g = fVar;
    }

    public final void k(float f2) {
        this.f6685d = new a(f2);
    }

    public final void l(d dVar) {
        this.f6685d = dVar;
    }

    public final void m(float f2) {
        this.f6684c = new a(f2);
    }

    public final void n(d dVar) {
        this.f6684c = dVar;
    }

    public final void o(float f2) {
        this.f6682a = new a(f2);
    }

    public final void p(d dVar) {
        this.f6682a = dVar;
    }

    public final void q(float f2) {
        this.f6683b = new a(f2);
    }

    public final void r(d dVar) {
        this.f6683b = dVar;
    }

    public final void s(float f2) {
        o(f2);
        q(f2);
        m(f2);
        k(f2);
    }

    public final void t(int i2, d dVar) {
        B(f.f(i2));
        this.f6685d = dVar;
    }

    public final void u(int i2, d dVar) {
        C(f.f(i2));
        this.f6684c = dVar;
    }

    public final void v(int i2, d dVar) {
        D(f.f(i2));
        this.f6682a = dVar;
    }

    public final void w(int i2, d dVar) {
        E(f.f(i2));
        this.f6683b = dVar;
    }

    public p() {
        this.f6690i = new n();
        this.f6691j = new n();
        this.f6692k = new n();
        this.f6693l = new n();
        this.f6682a = new a(0.0f);
        this.f6683b = new a(0.0f);
        this.f6684c = new a(0.0f);
        this.f6685d = new a(0.0f);
        this.f6686e = new f();
        this.f6687f = new f();
        this.f6688g = new f();
        this.f6689h = new f();
    }
}
