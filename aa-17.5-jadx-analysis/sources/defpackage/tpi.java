package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tpi {
    public final toi a;
    public final toi b;
    public final toi c;
    public final toi d;
    public final tok e;

    public tpi(toi toiVar, toi toiVar2, toi toiVar3, toi toiVar4, tok tokVar) {
        this.a = toiVar;
        this.b = toiVar2;
        this.c = toiVar3;
        this.d = toiVar4;
        this.e = tokVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpi)) {
            return false;
        }
        tpi tpiVar = (tpi) obj;
        return this.a.equals(tpiVar.a) && this.b.equals(tpiVar.b) && this.c.equals(tpiVar.c) && this.d.equals(tpiVar.d) && this.e.equals(tpiVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("nearLeft", this.a);
        xxgVarAo.b("nearRight", this.b);
        xxgVarAo.b("farLeft", this.c);
        xxgVarAo.b("farRight", this.d);
        xxgVarAo.b("latLngBounds", this.e);
        return xxgVarAo.toString();
    }
}
