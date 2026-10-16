package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ylk<T> extends yln<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final yln a;

    public ylk(yln ylnVar) {
        this.a = ylnVar;
    }

    @Override // defpackage.yln
    public final yln a() {
        return this.a.a();
    }

    @Override // defpackage.yln
    public final yln c() {
        return this.a.c().a();
    }

    @Override // defpackage.yln, java.util.Comparator
    public final int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylk) {
            return this.a.equals(((ylk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-921210296);
    }

    public final String toString() {
        return this.a.toString().concat(".nullsLast()");
    }

    @Override // defpackage.yln
    public final yln b() {
        return this;
    }
}
