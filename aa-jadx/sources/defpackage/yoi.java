package defpackage;

/* JADX INFO: loaded from: classes.dex */
class yoi implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.lang.Object f;
    final java.lang.Object g;

    public yoi(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        this.f = obj;
        this.g = obj2 == null ? this : obj2;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        synchronized (this.g) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final java.lang.String toString() {
        java.lang.String string;
        synchronized (this.g) {
            string = this.f.toString();
        }
        return string;
    }
}
