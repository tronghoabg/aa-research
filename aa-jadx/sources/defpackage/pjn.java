package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjn extends defpackage.pjo {
    private final defpackage.tsr a;

    public pjn(defpackage.tsr tsrVar) {
        this.a = tsrVar;
    }

    @Override // defpackage.pjp
    public final int b() {
        return 1;
    }

    @Override // defpackage.pjo, defpackage.pjp
    public final defpackage.tsr c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.pjp) {
            defpackage.pjp pjpVar = (defpackage.pjp) obj;
            if (pjpVar.b() == 1 && this.a.equals(pjpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RegistrationId{cvo=" + this.a.toString() + "}";
    }
}
