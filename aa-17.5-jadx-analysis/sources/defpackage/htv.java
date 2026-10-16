package defpackage;

/* loaded from: classes2.dex */
public final class htv extends hts {
    public final Object a;
    private final htx b;

    public htv(htx htxVar, Object obj) {
        this.b = htxVar;
        this.a = obj;
        int iOrdinal = htxVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new aezs();
        }
    }

    @Override // defpackage.hts
    public final htx a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htv)) {
            return false;
        }
        htv htvVar = (htv) obj;
        return this.b == htvVar.b && affa.f(this.a, htvVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Resource(status=" + this.b + ", resource=" + this.a + ")";
    }
}
