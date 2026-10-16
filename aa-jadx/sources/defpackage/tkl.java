package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tkl {
    private boolean a;
    public final java.util.List k = new java.util.ArrayList();
    public java.lang.Object l;

    private final boolean c() {
        if (this.l == null) {
            return false;
        }
        java.util.List list = this.k;
        if (list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((defpackage.tkl) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    protected abstract java.lang.Object a();

    public abstract java.lang.String b();

    public final java.lang.Object d() throws defpackage.tkk {
        java.lang.Object obj;
        if (!f() && c() && (obj = this.l) != null) {
            return obj;
        }
        try {
            java.lang.Object objA = a();
            this.a = false;
            this.l = objA;
            return objA;
        } catch (java.lang.Throwable th) {
            throw new defpackage.tkk("Error building node for ".concat(b()), th);
        }
    }

    public final void e() {
        this.a = true;
    }

    public final boolean f() {
        if (this.a) {
            return true;
        }
        java.util.List list = this.k;
        if (list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((defpackage.tkl) it.next()).f()) {
                return true;
            }
        }
        return false;
    }
}
