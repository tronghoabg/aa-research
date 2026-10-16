package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ylj<T> extends yln<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final yln a;

    public ylj(yln ylnVar) {
        this.a = ylnVar;
    }

    @Override // defpackage.yln
    public final yln b() {
        return this.a.b();
    }

    @Override // defpackage.yln
    public final yln c() {
        return this.a.c().b();
    }

    @Override // defpackage.yln, java.util.Comparator
    public final int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylj) {
            return this.a.equals(((ylj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.a.toString().concat(".nullsFirst()");
    }

    @Override // defpackage.yln
    public final yln a() {
        return this;
    }
}
