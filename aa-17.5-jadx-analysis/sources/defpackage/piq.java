package defpackage;

/* loaded from: classes2.dex */
public final class piq extends pis {
    private final trn a;

    public piq(trn trnVar) {
        this.a = trnVar;
    }

    @Override // defpackage.pis, defpackage.piu
    public final trn a() {
        return this.a;
    }

    @Override // defpackage.piu
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof piu) {
            piu piuVar = (piu) obj;
            if (piuVar.b() == 2 && this.a.equals(piuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RegistrationId{callout=" + this.a.toString() + "}";
    }
}
