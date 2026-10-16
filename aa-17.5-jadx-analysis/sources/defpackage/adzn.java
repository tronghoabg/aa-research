package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class adzn {
    final adlk a;
    final Object b;

    public adzn(adlk adlkVar, Object obj) {
        this.a = adlkVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            adzn adznVar = (adzn) obj;
            if (Objects.equals(this.a, adznVar.a) && Objects.equals(this.b, adznVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("provider", this.a);
        xxgVarAo.b("config", this.b);
        return xxgVarAo.toString();
    }
}
