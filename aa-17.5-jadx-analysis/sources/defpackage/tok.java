package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class tok implements Serializable {
    public final toi a;
    public final toi b;

    public tok(toi toiVar, toi toiVar2) {
        double d = toiVar2.a;
        double d2 = toiVar.a;
        woy.W(d >= d2, "Southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(toiVar2.a));
        this.a = toiVar;
        this.b = toiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tok)) {
            return false;
        }
        tok tokVar = (tok) obj;
        return this.a.equals(tokVar.a) && this.b.equals(tokVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("southwest", this.a);
        xxgVarAo.b("northeast", this.b);
        return xxgVarAo.toString();
    }

    public tok() {
        this.b = new toi(0.0d, 0.0d);
        this.a = new toi(0.0d, 0.0d);
    }
}
