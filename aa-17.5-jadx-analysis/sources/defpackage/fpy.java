package defpackage;

/* loaded from: classes2.dex */
public final class fpy extends fpz {
    public final cmw a;
    public final ftg b;

    public fpy(cmw cmwVar, ftg ftgVar) {
        ftgVar.getClass();
        this.a = cmwVar;
        this.b = ftgVar;
    }

    @Override // defpackage.fpz
    public final cmw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpy)) {
            return false;
        }
        fpy fpyVar = (fpy) obj;
        return affa.f(this.a, fpyVar.a) && affa.f(this.b, fpyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
