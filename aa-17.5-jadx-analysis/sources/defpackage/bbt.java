package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public abstract class bbt implements aqf {
    public final bwq A;
    public final byd B;
    public final kwp C;
    private final boolean D;
    private final bym E;
    private final bwq F;
    private final bwq G;
    private final byd H;
    private final izj I;
    private final bwq a;
    private final aqf b;
    public boolean c;
    public bbj d;
    public final bbl e;
    public int f;
    public int g;
    public long h;
    public long i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final bwq n;
    public dlg o;
    public int p;
    public final asf q;
    public final azt r;
    public final bay s;
    public final ayg t;
    public final bwq u;
    public final cus v;
    public final azq w;
    public final bwq x;
    public final bwq y;
    public final bwq z;

    public bbt(int i, float f) {
        double d = f;
        if (d < -0.5d || d > 0.5d) {
            asl.c("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        cja cjaVar = new cja(0L);
        bxp bxpVar = bxp.c;
        this.a = new ParcelableSnapshotMutableState(cjaVar, bxpVar);
        bbl bblVar = new bbl(i, f, this);
        this.e = bblVar;
        this.f = i;
        this.h = Long.MAX_VALUE;
        this.b = new anj(new bbn(this, 0));
        this.D = true;
        bbj bbjVar = bbv.b;
        bxp bxpVar2 = bxp.b;
        this.n = new ParcelableSnapshotMutableState(bbjVar, bxpVar2);
        this.o = bbv.a;
        this.q = new asg();
        this.H = new ParcelableSnapshotMutableIntState(-1);
        this.B = new ParcelableSnapshotMutableIntState(i);
        bap bapVar = new bap(this, 4);
        lah lahVar = byj.a;
        this.E = new bvk(bapVar, bxpVar);
        new bvk(new bap(this, 5), bxpVar);
        azt aztVar = new azt(new bbn(this, 2));
        this.r = aztVar;
        izj izjVar = new izj(this);
        this.I = izjVar;
        this.s = new bay(izjVar, aztVar, new bap(this, 6));
        this.C = new kwp((byte[]) null, (short[]) null);
        this.t = new ayg();
        this.u = new ParcelableSnapshotMutableState(null, bxpVar);
        this.v = new bbq(this, 0);
        dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
        this.w = new azq();
        azo azoVar = bblVar.d;
        afak afakVar = afak.a;
        this.x = new ParcelableSnapshotMutableState(afakVar, bxpVar2);
        this.y = new ParcelableSnapshotMutableState(afakVar, bxpVar2);
        this.F = new ParcelableSnapshotMutableState(false, bxpVar);
        this.G = new ParcelableSnapshotMutableState(false, bxpVar);
        this.z = new ParcelableSnapshotMutableState(false, bxpVar);
        this.A = new ParcelableSnapshotMutableState(false, bxpVar);
    }

    private final void D(int i) {
        this.H.h(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object r(defpackage.bbt r5, defpackage.akq r6, defpackage.afeg r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.bbr
            if (r0 == 0) goto L13
            r0 = r8
            bbr r0 = (defpackage.bbr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bbr r0 = new bbr
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            afcr r1 = defpackage.afcr.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.woy.dF(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r0.b
            akq r6 = r0.f
            java.lang.Object r5 = r0.a
            defpackage.woy.dF(r8)
            goto L4f
        L3e:
            defpackage.woy.dF(r8)
            r0.a = r5
            r0.f = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 == r1) goto L7c
        L4f:
            r8 = r5
            bbt r8 = (defpackage.bbt) r8
            boolean r2 = r8.i()
            if (r2 != 0) goto L61
            int r2 = r8.j()
            byd r4 = r8.B
            r4.h(r2)
        L61:
            aqf r8 = r8.b
            r0.a = r5
            r2 = 0
            r0.f = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L73
            goto L7c
        L73:
            bbt r5 = (defpackage.bbt) r5
            r6 = -1
            r5.D(r6)
            afak r5 = defpackage.afak.a
            return r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbt.r(bbt, akq, afeg, afck):java.lang.Object");
    }

    public final Object A(int i, afck afckVar) {
        Object objE = e(akq.a, new bbs(this, i, (afck) null, 0), afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    public final void B(int i) {
        D(f(i));
    }

    public final cxb C() {
        return (cxb) this.u.a();
    }

    @Override // defpackage.aqf
    public final float a(float f) {
        return this.b.a(f);
    }

    public abstract int b();

    public final float c() {
        return this.e.a();
    }

    public final float d() {
        dlg dlgVar = this.o;
        bbu bbuVar = bbv.a;
        return Math.min(dlgVar.eA(56.0f), k() / 2.0f) / k();
    }

    @Override // defpackage.aqf
    public final Object e(akq akqVar, afeg afegVar, afck afckVar) {
        return r(this, akqVar, afegVar, afckVar);
    }

    public final int f(int i) {
        if (b() > 0) {
            return afpt.g(i, 0, b() - 1);
        }
        return 0;
    }

    @Override // defpackage.aqf
    public final boolean g() {
        return ((Boolean) this.G.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean h() {
        return ((Boolean) this.F.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean i() {
        return this.b.i();
    }

    public final int j() {
        return this.e.b();
    }

    public final int k() {
        return ((bbj) this.n.a()).b;
    }

    public final int l() {
        return k() + m();
    }

    public final int m() {
        return ((bbj) this.n.a()).c;
    }

    public final int n() {
        return this.H.e();
    }

    public final int o() {
        return ((Number) this.E.a()).intValue();
    }

    public final long p() {
        return ((cja) this.a.a()).a;
    }

    public final Object q(afck afckVar) {
        Object objF;
        return (this.n.a() == bbv.b && (objF = this.t.f(afckVar)) == afcr.a) ? objF : afak.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02da A[Catch: all -> 0x050e, TryCatch #0 {all -> 0x050e, blocks: (B:123:0x0274, B:127:0x0288, B:130:0x0291, B:133:0x029e, B:135:0x02aa, B:144:0x02e1, B:146:0x0302, B:148:0x031b, B:150:0x0335, B:152:0x0340, B:154:0x0349, B:156:0x0355, B:157:0x035a, B:159:0x0365, B:160:0x0379, B:162:0x0387, B:164:0x0396, B:167:0x03a2, B:171:0x03a9, B:172:0x03ac, B:207:0x04ac, B:209:0x04b2, B:213:0x04cb, B:214:0x04d1, B:173:0x03b5, B:174:0x03ba, B:175:0x03bb, B:176:0x03e8, B:178:0x0408, B:180:0x0413, B:182:0x041c, B:184:0x0427, B:187:0x042c, B:189:0x0437, B:190:0x0449, B:191:0x0451, B:192:0x0454, B:194:0x045f, B:197:0x046a, B:201:0x0471, B:202:0x0474, B:203:0x047d, B:204:0x0482, B:205:0x0483, B:141:0x02da, B:138:0x02c2), top: B:228:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0302 A[Catch: all -> 0x050e, TryCatch #0 {all -> 0x050e, blocks: (B:123:0x0274, B:127:0x0288, B:130:0x0291, B:133:0x029e, B:135:0x02aa, B:144:0x02e1, B:146:0x0302, B:148:0x031b, B:150:0x0335, B:152:0x0340, B:154:0x0349, B:156:0x0355, B:157:0x035a, B:159:0x0365, B:160:0x0379, B:162:0x0387, B:164:0x0396, B:167:0x03a2, B:171:0x03a9, B:172:0x03ac, B:207:0x04ac, B:209:0x04b2, B:213:0x04cb, B:214:0x04d1, B:173:0x03b5, B:174:0x03ba, B:175:0x03bb, B:176:0x03e8, B:178:0x0408, B:180:0x0413, B:182:0x041c, B:184:0x0427, B:187:0x042c, B:189:0x0437, B:190:0x0449, B:191:0x0451, B:192:0x0454, B:194:0x045f, B:197:0x046a, B:201:0x0471, B:202:0x0474, B:203:0x047d, B:204:0x0482, B:205:0x0483, B:141:0x02da, B:138:0x02c2), top: B:228:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04b2 A[Catch: all -> 0x050e, TryCatch #0 {all -> 0x050e, blocks: (B:123:0x0274, B:127:0x0288, B:130:0x0291, B:133:0x029e, B:135:0x02aa, B:144:0x02e1, B:146:0x0302, B:148:0x031b, B:150:0x0335, B:152:0x0340, B:154:0x0349, B:156:0x0355, B:157:0x035a, B:159:0x0365, B:160:0x0379, B:162:0x0387, B:164:0x0396, B:167:0x03a2, B:171:0x03a9, B:172:0x03ac, B:207:0x04ac, B:209:0x04b2, B:213:0x04cb, B:214:0x04d1, B:173:0x03b5, B:174:0x03ba, B:175:0x03bb, B:176:0x03e8, B:178:0x0408, B:180:0x0413, B:182:0x041c, B:184:0x0427, B:187:0x042c, B:189:0x0437, B:190:0x0449, B:191:0x0451, B:192:0x0454, B:194:0x045f, B:197:0x046a, B:201:0x0471, B:202:0x0474, B:203:0x047d, B:204:0x0482, B:205:0x0483, B:141:0x02da, B:138:0x02c2), top: B:228:0x0274 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.bbj r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbt.s(bbj, boolean, boolean):void");
    }

    public final void t(long j) {
        this.a.b(new cja(j));
    }

    public final void u(int i, float f, boolean z) {
        bbl bblVar = this.e;
        if (bblVar.b() != i || bblVar.a() != f) {
            this.s.a.a();
        }
        bblVar.e(i, f);
        bblVar.c = null;
        if (!z) {
            this.y.b(afak.a);
            return;
        }
        cxb cxbVarC = C();
        if (cxbVarC != null) {
            cxbVarC.D();
        }
    }

    public final boolean v() {
        return ((Boolean) this.z.a()).booleanValue();
    }

    public final boolean w() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final bbj x() {
        return (bbj) this.n.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (e(defpackage.akq.a, r5, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(int r12, defpackage.aec r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.bbo
            if (r0 == 0) goto L13
            r0 = r14
            bbo r0 = (defpackage.bbo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bbo r0 = new bbo
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.woy.dF(r14)
            goto L83
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            int r12 = r0.a
            aft r13 = r0.e
            defpackage.woy.dF(r14)
        L3a:
            r9 = r13
            goto L63
        L3c:
            defpackage.woy.dF(r14)
            int r14 = r11.j()
            if (r12 != r14) goto L4d
            float r14 = r11.c()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L83
        L4d:
            int r14 = r11.b()
            if (r14 == 0) goto L83
            r14 = r13
            aft r14 = (defpackage.aft) r14
            r0.e = r14
            r0.a = r12
            r0.d = r5
            java.lang.Object r14 = r11.q(r0)
            if (r14 != r1) goto L3a
            goto L82
        L63:
            int r7 = r11.f(r12)
            int r12 = r11.l()
            float r12 = (float) r12
            float r8 = r12 * r3
            bbp r5 = new bbp
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = 0
            r0.e = r11
            r0.d = r4
            akq r11 = defpackage.akq.a
            java.lang.Object r11 = r6.e(r11, r5, r0)
            if (r11 != r1) goto L83
        L82:
            return r1
        L83:
            afak r11 = defpackage.afak.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbt.y(int, aec, afck):java.lang.Object");
    }
}
