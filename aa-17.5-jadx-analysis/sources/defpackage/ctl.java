package defpackage;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ctl implements bur {
    public final cxb a;
    public bvb b;
    public cvf c;
    public int d;
    public int e;
    public final cte f;
    public final ctb g;
    public final byw h;
    public int i;
    public int j;
    public final String k;
    public final aan l;
    public final aan m;
    public final aan n;
    public final aan o;
    private final cve p;

    public ctl(cxb cxbVar, cvf cvfVar) {
        this.a = cxbVar;
        this.c = cvfVar;
        long[] jArr = aao.a;
        this.l = new aan(6);
        this.m = new aan(6);
        this.f = new cte(this);
        this.g = new ctb(this);
        this.n = new aan(6);
        int i = aak.a;
        this.p = new cve(new aaj(6));
        this.o = new aan(6);
        this.h = new byw(new Object[16]);
        this.k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final cyj p() {
        return ((czq) cxe.a(this.a)).N();
    }

    private final Object q(List list, int i) {
        Object objA = this.l.a((cxb) list.get(i));
        objA.getClass();
        return ((ctc) objA).a;
    }

    private final void r(ctc ctcVar, boolean z) {
        bvd bvdVar;
        if (z || !ctcVar.f) {
            ctcVar.e = new ParcelableSnapshotMutableState(false, bxp.c);
        } else {
            ctcVar.e.b(false);
        }
        if (ctcVar.h != null) {
            s(ctcVar);
            return;
        }
        if (z) {
            bvd bvdVar2 = ctcVar.g;
            if (bvdVar2 != null) {
                bvdVar2.n();
                return;
            }
            return;
        }
        cyj cyjVarP = p();
        if (cyjVarP != null) {
            cyjVarP.n(new ahp(ctcVar, 17));
        } else {
            if (ctcVar.f || (bvdVar = ctcVar.g) == null) {
                return;
            }
            bvdVar.n();
        }
    }

    private static final void s(ctc ctcVar) {
        aap aapVar;
        bxa bxaVar = ctcVar.h;
        if (bxaVar != null) {
            bxaVar.d.set(bxb.b);
            cda cdaVar = bxaVar.f;
            if (cdaVar.h.c()) {
                aapVar = cdaVar.h;
                aap aapVar2 = aaq.a;
                cdaVar.h = new aap(6);
                cdaVar.b.g();
            } else {
                aapVar = null;
            }
            cdaVar.b();
            bxaVar.a.r(aapVar);
            ctcVar.h = null;
            bvd bvdVar = ctcVar.g;
            if (bvdVar != null) {
                bvdVar.d();
            }
            ctcVar.g = null;
        }
    }

    private static final void t(cxb cxbVar) {
        cxbVar.o().G = 3;
        cxn cxnVarN = cxbVar.n();
        if (cxnVarN != null) {
            cxnVarN.y = 3;
        }
    }

    public final cvb a(Object obj) {
        return !this.a.am() ? new cti() : new ctj(this, obj);
    }

    @Override // defpackage.bur
    public final void b() {
        l(true);
    }

    @Override // defpackage.bur
    public final void c() {
        g();
    }

    public final cxb d(int i) {
        cxb cxbVar = new cxb(true, 2, null);
        cxb cxbVar2 = this.a;
        cxbVar2.n = true;
        cxbVar2.F(i, cxbVar);
        cxbVar2.n = false;
        return cxbVar;
    }

    public final cxb e(Object obj) {
        int i;
        if (this.i == 0) {
            return null;
        }
        List listX = this.a.x();
        int size = listX.size() - this.j;
        int i2 = size - this.i;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (affa.f(q(listX, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object objA = this.l.a((cxb) listX.get(i3));
                objA.getClass();
                ctc ctcVar = (ctc) objA;
                Object obj2 = ctcVar.a;
                if (obj2 == cuy.a || this.c.b(obj, obj2)) {
                    ctcVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            o(i4, i2);
        }
        this.i--;
        cxb cxbVar = (cxb) listX.get(i2);
        Object objA2 = this.l.a(cxbVar);
        objA2.getClass();
        ctc ctcVar2 = (ctc) objA2;
        ctcVar2.e = new ParcelableSnapshotMutableState(true, bxp.c);
        ctcVar2.d = true;
        ctcVar2.c = true;
        return cxbVar;
    }

    public final void f(ctc ctcVar, boolean z) {
        cec cecVar;
        afec afecVar;
        Exception exc;
        int i;
        bxa bxaVar = ctcVar.h;
        if (bxaVar == null) {
            return;
        }
        cec cecVar2 = (cec) cek.i.j();
        afec afecVarI = cecVar2 != null ? cecVar2.i() : null;
        cec cecVarI = byx.i(cecVar2);
        try {
            cxb cxbVar = this.a;
            cxbVar.n = true;
            if (z) {
                while (!bxaVar.a()) {
                    try {
                        bxaVar.b(new cta());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            try {
                AtomicReference atomicReference = bxaVar.d;
                switch (((bxb) atomicReference.get()).ordinal()) {
                    case 0:
                        throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                    case 1:
                        throw new IllegalStateException("The paused composition has been cancelled");
                    case 2:
                    case 3:
                    case 4:
                        throw new IllegalStateException("The paused composition has not completed yet");
                    case 5:
                        try {
                            synchronized (bxaVar.c) {
                                try {
                                    bxo bxoVar = bxaVar.g;
                                    buj bujVar = bxaVar.b;
                                    cda cdaVar = bxaVar.f;
                                    zf zfVar = bxoVar.a;
                                    int i2 = zfVar.b;
                                    aag aagVar = bxoVar.b;
                                    aag aagVar2 = new aag(16);
                                    int i3 = 0;
                                    int i4 = 0;
                                    while (i3 < i2) {
                                        int i5 = i2;
                                        int i6 = i3 + 1;
                                        try {
                                            switch (zfVar.a(i3)) {
                                                case 0:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    bujVar.h();
                                                    i3 = i6;
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                                case 1:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    int i7 = i4 + 1;
                                                    bujVar.d(aagVar.c(i4));
                                                    i4 = i7;
                                                    i3 = i6;
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                                case 2:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    int i8 = i3 + 2;
                                                    i3 += 3;
                                                    bujVar.l(zfVar.a(i6), zfVar.a(i8));
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                                case 3:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    int i9 = i3 + 2;
                                                    try {
                                                        int iA = zfVar.a(i6);
                                                        int i10 = i3 + 3;
                                                        i3 += 4;
                                                        bujVar.k(iA, zfVar.a(i9), zfVar.a(i10));
                                                        i2 = i5;
                                                        cecVar2 = cecVar;
                                                        afecVarI = afecVar;
                                                    } catch (Exception e) {
                                                        exc = e;
                                                        i3 = i9;
                                                        try {
                                                            throw new but(aagVar, aagVar2, zfVar, i3 - 1, exc);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            bujVar.f();
                                                            throw th;
                                                        }
                                                    }
                                                case 4:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    bujVar.c();
                                                    i3 = i6;
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                                case 5:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    i3 += 2;
                                                    i = i4 + 1;
                                                    bujVar.i(zfVar.a(i6), aagVar.c(i4));
                                                    i4 = i;
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                                case 6:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    i3 += 2;
                                                    try {
                                                        i = i4 + 1;
                                                        bujVar.j(zfVar.a(i6), aagVar.c(i4));
                                                        i4 = i;
                                                        i2 = i5;
                                                        cecVar2 = cecVar;
                                                        afecVarI = afecVar;
                                                    } catch (Exception e2) {
                                                        exc = e2;
                                                        throw new but(aagVar, aagVar2, zfVar, i3 - 1, exc);
                                                    }
                                                case 7:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    int i11 = i4 + 1;
                                                    Object objC = aagVar.c(i4);
                                                    objC.getClass();
                                                    affz.g(objC, 2);
                                                    i4 += 2;
                                                    bujVar.b((afeg) objC, aagVar.c(i11));
                                                    i3 = i6;
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                                case 8:
                                                    Object objA = bujVar.a();
                                                    cecVar = cecVar2;
                                                    try {
                                                        if (objA instanceof bur) {
                                                            bur burVar = (bur) objA;
                                                            afecVar = afecVarI;
                                                            try {
                                                                try {
                                                                    if (cdaVar.d.m(burVar)) {
                                                                        burVar.b();
                                                                    }
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    exc = e;
                                                                    i3 = i6;
                                                                    throw new but(aagVar, aagVar2, zfVar, i3 - 1, exc);
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bujVar.f();
                                                                throw th;
                                                            }
                                                        } else {
                                                            afecVar = afecVarI;
                                                        }
                                                        aagVar2.p(objA);
                                                        bujVar.g();
                                                        i3 = i6;
                                                        i2 = i5;
                                                        cecVar2 = cecVar;
                                                        afecVarI = afecVar;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        afecVar = afecVarI;
                                                        exc = e;
                                                        i3 = i6;
                                                        throw new but(aagVar, aagVar2, zfVar, i3 - 1, exc);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bujVar.f();
                                                        throw th;
                                                    }
                                                default:
                                                    cecVar = cecVar2;
                                                    afecVar = afecVarI;
                                                    i3 = i6;
                                                    i2 = i5;
                                                    cecVar2 = cecVar;
                                                    afecVarI = afecVar;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            cecVar = cecVar2;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    cecVar = cecVar2;
                                    afecVar = afecVarI;
                                    try {
                                        if (i4 != aagVar.b) {
                                            buz.b("Applier operation size mismatch");
                                        }
                                        aagVar.k();
                                        zfVar.b = 0;
                                        try {
                                            bujVar.f();
                                            cdaVar.c();
                                            cdaVar.d();
                                            try {
                                                cdaVar.b();
                                                bxaVar.a.r(null);
                                                try {
                                                } catch (Throwable th6) {
                                                    throw th6;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            try {
                                                bxaVar.f.b();
                                                bxaVar.a.r(null);
                                                throw th;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e6) {
                                        exc = e6;
                                        throw new but(aagVar, aagVar2, zfVar, i3 - 1, exc);
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            }
                            try {
                                bxb bxbVar = bxb.f;
                                bxb bxbVar2 = bxb.g;
                                if (!a.h(atomicReference, bxbVar, bxbVar2)) {
                                    bxc.b(a.bw(bxbVar2, bxbVar, "Unexpected state change from: ", " to: ", "."));
                                }
                                try {
                                    ctcVar.h = null;
                                    cxbVar.n = false;
                                    byx.l(cecVar, cecVarI, afecVar);
                                    return;
                                } catch (Throwable th11) {
                                    th = th11;
                                    cecVar2 = cecVar;
                                    afecVarI = afecVar;
                                    byx.l(cecVar2, cecVarI, afecVarI);
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                bxaVar.d.set(bxb.a);
                                throw e;
                            } catch (Throwable th12) {
                                cecVar2 = cecVar;
                                afecVarI = afecVar;
                                throw th12;
                            }
                        } catch (Throwable th13) {
                            throw th13;
                        }
                    case 6:
                        throw new IllegalStateException("The paused composition has already been applied");
                    default:
                        throw new aezs();
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th14) {
            th = th14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r18 = this;
            r0 = r18
            cxb r1 = r0.a
            r2 = 1
            r1.n = r2
            aan r2 = r0.l
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            r11 = r6
        L27:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L47
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            ctc r12 = (defpackage.ctc) r12
            bvd r12 = r12.g
            if (r12 == 0) goto L47
            r12.d()
        L47:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L27
        L4b:
            if (r12 != r13) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r1.R()
            r1.n = r6
            r2.k()
            aan r1 = r0.m
            r1.k()
            r0.j = r6
            r0.i = r6
            aan r1 = r0.n
            r1.k()
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctl.g():void");
    }

    public final void h(int i) {
        boolean z;
        this.i = 0;
        cxb cxbVar = this.a;
        List listX = cxbVar.x();
        int size = (listX.size() - this.j) - 1;
        if (i <= size) {
            cve cveVar = this.p;
            cveVar.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    cveVar.add(q(listX, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(cveVar);
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            boolean z2 = false;
            while (size >= i) {
                try {
                    cxb cxbVar2 = (cxb) listX.get(size);
                    aan aanVar = this.l;
                    Object objA = aanVar.a(cxbVar2);
                    objA.getClass();
                    ctc ctcVar = (ctc) objA;
                    Object obj = ctcVar.a;
                    if (cveVar.contains(obj)) {
                        this.i++;
                        if (ctcVar.a()) {
                            t(cxbVar2);
                            r(ctcVar, false);
                            if (ctcVar.f) {
                                z2 = true;
                            }
                        }
                        z = false;
                    } else {
                        cxbVar.n = true;
                        aanVar.i(cxbVar2);
                        bvd bvdVar = ctcVar.g;
                        if (bvdVar != null) {
                            bvdVar.d();
                        }
                        cxbVar.S(size, 1);
                        z = false;
                        cxbVar.n = false;
                    }
                    this.m.i(obj);
                    size--;
                } finally {
                    byx.l(cecVar, cecVarI, afecVarI);
                }
            }
            if (z2) {
                byx.m();
            }
        }
        k();
    }

    @Override // defpackage.bur
    public final void i() {
        l(false);
    }

    public final void j(Object obj) {
        k();
        cxb cxbVar = (cxb) this.n.i(obj);
        if (cxbVar != null) {
            if (this.j <= 0) {
                crt.c("No pre-composed items to dispose");
            }
            cxb cxbVar2 = this.a;
            int iIndexOf = cxbVar2.x().indexOf(cxbVar);
            if (iIndexOf < cxbVar2.x().size() - this.j) {
                crt.c("Item is not in pre-composed item range");
            }
            this.i++;
            this.j--;
            ctc ctcVar = (ctc) this.l.a(cxbVar);
            if (ctcVar != null) {
                s(ctcVar);
            }
            int size = (cxbVar2.x().size() - this.j) - this.i;
            o(iIndexOf, size);
            h(size);
        }
        if (this.h.l(obj)) {
            this.a.X(true, true, true);
        }
    }

    public final void k() {
        int size = this.a.x().size();
        int i = this.l.e;
        if (i != size) {
            crt.b(a.bB(size, i, "Inconsistency between the count of nodes tracked by the state (", ") and the children count on the SubcomposeLayout (", "). Are you trying to use the state of the disposed SubcomposeLayout?"));
        }
        int i2 = this.i;
        int i3 = this.j;
        if ((size - i2) - i3 < 0) {
            crt.b(a.br(i3, i2, size, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children "));
        }
        int i4 = this.n.e;
        int i5 = this.j;
        if (i4 == i5) {
            return;
        }
        crt.b(a.bo(i4, i5, "Incorrect state. Precomposed children ", ". Map size "));
    }

    public final void l(boolean z) {
        this.j = 0;
        this.n.k();
        List listX = this.a.x();
        int size = listX.size();
        if (this.i != size) {
            this.i = size;
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            for (int i = 0; i < size; i++) {
                try {
                    cxb cxbVar = (cxb) listX.get(i);
                    ctc ctcVar = (ctc) this.l.a(cxbVar);
                    if (ctcVar != null && ctcVar.a()) {
                        t(cxbVar);
                        r(ctcVar, z);
                        ctcVar.a = cuy.a;
                    }
                } catch (Throwable th) {
                    byx.l(cecVar, cecVarI, afecVarI);
                    throw th;
                }
            }
            byx.l(cecVar, cecVarI, afecVarI);
            this.m.k();
        }
        k();
    }

    public final void m(Object obj, afeg afegVar, boolean z) {
        cxb cxbVar = this.a;
        if (cxbVar.am()) {
            k();
            if (aan.f(this.m, obj)) {
                return;
            }
            this.o.i(obj);
            aan aanVar = this.n;
            Object objA = aanVar.a(obj);
            if (objA == null) {
                objA = e(obj);
                if (objA != null) {
                    o(cxbVar.x().indexOf(objA), cxbVar.x().size());
                    this.j++;
                } else {
                    cxb cxbVarD = d(cxbVar.x().size());
                    this.j++;
                    objA = cxbVarD;
                }
                aanVar.m(obj, objA);
            }
            n((cxb) objA, obj, z, afegVar);
        }
    }

    public final void n(cxb cxbVar, Object obj, boolean z, afeg afegVar) {
        boolean z2;
        bvd bvdVar;
        aan aanVar = this.l;
        Object objA = aanVar.a(cxbVar);
        if (objA == null) {
            objA = new ctc(obj, csf.a);
            aanVar.m(cxbVar, objA);
        }
        ctc ctcVar = (ctc) objA;
        boolean z3 = ctcVar.b != afegVar;
        if (ctcVar.h != null) {
            if (z3) {
                s(ctcVar);
            } else {
                if (z) {
                    return;
                }
                f(ctcVar, true);
                z = false;
            }
        }
        bvd bvdVar2 = ctcVar.g;
        if (bvdVar2 != null) {
            synchronized (bvdVar2.c) {
                z2 = bvdVar2.n.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || ctcVar.c) {
            ctcVar.b = afegVar;
            if (ctcVar.h != null) {
                crt.b("new subcompose call while paused composition is still active");
            }
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            try {
                cxb cxbVar2 = this.a;
                cxbVar2.n = true;
                bvd bvdVar3 = ctcVar.g;
                bvb bvbVar = this.b;
                if (bvbVar == null) {
                    crt.a("parent composition reference not set");
                    throw new aezp();
                }
                if (bvdVar3 == null || bvdVar3.f()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = dcr.a;
                        bvdVar = new bvd(bvbVar, new cza(cxbVar));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = dcr.a;
                        bvdVar = new bvd(bvbVar, new cza(cxbVar));
                    }
                    bvdVar3 = bvdVar;
                }
                ctcVar.g = bvdVar3;
                afeg cctVar = ctcVar.b;
                if (p() != null) {
                    ctcVar.f = false;
                } else {
                    ctcVar.f = true;
                    cctVar = new cct(1524156494, true, new bmc(ctcVar, cctVar, 10));
                }
                if (z) {
                    if (ctcVar.d) {
                        bvdVar3.u();
                        bvdVar3.q();
                        ctcVar.h = bvdVar3.w(true, cctVar);
                    } else {
                        ctcVar.h = bvdVar3.w(bvdVar3.u(), cctVar);
                    }
                } else if (ctcVar.d) {
                    bvdVar3.u();
                    bvdVar3.q();
                    bvdVar3.m(cctVar);
                } else {
                    bvdVar3.e(cctVar);
                }
                ctcVar.d = false;
                cxbVar2.n = false;
                byx.l(cecVar, cecVarI, afecVarI);
                ctcVar.c = false;
            } catch (Throwable th) {
                byx.l(cecVar, cecVarI, afecVarI);
                throw th;
            }
        }
    }

    public final void o(int i, int i2) {
        cxb cxbVar = this.a;
        cxbVar.n = true;
        cxbVar.O(i, i2, 1);
        cxbVar.n = false;
    }
}
