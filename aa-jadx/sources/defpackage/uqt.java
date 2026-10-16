package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class uqt {
    private java.lang.ref.Reference a;

    private static final java.lang.Object c(java.lang.ref.Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    protected abstract java.lang.Object a();

    public java.lang.Object b() {
        java.lang.Object objC = c(this.a);
        if (objC != null) {
            return objC;
        }
        synchronized (this) {
            java.lang.Object objC2 = c(this.a);
            if (objC2 != null) {
                return objC2;
            }
            java.lang.Object objA = a();
            if (objA == null) {
                return null;
            }
            this.a = new java.lang.ref.SoftReference(objA);
            return objA;
        }
    }
}
