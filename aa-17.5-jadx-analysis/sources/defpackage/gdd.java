package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class gdd implements hju {
    public final afec a;
    public final afec b;
    public final afec c;
    public final Map d;

    public gdd(afec afecVar, afec afecVar2, afec afecVar3, Map map) {
        this.a = afecVar;
        this.b = afecVar2;
        this.c = afecVar3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdd)) {
            return false;
        }
        gdd gddVar = (gdd) obj;
        return affa.f(this.a, gddVar.a) && affa.f(this.b, gddVar.b) && affa.f(this.c, gddVar.c) && affa.f(this.d, gddVar.d);
    }

    public final int hashCode() {
        afec afecVar = this.a;
        int iHashCode = afecVar == null ? 0 : afecVar.hashCode();
        afec afecVar2 = this.b;
        int iHashCode2 = afecVar2 == null ? 0 : afecVar2.hashCode();
        int i = iHashCode * 31;
        afec afecVar3 = this.c;
        return ((((i + iHashCode2) * 31) + (afecVar3 != null ? afecVar3.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "KeypadUiModel(onKeyLongPress=" + this.a + ", onKeyDown=" + this.b + ", onKeyUp=" + this.c + ", keyToSecondaryText=" + this.d + ")";
    }

    public gdd() {
        this(null, null, null, afbf.a);
    }
}
