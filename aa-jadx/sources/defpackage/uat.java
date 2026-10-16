package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uat {
    public static final defpackage.uat a = new defpackage.uat(null, new defpackage.tpr(new defpackage.tpm(), new defpackage.tpm()));
    public final defpackage.uas b;
    public final defpackage.tox c;
    public defpackage.tpm d = null;

    public uat(defpackage.uas uasVar, defpackage.tox toxVar) {
        this.b = uasVar;
        this.c = toxVar;
    }

    public final defpackage.tox a() {
        defpackage.tox toxVar = this.c;
        return toxVar instanceof defpackage.toy ? toxVar.a() : toxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.uat)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.uat uatVar = (defpackage.uat) obj;
        return j$.util.Objects.equals(this.b, uatVar.b) && j$.util.Objects.equals(a(), uatVar.a());
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.b, a());
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s - %s", this.b, this.c.a());
    }
}
