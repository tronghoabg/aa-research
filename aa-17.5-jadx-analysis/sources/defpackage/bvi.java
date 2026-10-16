package defpackage;

/* loaded from: classes.dex */
public final class bvi implements byr {
    public final afec a;

    public bvi(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.byr
    public final Object a(ccx ccxVar) {
        return this.a.invoke(ccxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvi) && affa.f(this.a, ((bvi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
