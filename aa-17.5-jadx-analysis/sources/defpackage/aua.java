package defpackage;

/* loaded from: classes.dex */
public final class aua implements awo {
    private final awo a;
    private final awo b;

    public aua(awo awoVar, awo awoVar2) {
        this.a = awoVar;
        this.b = awoVar2;
    }

    @Override // defpackage.awo
    public final int a(dlg dlgVar) {
        int iA = this.a.a(dlgVar) - this.b.a(dlgVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.awo
    public final int b(dlg dlgVar, dlr dlrVar) {
        int iB = this.a.b(dlgVar, dlrVar) - this.b.b(dlgVar, dlrVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.awo
    public final int c(dlg dlgVar, dlr dlrVar) {
        int iC = this.a.c(dlgVar, dlrVar) - this.b.c(dlgVar, dlrVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.awo
    public final int d(dlg dlgVar) {
        int iD = this.a.d(dlgVar) - this.b.d(dlgVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aua)) {
            return false;
        }
        aua auaVar = (aua) obj;
        return affa.f(auaVar.a, this.a) && affa.f(auaVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
