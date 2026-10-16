package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aemp extends defpackage.aelu implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aemp() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aemq.a;
    }

    public java.lang.Object clone() {
        return defpackage.aemq.a;
    }

    @Override // defpackage.aelu, defpackage.aemo
    public final boolean d(long j) {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aefe) && ((defpackage.aefe) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aemo
    public final int s(long j) {
        return 0;
    }

    @Override // defpackage.aelu, defpackage.aefe
    public final int size() {
        return 0;
    }

    public java.lang.String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
