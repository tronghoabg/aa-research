package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class atl implements ctp {
    public final cfn a;
    private final boolean b;

    public atl(cfn cfnVar, boolean z) {
        this.a = cfnVar;
        this.b = z;
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        cuo cuoVarV;
        int iMax;
        int iMax2;
        if (list.isEmpty()) {
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new ajc(19));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            cto ctoVar = (cto) list.get(0);
            ath athVarA = atk.a(ctoVar);
            if (athVarA == null || !athVarA.b) {
                cuoVarV = ctoVar.v(j2);
                iMax = Math.max(dle.d(j), cuoVarV.a);
                iMax2 = Math.max(dle.c(j), cuoVarV.b);
            } else {
                iMax = dle.d(j);
                iMax2 = dle.c(j);
                cuoVarV = ctoVar.v(dlf.v(dle.d(j), dle.c(j)));
            }
            int i = iMax2;
            cuo cuoVar = cuoVarV;
            int i2 = iMax;
            return ctsVar.eK(i2, i, afbf.a, new atq(cuoVar, ctoVar, ctsVar, i2, i, this, 1));
        }
        cuo[] cuoVarArr = new cuo[list.size()];
        afft afftVar = new afft();
        afftVar.a = dle.d(j);
        afft afftVar2 = new afft();
        afftVar2.a = dle.c(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            cto ctoVar2 = (cto) list.get(i3);
            ath athVarA2 = atk.a(ctoVar2);
            if (athVarA2 == null || !athVarA2.b) {
                cuo cuoVarV2 = ctoVar2.v(j2);
                cuoVarArr[i3] = cuoVarV2;
                afftVar.a = Math.max(afftVar.a, cuoVarV2.a);
                afftVar2.a = Math.max(afftVar2.a, cuoVarV2.b);
            } else {
                z = true;
            }
        }
        if (z) {
            int i4 = afftVar.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = afftVar2.a;
            long jD = dlf.d(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                cto ctoVar3 = (cto) list.get(i7);
                ath athVarA3 = atk.a(ctoVar3);
                if (athVarA3 != null && athVarA3.b) {
                    cuoVarArr[i7] = ctoVar3.v(jD);
                }
            }
        }
        return ctsVar.eK(afftVar.a, afftVar2.a, afbf.a, new nmy(cuoVarArr, list, ctsVar, afftVar, afftVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atl)) {
            return false;
        }
        atl atlVar = (atl) obj;
        return affa.f(this.a, atlVar.a) && this.b == atlVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
