package defpackage;

/* loaded from: classes.dex */
public final class ewv {
    private final om a;
    private final eqa b;

    public ewv(om omVar, eqa eqaVar) {
        this.a = omVar;
        this.b = eqaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewv)) {
            return false;
        }
        ewv ewvVar = (ewv) obj;
        return affa.f(this.a, ewvVar.a) && affa.f(this.b, ewvVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        eqa eqaVar = this.b;
        return iHashCode + (eqaVar == null ? 0 : eqaVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ")";
    }

    public ewv() {
        throw null;
    }
}
