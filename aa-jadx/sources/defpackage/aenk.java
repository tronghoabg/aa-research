package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aenk extends defpackage.aelw implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aenk() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aenm.a;
    }

    @Override // defpackage.aelw, defpackage.aenj
    public final long a() {
        return 0L;
    }

    public java.lang.Object clone() {
        return defpackage.aenm.a;
    }

    @Override // defpackage.aelw, defpackage.aenj
    public final boolean e(long j) {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aelw, defpackage.aefe
    public final int size() {
        return 0;
    }

    @Override // defpackage.aenj
    public final long t(long j) {
        return 0L;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
