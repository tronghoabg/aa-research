package defpackage;

/* loaded from: classes2.dex */
public final class gva implements hju {
    public final hju a;
    public final cjv b;

    public gva(hju hjuVar, cjv cjvVar) {
        this.a = hjuVar;
        this.b = cjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gva)) {
            return false;
        }
        gva gvaVar = (gva) obj;
        return affa.f(this.a, gvaVar.a) && affa.f(this.b, gvaVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cjv cjvVar = this.b;
        return iHashCode + (cjvVar == null ? 0 : a.g(cjvVar.a));
    }

    public final String toString() {
        return "TurnCardUiModel(content=" + this.a + ", customBackgroundColor=" + this.b + ")";
    }
}
