package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class afwv {
    private final int identityHashCode;
    private final java.lang.ref.WeakReference<java.lang.ClassLoader> ref;
    private java.lang.ClassLoader temporaryStrongRef;

    public afwv(java.lang.ClassLoader classLoader) {
        classLoader.getClass();
        this.ref = new java.lang.ref.WeakReference<>(classLoader);
        this.identityHashCode = java.lang.System.identityHashCode(classLoader);
        this.temporaryStrongRef = classLoader;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afwv) && this.ref.get() == ((defpackage.afwv) obj).ref.get();
    }

    public int hashCode() {
        return this.identityHashCode;
    }

    public final void setTemporaryStrongRef(java.lang.ClassLoader classLoader) {
        this.temporaryStrongRef = classLoader;
    }

    public java.lang.String toString() {
        java.lang.String string;
        java.lang.ClassLoader classLoader = this.ref.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
