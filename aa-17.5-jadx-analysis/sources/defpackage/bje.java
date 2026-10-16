package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bje extends cxt<bjg> {
    private final deu a;
    private final dfw b;
    private final afec c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final List i;
    private final afec j;
    private final biy k = null;
    private final cjy l = null;
    private final afec m;
    private final wci n;

    public bje(deu deuVar, dfw dfwVar, wci wciVar, afec afecVar, int i, boolean z, int i2, int i3, List list, afec afecVar2, afec afecVar3) {
        this.a = deuVar;
        this.b = dfwVar;
        this.n = wciVar;
        this.c = afecVar;
        this.d = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = afecVar2;
        this.m = afecVar3;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bjg(this.a, this.b, this.n, this.c, this.d, this.f, this.g, this.h, this.i, this.j, null, this.m);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bjg bjgVar = (bjg) cfxVar;
        dfw dfwVar = this.b;
        bjgVar.l(bjgVar.r(dfwVar), bjgVar.o(this.a), bjgVar.s(dfwVar, this.i, this.h, this.g, this.f, this.n, this.d), bjgVar.n(this.c, this.j, null, this.m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bje)) {
            return false;
        }
        bje bjeVar = (bje) obj;
        cjy cjyVar = bjeVar.l;
        if (!affa.f(this.a, bjeVar.a) || !affa.f(this.b, bjeVar.b) || !affa.f(this.i, bjeVar.i) || !affa.f(this.n, bjeVar.n) || this.c != bjeVar.c || this.m != bjeVar.m || this.d != bjeVar.d || this.f != bjeVar.f || this.g != bjeVar.g || this.h != bjeVar.h || this.j != bjeVar.j) {
            return false;
        }
        biy biyVar = bjeVar.k;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        afec afecVar = this.c;
        int iHashCode2 = ((((((((((iHashCode * 31) + (afecVar != null ? afecVar.hashCode() : 0)) * 31) + this.d) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        afec afecVar2 = this.j;
        int iHashCode4 = iHashCode3 + (afecVar2 != null ? afecVar2.hashCode() : 0);
        afec afecVar3 = this.m;
        return (iHashCode4 * 29791) + (afecVar3 != null ? afecVar3.hashCode() : 0);
    }
}
