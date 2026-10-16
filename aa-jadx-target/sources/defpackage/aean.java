package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aean {
    final defpackage.adml a;
    final java.lang.Object b;

    public aean(defpackage.adml admlVar, java.lang.Object obj) {
        this.a = admlVar;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.aean aeanVar = (defpackage.aean) obj;
            if (j$.util.Objects.equals(this.a, aeanVar.a) && j$.util.Objects.equals(this.b, aeanVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("provider", this.a);
        xymVarBy.b("config", this.b);
        return xymVarBy.toString();
    }
}
