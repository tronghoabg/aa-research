package A6;

import E5.q0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f390a;

    /* renamed from: b, reason: collision with root package name */
    public int f391b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f392c;

    /* renamed from: d, reason: collision with root package name */
    public int f393d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394e;

    /* renamed from: f, reason: collision with root package name */
    public int f395f;

    /* renamed from: g, reason: collision with root package name */
    public Object f396g;

    public d() {
        this.f390a = false;
        this.f391b = -1;
        this.f393d = 0;
        this.f392c = false;
        this.f395f = 1;
        this.f394e = false;
    }

    public void a(int i5) {
        this.f390a |= i5 > 0;
        this.f391b += i5;
    }

    public d(q0 q0Var) {
        this.f396g = q0Var;
    }
}
