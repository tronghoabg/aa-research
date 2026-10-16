package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbl implements java.lang.Cloneable, java.io.Serializable {
    public static final defpackage.ajpy[] a = new defpackage.ajpy[0];
    private static final long serialVersionUID = 2608834160639271617L;
    public final java.util.List b = new java.util.ArrayList(16);

    public final void a(defpackage.ajpy ajpyVar) {
        if (ajpyVar == null) {
            return;
        }
        this.b.add(ajpyVar);
    }

    public final void b() {
        this.b.clear();
    }

    public final void c(defpackage.ajpy[] ajpyVarArr) {
        b();
        if (ajpyVarArr == null) {
            return;
        }
        java.util.Collections.addAll(this.b, ajpyVarArr);
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final defpackage.ajpy[] d() {
        java.util.List list = this.b;
        return (defpackage.ajpy[]) list.toArray(new defpackage.ajpy[list.size()]);
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
