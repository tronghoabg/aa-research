package k1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* loaded from: classes.dex */
public class o0 extends n0 {
    public o0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // k1.s0
    public v0 a() {
        return v0.g(null, this.f38853c.consumeDisplayCutout());
    }

    @Override // k1.s0
    public C3121h e() {
        DisplayCutout displayCutout = this.f38853c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C3121h(displayCutout);
    }

    @Override // k1.m0, k1.s0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Objects.equals(this.f38853c, o0Var.f38853c) && Objects.equals(this.f38857g, o0Var.f38857g) && m0.B(this.f38858h, o0Var.f38858h);
    }

    @Override // k1.s0
    public int hashCode() {
        return this.f38853c.hashCode();
    }
}
