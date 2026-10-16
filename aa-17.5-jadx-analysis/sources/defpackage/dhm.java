package defpackage;

/* loaded from: classes.dex */
public final class dhm {
    private final dhr a;
    private final Object b = null;

    public dhm(dhr dhrVar) {
        this.a = dhrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhm)) {
            return false;
        }
        dhm dhmVar = (dhm) obj;
        if (!affa.f(this.a, dhmVar.a)) {
            return false;
        }
        Object obj2 = dhmVar.b;
        return affa.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
