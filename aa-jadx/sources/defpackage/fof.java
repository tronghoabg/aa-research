package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fof {
    public final java.lang.String a;
    public final int b;

    public fof(java.lang.String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fof)) {
            return false;
        }
        defpackage.fof fofVar = (defpackage.fof) obj;
        return defpackage.afga.f(this.a, fofVar.a) && this.b == fofVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ")";
    }
}
