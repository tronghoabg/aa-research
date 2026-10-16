package com.waze.config;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f22630a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22631b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22632c;

    /* renamed from: d, reason: collision with root package name */
    private final e f22633d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f22634e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22635f;

    f(int i2, String str, int i3, String str2, e eVar) {
        h.g.b.x.f(this, "config");
        this.f22634e = h.g.a(new com.waze.asks.ad(this, 15));
        h.g.b.x.f(this, "config");
        h.g.a(new com.waze.asks.ad(this, 14));
        this.f22630a = i2;
        this.f22631b = str;
        this.f22635f = i3;
        this.f22632c = str2;
        this.f22633d = eVar;
    }

    public abstract Object b();

    public abstract void d(Object obj);

    public final int e() {
        return this.f22630a;
    }

    final Object f() {
        return this.f22633d.a();
    }

    public final String g() {
        return this.f22631b;
    }

    public final String h() {
        return com.waze.n.ac.r().b(this);
    }

    public final String i() {
        return this.f22632c;
    }

    public final String j() {
        return this.f22632c;
    }

    public final kotlinx.coroutines.b.k k() {
        return (kotlinx.coroutines.b.k) this.f22634e.getValue();
    }

    public final kotlinx.coroutines.b.ch l() {
        return (kotlinx.coroutines.b.ch) this.f22634e.getValue();
    }

    public final boolean m() {
        return com.waze.n.ac.r().k(this);
    }

    public final boolean n() {
        return com.waze.n.ac.r().l(this);
    }

    public final int o() {
        return this.f22635f;
    }
}
