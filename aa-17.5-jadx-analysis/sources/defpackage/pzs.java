package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class pzs implements Serializable {
    private final int a;

    public pzs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pzs) && this.a == ((pzs) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "{" + this.a + "}";
    }

    protected pzs() {
        throw null;
    }
}
