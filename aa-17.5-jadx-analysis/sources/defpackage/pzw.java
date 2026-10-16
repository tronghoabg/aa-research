package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pzw {
    public final zcf a;
    private final int b = 0;

    public pzw(zcf zcfVar) {
        this.a = zcfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzw)) {
            return false;
        }
        pzw pzwVar = (pzw) obj;
        if (this.a != pzwVar.a) {
            return false;
        }
        int i = pzwVar.b;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.c();
        xxgVarAo.b("action", this.a);
        xxgVarAo.b("cardinalDirection", null);
        return xxgVarAo.toString();
    }
}
