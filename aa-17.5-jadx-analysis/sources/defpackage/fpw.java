package defpackage;

/* loaded from: classes2.dex */
public final class fpw extends fpz {
    public final fsu a;
    private final cmw b;

    public fpw(cmw cmwVar, fsu fsuVar) {
        fsuVar.getClass();
        this.b = cmwVar;
        this.a = fsuVar;
    }

    public static /* synthetic */ fpw b(fpw fpwVar, cmw cmwVar) {
        return new fpw(cmwVar, fpwVar.a);
    }

    @Override // defpackage.fpz
    public final cmw a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpw)) {
            return false;
        }
        fpw fpwVar = (fpw) obj;
        return affa.f(this.b, fpwVar.b) && affa.f(this.a, fpwVar.a);
    }

    public final int hashCode() {
        cmw cmwVar = this.b;
        return ((cmwVar == null ? 0 : cmwVar.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Error(painter=" + this.b + ", result=" + this.a + ")";
    }
}
