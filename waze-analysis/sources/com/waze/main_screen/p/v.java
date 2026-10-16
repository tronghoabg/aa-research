package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class v implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f27354a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27355b;

    public /* synthetic */ v(Object obj, int i2) {
        this.f27355b = i2;
        this.f27354a = obj;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f27355b;
        if (i2 == 0) {
            return y.a((bf) this.f27354a);
        }
        if (i2 == 1) {
            return y.b((bf) this.f27354a);
        }
        if (i2 == 2) {
            return Integer.valueOf(bf.a((bf) this.f27354a));
        }
        Object obj = this.f27354a;
        return i2 != 3 ? bs.s((bs) obj) : bs.t((bs) obj);
    }
}
