package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class fth {
    public static final fth a = new fth(afbf.a);
    public final Map b;

    public fth(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fth) && affa.f(this.b, ((fth) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.b + ")";
    }
}
