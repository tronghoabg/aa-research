package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eox {
    public final int a;
    public final int b;

    public eox(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.eox eoxVar = (defpackage.eox) obj;
        return this.b == eoxVar.b && this.a == eoxVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}
