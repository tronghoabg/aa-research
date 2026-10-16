package defpackage;

/* loaded from: classes.dex */
public final class djy {
    public final deu a;
    public final djn b;

    public djy(deu deuVar, djn djnVar) {
        this.a = deuVar;
        this.b = djnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djy)) {
            return false;
        }
        djy djyVar = (djy) obj;
        return affa.f(this.a, djyVar.a) && affa.f(this.b, djyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
