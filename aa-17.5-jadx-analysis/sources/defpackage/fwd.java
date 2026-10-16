package defpackage;

/* loaded from: classes2.dex */
public final class fwd {
    public final int a;
    public final int b;

    public fwd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwd)) {
            return false;
        }
        fwd fwdVar = (fwd) obj;
        return this.a == fwdVar.a && this.b == fwdVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActionButtonColor(colorDarkMode=" + this.a + ", colorLightMode=" + this.b + ")";
    }
}
