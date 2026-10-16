package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ong {
    public final int a;
    public final int b;

    public ong(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ong)) {
            return false;
        }
        defpackage.ong ongVar = (defpackage.ong) obj;
        return this.a == ongVar.a && this.b == ongVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "BackgroundColors(colorNormal=" + this.a + ", colorFocused=" + this.b + ")";
    }
}
