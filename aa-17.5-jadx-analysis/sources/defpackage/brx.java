package defpackage;

/* loaded from: classes.dex */
public final class brx {
    public final ckv a;
    public final ckv b;
    public final ckv c;

    public brx(ckv ckvVar, ckv ckvVar2, ckv ckvVar3) {
        this.a = ckvVar;
        this.b = ckvVar2;
        this.c = ckvVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof brx)) {
            return false;
        }
        brx brxVar = (brx) obj;
        return affa.f(this.a, brxVar.a) && affa.f(this.b, brxVar.b) && affa.f(this.c, brxVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
