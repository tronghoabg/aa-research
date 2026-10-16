package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tzw {
    public static final tzw a = new tzw(null, new tot(new too(), new too()));
    public final tzv b;
    public final tnz c;
    public too d = null;

    public tzw(tzv tzvVar, tnz tnzVar) {
        this.b = tzvVar;
        this.c = tnzVar;
    }

    public final tnz a() {
        tnz tnzVar = this.c;
        return tnzVar instanceof toa ? tnzVar.a() : tnzVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tzw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        tzw tzwVar = (tzw) obj;
        return Objects.equals(this.b, tzwVar.b) && Objects.equals(a(), tzwVar.a());
    }

    public final int hashCode() {
        return Objects.hash(this.b, a());
    }

    public final String toString() {
        return String.format("%s - %s", this.b, this.c.a());
    }
}
