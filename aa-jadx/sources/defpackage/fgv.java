package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fgv {
    public android.view.View b;
    public final java.util.Map a = new java.util.HashMap();
    final java.util.ArrayList c = new java.util.ArrayList();

    public fgv(android.view.View view) {
        this.b = view;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.fgv)) {
            return false;
        }
        defpackage.fgv fgvVar = (defpackage.fgv) obj;
        return this.b == fgvVar.b && this.a.equals(fgvVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String strConcat = (("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        java.util.Map map = this.a;
        for (java.lang.String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    @java.lang.Deprecated
    public fgv() {
    }
}
