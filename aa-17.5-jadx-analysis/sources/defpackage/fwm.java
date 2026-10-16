package defpackage;

/* loaded from: classes2.dex */
public final class fwm implements hju {
    public final fwi a;
    public final fxo b;
    public final fwx c;

    public fwm(fwi fwiVar, fxo fxoVar, fwx fwxVar) {
        this.a = fwiVar;
        this.b = fxoVar;
        this.c = fwxVar;
        if (woy.da(new hju[]{fwiVar, fxoVar}).size() == 1) {
            return;
        }
        throw new IllegalArgumentException("ActionDelegateUiModel requires that only a single field be non-null. SPECIFIC_ACTION: [" + fwiVar + "],GENERIC_ACTION: [" + fxoVar + "]");
    }

    public static /* synthetic */ fwm a(fwm fwmVar, fwi fwiVar, fxo fxoVar, fwx fwxVar, int i) {
        if ((i & 1) != 0) {
            fwiVar = fwmVar.a;
        }
        if ((i & 2) != 0) {
            fxoVar = fwmVar.b;
        }
        if ((i & 4) != 0) {
            fwxVar = fwmVar.c;
        }
        return new fwm(fwiVar, fxoVar, fwxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwm)) {
            return false;
        }
        fwm fwmVar = (fwm) obj;
        return affa.f(this.a, fwmVar.a) && affa.f(this.b, fwmVar.b) && this.c == fwmVar.c;
    }

    public final int hashCode() {
        fwi fwiVar = this.a;
        int iHashCode = fwiVar == null ? 0 : fwiVar.hashCode();
        fxo fxoVar = this.b;
        int iHashCode2 = fxoVar == null ? 0 : fxoVar.hashCode();
        int i = iHashCode * 31;
        fwx fwxVar = this.c;
        return ((i + iHashCode2) * 31) + (fwxVar != null ? fwxVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActionDelegateUiModel(specificActionButtonUiModel=" + this.a + ", genericCarActionButtonUiModel=" + this.b + ", carActionButtonStyle=" + this.c + ")";
    }

    public fwm() {
        this(null, null, null);
    }
}
