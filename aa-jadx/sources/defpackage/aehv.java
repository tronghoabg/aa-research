package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aehv<V> extends defpackage.aehe<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aehv() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aehw.a;
    }

    @Override // defpackage.aehe, defpackage.aehu
    public final boolean c(int i) {
        return false;
    }

    public java.lang.Object clone() {
        return defpackage.aehw.a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aehu
    public final java.lang.Object p(int i) {
        return null;
    }

    @Override // defpackage.aehe, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
