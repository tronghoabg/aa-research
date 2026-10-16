package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class air extends cwe implements cys, cpq, cyu, cwc, cyg, cpm, ajx {
    private long D;
    private asf E;
    private boolean F;
    private aivh G;
    public asf a;
    public boolean b;
    public akm c;
    public String d = "idle";
    public asi e;
    public asa f;
    public asi g;
    public final zo h;
    private akm i;
    private boolean j;
    private String k;
    private ddo l;
    private afdr m;
    private final ajw n;
    private cwd o;
    private cwd p;

    public air(asf asfVar, akm akmVar, boolean z, boolean z2, String str, ddo ddoVar, afdr afdrVar) {
        this.a = asfVar;
        this.i = akmVar;
        this.j = z;
        this.k = str;
        this.l = ddoVar;
        this.b = z2;
        this.m = afdrVar;
        this.n = new ajw(this.a, 0, new bhd((Object) this, 1, (byte[]) null));
        int i = zp.a;
        this.h = new zo(6);
        this.D = 0L;
        this.E = this.a;
        this.F = L();
    }

    private final void J() {
        if (this.o == null) {
            ajy ajyVar = new ajy(this);
            W(ajyVar);
            this.o = ajyVar;
        }
    }

    private final boolean K() {
        affv affvVar = new affv();
        ca.bd(this, new acm(affvVar, 8));
        if (affvVar.a != null) {
            return true;
        }
        long j = ajl.a;
        ViewParent parent = tt.c(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    private final boolean L() {
        return this.E == null;
    }

    @Override // defpackage.cpq
    public final boolean A(KeyEvent keyEvent) {
        boolean z;
        m();
        long jF = rl.f(keyEvent);
        if (this.b && rl.e(keyEvent) == 2 && afp.v(keyEvent)) {
            zo zoVar = this.h;
            if (zoVar.b(jF)) {
                z = false;
            } else {
                asi asiVar = new asi(this.D);
                zoVar.e(jF, asiVar);
                if (this.a != null) {
                    ahnc.d(N(), null, 0, new ain(this, asiVar, (afck) null, 7, (char[]) null), 3);
                }
                z = true;
            }
            G(keyEvent);
            return z;
        }
        if (!this.b || rl.e(keyEvent) != 1 || !afp.v(keyEvent)) {
            return false;
        }
        asi asiVar2 = (asi) this.h.c(jF);
        if (asiVar2 != null) {
            if (this.a != null) {
                ahnc.d(N(), null, 0, new ain(this, asiVar2, (afck) null, 8, (short[]) null), 3);
            }
            F(keyEvent);
        }
        return asiVar2 != null;
    }

    @Override // defpackage.cpq
    public final boolean B(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    protected abstract void F(KeyEvent keyEvent);

    protected abstract void G(KeyEvent keyEvent);

    @Override // defpackage.cpm
    public void H(aagd aagdVar, cqm cqmVar) {
        m();
        if (this.b) {
            J();
        }
    }

    protected final long a(long j) {
        long jEH = bzi.q(this).r.eH(((dcc) bzi.x(this, dbc.n)).g());
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jEH >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jEH & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // defpackage.ajx
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cys
    public final /* synthetic */ long eq() {
        return ty.c(0, 0, 0, 0);
    }

    @Override // defpackage.cfx
    public final void er() {
        r();
        if (!this.F) {
            m();
        }
        if (this.b) {
            W(this.n);
        }
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        ddo ddoVar = this.l;
        if (ddoVar != null) {
            decVar.a(ddx.A, new ddo(ddoVar.a));
        }
        decVar.a(ddq.b, new ddf(this.k, new nx(this, 15)));
        if (this.b) {
            this.n.g(decVar);
        } else {
            decVar.a(ddx.j, afak.a);
        }
        f(decVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void h() {
        /*
            r17 = this;
            r0 = r17
            asf r1 = r0.a
            if (r1 == 0) goto L76
            asi r2 = r0.e
            if (r2 == 0) goto L12
            ash r3 = new ash
            r3.<init>(r2)
            r1.c(r3)
        L12:
            asi r2 = r0.g
            if (r2 == 0) goto L1e
            ash r3 = new ash
            r3.<init>(r2)
            r1.c(r3)
        L1e:
            asa r2 = r0.f
            if (r2 == 0) goto L2a
            asb r3 = new asb
            r3.<init>(r2)
            r1.c(r3)
        L2a:
            zo r2 = r0.h
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L76
            r5 = 0
            r6 = r5
        L37:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L71
            int r9 = r6 - r4
            r10 = r5
        L4a:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L6b
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            asi r11 = (defpackage.asi) r11
            ash r13 = new ash
            r13.<init>(r11)
            r1.c(r13)
        L6b:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L4a
        L6f:
            if (r11 != r12) goto L76
        L71:
            if (r6 == r4) goto L76
            int r6 = r6 + 1
            goto L37
        L76:
            r1 = 0
            r0.e = r1
            r0.g = r1
            r0.f = r1
            zo r0 = r0.h
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.air.h():void");
    }

    protected final void i(boolean z) {
        asf asfVar = this.a;
        if (asfVar != null) {
            aivh aivhVar = this.G;
            byte[] bArr = null;
            if (aivhVar == null || !aivhVar.t()) {
                asi asiVar = z ? this.g : this.e;
                if (asiVar != null) {
                    ash ashVar = new ash(asiVar);
                    aivh aivhVar2 = (aivh) ((ajbw) N()).a.get(aivh.d);
                    ahnc.d(N(), null, 0, new aio(asfVar, ashVar, aivhVar2 != null ? aivhVar2.p(new abi(asfVar, ashVar, 19, bArr)) : null, (afck) null, 0), 3);
                }
            } else {
                aivh aivhVar3 = this.G;
                if (aivhVar3 != null) {
                    aivhVar3.s(null);
                }
            }
            if (z) {
                this.g = null;
            } else {
                this.e = null;
            }
        }
    }

    protected final void j(long j, boolean z) {
        asf asfVar = this.a;
        if (asfVar != null) {
            aivh aivhVar = this.G;
            if (aivhVar == null || !aivhVar.t()) {
                asi asiVar = z ? this.g : this.e;
                if (asiVar != null) {
                    ahnc.d(N(), null, 0, new ain(asiVar, asfVar, (afck) null, 2), 3);
                }
            } else {
                aivhVar.s(null);
                ahnc.d(N(), null, 0, new aip(aivhVar, j, asfVar, null), 3);
            }
            if (z) {
                this.g = null;
            } else {
                this.e = null;
            }
        }
    }

    protected final void k(cpl cplVar) {
        asf asfVar = this.a;
        if (asfVar != null) {
            asi asiVar = new asi(cplVar.c);
            if (K()) {
                this.G = ahnc.d(N(), null, 0, new aio(asfVar, asiVar, this, (afck) null, 2), 3);
            } else {
                this.g = asiVar;
                ahnc.d(N(), null, 0, new ain(asfVar, asiVar, (afck) null, 3), 3);
            }
        }
    }

    protected final void l(cqu cquVar) {
        asf asfVar = this.a;
        if (asfVar != null) {
            asi asiVar = new asi(cquVar.c);
            if (K()) {
                this.G = ahnc.d(N(), null, 0, new aio(asfVar, asiVar, this, (afck) null, 3, (byte[]) null), 3);
            } else {
                this.e = asiVar;
                ahnc.d(N(), null, 0, new ain(asfVar, asiVar, (afck) null, 4, (byte[]) null), 3);
            }
        }
    }

    public final void m() {
        if (this.p != null) {
            return;
        }
        akm akmVar = this.j ? this.c : this.i;
        if (akmVar != null) {
            if (this.a == null) {
                this.a = new asg();
            }
            this.n.b(this.a);
            asf asfVar = this.a;
            asfVar.getClass();
            cwd cwdVarA = akmVar.a(asfVar);
            W(cwdVarA);
            this.p = cwdVarA;
        }
    }

    @Override // defpackage.cys
    public void o() {
        asa asaVar;
        asf asfVar = this.a;
        if (asfVar != null && (asaVar = this.f) != null) {
            asfVar.c(new asb(asaVar));
        }
        this.f = null;
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cfx
    public final void q() {
        h();
        if (this.E == null) {
            this.a = null;
        }
        cwd cwdVar = this.p;
        if (cwdVar != null) {
            V(cwdVar);
        }
        this.p = null;
        cwd cwdVar2 = this.o;
        if (cwdVar2 != null) {
            V(cwdVar2);
        }
        this.o = null;
    }

    @Override // defpackage.cyg
    public final void r() {
        if (this.j) {
            cjn.p(this, new nx(this, 14));
        }
    }

    @Override // defpackage.cys
    public void s(cql cqlVar, cqm cqmVar, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.D = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m();
        if (this.b) {
            J();
            if (cqmVar == cqm.b) {
                int i = cqlVar.e;
                if (i == 4) {
                    ahnc.d(N(), null, 0, new aiq(this, (afck) null, 1, (byte[]) null), 3);
                } else if (i == 5) {
                    ahnc.d(N(), null, 0, new aiq(this, (afck) null, 0), 3);
                }
            }
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void t() {
        o();
    }

    public final void u() {
        dbz dbzVar = (dbz) bzi.x(this, dbc.p);
        if (dbzVar != null) {
            dbzVar.a();
        }
        this.m.invoke();
    }

    public final void v() {
        cwd cwdVar = this.p;
        if (cwdVar == null && this.F) {
            return;
        }
        if (cwdVar != null) {
            V(cwdVar);
        }
        this.p = null;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.asf r3, defpackage.akm r4, boolean r5, boolean r6, java.lang.String r7, defpackage.ddo r8, defpackage.afdr r9) {
        /*
            r2 = this;
            asf r0 = r2.E
            boolean r0 = defpackage.affa.f(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.h()
            r2.E = r3
            r2.a = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            akm r0 = r2.i
            boolean r0 = defpackage.affa.f(r0, r4)
            if (r0 != 0) goto L1e
            r2.i = r4
            r3 = r1
        L1e:
            boolean r4 = r2.j
            if (r4 == r5) goto L2a
            r2.j = r5
            if (r5 == 0) goto L2b
            r2.r()
            goto L2b
        L2a:
            r1 = r3
        L2b:
            boolean r3 = r2.b
            if (r3 == r6) goto L56
            ajw r3 = r2.n
            if (r6 == 0) goto L37
            r2.W(r3)
            goto L3d
        L37:
            r2.V(r3)
            r2.h()
        L3d:
            cxb r3 = defpackage.bzi.q(r2)
            r3.J()
            if (r6 != 0) goto L54
            cwd r3 = r2.o
            if (r3 == 0) goto L4d
            r2.V(r3)
        L4d:
            r3 = 0
            r2.o = r3
            java.lang.String r3 = "idle"
            r2.d = r3
        L54:
            r2.b = r6
        L56:
            java.lang.String r3 = r2.k
            boolean r3 = defpackage.affa.f(r3, r7)
            if (r3 != 0) goto L67
            r2.k = r7
            cxb r3 = defpackage.bzi.q(r2)
            r3.J()
        L67:
            ddo r3 = r2.l
            boolean r3 = defpackage.affa.f(r3, r8)
            if (r3 != 0) goto L78
            r2.l = r8
            cxb r3 = defpackage.bzi.q(r2)
            r3.J()
        L78:
            r2.m = r9
            boolean r3 = r2.F
            boolean r4 = r2.L()
            if (r3 == r4) goto L8f
            boolean r3 = r2.L()
            r2.F = r3
            if (r3 != 0) goto L8f
            cwd r3 = r2.p
            if (r3 != 0) goto L8f
            goto L91
        L8f:
            if (r1 == 0) goto L94
        L91:
            r2.v()
        L94:
            ajw r3 = r2.n
            asf r2 = r2.a
            r3.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.air.w(asf, akm, boolean, boolean, java.lang.String, ddo, afdr):void");
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final boolean y() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }

    public void n() {
    }

    public void f(dec decVar) {
    }
}
