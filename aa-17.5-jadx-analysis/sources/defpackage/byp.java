package defpackage;

/* loaded from: classes.dex */
public final class byp implements byr {
    public final Object a;

    public byp(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.byr
    public final Object a(ccx ccxVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byp) && affa.f(this.a, ((byp) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
