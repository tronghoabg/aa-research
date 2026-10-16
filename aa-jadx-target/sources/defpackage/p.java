package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class p {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public java.lang.Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    defpackage.p ab;
    defpackage.p ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final defpackage.o i;
    final defpackage.o j;
    final defpackage.o k;
    final defpackage.o l;
    final defpackage.o m;
    final defpackage.o n;
    final defpackage.o o;
    final defpackage.o p;
    protected final java.util.ArrayList q;
    public defpackage.p r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public p() {
        defpackage.o oVar = new defpackage.o(this, 2);
        this.i = oVar;
        defpackage.o oVar2 = new defpackage.o(this, 3);
        this.j = oVar2;
        defpackage.o oVar3 = new defpackage.o(this, 4);
        this.k = oVar3;
        defpackage.o oVar4 = new defpackage.o(this, 5);
        this.l = oVar4;
        defpackage.o oVar5 = new defpackage.o(this, 6);
        this.m = oVar5;
        defpackage.o oVar6 = new defpackage.o(this, 8);
        this.n = oVar6;
        defpackage.o oVar7 = new defpackage.o(this, 9);
        this.o = oVar7;
        this.p = new defpackage.o(this, 7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(oVar);
        arrayList.add(oVar2);
        arrayList.add(oVar3);
        arrayList.add(oVar4);
        arrayList.add(oVar6);
        arrayList.add(oVar7);
        arrayList.add(oVar5);
    }

    private final void A(defpackage.m mVar, boolean z, boolean z2, defpackage.o oVar, defpackage.o oVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8 = i6;
        defpackage.n nVarC = mVar.c(oVar);
        defpackage.n nVarC2 = mVar.c(oVar2);
        defpackage.n nVarC3 = mVar.c(oVar.b);
        defpackage.n nVarC4 = mVar.c(oVar2.b);
        int iA = oVar.a();
        int iA2 = oVar2.a();
        int i9 = this.K;
        boolean z5 = i9 != 8;
        int i10 = i9 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (nVarC3 == null && nVarC4 == null) {
            defpackage.k kVarA = mVar.a();
            kVarA.g(nVarC, i);
            mVar.e(kVarA);
            if (z3) {
                return;
            }
            if (z) {
                defpackage.k kVarA2 = mVar.a();
                kVarA2.h(nVarC2, nVarC, i4);
                mVar.i(kVarA2, 1);
                mVar.e(kVarA2);
                return;
            }
            if (z6) {
                defpackage.k kVarA3 = mVar.a();
                kVarA3.h(nVarC2, nVarC, i10);
                mVar.e(kVarA3);
                return;
            } else {
                defpackage.k kVarA4 = mVar.a();
                kVarA4.g(nVarC2, i2);
                mVar.e(kVarA4);
                return;
            }
        }
        if (nVarC3 != null && nVarC4 == null) {
            defpackage.k kVarA5 = mVar.a();
            kVarA5.h(nVarC, nVarC3, iA);
            mVar.e(kVarA5);
            if (z) {
                defpackage.k kVarA6 = mVar.a();
                kVarA6.h(nVarC2, nVarC, i4);
                mVar.i(kVarA6, 1);
                mVar.e(kVarA6);
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                defpackage.k kVarA7 = mVar.a();
                kVarA7.h(nVarC2, nVarC, i10);
                mVar.e(kVarA7);
                return;
            } else {
                defpackage.k kVarA8 = mVar.a();
                kVarA8.g(nVarC2, i2);
                mVar.e(kVarA8);
                return;
            }
        }
        if (nVarC3 == null) {
            defpackage.k kVarA9 = mVar.a();
            kVarA9.h(nVarC2, nVarC4, -iA2);
            mVar.e(kVarA9);
            if (z) {
                defpackage.k kVarA10 = mVar.a();
                kVarA10.h(nVarC2, nVarC, i4);
                mVar.i(kVarA10, 1);
                mVar.e(kVarA10);
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                defpackage.k kVarA11 = mVar.a();
                kVarA11.h(nVarC2, nVarC, i10);
                mVar.e(kVarA11);
                return;
            } else {
                defpackage.k kVarA12 = mVar.a();
                kVarA12.g(nVarC, i);
                mVar.e(kVarA12);
                return;
            }
        }
        if (!z6) {
            if (z3) {
                mVar.g(nVarC, nVarC3, iA, 3);
                mVar.h(nVarC2, nVarC4, -iA2, 3);
                mVar.e(defpackage.m.o(mVar, nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -iA2;
            if (i5 == 1) {
                if (i8 <= i10) {
                    i8 = i10;
                }
                if (i7 > 0) {
                    if (i7 < i8) {
                        i8 = i7;
                    } else {
                        mVar.h(nVarC2, nVarC, i7, 3);
                    }
                }
                mVar.l(nVarC2, nVarC, i8, 3);
                mVar.g(nVarC, nVarC3, iA, 2);
                mVar.h(nVarC2, nVarC4, i11, 2);
                mVar.k(nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2);
                return;
            }
            if (i8 != 0 || i7 != 0) {
                if (i7 > 0) {
                    mVar.h(nVarC2, nVarC, i7, 3);
                }
                mVar.g(nVarC, nVarC3, iA, 2);
                mVar.h(nVarC2, nVarC4, i11, 2);
                mVar.k(nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2);
                return;
            }
            defpackage.k kVarA13 = mVar.a();
            kVarA13.h(nVarC, nVarC3, iA);
            mVar.e(kVarA13);
            defpackage.k kVarA14 = mVar.a();
            kVarA14.h(nVarC2, nVarC4, i11);
            mVar.e(kVarA14);
            return;
        }
        if (z) {
            defpackage.k kVarA15 = mVar.a();
            kVarA15.h(nVarC2, nVarC, i4);
            mVar.i(kVarA15, 1);
            mVar.e(kVarA15);
        } else {
            defpackage.k kVarA16 = mVar.a();
            kVarA16.h(nVarC2, nVarC, i10);
            mVar.e(kVarA16);
        }
        int i12 = oVar.h;
        if (i12 != oVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                defpackage.k kVarA17 = mVar.a();
                kVarA17.h(nVarC, nVarC3, iA);
                mVar.e(kVarA17);
                defpackage.n nVarD = mVar.d();
                defpackage.k kVarA18 = mVar.a();
                kVarA18.j(nVarC2, nVarC4, nVarD, i13);
                mVar.e(kVarA18);
                return;
            }
            defpackage.n nVarD2 = mVar.d();
            defpackage.k kVarA19 = mVar.a();
            kVarA19.i(nVarC, nVarC3, nVarD2, iA);
            mVar.e(kVarA19);
            defpackage.k kVarA20 = mVar.a();
            kVarA20.h(nVarC2, nVarC4, i13);
            mVar.e(kVarA20);
            return;
        }
        if (nVarC3 == nVarC4) {
            mVar.e(defpackage.m.o(mVar, nVarC, nVarC3, 0, 0.5f, nVarC4, nVarC2, 0));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = oVar.i;
        defpackage.n nVarD3 = mVar.d();
        defpackage.k kVarA21 = mVar.a();
        kVarA21.i(nVarC, nVarC3, nVarD3, iA);
        if (i15 != 2) {
            mVar.i(kVarA21, (int) (-kVarA21.d.a(nVarD3)));
        }
        mVar.e(kVarA21);
        int i16 = oVar2.i;
        defpackage.n nVarD4 = mVar.d();
        defpackage.k kVarA22 = mVar.a();
        kVarA22.j(nVarC2, nVarC4, nVarD4, i14);
        if (i16 != 2) {
            mVar.i(kVarA22, (int) (-kVarA22.d.a(nVarD4)));
        }
        mVar.e(kVarA22);
        defpackage.k kVarA23 = mVar.a();
        kVarA23.d(nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2);
        mVar.e(kVarA23);
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int i = this.t;
        if (this.ae != 3) {
            return i;
        }
        int i2 = this.d;
        int iMax = this.g;
        if (i2 == 1) {
            iMax = java.lang.Math.max(iMax, i);
        } else if (iMax > 0) {
            this.t = iMax;
        } else {
            iMax = 0;
        }
        int i3 = this.h;
        return (i3 <= 0 || i3 >= iMax) ? iMax : i3;
    }

    public final int f() {
        int i = this.s;
        if (this.ad != 3) {
            return i;
        }
        int i2 = this.c;
        int iMax = this.e;
        if (i2 == 1) {
            iMax = java.lang.Math.max(iMax, i);
        } else if (iMax > 0) {
            this.s = iMax;
        } else {
            iMax = 0;
        }
        int i3 = this.f;
        return (i3 <= 0 || i3 >= iMax) ? iMax : i3;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public defpackage.o t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return this.j;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return this.k;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return this.l;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return this.m;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                return this.p;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.n;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return this.o;
        }
    }

    public final java.lang.String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void u(int i, defpackage.p pVar, int i2, int i3, int i4) {
        t(i).d(pVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:147:0x020a  */
    /* JADX WARN: Code duplicated, block: B:150:0x020f  */
    /* JADX WARN: Code duplicated, block: B:160:0x026e  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:188:0x0303  */
    /* JADX WARN: Code duplicated, block: B:190:0x0309  */
    /* JADX WARN: Code duplicated, block: B:192:0x032f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0351  */
    /* JADX WARN: Code duplicated, block: B:197:0x038d  */
    /* JADX WARN: Code duplicated, block: B:199:0x039d  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:211:0x040c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0414  */
    /* JADX WARN: Code duplicated, block: B:215:0x0423  */
    /* JADX WARN: Code duplicated, block: B:217:0x042c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0439  */
    /* JADX WARN: Code duplicated, block: B:221:0x0440  */
    /* JADX WARN: Code duplicated, block: B:224:0x0447  */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r0v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5, types: [p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [p] */
    /* JADX WARN: Type inference failed for: r43v0, types: [p] */
    public void x(defpackage.m mVar) {
        boolean z;
        boolean z2;
        int i;
        defpackage.o oVar;
        int i2;
        float f;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        defpackage.n nVar;
        defpackage.n nVar2;
        defpackage.o oVar2;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        boolean z9;
        int i6;
        int i7;
        char c;
        boolean z10;
        defpackage.n nVar3;
        defpackage.m mVar2;
        ?? r0;
        defpackage.k kVarA;
        int i8;
        defpackage.n nVar4;
        defpackage.n nVar5;
        int i9;
        int i10;
        defpackage.n nVar6;
        defpackage.o oVar3;
        defpackage.o oVar4;
        int i11;
        defpackage.o oVar5;
        boolean z11;
        defpackage.o oVar6;
        defpackage.n nVarC;
        defpackage.n nVarC2;
        defpackage.n nVarC3;
        defpackage.n nVarC4;
        defpackage.o oVar7;
        boolean z12;
        defpackage.o oVar8;
        boolean z13;
        defpackage.p pVar;
        defpackage.p pVar2;
        defpackage.p pVar3;
        defpackage.p pVar4;
        defpackage.p pVar5;
        defpackage.p pVar6;
        defpackage.m mVar3 = mVar;
        defpackage.o oVar9 = this.j;
        defpackage.o oVar10 = this.i;
        defpackage.o oVar11 = this.l;
        defpackage.o oVar12 = this.k;
        defpackage.n nVarC5 = mVar3.c(oVar10);
        defpackage.n nVarC6 = mVar3.c(oVar12);
        defpackage.n nVarC7 = mVar3.c(oVar9);
        defpackage.n nVarC8 = mVar3.c(oVar11);
        defpackage.o oVar13 = this.m;
        defpackage.n nVarC9 = mVar3.c(oVar13);
        defpackage.p pVar7 = this.r;
        if (pVar7 != null) {
            defpackage.o oVar14 = oVar10.b;
            if ((oVar14 == null || oVar14.b != oVar10) && ((oVar7 = oVar12.b) == null || oVar7.b != oVar12)) {
                z12 = false;
            } else {
                ((defpackage.q) pVar7).A(this, 0);
                z12 = true;
            }
            defpackage.o oVar15 = oVar9.b;
            if ((oVar15 == null || oVar15.b != oVar9) && ((oVar8 = oVar11.b) == null || oVar8.b != oVar11)) {
                z13 = false;
            } else {
                ((defpackage.q) this.r).A(this, 1);
                z13 = true;
            }
            defpackage.p pVar8 = this.r;
            if (pVar8.ad != 2 || z12) {
                z12 = z12;
            } else {
                defpackage.o oVar16 = oVar10.b;
                if (oVar16 == null || (pVar6 = oVar16.a) != pVar8) {
                    defpackage.n nVarC10 = mVar3.c(pVar8.i);
                    defpackage.k kVarA2 = mVar3.a();
                    kVarA2.i(nVarC5, nVarC10, mVar3.d(), 0);
                    mVar3.e(kVarA2);
                } else if (pVar6 == pVar8) {
                    oVar10.i = 2;
                }
                defpackage.o oVar17 = oVar12.b;
                if (oVar17 == null || (pVar5 = oVar17.a) != (pVar4 = this.r)) {
                    defpackage.n nVarC11 = mVar3.c(this.r.k);
                    defpackage.k kVarA3 = mVar3.a();
                    kVarA3.i(nVarC11, nVarC6, mVar3.d(), 0);
                    mVar3.e(kVarA3);
                } else if (pVar5 == pVar4) {
                    oVar12.i = 2;
                }
            }
            defpackage.p pVar9 = this.r;
            if (pVar9.ae == 2 && !z13) {
                defpackage.o oVar18 = oVar9.b;
                if (oVar18 == null || (pVar3 = oVar18.a) != pVar9) {
                    defpackage.n nVarC12 = mVar3.c(pVar9.j);
                    defpackage.k kVarA4 = mVar3.a();
                    kVarA4.i(nVarC7, nVarC12, mVar3.d(), 0);
                    mVar3.e(kVarA4);
                } else if (pVar3 == pVar9) {
                    oVar9.i = 2;
                }
                defpackage.o oVar19 = oVar11.b;
                if (oVar19 == null || (pVar2 = oVar19.a) != (pVar = this.r)) {
                    defpackage.n nVarC13 = mVar3.c(this.r.l);
                    defpackage.k kVarA5 = mVar3.a();
                    kVarA5.i(nVarC13, nVarC8, mVar3.d(), 0);
                    mVar3.e(kVarA5);
                } else if (pVar2 == pVar) {
                    oVar11.i = 2;
                }
            }
            z2 = z13;
            z = z12;
        } else {
            z = false;
            z2 = false;
        }
        int i12 = this.s;
        int i13 = this.D;
        int i14 = i12 < i13 ? i13 : i12;
        int i15 = this.t;
        boolean z14 = z;
        int i16 = this.E;
        int i17 = i15 >= i16 ? i15 : i16;
        int i18 = this.ad;
        boolean z15 = i18 != 3;
        int i19 = this.ae;
        boolean z16 = i19 != 3;
        if (!z15 && oVar10 != null && oVar12 != null && (oVar10.b == null || oVar12.b == null)) {
            z15 = true;
        }
        if (z16 || oVar9 == null || oVar11 == null) {
            i = i14;
        } else {
            defpackage.o oVar20 = oVar9.b;
            i = i14;
            if ((oVar20 == null || oVar11.b == null) && (this.C == 0 || (oVar13 != null && (oVar20 == null || oVar13.b == null)))) {
                z16 = true;
            }
        }
        int i20 = this.v;
        float f2 = this.u;
        if (f2 > 0.0f) {
            oVar = oVar11;
            if (this.K != 8) {
                int i21 = 3;
                if (i18 != 3) {
                    if (i18 == i21) {
                        i = (int) (i15 * f2);
                        f = f2;
                        i17 = i17;
                        i3 = 2;
                        i2 = 0;
                        z3 = false;
                        z15 = true;
                    } else if (i19 == i21) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        i17 = (int) (i12 * f2);
                        f = f2;
                        i = i;
                        i3 = 2;
                        i2 = 1;
                        z3 = false;
                        z16 = true;
                    }
                } else if (i19 == 3) {
                    if (z15 && !z16) {
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                        i2 = 0;
                    } else if (z15 || !z16) {
                        i2 = i20;
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                    } else {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                        i2 = 1;
                    }
                    z3 = true;
                } else {
                    i18 = 3;
                    i21 = 3;
                    if (i18 == i21) {
                        i = (int) (i15 * f2);
                        f = f2;
                        i17 = i17;
                        i3 = 2;
                        i2 = 0;
                        z3 = false;
                        z15 = true;
                    } else if (i19 == i21) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        i17 = (int) (i12 * f2);
                        f = f2;
                        i = i;
                        i3 = 2;
                        i2 = 1;
                        z3 = false;
                        z16 = true;
                    }
                }
            }
            z4 = !z3 && (i2 == 0 || i2 == -1);
            if (i18 == i3 || !(this instanceof defpackage.q)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (this.a != i3) {
                i4 = i17;
                nVar = nVarC7;
                nVar2 = nVarC8;
                oVar2 = oVar13;
                nVarC9 = nVarC9;
                z6 = false;
            } else if (z4 || oVar10.b == null || oVar12.b == null) {
                nVarC9 = nVarC9;
                z6 = false;
                int i22 = this.w;
                i4 = i17;
                nVar = nVarC7;
                nVar2 = nVarC8;
                oVar2 = oVar13;
                mVar3 = mVar;
                A(mVar3, z5, z15, oVar10, oVar12, i22, i22 + i, i, i13, this.H, z4, z14, this.c, this.e, this.f);
            } else {
                defpackage.n nVarC14 = mVar3.c(oVar10);
                defpackage.n nVarC15 = mVar3.c(oVar12);
                defpackage.n nVarC16 = mVar3.c(oVar10.b);
                defpackage.n nVarC17 = mVar3.c(oVar12.b);
                mVar3.g(nVarC14, nVarC16, oVar10.a(), 3);
                mVar3.h(nVarC15, nVarC17, -oVar12.a(), 3);
                if (z14) {
                    z6 = false;
                } else {
                    z6 = false;
                    mVar3.k(nVarC14, nVarC16, oVar10.a(), this.H, nVarC17, nVarC15, oVar12.a());
                }
                mVar3 = mVar;
                i4 = i17;
                nVar = nVarC7;
                nVar2 = nVarC8;
                oVar2 = oVar13;
            }
            if (this.b == 2) {
                return;
            }
            if (this.ae == 2 || !(this instanceof defpackage.q)) {
                z7 = z6;
            } else {
                z7 = true;
            }
            if (z3) {
                z8 = true;
                if (i5 != 1 || i5 == -1) {
                    i5 = i2;
                    i5 = i2;
                    z9 = true;
                }
                i6 = this.C;
                if (i6 > 0) {
                    nVar6 = nVar;
                    mVar3.l(nVarC9, nVar6, i6, 5);
                    oVar3 = oVar2;
                    if (oVar3.b != null) {
                        i11 = this.C;
                        oVar4 = oVar3;
                    } else {
                        oVar4 = oVar;
                        i11 = i4;
                    }
                    if (z9) {
                        oVar5 = oVar9;
                        if (oVar5.b != null) {
                            oVar6 = oVar;
                            if (oVar6.b != null) {
                                nVarC = mVar3.c(oVar5);
                                nVarC2 = mVar3.c(oVar6);
                                nVarC3 = mVar3.c(oVar5.b);
                                nVarC4 = mVar3.c(oVar6.b);
                                mVar3.g(nVarC, nVarC3, oVar5.a(), 3);
                                mVar3.h(nVarC2, nVarC4, -oVar6.a(), 3);
                                if (!z2) {
                                    mVar.k(nVarC, nVarC3, oVar5.a(), this.I, nVarC4, nVarC2, oVar6.a());
                                }
                                mVar2 = mVar;
                                r0 = this;
                                i7 = i5;
                                nVar3 = nVar6;
                            }
                        }
                        z11 = z8;
                    } else {
                        oVar5 = r30;
                        z11 = z6;
                    }
                    int i23 = this.x;
                    mVar2 = mVar;
                    i7 = i5;
                    A(mVar2, z7, z16, oVar5, oVar4, i23, i23 + i11, i11, this.E, this.I, z11, z2, this.d, this.g, this.h);
                    mVar2.l(nVar2, nVar6, i4, 5);
                    r0 = this;
                    nVar3 = nVar6;
                } else {
                    i7 = i5;
                    boolean z17 = z2;
                    boolean z18 = z16;
                    defpackage.o oVar21 = oVar;
                    defpackage.n nVar7 = nVar;
                    defpackage.n nVar8 = nVar2;
                    if (!z9) {
                        c = 3;
                        z10 = z6;
                    } else if (r30.b != null || oVar21.b == null) {
                        c = 3;
                        z10 = true;
                    } else {
                        defpackage.n nVarC18 = mVar3.c(r30);
                        defpackage.n nVarC19 = mVar3.c(oVar21);
                        defpackage.n nVarC20 = mVar3.c(r30.b);
                        defpackage.n nVarC21 = mVar3.c(oVar21.b);
                        mVar3.g(nVarC18, nVarC20, r30.a(), 3);
                        mVar3.h(nVarC19, nVarC21, -oVar21.a(), 3);
                        if (!z17) {
                            mVar.k(nVarC18, nVarC20, r30.a(), this.I, nVarC21, nVarC19, oVar21.a());
                        }
                        mVar2 = mVar;
                        r0 = this;
                        nVar3 = nVar7;
                        nVar2 = nVar8;
                    }
                    int i24 = this.x;
                    int i25 = this.E;
                    float f3 = this.I;
                    int i26 = this.d;
                    nVar2 = nVar8;
                    int i27 = this.g;
                    nVar3 = nVar7;
                    int i28 = this.h;
                    mVar2 = mVar;
                    ?? r1 = this;
                    r1.A(mVar2, z7, z18, r30, oVar21, i24, i24 + i4, i4, i25, f3, z10, z17, i26, i27, i28);
                    r0 = r1;
                }
                if (z3) {
                    kVarA = mVar2.a();
                    i8 = i7;
                    if (i8 == 0) {
                        kVarA.e(nVarC6, nVarC5, nVar2, nVar3, f);
                        mVar2.e(kVarA);
                        return;
                    }
                    nVar4 = nVar3;
                    nVar5 = nVar2;
                    if (i8 == 1) {
                        kVarA.e(nVar5, nVar4, nVarC6, nVarC5, f);
                        mVar2.e(kVarA);
                        return;
                    }
                    i9 = r0.e;
                    if (i9 > 0) {
                        mVar2.g(nVarC6, nVarC5, i9, 3);
                    }
                    i10 = r0.g;
                    if (i10 > 0) {
                        mVar2.g(nVar5, nVar4, i10, 3);
                    }
                    kVarA.e(nVarC6, nVarC5, nVar5, nVar4, f);
                    defpackage.n nVarB = mVar2.b();
                    defpackage.n nVarB2 = mVar2.b();
                    nVarB.c = 4;
                    nVarB2.c = 4;
                    kVarA.c(nVarB, nVarB2);
                    mVar2.e(kVarA);
                }
            }
            i5 = i2;
            z8 = true;
            i5 = i2;
            z9 = z6;
            i6 = this.C;
            if (i6 > 0) {
                nVar6 = nVar;
                mVar3.l(nVarC9, nVar6, i6, 5);
                oVar3 = oVar2;
                if (oVar3.b != null) {
                    i11 = this.C;
                    oVar4 = oVar3;
                } else {
                    oVar4 = oVar;
                    i11 = i4;
                }
                if (z9) {
                    oVar5 = oVar9;
                    if (oVar5.b != null) {
                        oVar6 = oVar;
                        if (oVar6.b != null) {
                            nVarC = mVar3.c(oVar5);
                            nVarC2 = mVar3.c(oVar6);
                            nVarC3 = mVar3.c(oVar5.b);
                            nVarC4 = mVar3.c(oVar6.b);
                            mVar3.g(nVarC, nVarC3, oVar5.a(), 3);
                            mVar3.h(nVarC2, nVarC4, -oVar6.a(), 3);
                            if (!z2) {
                                mVar.k(nVarC, nVarC3, oVar5.a(), this.I, nVarC4, nVarC2, oVar6.a());
                            }
                            mVar2 = mVar;
                            r0 = this;
                            i7 = i5;
                            nVar3 = nVar6;
                        }
                    }
                    z11 = z8;
                } else {
                    oVar5 = r30;
                    z11 = z6;
                }
                int i29 = this.x;
                mVar2 = mVar;
                i7 = i5;
                A(mVar2, z7, z16, oVar5, oVar4, i29, i29 + i11, i11, this.E, this.I, z11, z2, this.d, this.g, this.h);
                mVar2.l(nVar2, nVar6, i4, 5);
                r0 = this;
                nVar3 = nVar6;
            } else {
                i7 = i5;
                boolean z19 = z2;
                boolean z110 = z16;
                defpackage.o oVar22 = oVar;
                defpackage.n nVar9 = nVar;
                defpackage.n nVar10 = nVar2;
                if (!z9) {
                    if (r30.b != null) {
                    }
                    c = 3;
                    z10 = true;
                } else {
                    c = 3;
                    z10 = z6;
                }
                int i210 = this.x;
                int i211 = this.E;
                float f4 = this.I;
                int i212 = this.d;
                nVar2 = nVar10;
                int i213 = this.g;
                nVar3 = nVar9;
                int i214 = this.h;
                mVar2 = mVar;
                ?? r2 = this;
                r2.A(mVar2, z7, z110, r30, oVar22, i210, i210 + i4, i4, i211, f4, z10, z19, i212, i213, i214);
                r0 = r2;
            }
            if (z3) {
                kVarA = mVar2.a();
                i8 = i7;
                if (i8 == 0) {
                    kVarA.e(nVarC6, nVarC5, nVar2, nVar3, f);
                    mVar2.e(kVarA);
                    return;
                }
                nVar4 = nVar3;
                nVar5 = nVar2;
                if (i8 == 1) {
                    kVarA.e(nVar5, nVar4, nVarC6, nVarC5, f);
                    mVar2.e(kVarA);
                    return;
                }
                i9 = r0.e;
                if (i9 > 0) {
                    mVar2.g(nVarC6, nVarC5, i9, 3);
                }
                i10 = r0.g;
                if (i10 > 0) {
                    mVar2.g(nVar5, nVar4, i10, 3);
                }
                kVarA.e(nVarC6, nVarC5, nVar5, nVar4, f);
                defpackage.n nVarB3 = mVar2.b();
                defpackage.n nVarB4 = mVar2.b();
                nVarB3.c = 4;
                nVarB4.c = 4;
                kVarA.c(nVarB3, nVarB4);
                mVar2.e(kVarA);
            }
        }
        oVar = oVar11;
        i2 = i20;
        f = f2;
        i17 = i17;
        i = i;
        i3 = 2;
        z3 = false;
        if (z3) {
        }
        if (i18 == i3) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (this.a != i3) {
            i4 = i17;
            nVar = nVarC7;
            nVar2 = nVarC8;
            oVar2 = oVar13;
            nVarC9 = nVarC9;
            z6 = false;
        } else if (z4) {
            nVarC9 = nVarC9;
            z6 = false;
            int i215 = this.w;
            i4 = i17;
            nVar = nVarC7;
            nVar2 = nVarC8;
            oVar2 = oVar13;
            mVar3 = mVar;
            A(mVar3, z5, z15, oVar10, oVar12, i215, i215 + i, i, i13, this.H, z4, z14, this.c, this.e, this.f);
        } else {
            nVarC9 = nVarC9;
            z6 = false;
            int i216 = this.w;
            i4 = i17;
            nVar = nVarC7;
            nVar2 = nVarC8;
            oVar2 = oVar13;
            mVar3 = mVar;
            A(mVar3, z5, z15, oVar10, oVar12, i216, i216 + i, i, i13, this.H, z4, z14, this.c, this.e, this.f);
        }
        if (this.b == 2) {
            return;
        }
        if (this.ae == 2) {
            z7 = z6;
        } else {
            z7 = z6;
        }
        if (z3) {
            z8 = true;
            if (i5 != 1) {
            }
            i5 = i2;
            i5 = i2;
            z9 = true;
            i6 = this.C;
            if (i6 > 0) {
                nVar6 = nVar;
                mVar3.l(nVarC9, nVar6, i6, 5);
                oVar3 = oVar2;
                if (oVar3.b != null) {
                    i11 = this.C;
                    oVar4 = oVar3;
                } else {
                    oVar4 = oVar;
                    i11 = i4;
                }
                if (z9) {
                    oVar5 = oVar9;
                    if (oVar5.b != null) {
                        oVar6 = oVar;
                        if (oVar6.b != null) {
                            nVarC = mVar3.c(oVar5);
                            nVarC2 = mVar3.c(oVar6);
                            nVarC3 = mVar3.c(oVar5.b);
                            nVarC4 = mVar3.c(oVar6.b);
                            mVar3.g(nVarC, nVarC3, oVar5.a(), 3);
                            mVar3.h(nVarC2, nVarC4, -oVar6.a(), 3);
                            if (!z2) {
                                mVar.k(nVarC, nVarC3, oVar5.a(), this.I, nVarC4, nVarC2, oVar6.a());
                            }
                            mVar2 = mVar;
                            r0 = this;
                            i7 = i5;
                            nVar3 = nVar6;
                        }
                    }
                    z11 = z8;
                } else {
                    oVar5 = r30;
                    z11 = z6;
                }
                int i217 = this.x;
                mVar2 = mVar;
                i7 = i5;
                A(mVar2, z7, z16, oVar5, oVar4, i217, i217 + i11, i11, this.E, this.I, z11, z2, this.d, this.g, this.h);
                mVar2.l(nVar2, nVar6, i4, 5);
                r0 = this;
                nVar3 = nVar6;
            } else {
                i7 = i5;
                boolean z111 = z2;
                boolean z112 = z16;
                defpackage.o oVar23 = oVar;
                defpackage.n nVar11 = nVar;
                defpackage.n nVar12 = nVar2;
                if (!z9) {
                    if (r30.b != null) {
                    }
                    c = 3;
                    z10 = true;
                } else {
                    c = 3;
                    z10 = z6;
                }
                int i218 = this.x;
                int i219 = this.E;
                float f5 = this.I;
                int i2110 = this.d;
                nVar2 = nVar12;
                int i2111 = this.g;
                nVar3 = nVar11;
                int i2112 = this.h;
                mVar2 = mVar;
                ?? r3 = this;
                r3.A(mVar2, z7, z112, r30, oVar23, i218, i218 + i4, i4, i219, f5, z10, z111, i2110, i2111, i2112);
                r0 = r3;
            }
            if (z3) {
                kVarA = mVar2.a();
                i8 = i7;
                if (i8 == 0) {
                    kVarA.e(nVarC6, nVarC5, nVar2, nVar3, f);
                    mVar2.e(kVarA);
                    return;
                }
                nVar4 = nVar3;
                nVar5 = nVar2;
                if (i8 == 1) {
                    kVarA.e(nVar5, nVar4, nVarC6, nVarC5, f);
                    mVar2.e(kVarA);
                    return;
                }
                i9 = r0.e;
                if (i9 > 0) {
                    mVar2.g(nVarC6, nVarC5, i9, 3);
                }
                i10 = r0.g;
                if (i10 > 0) {
                    mVar2.g(nVar5, nVar4, i10, 3);
                }
                kVarA.e(nVarC6, nVarC5, nVar5, nVar4, f);
                defpackage.n nVarB5 = mVar2.b();
                defpackage.n nVarB6 = mVar2.b();
                nVarB5.c = 4;
                nVarB6.c = 4;
                kVarA.c(nVarB5, nVarB6);
                mVar2.e(kVarA);
            }
        }
        i5 = i2;
        z8 = true;
        i5 = i2;
        z9 = z6;
        i6 = this.C;
        if (i6 > 0) {
            nVar6 = nVar;
            mVar3.l(nVarC9, nVar6, i6, 5);
            oVar3 = oVar2;
            if (oVar3.b != null) {
                i11 = this.C;
                oVar4 = oVar3;
            } else {
                oVar4 = oVar;
                i11 = i4;
            }
            if (z9) {
                oVar5 = oVar9;
                if (oVar5.b != null) {
                    oVar6 = oVar;
                    if (oVar6.b != null) {
                        nVarC = mVar3.c(oVar5);
                        nVarC2 = mVar3.c(oVar6);
                        nVarC3 = mVar3.c(oVar5.b);
                        nVarC4 = mVar3.c(oVar6.b);
                        mVar3.g(nVarC, nVarC3, oVar5.a(), 3);
                        mVar3.h(nVarC2, nVarC4, -oVar6.a(), 3);
                        if (!z2) {
                            mVar.k(nVarC, nVarC3, oVar5.a(), this.I, nVarC4, nVarC2, oVar6.a());
                        }
                        mVar2 = mVar;
                        r0 = this;
                        i7 = i5;
                        nVar3 = nVar6;
                    }
                }
                z11 = z8;
            } else {
                oVar5 = r30;
                z11 = z6;
            }
            int i2113 = this.x;
            mVar2 = mVar;
            i7 = i5;
            A(mVar2, z7, z16, oVar5, oVar4, i2113, i2113 + i11, i11, this.E, this.I, z11, z2, this.d, this.g, this.h);
            mVar2.l(nVar2, nVar6, i4, 5);
            r0 = this;
            nVar3 = nVar6;
        } else {
            i7 = i5;
            boolean z113 = z2;
            boolean z114 = z16;
            defpackage.o oVar24 = oVar;
            defpackage.n nVar13 = nVar;
            defpackage.n nVar14 = nVar2;
            if (!z9) {
                if (r30.b != null) {
                }
                c = 3;
                z10 = true;
            } else {
                c = 3;
                z10 = z6;
            }
            int i2114 = this.x;
            int i2115 = this.E;
            float f6 = this.I;
            int i2116 = this.d;
            nVar2 = nVar14;
            int i2117 = this.g;
            nVar3 = nVar13;
            int i2118 = this.h;
            mVar2 = mVar;
            ?? r4 = this;
            r4.A(mVar2, z7, z114, r30, oVar24, i2114, i2114 + i4, i4, i2115, f6, z10, z113, i2116, i2117, i2118);
            r0 = r4;
        }
        if (z3) {
            kVarA = mVar2.a();
            i8 = i7;
            if (i8 == 0) {
                kVarA.e(nVarC6, nVarC5, nVar2, nVar3, f);
                mVar2.e(kVarA);
                return;
            }
            nVar4 = nVar3;
            nVar5 = nVar2;
            if (i8 == 1) {
                kVarA.e(nVar5, nVar4, nVarC6, nVarC5, f);
                mVar2.e(kVarA);
                return;
            }
            i9 = r0.e;
            if (i9 > 0) {
                mVar2.g(nVarC6, nVarC5, i9, 3);
            }
            i10 = r0.g;
            if (i10 > 0) {
                mVar2.g(nVar5, nVar4, i10, 3);
            }
            kVarA.e(nVarC6, nVarC5, nVar5, nVar4, f);
            defpackage.n nVarB7 = mVar2.b();
            defpackage.n nVarB8 = mVar2.b();
            nVarB7.c = 4;
            nVarB8.c = 4;
            kVarA.c(nVarB7, nVarB8);
            mVar2.e(kVarA);
        }
    }

    public void y() {
        int i;
        int i2;
        int iN = defpackage.m.n(this.i);
        int iN2 = defpackage.m.n(this.j);
        int iN3 = defpackage.m.n(this.k) - iN;
        int iN4 = defpackage.m.n(this.l) - iN2;
        this.w = iN;
        this.x = iN2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iN3 < (i2 = this.s)) {
            iN3 = i2;
        }
        if (this.ae == 1 && iN4 < (i = this.t)) {
            iN4 = i;
        }
        this.s = iN3;
        this.t = iN4;
        int i3 = this.E;
        if (iN4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iN3 < i4) {
            this.s = i4;
        }
    }

    public void z(defpackage.lam lamVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
