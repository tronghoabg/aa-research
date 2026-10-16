package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dna implements ctp {
    private final /* synthetic */ int d;
    public static final dna c = new dna(2);
    public static final dna b = new dna(1);
    public static final dna a = new dna(0);

    public dna(int i) {
        this.d = i;
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            int size = list.size();
            if (size == 0) {
                return ctsVar.eK(0, 0, afbf.a, ebq.b);
            }
            if (size == 1) {
                cuo cuoVarV = ((cto) list.get(0)).v(j);
                return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new dmz(cuoVarV, 0));
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int iMax = 0;
            int iMax2 = 0;
            while (i2 < size2) {
                cuo cuoVarV2 = ((cto) list.get(i2)).v(j);
                iMax = Math.max(iMax, cuoVarV2.a);
                iMax2 = Math.max(iMax2, cuoVarV2.b);
                arrayList.add(cuoVarV2);
                i2++;
            }
            return ctsVar.eK(iMax, iMax2, afbf.a, new dmz(arrayList, 2));
        }
        if (i != 1) {
            ctsVar.getClass();
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new ewc(12));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size3 = list.size();
        int iC = 0;
        int iD = 0;
        while (i2 < size3) {
            cuo cuoVarV3 = ((cto) list.get(i2)).v(j);
            iD = Math.max(iD, cuoVarV3.a);
            iC = Math.max(iC, cuoVarV3.b);
            arrayList2.add(cuoVarV3);
            i2++;
        }
        if (list.isEmpty()) {
            iD = dle.d(j);
            iC = dle.c(j);
        }
        return ctsVar.eK(iD, iC, afbf.a, new ddz(arrayList2, 9));
    }
}
