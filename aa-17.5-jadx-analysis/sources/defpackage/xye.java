package defpackage;

/* loaded from: classes.dex */
public final class xye implements xyc {
    private volatile xyc a;
    private Object b;
    private final afep c = new afep();

    public xye(xyc xycVar) {
        xycVar.getClass();
        this.a = xycVar;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        if (this.a != null) {
            synchronized (this.c) {
                if (this.a != null) {
                    Object objGu = this.a.gu();
                    this.b = objGu;
                    this.a = null;
                    return objGu;
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "<supplier that returned " + String.valueOf(this.b) + ">";
        }
        return a.bW(obj, "Suppliers.memoize(", ")");
    }
}
