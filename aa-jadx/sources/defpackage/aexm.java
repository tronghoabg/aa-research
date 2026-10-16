package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aexm<K, V> extends defpackage.aesd<K, V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aexm() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aexn.a;
    }

    public java.lang.Object clone() {
        return defpackage.aexn.a;
    }

    @Override // defpackage.aesd, defpackage.aefe
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    @Override // defpackage.aexl, defpackage.aefe
    public final V get(java.lang.Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aesd, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
