package Yf;

import A.C0230x;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class m extends E4.F {

    /* renamed from: e, reason: collision with root package name */
    public final Xf.c f16868e;

    /* renamed from: f, reason: collision with root package name */
    public int f16869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0230x c0230x, Xf.c json) {
        super(c0230x, 6);
        AbstractC3340k.e(json, "json");
        this.f16868e = json;
    }

    @Override // E4.F
    public final void e() {
        this.f2853b = true;
        this.f16869f++;
    }

    @Override // E4.F
    public final void i() {
        this.f2853b = false;
        p("\n");
        int i5 = this.f16869f;
        for (int i10 = 0; i10 < i5; i10++) {
            p(this.f16868e.f16252a.f16276g);
        }
    }

    @Override // E4.F
    public final void j() {
        if (this.f2853b) {
            this.f2853b = false;
        } else {
            i();
        }
    }

    @Override // E4.F
    public final void t() {
        m(' ');
    }

    @Override // E4.F
    public final void u() {
        this.f16869f--;
    }
}
