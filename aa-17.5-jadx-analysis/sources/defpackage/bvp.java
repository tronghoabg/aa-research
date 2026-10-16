package defpackage;

/* loaded from: classes.dex */
public final class bvp implements byr {
    public final bwq a;

    public bvp(bwq bwqVar) {
        this.a = bwqVar;
    }

    @Override // defpackage.byr
    public final Object a(ccx ccxVar) {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvp) && affa.f(this.a, ((bvp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
