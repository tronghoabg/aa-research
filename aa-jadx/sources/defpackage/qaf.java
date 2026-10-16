package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qaf {
    private final int a;
    private final int b;
    private final int c;

    public qaf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qaf)) {
            return false;
        }
        defpackage.qaf qafVar = (defpackage.qaf) obj;
        return this.a == qafVar.a && this.b == qafVar.b && this.c == qafVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return this.a + "." + this.b + "." + this.c;
    }
}
