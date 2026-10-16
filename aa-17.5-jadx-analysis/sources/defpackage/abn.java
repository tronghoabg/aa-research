package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class abn implements ctp {
    private final abv a;
    private boolean b;

    public abn(abv abvVar) {
        this.a = abvVar;
    }

    @Override // defpackage.ctp
    public final int a(csq csqVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((csp) list.get(0)).c(i);
        int iBh = woy.bh(list);
        if (iBh > 0) {
            int i2 = 1;
            while (true) {
                int iC2 = ((csp) list.get(i2)).c(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == iBh) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // defpackage.ctp
    public final int b(csq csqVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((csp) list.get(0)).d(i);
        int iBh = woy.bh(list);
        if (iBh > 0) {
            int i2 = 1;
            while (true) {
                int iD2 = ((csp) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == iBh) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // defpackage.ctp
    public final int c(csq csqVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE = ((csp) list.get(0)).e(i);
        int iBh = woy.bh(list);
        if (iBh > 0) {
            int i2 = 1;
            while (true) {
                int iE2 = ((csp) list.get(i2)).e(i);
                if (iE2 > iE) {
                    iE = iE2;
                }
                if (i2 == iBh) {
                    break;
                }
                i2++;
            }
        }
        return iE;
    }

    @Override // defpackage.ctp
    public final int d(csq csqVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((csp) list.get(0)).f(i);
        int iBh = woy.bh(list);
        if (iBh > 0) {
            int i2 = 1;
            while (true) {
                int iF2 = ((csp) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == iBh) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            cuo cuoVarV = ((cto) list.get(i)).v(j);
            iMax2 = Math.max(iMax2, cuoVarV.a);
            iMax = Math.max(iMax, cuoVarV.b);
            arrayList.add(cuoVarV);
        }
        if (ctsVar.eM()) {
            this.b = true;
            this.a.b.b(new dlq((iMax2 << 32) | (4294967295L & iMax)));
        } else if (!this.b) {
            this.a.b.b(new dlq((iMax2 << 32) | (4294967295L & iMax)));
        }
        return ctsVar.eK(iMax2, iMax, afbf.a, new aai(arrayList, 8));
    }
}
