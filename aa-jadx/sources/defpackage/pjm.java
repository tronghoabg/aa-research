package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjm extends defpackage.pjo {
    private final defpackage.tsl a;

    public pjm(defpackage.tsl tslVar) {
        this.a = tslVar;
    }

    @Override // defpackage.pjo, defpackage.pjp
    public final defpackage.tsl a() {
        return this.a;
    }

    @Override // defpackage.pjp
    public final int b() {
        return 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.pjp) {
            defpackage.pjp pjpVar = (defpackage.pjp) obj;
            if (pjpVar.b() == 2 && this.a.equals(pjpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RegistrationId{callout=" + this.a.toString() + "}";
    }
}
