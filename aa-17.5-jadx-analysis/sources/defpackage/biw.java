package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class biw extends cxt<bix> {
    private final deu a;
    private final dfw b;
    private final afec c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final List i;
    private final afec j;
    private final biy k;
    private final cjy l = null;
    private final bek m = null;
    private final wci n;

    public biw(deu deuVar, dfw dfwVar, wci wciVar, afec afecVar, int i, boolean z, int i2, int i3, List list, afec afecVar2, biy biyVar) {
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
        this.k = biyVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bix(this.a, this.b, this.n, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bix bixVar = (bix) cfxVar;
        bjg bjgVar = bixVar.b;
        dfw dfwVar = this.b;
        afec afecVar = this.c;
        afec afecVar2 = this.j;
        biy biyVar = this.k;
        bjgVar.l(bjgVar.r(dfwVar), bjgVar.o(this.a), bjgVar.s(dfwVar, this.i, this.h, this.g, this.f, this.n, this.d), bjgVar.n(afecVar, afecVar2, biyVar, null));
        if (bixVar.c && !affa.f(biyVar, bixVar.a)) {
            biy biyVar2 = bixVar.a;
            if (biyVar2 != null) {
                biyVar2.b();
            }
            biyVar.a();
        }
        biyVar.c(bixVar.l());
        bixVar.a = biyVar;
        bzi.q(bixVar).I();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biw)) {
            return false;
        }
        biw biwVar = (biw) obj;
        cjy cjyVar = biwVar.l;
        if (!affa.f(this.a, biwVar.a) || !affa.f(this.b, biwVar.b) || !affa.f(this.i, biwVar.i) || !affa.f(this.n, biwVar.n)) {
            return false;
        }
        bek bekVar = biwVar.m;
        return this.c == biwVar.c && this.d == biwVar.d && this.f == biwVar.f && this.g == biwVar.g && this.h == biwVar.h && this.j == biwVar.j && affa.f(this.k, biwVar.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        afec afecVar = this.c;
        int iHashCode2 = ((((((((((iHashCode * 31) + (afecVar != null ? afecVar.hashCode() : 0)) * 31) + this.d) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        afec afecVar2 = this.j;
        return (((iHashCode3 + (afecVar2 != null ? afecVar2.hashCode() : 0)) * 31) + this.k.hashCode()) * 961;
    }
}
