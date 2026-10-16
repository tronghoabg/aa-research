package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dqq extends dqu {
    public dqn[] aJ;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public float g = 0.5f;
    public float h = 0.5f;
    public float i = 0.5f;
    public float j = 0.5f;
    public float k = 0.5f;
    public float aB = 0.5f;
    public int aC = 0;
    public int aD = 0;
    public int aE = 2;
    public int aF = 2;
    public int aG = 0;
    public int aH = -1;
    public int aI = 0;
    private final ArrayList aY = new ArrayList();
    private dqn[] aZ = null;
    private dqn[] ba = null;
    private int[] bb = null;
    public int aK = 0;

    @Override // defpackage.dqn
    public final void a(doy doyVar, boolean z) {
        dqn dqnVar;
        float f;
        int i;
        super.a(doyVar, z);
        dqn dqnVar2 = this.ae;
        boolean z2 = dqnVar2 != null && ((dqo) dqnVar2).d;
        int i2 = this.aG;
        if (i2 == 0) {
            ArrayList arrayList = this.aY;
            if (arrayList.size() > 0) {
                ((dqp) arrayList.get(0)).d(z2, 0, true);
            }
        } else if (i2 == 1) {
            ArrayList arrayList2 = this.aY;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ((dqp) arrayList2.get(i3)).d(z2, i3, i3 == size + (-1));
                i3++;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                ArrayList arrayList3 = this.aY;
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    ((dqp) arrayList3.get(i4)).d(z2, i4, i4 == size2 + (-1));
                    i4++;
                }
            }
        } else if (this.bb != null && this.ba != null && this.aZ != null) {
            for (int i5 = 0; i5 < this.aK; i5++) {
                this.aJ[i5].v();
            }
            int[] iArr = this.bb;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f2 = this.g;
            dqn dqnVar3 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z2) {
                    i = (i6 - i8) - 1;
                    f = 1.0f - this.g;
                } else {
                    f = f2;
                    i = i8;
                }
                dqn dqnVar4 = this.ba[i];
                if (dqnVar4 != null && dqnVar4.ar != 8) {
                    if (i8 == 0) {
                        dqnVar4.q(dqnVar4.T, this.T, this.aR);
                        dqnVar4.at = this.a;
                        dqnVar4.ao = f;
                        i8 = 0;
                    }
                    if (i8 == i6 - 1) {
                        dqnVar4.q(dqnVar4.V, this.V, this.aS);
                    }
                    if (i8 > 0 && dqnVar3 != null) {
                        dqm dqmVar = dqnVar4.T;
                        int i9 = this.aC;
                        dqm dqmVar2 = dqnVar3.V;
                        dqnVar4.q(dqmVar, dqmVar2, i9);
                        dqnVar3.q(dqmVar2, dqmVar, 0);
                    }
                    dqnVar3 = dqnVar4;
                }
                i8++;
                f2 = f;
            }
            int i10 = 0;
            while (i10 < i7) {
                dqn dqnVar5 = this.aZ[i10];
                if (dqnVar5 != null && dqnVar5.ar != 8) {
                    if (i10 == 0) {
                        dqnVar5.q(dqnVar5.U, this.U, this.aN);
                        dqnVar5.au = this.b;
                        dqnVar5.ap = this.h;
                        i10 = 0;
                    }
                    if (i10 == i7 - 1) {
                        dqnVar5.q(dqnVar5.W, this.W, this.aO);
                    }
                    if (i10 > 0 && dqnVar3 != null) {
                        dqm dqmVar3 = dqnVar5.U;
                        int i11 = this.aD;
                        dqm dqmVar4 = dqnVar3.W;
                        dqnVar5.q(dqmVar3, dqmVar4, i11);
                        dqnVar3.q(dqmVar4, dqmVar3, 0);
                    }
                    dqnVar3 = dqnVar5;
                }
                i10++;
            }
            for (int i12 = 0; i12 < i6; i12++) {
                for (int i13 = 0; i13 < i7; i13++) {
                    int i14 = (i13 * i6) + i12;
                    if (this.aI == 1) {
                        i14 = (i12 * i7) + i13;
                    }
                    dqn[] dqnVarArr = this.aJ;
                    if (i14 < dqnVarArr.length && (dqnVar = dqnVarArr[i14]) != null && dqnVar.ar != 8) {
                        dqn dqnVar6 = this.ba[i12];
                        dqn dqnVar7 = this.aZ[i13];
                        if (dqnVar != dqnVar6) {
                            dqnVar.q(dqnVar.T, dqnVar6.T, 0);
                            dqnVar.q(dqnVar.V, dqnVar6.V, 0);
                        }
                        if (dqnVar != dqnVar7) {
                            dqnVar.q(dqnVar.U, dqnVar7.U, 0);
                            dqnVar.q(dqnVar.W, dqnVar7.W, 0);
                        }
                    }
                }
            }
        }
        this.aT = false;
    }

    public final int ae(dqn dqnVar, int i) {
        dqn dqnVar2;
        if (dqnVar == null) {
            return 0;
        }
        if (dqnVar.W() == 3) {
            int i2 = dqnVar.C;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dqnVar.H * i);
                if (i3 != dqnVar.j()) {
                    dqnVar.r = true;
                    ak(dqnVar, 1, i3, dqnVar.X(), dqnVar.h());
                }
                return i3;
            }
            dqnVar2 = dqnVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((dqnVar2.h() * dqnVar2.ah) + 0.5f);
            }
        } else {
            dqnVar2 = dqnVar;
        }
        return dqnVar2.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
    @Override // defpackage.dqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqq.b(int, int, int, int):void");
    }

    public final int c(dqn dqnVar, int i) {
        dqn dqnVar2;
        if (dqnVar == null) {
            return 0;
        }
        if (dqnVar.X() == 3) {
            int i2 = dqnVar.D;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dqnVar.K * i);
                if (i3 != dqnVar.h()) {
                    dqnVar.r = true;
                    ak(dqnVar, dqnVar.W(), dqnVar.j(), 1, i3);
                }
                return i3;
            }
            dqnVar2 = dqnVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((dqnVar2.j() * dqnVar2.ah) + 0.5f);
            }
        } else {
            dqnVar2 = dqnVar;
        }
        return dqnVar2.h();
    }
}
