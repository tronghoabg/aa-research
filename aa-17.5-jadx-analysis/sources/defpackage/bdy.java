package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
final class bdy implements csy {
    public final bfb a;
    public final int b;
    public final djy c;
    public final afdr d;

    public bdy(bfb bfbVar, int i, djy djyVar, afdr afdrVar) {
        this.a = bfbVar;
        this.b = i;
        this.c = djyVar;
        this.d = afdrVar;
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return cfyVar == cfy.e ? this : new cft(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return ((Boolean) afecVar.invoke(this)).booleanValue();
    }

    @Override // defpackage.csy
    public final /* synthetic */ int d(csq csqVar, csp cspVar, int i) {
        return tr.q(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int e(csq csqVar, csp cspVar, int i) {
        return tr.r(this, csqVar, cspVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdy)) {
            return false;
        }
        bdy bdyVar = (bdy) obj;
        return affa.f(this.a, bdyVar.a) && this.b == bdyVar.b && affa.f(this.c, bdyVar.c) && affa.f(this.d, bdyVar.d);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int f(csq csqVar, csp cspVar, int i) {
        return tr.s(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int g(csq csqVar, csp cspVar, int i) {
        return tr.t(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final ctq h(cts ctsVar, cto ctoVar, long j) {
        long j2;
        if (ctoVar.d(dle.a(j)) < dle.b(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = dle.m(j2, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13);
        }
        cuo cuoVarV = ctoVar.v(j);
        int iMin = Math.min(cuoVarV.a, dle.b(j2));
        return ctsVar.eK(iMin, cuoVarV.b, afbf.a, new bdx(this, ctsVar, cuoVarV, iMin, 0));
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
