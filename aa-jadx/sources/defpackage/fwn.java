package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fwn {
    public final int a;
    public final int b;

    public fwn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fwn)) {
            return false;
        }
        defpackage.fwn fwnVar = (defpackage.fwn) obj;
        return this.a == fwnVar.a && this.b == fwnVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "ActionButtonColor(colorDarkMode=" + this.a + ", colorLightMode=" + this.b + ")";
    }
}
