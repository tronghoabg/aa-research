package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aejb<V> extends defpackage.aehh<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aejb() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aejc.a;
    }

    @Override // defpackage.aehh, defpackage.aeja
    public final boolean c(int i) {
        return false;
    }

    public java.lang.Object clone() {
        return defpackage.aejc.a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    @Override // defpackage.aeja
    public final java.lang.Object h(int i) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aehh, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
