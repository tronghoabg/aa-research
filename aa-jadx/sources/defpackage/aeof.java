package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aeof<V> extends defpackage.aely<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeof() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aeog.a;
    }

    @Override // defpackage.aely, defpackage.aeoe
    public final boolean c(long j) {
        return false;
    }

    public java.lang.Object clone() {
        return defpackage.aeog.a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aeoe
    public final java.lang.Object p(long j) {
        return null;
    }

    @Override // defpackage.aely, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
