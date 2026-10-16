package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class atj implements ctp {
    private final /* synthetic */ int e;
    public static final atj d = new atj(3);
    public static final atj c = new atj(2);
    public static final atj b = new atj(1);
    public static final atj a = new atj(0);

    public atj(int i) {
        this.e = i;
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        int i2 = this.e;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        int i2 = this.e;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        int i2 = this.e;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        int i2 = this.e;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        int i = this.e;
        if (i == 0) {
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new ajc(18));
        }
        if (i == 1) {
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new ajc(2));
        }
        int i2 = 0;
        if (i == 2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i2 < size) {
                arrayList.add(((cto) list.get(i2)).v(j));
                i2++;
            }
            return ctsVar.eK(dle.b(j), dle.a(j), afbf.a, new bbn(arrayList, 6));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        while (i2 < size2) {
            cuo cuoVarV = ((cto) list.get(i2)).v(j);
            iMax = Math.max(iMax, cuoVarV.a);
            iMax2 = Math.max(iMax2, cuoVarV.b);
            arrayList2.add(cuoVarV);
            i2++;
        }
        return ctsVar.eK(iMax, iMax2, afbf.a, new bji(arrayList2, 8));
    }
}
