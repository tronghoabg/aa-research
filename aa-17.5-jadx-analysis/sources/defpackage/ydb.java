package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class ydb<T> extends yln<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public ydb(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.yln, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ydb) {
            return this.a.equals(((ydb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
