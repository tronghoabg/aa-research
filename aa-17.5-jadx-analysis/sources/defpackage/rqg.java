package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
final class rqg {
    public final ygr a;

    public rqg(ygr ygrVar) {
        if (ygrVar == null) {
            throw new NullPointerException("Null batchKeys");
        }
        this.a = ygrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqg) {
            return this.a.equals(((rqg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return String.format(Locale.US, "UiEventBatchConfig{batchKeys=[%s]}", yrm.am(this.a, new ikj(16)));
    }

    public rqg() {
        throw null;
    }
}
