package defpackage;

/* loaded from: classes2.dex */
public final class gry implements hju {
    public final grw a;
    public final hju b;

    public gry(grw grwVar, hju hjuVar) {
        this.a = grwVar;
        this.b = hjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gry)) {
            return false;
        }
        gry gryVar = (gry) obj;
        return affa.f(this.a, gryVar.a) && affa.f(this.b, gryVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hju hjuVar = this.b;
        return iHashCode + (hjuVar == null ? 0 : hjuVar.hashCode());
    }

    public final String toString() {
        return "MessageContentWithActionsUiModel(content=" + this.a + ", contentActions=" + this.b + ")";
    }
}
