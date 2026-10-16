package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class esc {
    public final Map b = new LinkedHashMap();

    public abstract Object a(esb esbVar);

    public final boolean equals(Object obj) {
        return (obj instanceof esc) && affa.f(this.b, ((esc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ")";
    }
}
