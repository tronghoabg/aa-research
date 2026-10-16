package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xzj implements java.io.Serializable, defpackage.xzi {
    private static final long serialVersionUID = 0;
    final defpackage.xzi a;
    volatile transient boolean b;
    transient java.lang.Object c;
    private transient defpackage.affp d = new defpackage.affp();

    public xzj(defpackage.xzi xziVar) {
        xziVar.getClass();
        this.a = xziVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.d = new defpackage.affp();
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    java.lang.Object objFF = this.a.fF();
                    this.c = objFF;
                    this.b = true;
                    return objFF;
                }
            }
        }
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.b) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return defpackage.a.bV(obj, "Suppliers.memoize(", ")");
    }
}
