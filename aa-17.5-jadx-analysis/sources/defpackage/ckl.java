package defpackage;

/* loaded from: classes.dex */
public final class ckl extends ckm {
    public final cjc a;
    public final cjm b;

    public ckl(cjc cjcVar) {
        this.a = cjcVar;
        cjm cjmVar = null;
        if (!byx.D(cjcVar)) {
            cjm cjmVar2 = new cjm((byte[]) null);
            cjmVar2.q(cjcVar);
            cjmVar = cjmVar2;
        }
        this.b = cjmVar;
    }

    @Override // defpackage.ckm
    public final cjb a() {
        cjc cjcVar = this.a;
        return new cjb(cjcVar.a, cjcVar.b, cjcVar.c, cjcVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckl) && affa.f(this.a, ((ckl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
