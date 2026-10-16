package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aeox<V> extends defpackage.aemb<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeox() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aeoy.a;
    }

    @Override // defpackage.aemb, defpackage.aeow
    public final boolean c(long j) {
        return false;
    }

    public java.lang.Object clone() {
        return defpackage.aeoy.a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    @Override // defpackage.aeow
    public final java.lang.Object h(long j) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aemb, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
