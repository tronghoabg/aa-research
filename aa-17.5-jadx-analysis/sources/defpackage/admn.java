package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class admn {
    public final adnq a;
    public final Object b;

    public admn(adnq adnqVar) {
        this.b = null;
        this.a = adnqVar;
        woy.S(!adnqVar.g(), "cannot use OK status: %s", adnqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            admn admnVar = (admn) obj;
            if (Objects.equals(this.a, admnVar.a) && Objects.equals(this.b, admnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            xxg xxgVarAo = woy.ao(this);
            xxgVarAo.b("config", obj);
            return xxgVarAo.toString();
        }
        xxg xxgVarAo2 = woy.ao(this);
        xxgVarAo2.b("error", this.a);
        return xxgVarAo2.toString();
    }

    public admn(Object obj) {
        this.b = obj;
        this.a = null;
    }
}
