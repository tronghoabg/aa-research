package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aebe implements defpackage.aebf {
    private final java.net.URI a;

    public aebe(java.net.URI uri) {
        uri.getClass();
        this.a = uri;
    }

    @Override // defpackage.aebf
    public final defpackage.adns a(defpackage.adnp adnpVar, defpackage.adnn adnnVar) {
        return adnpVar.b(this.a, adnnVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aebe) {
            return this.a.equals(((defpackage.aebe) obj).a);
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
