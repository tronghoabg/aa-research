package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class blr {
    private final bwq A;
    private int B;
    private blf C;
    public final bfl a;
    public djn b;
    public afec c;
    public bed d;
    public final bwq e;
    public afdr f;
    public aitx g;
    public cil h;
    public final bwq i;
    public final bwq j;
    public long k;
    public dfv l;
    public long m;
    public djv n;
    public dfv o;
    public final bwq p;
    public final ben q;
    public final bjx r;
    public boolean s;
    public bke t;
    public dka u;
    public dan v;
    public vtn w;
    public kwp x;
    public kwp y;
    private final bwq z;

    public blr(bfl bflVar) {
        this.a = bflVar;
        this.b = bfn.a;
        this.c = new bes(15);
        djv djvVar = new djv((String) null, 0L, 7);
        bxp bxpVar = bxp.c;
        this.e = new ParcelableSnapshotMutableState(djvVar, bxpVar);
        this.u = djz.a;
        this.i = new ParcelableSnapshotMutableState(true, bxpVar);
        this.j = new ParcelableSnapshotMutableState(true, bxpVar);
        this.k = 0L;
        this.m = 0L;
        this.z = new ParcelableSnapshotMutableState(null, bxpVar);
        this.A = new ParcelableSnapshotMutableState(null, bxpVar);
        this.B = -1;
        this.n = new djv((String) null, 0L, 7);
        this.p = new ParcelableSnapshotMutableState(false, bxpVar);
        this.w = new vtn(null, null);
        this.q = new blp(this);
        this.r = new bln(this);
    }

    public final void A() {
        aitx aitxVar = this.g;
        if (aitxVar != null) {
            ahnc.d(aitxVar, null, 4, new blo(this, null), 1);
        }
    }

    public final long a(boolean z) {
        bff bffVarD;
        deu deuVarE;
        long j;
        int iMax;
        bed bedVar = this.d;
        if (bedVar != null && (bffVarD = bedVar.d()) != null && (deuVarE = e()) != null) {
            dft dftVar = bffVarD.a;
            if (affa.f(deuVarE.b, dftVar.a.a.b)) {
                if (z) {
                    long j2 = f().b;
                    long j3 = dfv.a;
                    j = j2 >> 32;
                } else {
                    long j4 = f().b;
                    long j5 = dfv.a;
                    j = j4 & 4294967295L;
                }
                int iA = this.b.a((int) j);
                boolean zJ = dfv.j(f().b);
                if (dftVar.g(iA) >= dftVar.e()) {
                    return 9205357640488583168L;
                }
                if (z) {
                    if (zJ) {
                        zJ = true;
                        if (z) {
                        }
                    }
                } else {
                    iMax = (z && zJ) ? iA : Math.max(iA - 1, 0);
                }
                int iP = dftVar.p(iMax);
                int iQ = dftVar.q(iA);
                dfb dfbVar = dftVar.b;
                dfbVar.j(iA);
                dfd dfdVar = (dfd) dfbVar.h.get(iA == dfbVar.h().a() ? dfbVar.h.size() - 1 : das.e(dfbVar.h, iA));
                den denVar = dfdVar.g;
                int iE = dfdVar.e(iA);
                float fE = iP == iQ ? denVar.b.e(iE, false) : denVar.b.f(iE, false);
                long j6 = dftVar.c;
                return (Float.floatToRawIntBits(afpt.d(dftVar.a(r7), BitmapDescriptorFactory.HUE_RED, (int) (j6 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(afpt.d(fE, BitmapDescriptorFactory.HUE_RED, (int) (j6 >> 32))) << 32);
            }
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.djv r24, long r25, boolean r27, boolean r28, defpackage.bko r29, boolean r30, defpackage.cpi r31) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blr.b(djv, long, boolean, boolean, bko, boolean, cpi):long");
    }

    public final bdt c() {
        return (bdt) this.z.a();
    }

    public final cja d() {
        return (cja) this.A.a();
    }

    public final deu e() {
        bem bemVar;
        bed bedVar = this.d;
        if (bedVar == null || (bemVar = bedVar.a) == null) {
            return null;
        }
        return bemVar.a;
    }

    public final djv f() {
        return (djv) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.blq
            if (r0 == 0) goto L13
            r0 = r5
            blq r0 = (defpackage.blq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            blq r0 = new blq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            blr r4 = r0.d
            defpackage.woy.dF(r5)
            goto L59
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r5)
            kwp r5 = r4.x
            if (r5 == 0) goto L63
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.a
            czl r5 = (defpackage.czl) r5
            android.content.ClipboardManager r5 = r5.a()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            if (r5 != 0) goto L4c
            r5 = 0
            goto L52
        L4c:
            java.lang.String r0 = "text/*"
            boolean r5 = r5.hasMimeType(r0)
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            bwq r4 = r4.p
            r4.b(r5)
        L63:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blr.g(afck):java.lang.Object");
    }

    public final aezu h() {
        String str;
        dfv dfvVar;
        deu deuVarE = e();
        if (deuVarE == null || (str = deuVarE.b) == null || (dfvVar = this.o) == null) {
            return null;
        }
        djn djnVar = this.b;
        long j = dfvVar.b;
        return new aezu(str, new dfv(czz.t(djnVar.a((int) (j >> 32)), this.b.a((int) (j & 4294967295L)))));
    }

    public final void i(cja cjaVar) {
        int iMax;
        if (!dfv.i(f().b)) {
            bed bedVar = this.d;
            bff bffVarD = bedVar != null ? bedVar.d() : null;
            if (cjaVar == null || bffVarD == null) {
                long j = f().b;
                iMax = Math.max((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                iMax = this.b.b(bffVarD.a(cjaVar.a, true));
            }
            djv djvVarB = djv.b(f(), null, czz.t(iMax, iMax), 5);
            this.c.invoke(djvVarB);
            this.o = new dfv(djvVarB.b);
        }
        q((cjaVar == null || f().a().length() <= 0) ? bdu.a : bdu.c);
        t(false);
    }

    public final void j(boolean z) {
        cil cilVar;
        bed bedVar = this.d;
        if (bedVar != null && !bedVar.p() && (cilVar = this.h) != null) {
            cilVar.a(7);
        }
        this.n = f();
        t(z);
        q(bdu.b);
    }

    public final void k() {
        t(false);
        q(bdu.a);
    }

    public final void l() {
        bhj bhjVar;
        aivh aivhVar;
        Object obj = this.w.b;
        if (obj == null || (aivhVar = (bhjVar = (bhj) obj).d) == null) {
            return;
        }
        aivhVar.s(null);
        bhjVar.d = null;
    }

    public final void m(dfv dfvVar) {
        bke bkeVar;
        deu deuVarE;
        String str;
        aitx aitxVar;
        if (dfvVar == null || (bkeVar = this.t) == null || (deuVarE = e()) == null || (str = deuVarE.b) == null) {
            return;
        }
        djn djnVar = this.b;
        long j = dfvVar.b;
        long jT = czz.t(djnVar.a((int) (j >> 32)), djnVar.a((int) (j & 4294967295L)));
        if (str.length() <= 0 || dfv.i(jT) || (aitxVar = this.g) == null) {
            return;
        }
        ahnc.d(aitxVar, null, 0, new blm(bkeVar, str, jT, dfvVar, this, djnVar, null), 3);
    }

    public final void n(cja cjaVar) {
        this.A.b(cjaVar);
    }

    public final void o(long j) {
        bed bedVar = this.d;
        if (bedVar != null) {
            bedVar.g(j);
        }
        bed bedVar2 = this.d;
        if (bedVar2 != null) {
            bedVar2.k(dfv.a);
        }
        if (dfv.i(j)) {
            return;
        }
        k();
    }

    public final void p(bdt bdtVar) {
        this.z.b(bdtVar);
    }

    public final void q(bdu bduVar) {
        bed bedVar = this.d;
        if (bedVar != null) {
            if (bedVar.c() == bduVar) {
                bedVar = null;
            }
            if (bedVar != null) {
                bedVar.h(bduVar);
            }
        }
    }

    public final void r(long j) {
        bed bedVar = this.d;
        if (bedVar != null) {
            bedVar.k(j);
        }
        bed bedVar2 = this.d;
        if (bedVar2 != null) {
            bedVar2.g(dfv.a);
        }
        if (dfv.i(j)) {
            return;
        }
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r4.t() != false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r5v3, types: [cwc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r5 = this;
            lah r0 = defpackage.cek.i
            java.lang.Object r0 = r0.j()
            cec r0 = (defpackage.cec) r0
            r1 = 0
            if (r0 == 0) goto L10
            afec r2 = r0.i()
            goto L11
        L10:
            r2 = r1
        L11:
            cec r3 = defpackage.byx.i(r0)
            boolean r4 = r5.v()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L68
            bed r4 = r5.d     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L25
            boolean r4 = r4.t()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L68
        L25:
            defpackage.byx.l(r0, r3, r2)
            vtn r5 = r5.w
            int r0 = r5.a
            r2 = 1
            if (r0 != r2) goto L34
            java.lang.String r0 = "ToolbarRequester is not initialized."
            defpackage.asl.d(r0)
        L34:
            java.lang.Object r5 = r5.b
            if (r5 == 0) goto L67
            r0 = r5
            cfx r0 = (defpackage.cfx) r0
            boolean r3 = r0.A
            if (r3 == 0) goto L67
            r3 = r5
            bhj r3 = (defpackage.bhj) r3
            aivh r4 = r3.d
            if (r4 == 0) goto L4d
            boolean r4 = r4.t()
            if (r4 != r2) goto L4d
            goto L67
        L4d:
            bvf r4 = defpackage.bhq.b
            java.lang.Object r5 = defpackage.bzi.x(r5, r4)
            bhp r5 = (defpackage.bhp) r5
            if (r5 == 0) goto L67
            aitx r0 = r0.N()
            bhi r4 = new bhi
            r4.<init>(r3, r5, r1)
            r5 = 4
            aivh r5 = defpackage.ahnc.d(r0, r1, r5, r4, r2)
            r3.d = r5
        L67:
            return
        L68:
            defpackage.byx.l(r0, r3, r2)
            return
        L6c:
            r5 = move-exception
            defpackage.byx.l(r0, r3, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blr.s():void");
    }

    public final void t(boolean z) {
        bed bedVar = this.d;
        if (bedVar != null) {
            bedVar.m(z);
        }
        if (z) {
            s();
        } else {
            l();
        }
    }

    public final boolean u() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final boolean w() {
        return !dfv.i(f().b);
    }

    public final void y(boolean z) {
        aitx aitxVar = this.g;
        if (aitxVar != null) {
            ahnc.d(aitxVar, null, 4, new blj(this, z, null), 1);
        }
    }

    public final void z() {
        aitx aitxVar = this.g;
        if (aitxVar != null) {
            ahnc.d(aitxVar, null, 4, new beo(this, (afck) null, 4, (byte[]) null), 1);
        }
    }

    public blr() {
        this(null);
    }
}
