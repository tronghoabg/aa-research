package Yf;

import A.C0230x;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class k extends E4.F {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16866e;

    public k(C0230x c0230x, boolean z2) {
        super(c0230x, 6);
        this.f16866e = z2;
    }

    @Override // E4.F
    public final void r(String value) {
        AbstractC3340k.e(value, "value");
        if (this.f16866e) {
            super.r(value);
        } else {
            p(value);
        }
    }
}
