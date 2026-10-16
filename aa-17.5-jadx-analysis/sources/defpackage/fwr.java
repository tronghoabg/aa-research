package defpackage;

/* loaded from: classes2.dex */
public final class fwr implements fxo {
    public final fwy a;
    public final boolean b;

    static {
        hjw hjwVar = hjw.a;
    }

    public fwr(fwy fwyVar, boolean z) {
        this.a = fwyVar;
        this.b = z;
    }

    @Override // defpackage.fxo
    public final gcq a() {
        return this.a.b;
    }

    @Override // defpackage.fxo
    public final afdr b() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwr)) {
            return false;
        }
        fwr fwrVar = (fwr) obj;
        return affa.f(this.a, fwrVar.a) && this.b == fwrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "ApphostMapActionButtonUiModel(carActionButtonUiModel=" + this.a + ", isVisible=" + this.b + ")";
    }
}
