package defpackage;

/* loaded from: classes.dex */
public final class cft implements cfy {
    public final cfy a;
    public final cfy b;

    public cft(cfy cfyVar, cfy cfyVar2) {
        this.a = cfyVar;
        this.b = cfyVar2;
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return cfyVar == cfy.e ? this : new cft(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final Object b(Object obj, afeg afegVar) {
        return this.b.b(this.a.b(obj, afegVar), afegVar);
    }

    @Override // defpackage.cfy
    public final boolean c(afec afecVar) {
        return this.a.c(afecVar) && this.b.c(afecVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cft)) {
            return false;
        }
        cft cftVar = (cft) obj;
        return affa.f(this.a, cftVar.a) && affa.f(this.b, cftVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) b(new StringBuilder("["), new bni(8));
        sb.append("]");
        return sb.toString();
    }
}
