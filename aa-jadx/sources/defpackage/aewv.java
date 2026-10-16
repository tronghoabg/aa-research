package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aewv<K, V> extends defpackage.aesb<K, V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aewv() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aeww.a;
    }

    public java.lang.Object clone() {
        return defpackage.aeww.a;
    }

    @Override // defpackage.aesb, defpackage.aefe
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    @Override // defpackage.aewu, defpackage.aefe
    public final V get(java.lang.Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aesb, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
