package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class foa {
    public final java.lang.String a;
    public final int b;
    public final int c;

    public foa(java.lang.String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.foa)) {
            return false;
        }
        defpackage.foa foaVar = (defpackage.foa) obj;
        return defpackage.afga.f(this.a, foaVar.a) && this.b == foaVar.b && this.c == foaVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ")";
    }
}
