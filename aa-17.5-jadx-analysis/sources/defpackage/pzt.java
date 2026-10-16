package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class pzt implements Serializable {
    public final qag a;
    private final pzs b;
    private final xxh c;
    private final xxh d;

    public pzt(qag qagVar, pzs pzsVar, xxh xxhVar, xxh xxhVar2) {
        qagVar.getClass();
        this.a = qagVar;
        this.b = pzsVar;
        this.c = xxhVar;
        this.d = xxhVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pzt) {
            pzt pztVar = (pzt) obj;
            if (this.a.equals(pztVar.a) && this.b.equals(pztVar.b) && this.c.equals(pztVar.c) && this.d.equals(pztVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a.a + ", " + this.b.toString() + ", " + this.c.toString() + ", " + this.d.toString() + "}";
    }

    public pzt() {
        throw null;
    }
}
