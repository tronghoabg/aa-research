package com.google.android.gms.common.api.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private bf f4784a;

    /* renamed from: b, reason: collision with root package name */
    private bf f4785b;

    /* renamed from: d, reason: collision with root package name */
    private au f4787d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.gms.common.f[] f4788e;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f4786c = new bc(0);

    /* renamed from: f, reason: collision with root package name */
    private boolean f4789f = true;

    /* synthetic */ bd() {
    }

    public final be a() {
        av.d(this.f4784a != null, "Must set register function");
        av.d(this.f4785b != null, "Must set unregister function");
        av.d(this.f4787d != null, "Must set holder");
        av.n(this.f4787d.a(), "Key must not be null");
        return new be(new bb(this, this.f4787d, this.f4788e, this.f4789f), new bq(this), this.f4786c);
    }

    public final void d(bf bfVar) {
        this.f4784a = bfVar;
    }

    public final void e() {
        this.f4789f = false;
    }

    public final void f(com.google.android.gms.common.f... fVarArr) {
        this.f4788e = fVarArr;
    }

    public final void g(bf bfVar) {
        this.f4785b = bfVar;
    }

    public final void h(au auVar) {
        this.f4787d = auVar;
    }
}
