package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adot {
    private final defpackage.ador a;
    private final java.lang.Object b;

    public adot(defpackage.ador adorVar, java.lang.Object obj) {
        this.a = adorVar;
        this.b = obj;
    }

    public static defpackage.adot b(defpackage.ador adorVar) {
        adorVar.getClass();
        defpackage.adot adotVar = new defpackage.adot(adorVar, null);
        defpackage.ysr.bc(!adorVar.g(), "cannot use OK status: %s", adorVar);
        return adotVar;
    }

    public final defpackage.ador a() {
        defpackage.ador adorVar = this.a;
        return adorVar == null ? defpackage.ador.b : adorVar;
    }

    public final java.lang.Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adot)) {
            return false;
        }
        defpackage.adot adotVar = (defpackage.adot) obj;
        if (d() == adotVar.d()) {
            return d() ? j$.util.Objects.equals(this.b, adotVar.b) : j$.util.Objects.equals(this.a, adotVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        defpackage.ador adorVar = this.a;
        if (adorVar == null) {
            xymVarBy.b("value", this.b);
        } else {
            xymVarBy.b("error", adorVar);
        }
        return xymVarBy.toString();
    }
}
