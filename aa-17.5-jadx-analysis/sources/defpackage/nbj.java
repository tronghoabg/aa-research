package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class nbj {
    public final List a;
    public final loz b;
    public final boolean c;

    public nbj(List list, loz lozVar, boolean z) {
        list.getClass();
        this.a = list;
        this.b = lozVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbj)) {
            return false;
        }
        nbj nbjVar = (nbj) obj;
        return affa.f(this.a, nbjVar.a) && affa.f(this.b, nbjVar.b) && this.c == nbjVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        loz lozVar = this.b;
        return ((iHashCode + (lozVar == null ? 0 : lozVar.hashCode())) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "SwitcherContext(liveItems=" + this.a + ", nowPlayingSession=" + this.b + ", loopingEnabled=" + this.c + ")";
    }
}
