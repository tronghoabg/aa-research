package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aewb<K> extends defpackage.aerz<K> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aewb() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aewc.a;
    }

    public java.lang.Object clone() {
        return defpackage.aewc.a;
    }

    @Override // defpackage.aerz, defpackage.aefe
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aewa
    public final int o(java.lang.Object obj) {
        return 0;
    }

    @Override // defpackage.aerz, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
