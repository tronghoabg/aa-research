package defpackage;

/* loaded from: classes2.dex */
public final class pir extends pis {
    private final trt a;

    public pir(trt trtVar) {
        this.a = trtVar;
    }

    @Override // defpackage.piu
    public final int b() {
        return 1;
    }

    @Override // defpackage.pis, defpackage.piu
    public final trt c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof piu) {
            piu piuVar = (piu) obj;
            if (piuVar.b() == 1 && this.a.equals(piuVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RegistrationId{cvo=" + this.a.toString() + "}";
    }
}
