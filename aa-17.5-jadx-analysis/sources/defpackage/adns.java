package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class adns {
    private final adnq a;
    private final Object b;

    public adns(adnq adnqVar, Object obj) {
        this.a = adnqVar;
        this.b = obj;
    }

    public static adns b(adnq adnqVar) {
        adnqVar.getClass();
        adns adnsVar = new adns(adnqVar, null);
        woy.S(!adnqVar.g(), "cannot use OK status: %s", adnqVar);
        return adnsVar;
    }

    public final adnq a() {
        adnq adnqVar = this.a;
        return adnqVar == null ? adnq.b : adnqVar;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adns)) {
            return false;
        }
        adns adnsVar = (adns) obj;
        if (d() == adnsVar.d()) {
            return d() ? Objects.equals(this.b, adnsVar.b) : Objects.equals(this.a, adnsVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        adnq adnqVar = this.a;
        if (adnqVar == null) {
            xxgVarAo.b("value", this.b);
        } else {
            xxgVarAo.b("error", adnqVar);
        }
        return xxgVarAo.toString();
    }
}
