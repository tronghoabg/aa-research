package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class afid {
    public static final afid a = new afid(null, null);
    public final afie b;
    public final afib c;

    public afid(afie afieVar, afib afibVar) {
        this.b = afieVar;
        this.c = afibVar;
        if ((afieVar == null) == (afibVar == null)) {
        } else {
            throw new IllegalArgumentException(afieVar == null ? "Star projection must have no type specified." : a.bm(afieVar, "The projection variance ", " requires type to be specified."));
        }
    }

    public static /* synthetic */ afid a(afid afidVar, afib afibVar) {
        return new afid(afidVar.b, afibVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afid)) {
            return false;
        }
        afid afidVar = (afid) obj;
        return this.b == afidVar.b && affa.f(this.c, afidVar.c);
    }

    public final int hashCode() {
        afie afieVar = this.b;
        int iHashCode = afieVar == null ? 0 : afieVar.hashCode();
        afib afibVar = this.c;
        return (iHashCode * 31) + (afibVar != null ? afibVar.hashCode() : 0);
    }

    public final String toString() {
        afie afieVar = this.b;
        if (afieVar == null) {
            return "*";
        }
        int iOrdinal = afieVar.ordinal();
        if (iOrdinal == 0) {
            return String.valueOf(this.c);
        }
        if (iOrdinal == 1) {
            afib afibVar = this.c;
            Objects.toString(afibVar);
            return "in ".concat(String.valueOf(afibVar));
        }
        if (iOrdinal != 2) {
            throw new aezs();
        }
        afib afibVar2 = this.c;
        Objects.toString(afibVar2);
        return "out ".concat(String.valueOf(afibVar2));
    }
}
