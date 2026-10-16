package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class dqn {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int[] E;
    public int F;
    public int G;
    public float H;
    public int I;
    public int J;
    public float K;
    int L;
    float M;
    public final int[] N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public final dqm T;
    public final dqm U;
    public final dqm V;
    public final dqm W;
    public final dqm X;
    final dqm Y;
    final dqm Z;
    private boolean a;
    public final int[] aA;
    public final dqm aa;
    public final dqm[] ab;
    protected final ArrayList ac;
    public final boolean[] ad;
    public dqn ae;
    int af;
    public int ag;
    public float ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public float ao;
    public float ap;
    public Object aq;
    public int ar;
    public String as;
    public int at;
    public int au;
    public final float[] av;
    public final dqn[] aw;
    public final dqn[] ax;
    public int ay;
    public int az;
    public boolean l;
    public dqy m;
    public dqy n;
    public drg o;
    public drh p;
    public final boolean[] q;
    public boolean r;
    public int s;
    public int t;
    public final dqa u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public dqn(int i, int i2) {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new dqa(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        dqm dqmVar = new dqm(this, 2);
        this.T = dqmVar;
        dqm dqmVar2 = new dqm(this, 3);
        this.U = dqmVar2;
        dqm dqmVar3 = new dqm(this, 4);
        this.V = dqmVar3;
        dqm dqmVar4 = new dqm(this, 5);
        this.W = dqmVar4;
        dqm dqmVar5 = new dqm(this, 6);
        this.X = dqmVar5;
        this.Y = new dqm(this, 8);
        this.Z = new dqm(this, 9);
        dqm dqmVar6 = new dqm(this, 7);
        this.aa = dqmVar6;
        this.ab = new dqm[]{dqmVar, dqmVar3, dqmVar2, dqmVar4, dqmVar5, dqmVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.ah = BitmapDescriptorFactory.HUE_RED;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new dqn[]{null, null};
        this.ax = new dqn[]{null, null};
        this.ay = -1;
        this.az = -1;
        this.af = i;
        this.ag = i2;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b9 A[PHI: r0
  0x04b9: PHI (r0v17 int) = (r0v16 int), (r0v21 int), (r0v21 int), (r0v21 int) binds: [B:284:0x04a9, B:286:0x04af, B:287:0x04b1, B:289:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ae(defpackage.doy r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.dpb r34, defpackage.dpb r35, int r36, boolean r37, defpackage.dqm r38, defpackage.dqm r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqn.ae(doy, boolean, boolean, boolean, boolean, dpb, dpb, int, boolean, dqm, dqm, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private final void b() {
        ArrayList arrayList = this.ac;
        arrayList.add(this.T);
        arrayList.add(this.U);
        arrayList.add(this.V);
        arrayList.add(this.W);
        arrayList.add(this.Y);
        arrayList.add(this.Z);
        arrayList.add(this.aa);
        arrayList.add(this.X);
    }

    private final boolean c(int i) {
        dqm dqmVar;
        dqm dqmVar2;
        dqm[] dqmVarArr = this.ab;
        int i2 = i + i;
        dqm dqmVar3 = dqmVarArr[i2];
        dqm dqmVar4 = dqmVar3.e;
        return (dqmVar4 == null || dqmVar4.e == dqmVar3 || (dqmVar2 = (dqmVar = dqmVarArr[i2 + 1]).e) == null || dqmVar2.e != dqmVar) ? false : true;
    }

    public final void A(int i, int i2) {
        if (this.w) {
            return;
        }
        this.U.f(i);
        this.W.f(i2);
        this.ak = i;
        this.ag = i2 - i;
        if (this.P) {
            this.X.f(i + this.al);
        }
        this.w = true;
    }

    public final void B(int i) {
        this.ag = i;
        int i2 = this.an;
        if (i < i2) {
            this.ag = i2;
        }
    }

    public final void C(int i, int i2, int i3, float f) {
        this.C = i;
        this.F = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.G = i3;
        this.H = f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f || i != 0) {
            return;
        }
        this.C = 2;
    }

    public final void D(float f) {
        this.av[0] = f;
    }

    protected final void E(int i, boolean z) {
        this.ad[i] = z;
    }

    public final void F(int i, int i2) {
        this.R = i;
        this.S = i2;
        this.r = false;
    }

    public final void G(int i) {
        this.N[1] = i;
    }

    public final void H(int i) {
        this.N[0] = i;
    }

    public final void I(int i) {
        if (i < 0) {
            this.an = 0;
        } else {
            this.an = i;
        }
    }

    public final void J(int i) {
        if (i < 0) {
            this.am = 0;
        } else {
            this.am = i;
        }
    }

    public final void K(int i, int i2, int i3, float f) {
        this.D = i;
        this.I = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.J = i3;
        this.K = f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f || i != 0) {
            return;
        }
        this.D = 2;
    }

    public final void L(float f) {
        this.av[1] = f;
    }

    public final void M(int i) {
        this.af = i;
        int i2 = this.am;
        if (i < i2) {
            this.af = i2;
        }
    }

    public void N(boolean z, boolean z2) {
        int i;
        int i2;
        drg drgVar = this.o;
        boolean z3 = z & drgVar.g;
        drh drhVar = this.p;
        boolean z4 = z2 & drhVar.g;
        int i3 = drgVar.h.f;
        int i4 = drhVar.h.f;
        int i5 = drgVar.i.f;
        int i6 = drhVar.i.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aj = i3;
        }
        if (z4) {
            this.ak = i4;
        }
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.aA[0] == 1 && i8 < (i2 = this.af)) {
                i8 = i2;
            }
            this.af = i8;
            int i9 = this.am;
            if (i8 < i9) {
                this.af = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.aA[1] == 1 && i10 < (i = this.ag)) {
                i10 = i;
            }
            this.ag = i10;
            int i11 = this.an;
            if (i10 < i11) {
                this.ag = i11;
            }
        }
    }

    final boolean O() {
        return (this instanceof dqu) || (this instanceof dqr);
    }

    public final boolean P(int i) {
        if (i == 0) {
            return (this.T.e != null ? 1 : 0) + (this.V.e != null ? 1 : 0) < 2;
        }
        return ((this.U.e != null ? 1 : 0) + (this.W.e != null ? 1 : 0)) + (this.X.e != null ? 1 : 0) < 2;
    }

    public final boolean Q(int i, int i2) {
        dqm dqmVar;
        dqm dqmVar2;
        dqm dqmVar3;
        dqm dqmVar4;
        if (i == 0) {
            dqm dqmVar5 = this.T;
            dqm dqmVar6 = dqmVar5.e;
            return dqmVar6 != null && dqmVar6.c && (dqmVar4 = (dqmVar3 = this.V).e) != null && dqmVar4.c && (dqmVar4.a() - dqmVar3.b()) - (dqmVar5.e.a() + dqmVar5.b()) >= i2;
        }
        dqm dqmVar7 = this.U;
        dqm dqmVar8 = dqmVar7.e;
        if (dqmVar8 != null && dqmVar8.c && (dqmVar2 = (dqmVar = this.W).e) != null && dqmVar2.c && (dqmVar2.a() - dqmVar.b()) - (dqmVar7.e.a() + dqmVar7.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        dqm dqmVar = this.T;
        dqm dqmVar2 = dqmVar.e;
        if (dqmVar2 != null && dqmVar2.e == dqmVar) {
            return true;
        }
        dqm dqmVar3 = this.V;
        dqm dqmVar4 = dqmVar3.e;
        return dqmVar4 != null && dqmVar4.e == dqmVar3;
    }

    public final boolean S() {
        dqm dqmVar = this.U;
        dqm dqmVar2 = dqmVar.e;
        if (dqmVar2 != null && dqmVar2.e == dqmVar) {
            return true;
        }
        dqm dqmVar3 = this.W;
        dqm dqmVar4 = dqmVar3.e;
        return dqmVar4 != null && dqmVar4.e == dqmVar3;
    }

    public final boolean T() {
        return this.r && this.ar != 8;
    }

    public dqm U(int i) {
        switch (i - 1) {
            case 1:
                return this.T;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.X;
            case 6:
                return this.aa;
            case 7:
                return this.Y;
            default:
                return this.Z;
        }
    }

    public final int V(int i) {
        return i == 0 ? W() : X();
    }

    public final int W() {
        return this.aA[0];
    }

    public final int X() {
        return this.aA[1];
    }

    public final void Y(int i, dqn dqnVar, int i2, int i3) {
        int i4;
        boolean z;
        int i5 = 4;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2) {
                    i2 = 2;
                } else if (i2 != 4) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return;
                        } else {
                            i2 = 5;
                        }
                    }
                    Y(3, dqnVar, i2, 0);
                    Y(5, dqnVar, i2, 0);
                    U(7).l(dqnVar.U(i2), 0, Integer.MIN_VALUE, false);
                    return;
                }
                Y(2, dqnVar, i2, 0);
                Y(4, dqnVar, i2, 0);
                U(7).l(dqnVar.U(i2), 0, Integer.MIN_VALUE, false);
                return;
            }
            dqm dqmVarU = U(2);
            dqm dqmVarU2 = U(4);
            dqm dqmVarU3 = U(3);
            dqm dqmVarU4 = U(5);
            boolean z2 = true;
            if ((dqmVarU == null || !dqmVarU.j()) && (dqmVarU2 == null || !dqmVarU2.j())) {
                Y(2, dqnVar, 2, 0);
                Y(4, dqnVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((dqmVarU3 == null || !dqmVarU3.j()) && (dqmVarU4 == null || !dqmVarU4.j())) {
                Y(3, dqnVar, 3, 0);
                Y(5, dqnVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                U(7).l(dqnVar.U(7), 0, Integer.MIN_VALUE, false);
                return;
            } else if (z) {
                U(8).l(dqnVar.U(8), 0, Integer.MIN_VALUE, false);
                return;
            } else {
                if (z2) {
                    U(9).l(dqnVar.U(9), 0, Integer.MIN_VALUE, false);
                    return;
                }
                return;
            }
        }
        if (i == 8) {
            if (i2 == 2) {
                i4 = 2;
            } else if (i2 == 4) {
                i4 = 4;
            } else {
                i = 8;
            }
            dqm dqmVarU5 = U(2);
            dqm dqmVarU6 = dqnVar.U(i4);
            dqm dqmVarU7 = U(4);
            dqmVarU5.l(dqmVarU6, 0, Integer.MIN_VALUE, false);
            dqmVarU7.l(dqmVarU6, 0, Integer.MIN_VALUE, false);
            U(8).l(dqmVarU6, 0, Integer.MIN_VALUE, false);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            dqm dqmVarU8 = dqnVar.U(i2);
            U(3).l(dqmVarU8, 0, Integer.MIN_VALUE, false);
            U(5).l(dqmVarU8, 0, Integer.MIN_VALUE, false);
            U(9).l(dqmVarU8, 0, Integer.MIN_VALUE, false);
            return;
        }
        if (i == 8 && i2 == 8) {
            U(2).l(dqnVar.U(2), 0, Integer.MIN_VALUE, false);
            U(4).l(dqnVar.U(4), 0, Integer.MIN_VALUE, false);
            U(8).l(dqnVar.U(8), 0, Integer.MIN_VALUE, false);
            return;
        }
        if (i == 9 && i2 == 9) {
            U(3).l(dqnVar.U(3), 0, Integer.MIN_VALUE, false);
            U(5).l(dqnVar.U(5), 0, Integer.MIN_VALUE, false);
            U(9).l(dqnVar.U(9), 0, Integer.MIN_VALUE, false);
            return;
        }
        dqm dqmVarU9 = U(i);
        dqm dqmVarU10 = dqnVar.U(i2);
        if (dqmVarU9.k(dqmVarU10)) {
            if (i == 6) {
                dqm dqmVarU11 = U(3);
                dqm dqmVarU12 = U(5);
                if (dqmVarU11 != null) {
                    dqmVarU11.e();
                }
                if (dqmVarU12 != null) {
                    dqmVarU12.e();
                }
            } else if (i == 3 || i == 5) {
                dqm dqmVarU13 = U(6);
                if (dqmVarU13 != null) {
                    dqmVarU13.e();
                }
                dqm dqmVarU14 = U(7);
                if (dqmVarU14.e != dqmVarU10) {
                    dqmVarU14.e();
                }
                dqm dqmVarC = U(i).c();
                dqm dqmVarU15 = U(9);
                if (dqmVarU15.j()) {
                    dqmVarC.e();
                    dqmVarU15.e();
                }
            } else {
                if (i == 2) {
                    i5 = i;
                } else if (i == 4) {
                }
                dqm dqmVarU16 = U(7);
                if (dqmVarU16.e != dqmVarU10) {
                    dqmVarU16.e();
                }
                dqm dqmVarC2 = U(i5).c();
                dqm dqmVarU17 = U(8);
                if (dqmVarU17.j()) {
                    dqmVarC2.e();
                    dqmVarU17.e();
                }
            }
            dqmVarU9.l(dqmVarU10, i3, Integer.MIN_VALUE, false);
        }
    }

    public final void Z(int i, dqn dqnVar, int i2, int i3, int i4) {
        U(i).l(dqnVar.U(i2), i3, i4, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v44, types: [dqo] */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.doy r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqn.a(doy, boolean):void");
    }

    public final void aa(int i) {
        this.aA[0] = i;
    }

    public final void ab(int i) {
        this.aA[1] = i;
    }

    public void ac(boolean z) {
        int i;
        drh drhVar;
        drg drgVar;
        dqm dqmVar = this.W;
        dqm dqmVar2 = this.V;
        dqm dqmVar3 = this.U;
        int iO = doy.o(this.T);
        int iO2 = doy.o(dqmVar3);
        int iO3 = doy.o(dqmVar2);
        int iO4 = doy.o(dqmVar);
        if (z && (drgVar = this.o) != null) {
            drb drbVar = drgVar.h;
            if (drbVar.i) {
                drb drbVar2 = drgVar.i;
                if (drbVar2.i) {
                    iO = drbVar.f;
                    iO3 = drbVar2.f;
                }
            }
        }
        if (z && (drhVar = this.p) != null) {
            drb drbVar3 = drhVar.h;
            if (drbVar3.i) {
                drb drbVar4 = drhVar.i;
                if (drbVar4.i) {
                    iO2 = drbVar3.f;
                    iO4 = drbVar4.f;
                }
            }
        }
        if (iO3 - iO < 0 || iO4 - iO2 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO4 = 0;
            iO3 = 0;
            iO2 = 0;
            iO = 0;
        }
        this.aj = iO;
        this.ak = iO2;
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        int i2 = iO3 - iO;
        int[] iArr = this.aA;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.af;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = iO4 - iO2;
        if (iArr[1] == 1 && i5 < (i = this.ag)) {
            i5 = i;
        }
        this.af = i2;
        this.ag = i5;
        int i6 = this.an;
        if (i5 < i6) {
            this.ag = i6;
        }
        int i7 = this.am;
        if (i2 < i7) {
            this.af = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.G;
        if (i8 > 0 && i3 == 3) {
            this.af = Math.min(i7, i8);
        }
        int i9 = this.J;
        if (i9 > 0 && iArr[1] == 3) {
            this.ag = Math.min(this.ag, i9);
        }
        int i10 = this.af;
        if (i2 != i10) {
            this.s = i10;
        }
        int i11 = this.ag;
        if (i5 != i11) {
            this.t = i11;
        }
    }

    public void ad(lah lahVar) {
        this.T.m();
        this.U.m();
        this.V.m();
        this.W.m();
        this.X.m();
        this.aa.m();
        this.Y.m();
        this.Z.m();
    }

    public boolean ay() {
        return this.ar != 8;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        return this.T.c && this.V.c;
    }

    public boolean f() {
        if (this.w) {
            return true;
        }
        return this.U.c && this.W.c;
    }

    public final int g() {
        return l() + this.ag;
    }

    public final int h() {
        if (this.ar == 8) {
            return 0;
        }
        return this.ag;
    }

    public final int i() {
        return k() + this.af;
    }

    public final int j() {
        if (this.ar == 8) {
            return 0;
        }
        return this.af;
    }

    public final int k() {
        dqn dqnVar = this.ae;
        return (dqnVar == null || !(dqnVar instanceof dqo)) ? this.aj : ((dqo) dqnVar).f + this.aj;
    }

    public final int l() {
        dqn dqnVar = this.ae;
        return (dqnVar == null || !(dqnVar instanceof dqo)) ? this.ak : ((dqo) dqnVar).g + this.ak;
    }

    public final dqn m(int i) {
        dqm dqmVar;
        dqm dqmVar2;
        if (i == 0) {
            dqm dqmVar3 = this.V;
            dqmVar2 = dqmVar3.e;
            if (dqmVar2 == null || dqmVar2.e != dqmVar3) {
                return null;
            }
        } else if (i != 1 || (dqmVar2 = (dqmVar = this.W).e) == null || dqmVar2.e != dqmVar) {
            return null;
        }
        return dqmVar2.d;
    }

    public final dqn n(int i) {
        dqm dqmVar;
        dqm dqmVar2;
        if (i == 0) {
            dqm dqmVar3 = this.T;
            dqmVar2 = dqmVar3.e;
            if (dqmVar2 == null || dqmVar2.e != dqmVar3) {
                return null;
            }
        } else if (i != 1 || (dqmVar2 = (dqmVar = this.U).e) == null || dqmVar2.e != dqmVar) {
            return null;
        }
        return dqmVar2.d;
    }

    public final drj o(int i) {
        if (i == 0) {
            return this.o;
        }
        if (i == 1) {
            return this.p;
        }
        return null;
    }

    public final void p(dqo dqoVar, doy doyVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            dqt.a(dqoVar, doyVar, this);
            hashSet.remove(this);
            a(doyVar, dqoVar.aj(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.T.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((dqm) it.next()).d.p(dqoVar, doyVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.V.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((dqm) it2.next()).d.p(dqoVar, doyVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.U.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((dqm) it3.next()).d.p(dqoVar, doyVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.W.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((dqm) it4.next()).d.p(dqoVar, doyVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.X.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((dqm) it5.next()).d.p(dqoVar, doyVar, hashSet, 1, true);
            }
        }
    }

    public final void q(dqm dqmVar, dqm dqmVar2, int i) {
        if (dqmVar.d == this) {
            Y(dqmVar.i, dqmVar2.d, dqmVar2.i, i);
        }
    }

    public final void r(dqn dqnVar, float f, int i) {
        Z(7, dqnVar, 7, i, 0);
        this.O = f;
    }

    public final void s(doy doyVar) {
        doyVar.b(this.T);
        doyVar.b(this.U);
        doyVar.b(this.V);
        doyVar.b(this.W);
        if (this.al > 0) {
            doyVar.b(this.X);
        }
    }

    public final void t() {
        if (this.o == null) {
            this.o = new drg(this);
        }
        if (this.p == null) {
            this.p = new drh(this);
        }
    }

    public String toString() {
        String str = this.as;
        return "" + (str != null ? a.bq(str, "id: ", " ") : "") + "(" + this.aj + ", " + this.ak + ") - (" + this.af + " x " + this.ag + ")";
    }

    public void u() {
        this.T.e();
        this.U.e();
        this.V.e();
        this.W.e();
        this.X.e();
        this.Y.e();
        this.Z.e();
        this.aa.e();
        this.ae = null;
        this.O = Float.NaN;
        this.af = 0;
        this.ag = 0;
        this.ah = BitmapDescriptorFactory.HUE_RED;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        int[] iArr = this.aA;
        iArr[0] = 1;
        iArr[1] = 1;
        this.aq = null;
        this.ar = 0;
        this.at = 0;
        this.au = 0;
        float[] fArr = this.av;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.z = -1;
        this.A = -1;
        int[] iArr2 = this.N;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.C = 0;
        this.D = 0;
        this.H = 1.0f;
        this.K = 1.0f;
        this.G = Alert.DURATION_SHOW_INDEFINITELY;
        this.J = Alert.DURATION_SHOW_INDEFINITELY;
        this.F = 0;
        this.I = 0;
        this.L = -1;
        this.M = 1.0f;
        boolean[] zArr = this.q;
        zArr[0] = true;
        zArr[1] = true;
        this.Q = false;
        boolean[] zArr2 = this.ad;
        zArr2[0] = false;
        zArr2[1] = false;
        this.r = true;
        int[] iArr3 = this.E;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.s = -1;
        this.t = -1;
    }

    public final void v() {
        dqn dqnVar = this.ae;
        if (dqnVar != null && (dqnVar instanceof dqo)) {
        }
        ArrayList arrayList = this.ac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dqm) arrayList.get(i)).e();
        }
    }

    public final void w() {
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        ArrayList arrayList = this.ac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dqm dqmVar = (dqm) arrayList.get(i);
            dqmVar.c = false;
            dqmVar.b = 0;
        }
    }

    public final void x(int i) {
        this.al = i;
        this.P = i > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[PHI: r0
  0x0089: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:47:0x0089, B:37:0x0082, B:25:0x0054, B:27:0x005a, B:29:0x0066, B:31:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0089 -> B:41:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L93
            int r1 = r10.length()
            if (r1 != 0) goto Lb
            goto L93
        Lb:
            int r1 = r10.length()
            r2 = 44
            int r2 = r10.indexOf(r2)
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 <= 0) goto L3b
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L3b
            java.lang.String r6 = r10.substring(r4, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r4 = r3
            goto L36
        L35:
            r4 = r5
        L36:
            int r2 = r2 + r3
            r8 = r4
            r4 = r2
            r2 = r8
            goto L3c
        L3b:
            r2 = r5
        L3c:
            r6 = 58
            int r6 = r10.indexOf(r6)
            if (r6 < 0) goto L7a
            int r1 = r1 + r5
            if (r6 >= r1) goto L7a
            java.lang.String r1 = r10.substring(r4, r6)
            int r6 = r6 + r3
            java.lang.String r10 = r10.substring(r6)
            int r4 = r1.length()
            if (r4 <= 0) goto L89
            int r4 = r10.length()
            if (r4 <= 0) goto L89
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L89
            float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.lang.NumberFormatException -> L89
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 <= 0) goto L89
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 <= 0) goto L89
            if (r2 != r3) goto L74
            float r10 = r10 / r1
            float r10 = java.lang.Math.abs(r10)     // Catch: java.lang.NumberFormatException -> L89
            goto L8a
        L74:
            float r1 = r1 / r10
            float r10 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L89
            goto L8a
        L7a:
            java.lang.String r10 = r10.substring(r4)
            int r1 = r10.length()
            if (r1 <= 0) goto L89
            float r10 = java.lang.Float.parseFloat(r10)     // Catch: java.lang.NumberFormatException -> L89
            goto L8a
        L89:
            r10 = r0
        L8a:
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L92
            r9.ah = r10
            r9.ai = r2
        L92:
            return
        L93:
            r9.ah = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqn.y(java.lang.String):void");
    }

    public final void z(int i, int i2) {
        if (this.a) {
            return;
        }
        this.T.f(i);
        this.V.f(i2);
        this.aj = i;
        this.af = i2 - i;
        this.a = true;
    }

    public dqn() {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new dqa(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        dqm dqmVar = new dqm(this, 2);
        this.T = dqmVar;
        dqm dqmVar2 = new dqm(this, 3);
        this.U = dqmVar2;
        dqm dqmVar3 = new dqm(this, 4);
        this.V = dqmVar3;
        dqm dqmVar4 = new dqm(this, 5);
        this.W = dqmVar4;
        dqm dqmVar5 = new dqm(this, 6);
        this.X = dqmVar5;
        this.Y = new dqm(this, 8);
        this.Z = new dqm(this, 9);
        dqm dqmVar6 = new dqm(this, 7);
        this.aa = dqmVar6;
        this.ab = new dqm[]{dqmVar, dqmVar3, dqmVar2, dqmVar4, dqmVar5, dqmVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.af = 0;
        this.ag = 0;
        this.ah = BitmapDescriptorFactory.HUE_RED;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new dqn[]{null, null};
        this.ax = new dqn[]{null, null};
        this.ay = -1;
        this.az = -1;
        b();
    }
}
