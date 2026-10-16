package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dqj extends dqu {
    dqo a;
    private dqn[] aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private boolean[][] aH;
    private int[][] aI;
    private int[][] aJ;
    public float c;
    public float d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public int k;
    public boolean b = false;
    Set j = new HashSet();
    private int aK = 0;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dqj() {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.b = r0
            r6.aG = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r6.j = r1
            r6.aK = r0
            r6.aq()
            int[][] r1 = r6.aI
            r2 = 1
            if (r1 == 0) goto L30
            int r3 = r6.aM
            int r1 = r1.length
            if (r1 != r3) goto L30
            boolean[][] r1 = r6.aH
            if (r1 == 0) goto L30
            int r3 = r6.aC
            int r4 = r1.length
            if (r4 != r3) goto L30
            r1 = r1[r0]
            int r1 = r1.length
            int r3 = r6.aE
            if (r1 != r3) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r0
        L31:
            if (r1 != 0) goto L36
            r6.ap()
        L36:
            if (r1 == 0) goto L69
            r1 = r0
        L39:
            boolean[][] r3 = r6.aH
            int r3 = r3.length
            if (r1 >= r3) goto L50
            r3 = r0
        L3f:
            boolean[][] r4 = r6.aH
            r5 = r4[r0]
            int r5 = r5.length
            if (r3 >= r5) goto L4d
            r4 = r4[r1]
            r4[r3] = r2
            int r3 = r3 + 1
            goto L3f
        L4d:
            int r1 = r1 + 1
            goto L39
        L50:
            r1 = r0
        L51:
            int[][] r3 = r6.aI
            int r3 = r3.length
            if (r1 >= r3) goto L69
            r3 = r0
        L57:
            int[][] r4 = r6.aI
            r5 = r4[r0]
            int r5 = r5.length
            if (r3 >= r5) goto L66
            r4 = r4[r1]
            r5 = -1
            r4[r3] = r5
            int r3 = r3 + 1
            goto L57
        L66:
            int r1 = r1 + 1
            goto L51
        L69:
            r6.aG = r0
            java.lang.String r1 = r6.h
            if (r1 == 0) goto L84
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L84
            java.lang.String r1 = r6.h
            int[][] r0 = r6.at(r1, r0)
            if (r0 == 0) goto L84
            r6.an(r0)
        L84:
            java.lang.String r0 = r6.g
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            java.lang.String r0 = r6.g
            int[][] r0 = r6.at(r0, r2)
            if (r0 == 0) goto L9d
            r6.ao(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqj.<init>():void");
    }

    private final int ae(int i) {
        return this.i == 1 ? i / this.aC : i % this.aE;
    }

    private final int al(int i) {
        return this.i == 1 ? i % this.aC : i / this.aE;
    }

    private final void am(dqn dqnVar, int i, int i2, int i3, int i4) {
        dqnVar.T.l(this.aB[i2].T, 0, Integer.MIN_VALUE, false);
        dqnVar.U.l(this.aB[i].U, 0, Integer.MIN_VALUE, false);
        dqnVar.V.l(this.aB[(i2 + i4) - 1].V, 0, Integer.MIN_VALUE, false);
        dqnVar.W.l(this.aB[(i + i3) - 1].W, 0, Integer.MIN_VALUE, false);
    }

    private final void an(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!ar(al(iArr2[0]), ae(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private final void ao(int[][] iArr) {
        if (as()) {
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int iAl = this.al(iArr[i][0]);
            int iAe = this.ae(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!this.ar(iAl, iAe, iArr2[1], iArr2[2])) {
                return;
            }
            dqn dqnVar = this.aL[i];
            int[] iArr3 = iArr[i];
            dqj dqjVar = this;
            dqjVar.am(dqnVar, iAl, iAe, iArr3[1], iArr3[2]);
            dqjVar.j.add(dqjVar.aL[i].v);
            i++;
            this = dqjVar;
        }
    }

    private final void ap() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.aC, this.aE);
        this.aH = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.aM;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.aI = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private final void aq() {
        int i;
        int i2 = this.aD;
        if (i2 != 0 && (i = this.aF) != 0) {
            this.aC = i2;
            this.aE = i;
            return;
        }
        int i3 = this.aF;
        if (i3 > 0) {
            this.aE = i3;
            this.aC = ((this.aM + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.aC = i2;
            this.aE = ((this.aM + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.aM) + 1.5d);
            this.aC = iSqrt;
            this.aE = ((this.aM + iSqrt) - 1) / iSqrt;
        }
    }

    private final boolean ar(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.aH;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final boolean as() {
        return (this.k & 2) > 0;
    }

    private final int[][] at(String str, boolean z) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new ail(2));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.aC != 1 && this.aE != 1) {
                for (int i = 0; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.k & 1) > 0) {
                        iArr[i][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                String[] strArrSplit4 = strArrSplit[i4].trim().split(":");
                iArr[i4][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i4];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.aE == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i2 += iArr[i4][1];
                    if (z) {
                        i2--;
                    }
                }
                if (this.aC == 1) {
                    iArr[i4][2] = Integer.parseInt(strArrSplit4[1]);
                    i3 += iArr[i4][2];
                    if (z) {
                        i3--;
                    }
                }
            }
            if (i2 != 0 && !this.b) {
                d(this.aC + i2);
            }
            if (i3 != 0 && !this.b) {
                c(this.aE + i3);
            }
            this.b = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private static final void au(dqn dqnVar) {
        dqnVar.D(-1.0f);
        dqnVar.T.e();
        dqnVar.V.e();
    }

    private static final void av(dqn dqnVar) {
        dqnVar.L(-1.0f);
        dqnVar.U.e();
        dqnVar.W.e();
        dqnVar.X.e();
    }

    private static final dqn aw() {
        dqn dqnVar = new dqn();
        int[] iArr = dqnVar.aA;
        iArr[0] = 3;
        iArr[1] = 3;
        dqnVar.v = String.valueOf(dqnVar.hashCode());
        return dqnVar;
    }

    private static final float[] ax(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    @Override // defpackage.dqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.doy r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqj.a(doy, boolean):void");
    }

    @Override // defpackage.dqu
    public final void b(int i, int i2, int i3, int i4) {
        int[][] iArrAt;
        this.a = (dqo) this.ae;
        if (this.aC > 0 && this.aE > 0) {
            this.aG = 0;
            String str = this.h;
            if (str != null && !str.trim().isEmpty() && (iArrAt = at(this.h, false)) != null) {
                an(iArrAt);
            }
            String str2 = this.g;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.aJ = at(this.g, true);
            }
            int iMax = Math.max(this.aC, this.aE);
            dqn[] dqnVarArr = this.aB;
            if (dqnVarArr == null) {
                this.aB = new dqn[iMax];
                int i5 = 0;
                while (true) {
                    dqn[] dqnVarArr2 = this.aB;
                    if (i5 >= dqnVarArr2.length) {
                        break;
                    }
                    dqnVarArr2[i5] = aw();
                    i5++;
                }
            } else if (iMax != dqnVarArr.length) {
                dqn[] dqnVarArr3 = new dqn[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    dqn[] dqnVarArr4 = this.aB;
                    if (i6 < dqnVarArr4.length) {
                        dqnVarArr3[i6] = dqnVarArr4[i6];
                    } else {
                        dqnVarArr3[i6] = aw();
                    }
                }
                while (true) {
                    dqn[] dqnVarArr5 = this.aB;
                    if (iMax >= dqnVarArr5.length) {
                        break;
                    }
                    this.a.an(dqnVarArr5[iMax]);
                    iMax++;
                }
                this.aB = dqnVarArr3;
            }
            int[][] iArr = this.aJ;
            if (iArr != null) {
                ao(iArr);
            }
        }
        dqo dqoVar = this.a;
        for (dqn dqnVar : this.aB) {
            dqoVar.am(dqnVar);
        }
    }

    public final void c(int i) {
        if (i <= 50 && this.aF != i) {
            this.aF = i;
            aq();
            ap();
        }
    }

    public final void d(int i) {
        if (i <= 50 && this.aD != i) {
            this.aD = i;
            aq();
            ap();
        }
    }
}
