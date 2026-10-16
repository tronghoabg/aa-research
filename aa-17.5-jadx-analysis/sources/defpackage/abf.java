package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class abf implements ctp {
    public final abk a;
    public cuo[] b;
    public cuo[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final afec h = new aai(this, 4);
    private final afec i = new aai(this, 5);

    public abf(abk abkVar) {
        this.a = abkVar;
    }

    @Override // defpackage.ctp
    public final int a(csq csqVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((csp) list.get(0)).c(i));
            int iBh = woy.bh(list);
            if (iBh > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((csp) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iBh) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ctp
    public final int b(csq csqVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((csp) list.get(0)).d(i));
            int iBh = woy.bh(list);
            if (iBh > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((csp) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iBh) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ctp
    public final int c(csq csqVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((csp) list.get(0)).e(i));
            int iBh = woy.bh(list);
            if (iBh > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((csp) list.get(i2)).e(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iBh) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ctp
    public final int d(csq csqVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((csp) list.get(0)).f(i));
            int iBh = woy.bh(list);
            if (iBh > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((csp) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iBh) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        aezu aezuVar;
        abk abkVar = this.a;
        cfn cfnVar = abkVar.b;
        int size = list.size();
        cuo[] cuoVarArr = new cuo[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            cto ctoVar = (cto) list.get(i);
            Object objG = ctoVar.g();
            abj abjVar = objG instanceof abj ? (abj) objG : null;
            if (abjVar != null && ((Boolean) abjVar.a.a()).booleanValue()) {
                cuo cuoVarV = ctoVar.v(j);
                long j3 = cuoVarV.b & 4294967295L;
                cuoVarArr[i] = cuoVarV;
                j2 = j3 | (cuoVarV.a << 32);
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            cto ctoVar2 = (cto) list.get(i2);
            if (cuoVarArr[i2] == null) {
                cuoVarArr[i2] = ctoVar2.v(j);
            }
        }
        if (ctsVar.eM()) {
            aezuVar = new aezu(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                cuo cuoVar = cuoVarArr[i5];
                if (cuoVar != null) {
                    Object objG2 = ((cto) list.get(i5)).g();
                    abj abjVar2 = objG2 instanceof abj ? (abj) objG2 : null;
                    if (abjVar2 == null || !((Boolean) abjVar2.b.a()).booleanValue()) {
                        int i6 = cuoVar.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = cuoVar.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            aezuVar = new aezu(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) aezuVar.a).intValue();
        int iIntValue2 = ((Number) aezuVar.b).intValue();
        if (ctsVar.eM()) {
            this.b = cuoVarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return ctsVar.eK(iIntValue, iIntValue2, afbf.a, this.h);
        }
        abkVar.d.b(new dlq((iIntValue << 32) | (iIntValue2 & 4294967295L)));
        this.c = cuoVarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return ctsVar.eK(iIntValue, iIntValue2, afbf.a, this.i);
    }
}
