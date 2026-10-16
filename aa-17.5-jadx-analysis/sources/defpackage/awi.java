package defpackage;

/* loaded from: classes.dex */
public final class awi implements awo {
    private final awo a;
    private final awo b;

    public awi(awo awoVar, awo awoVar2) {
        this.a = awoVar;
        this.b = awoVar2;
    }

    @Override // defpackage.awo
    public final int a(dlg dlgVar) {
        return Math.max(this.a.a(dlgVar), this.b.a(dlgVar));
    }

    @Override // defpackage.awo
    public final int b(dlg dlgVar, dlr dlrVar) {
        return Math.max(this.a.b(dlgVar, dlrVar), this.b.b(dlgVar, dlrVar));
    }

    @Override // defpackage.awo
    public final int c(dlg dlgVar, dlr dlrVar) {
        return Math.max(this.a.c(dlgVar, dlrVar), this.b.c(dlgVar, dlrVar));
    }

    @Override // defpackage.awo
    public final int d(dlg dlgVar) {
        return Math.max(this.a.d(dlgVar), this.b.d(dlgVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awi)) {
            return false;
        }
        awi awiVar = (awi) obj;
        return affa.f(awiVar.a, this.a) && affa.f(awiVar.b, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
