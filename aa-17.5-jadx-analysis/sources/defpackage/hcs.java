package defpackage;

/* loaded from: classes2.dex */
public final class hcs implements hcw {
    public final fxo a;

    public hcs(fxo fxoVar) {
        this.a = fxoVar;
    }

    @Override // defpackage.hcw
    public final void a(cfy cfyVar, boolean z, hjw hjwVar, bux buxVar, int i) {
        cfyVar.getClass();
        buxVar.v(438168870);
        hjw hjwVar2 = hjw.a;
        int i2 = i >> 9;
        int i3 = i << 3;
        gtz.d(this, cfyVar, z, hjwVar, buxVar, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168));
        ((bvv) buxVar).Y(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcs) && affa.f(this.a, ((hcs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action(action=" + this.a + ")";
    }
}
