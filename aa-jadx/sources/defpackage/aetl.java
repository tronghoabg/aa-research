package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aetl<K, V> extends defpackage.aern<K, V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aetl() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aetm.a;
    }

    public java.lang.Object clone() {
        return defpackage.aetm.a;
    }

    @Override // defpackage.aern, defpackage.aefe
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    @Override // defpackage.aetk, defpackage.aefe
    public final V get(java.lang.Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aern, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
