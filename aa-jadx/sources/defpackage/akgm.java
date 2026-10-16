package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgm implements defpackage.akgl {
    public final defpackage.akgl a;

    private akgm(defpackage.akgl akglVar) {
        this.a = akglVar;
    }

    static defpackage.akgm b(defpackage.akgl akglVar) {
        if (akglVar instanceof defpackage.akgi) {
            return ((defpackage.akgi) akglVar).a;
        }
        if (akglVar instanceof defpackage.akgm) {
            return (defpackage.akgm) akglVar;
        }
        if (akglVar == null) {
            return null;
        }
        return new defpackage.akgm(akglVar);
    }

    @Override // defpackage.akgl
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.akgl
    public final int c(defpackage.akgh akghVar, java.lang.CharSequence charSequence, int i) {
        return this.a.c(akghVar, charSequence, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akgm) {
            return this.a.equals(((defpackage.akgm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
