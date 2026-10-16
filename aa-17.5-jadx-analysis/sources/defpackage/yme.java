package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class yme<T> extends yln<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final yln a;

    public yme(yln ylnVar) {
        this.a = ylnVar;
    }

    @Override // defpackage.yln
    public final yln c() {
        return this.a;
    }

    @Override // defpackage.yln, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yme) {
            return this.a.equals(((yme) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
