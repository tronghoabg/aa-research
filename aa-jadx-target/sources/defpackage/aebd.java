package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aebd implements aebf {
    private final defpackage.adpa a;

    public aebd(defpackage.adpa adpaVar) {
        adpaVar.getClass();
        this.a = adpaVar;
    }

    public final defpackage.adns a(defpackage.adnp adnpVar, defpackage.adnn adnnVar) {
        return adnpVar.a(this.a, adnnVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aebd) {
            return this.a.equals(((defpackage.aebd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
