package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctu implements defpackage.buy {
    public final defpackage.cxl a;
    public defpackage.bvi b;
    public defpackage.cvo c;
    public int d;
    public int e;
    public final defpackage.ctn f;
    public final defpackage.ctk g;
    public final defpackage.bzc h;
    public int i;
    public int j;
    public final java.lang.String k;
    public final defpackage.aau l;
    public final defpackage.aau m;
    public final defpackage.aau n;
    public final defpackage.aau o;
    private final defpackage.cvn p;

    public ctu(defpackage.cxl cxlVar, defpackage.cvo cvoVar) {
        this.a = cxlVar;
        this.c = cvoVar;
        long[] jArr = defpackage.aav.a;
        this.l = new defpackage.aau(6);
        this.m = new defpackage.aau(6);
        this.f = new defpackage.ctn(this);
        this.g = new defpackage.ctk(this);
        this.n = new defpackage.aau(6);
        int i = defpackage.aar.a;
        this.p = new defpackage.cvn(new defpackage.aaq(6));
        this.o = new defpackage.aau(6);
        this.h = new defpackage.bzc(new java.lang.Object[16]);
        this.k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final defpackage.cyr p() {
        return ((defpackage.czz) defpackage.cxo.a(this.a)).N();
    }

    private final java.lang.Object q(java.util.List list, int i) {
        java.lang.Object objA = this.l.a((defpackage.cxl) list.get(i));
        objA.getClass();
        return ((defpackage.ctl) objA).a;
    }

    private final void r(defpackage.ctl ctlVar, boolean z) {
        defpackage.bvk bvkVar;
        if (z || !ctlVar.f) {
            ctlVar.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
        } else {
            ctlVar.e.b(java.lang.Boolean.FALSE);
        }
        if (ctlVar.h != null) {
            s(ctlVar);
            return;
        }
        if (z) {
            defpackage.bvk bvkVar2 = ctlVar.g;
            if (bvkVar2 != null) {
                bvkVar2.n();
                return;
            }
            return;
        }
        defpackage.cyr cyrVarP = p();
        if (cyrVarP != null) {
            cyrVarP.n(new defpackage.oe(ctlVar, 19));
        } else {
            if (ctlVar.f || (bvkVar = ctlVar.g) == null) {
                return;
            }
            bvkVar.n();
        }
    }

    private static final void s(defpackage.ctl ctlVar) {
        defpackage.aaw aawVar;
        defpackage.bxg bxgVar = ctlVar.h;
        if (bxgVar != null) {
            bxgVar.d.set(defpackage.bxh.b);
            defpackage.cdg cdgVar = bxgVar.f;
            if (cdgVar.h.c()) {
                aawVar = cdgVar.h;
                defpackage.aaw aawVar2 = defpackage.aax.a;
                cdgVar.h = new defpackage.aaw(6);
                cdgVar.b.g();
            } else {
                aawVar = null;
            }
            cdgVar.b();
            bxgVar.a.r(aawVar);
            ctlVar.h = null;
            defpackage.bvk bvkVar = ctlVar.g;
            if (bvkVar != null) {
                bvkVar.d();
            }
            ctlVar.g = null;
        }
    }

    private static final void t(defpackage.cxl cxlVar) {
        cxlVar.o().G = 3;
        defpackage.cxw cxwVarN = cxlVar.n();
        if (cxwVarN != null) {
            cxwVarN.y = 3;
        }
    }

    public final defpackage.cvk a(java.lang.Object obj) {
        return !this.a.am() ? new defpackage.ctr() : new defpackage.cts(this, obj);
    }

    @Override // defpackage.buy
    public final void b() {
        l(true);
    }

    @Override // defpackage.buy
    public final void c() {
        g();
    }

    public final defpackage.cxl d(int i) {
        defpackage.cxl cxlVar = new defpackage.cxl(true, 2, null);
        defpackage.cxl cxlVar2 = this.a;
        cxlVar2.n = true;
        cxlVar2.F(i, cxlVar);
        cxlVar2.n = false;
        return cxlVar;
    }

    public final defpackage.cxl e(java.lang.Object obj) {
        int i;
        if (this.i == 0) {
            return null;
        }
        java.util.List listX = this.a.x();
        int size = listX.size() - this.j;
        int i2 = size - this.i;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (defpackage.afga.f(q(listX, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    i = -1;
                    break;
                }
                java.lang.Object objA = this.l.a((defpackage.cxl) listX.get(i3));
                objA.getClass();
                defpackage.ctl ctlVar = (defpackage.ctl) objA;
                java.lang.Object obj2 = ctlVar.a;
                if (obj2 == defpackage.cvh.a || this.c.b(obj, obj2)) {
                    ctlVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            o(i4, i2);
        }
        this.i--;
        defpackage.cxl cxlVar = (defpackage.cxl) listX.get(i2);
        java.lang.Object objA2 = this.l.a(cxlVar);
        objA2.getClass();
        defpackage.ctl ctlVar2 = (defpackage.ctl) objA2;
        ctlVar2.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, defpackage.bxv.c);
        ctlVar2.d = true;
        ctlVar2.c = true;
        return cxlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0203, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.ctl r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctu.f(ctl, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[LOOP:0: B:5:0x0014->B:18:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[EDGE_INSN: B:22:0x0052->B:19:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:18:0x004f], SYNTHETIC] */
    public final void g() {
        int i;
        defpackage.bvk bvkVar;
        defpackage.cxl cxlVar = this.a;
        cxlVar.n = true;
        defpackage.aau aauVar = this.l;
        java.lang.Object[] objArr = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128 && (bvkVar = ((defpackage.ctl) objArr[(i2 << 3) + i4]).g) != null) {
                            bvkVar.d();
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        cxlVar.R();
        cxlVar.n = false;
        aauVar.k();
        this.m.k();
        this.j = 0;
        this.i = 0;
        this.n.k();
        k();
    }

    public final void h(int i) {
        boolean z;
        this.i = 0;
        defpackage.cxl cxlVar = this.a;
        java.util.List listX = cxlVar.x();
        int size = (listX.size() - this.j) - 1;
        if (i <= size) {
            defpackage.cvn cvnVar = this.p;
            cvnVar.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    cvnVar.add(q(listX, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(cvnVar);
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            boolean z2 = false;
            while (size >= i) {
                try {
                    defpackage.cxl cxlVar2 = (defpackage.cxl) listX.get(size);
                    defpackage.aau aauVar = this.l;
                    java.lang.Object objA = aauVar.a(cxlVar2);
                    objA.getClass();
                    defpackage.ctl ctlVar = (defpackage.ctl) objA;
                    java.lang.Object obj = ctlVar.a;
                    if (cvnVar.contains(obj)) {
                        this.i++;
                        if (ctlVar.a()) {
                            t(cxlVar2);
                            r(ctlVar, false);
                            if (ctlVar.f) {
                                z2 = true;
                            }
                        }
                        z = false;
                    } else {
                        cxlVar.n = true;
                        aauVar.i(cxlVar2);
                        defpackage.bvk bvkVar = ctlVar.g;
                        if (bvkVar != null) {
                            bvkVar.d();
                        }
                        cxlVar.S(size, 1);
                        z = false;
                        cxlVar.n = false;
                    }
                    this.m.i(obj);
                    size--;
                } catch (java.lang.Throwable th) {
                    defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                    throw th;
                }
            }
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            if (z2) {
                defpackage.bzd.l();
            }
        }
        k();
    }

    @Override // defpackage.buy
    public final void i() {
        l(false);
    }

    public final void j(java.lang.Object obj) {
        k();
        defpackage.cxl cxlVar = (defpackage.cxl) this.n.i(obj);
        if (cxlVar != null) {
            if (this.j <= 0) {
                defpackage.csc.c("No pre-composed items to dispose");
            }
            defpackage.cxl cxlVar2 = this.a;
            int iIndexOf = cxlVar2.x().indexOf(cxlVar);
            if (iIndexOf < cxlVar2.x().size() - this.j) {
                defpackage.csc.c("Item is not in pre-composed item range");
            }
            this.i++;
            this.j--;
            defpackage.ctl ctlVar = (defpackage.ctl) this.l.a(cxlVar);
            if (ctlVar != null) {
                s(ctlVar);
            }
            int size = (cxlVar2.x().size() - this.j) - this.i;
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
            defpackage.csc.b(defpackage.a.bz(size, i, "Inconsistency between the count of nodes tracked by the state (", ") and the children count on the SubcomposeLayout (", "). Are you trying to use the state of the disposed SubcomposeLayout?"));
        }
        int i2 = this.i;
        int i3 = this.j;
        if ((size - i2) - i3 < 0) {
            defpackage.csc.b(defpackage.a.bq(i3, i2, size, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children "));
        }
        int i4 = this.n.e;
        int i5 = this.j;
        if (i4 == i5) {
            return;
        }
        defpackage.csc.b(defpackage.a.bn(i4, i5, "Incorrect state. Precomposed children ", ". Map size "));
    }

    public final void l(boolean z) {
        this.j = 0;
        this.n.k();
        java.util.List listX = this.a.x();
        int size = listX.size();
        if (this.i != size) {
            this.i = size;
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            for (int i = 0; i < size; i++) {
                try {
                    defpackage.cxl cxlVar = (defpackage.cxl) listX.get(i);
                    defpackage.ctl ctlVar = (defpackage.ctl) this.l.a(cxlVar);
                    if (ctlVar != null && ctlVar.a()) {
                        t(cxlVar);
                        r(ctlVar, z);
                        ctlVar.a = defpackage.cvh.a;
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                    throw th;
                }
            }
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            this.m.k();
        }
        k();
    }

    public final void m(java.lang.Object obj, defpackage.affg affgVar, boolean z) {
        defpackage.cxl cxlVar = this.a;
        if (cxlVar.am()) {
            k();
            if (defpackage.aau.f(this.m, obj)) {
                return;
            }
            this.o.i(obj);
            defpackage.aau aauVar = this.n;
            java.lang.Object objA = aauVar.a(obj);
            if (objA == null) {
                objA = e(obj);
                if (objA != null) {
                    o(cxlVar.x().indexOf(objA), cxlVar.x().size());
                    this.j++;
                } else {
                    defpackage.cxl cxlVarD = d(cxlVar.x().size());
                    this.j++;
                    objA = cxlVarD;
                }
                aauVar.m(obj, objA);
            }
            n((defpackage.cxl) objA, obj, z, affgVar);
        }
    }

    public final void n(defpackage.cxl cxlVar, java.lang.Object obj, boolean z, defpackage.affg affgVar) {
        boolean z2;
        defpackage.bvk bvkVar;
        defpackage.aau aauVar = this.l;
        java.lang.Object objA = aauVar.a(cxlVar);
        if (objA == null) {
            objA = new defpackage.ctl(obj, defpackage.cso.a);
            aauVar.m(cxlVar, objA);
        }
        defpackage.ctl ctlVar = (defpackage.ctl) objA;
        boolean z3 = ctlVar.b != affgVar;
        if (ctlVar.h != null) {
            if (z3) {
                s(ctlVar);
            } else {
                if (z) {
                    return;
                }
                f(ctlVar, true);
                z = false;
            }
        }
        defpackage.bvk bvkVar2 = ctlVar.g;
        if (bvkVar2 != null) {
            synchronized (bvkVar2.c) {
                z2 = bvkVar2.n.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || ctlVar.c) {
            ctlVar.b = affgVar;
            if (ctlVar.h != null) {
                defpackage.csc.b("new subcompose call while paused composition is still active");
            }
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                defpackage.cxl cxlVar2 = this.a;
                cxlVar2.n = true;
                defpackage.bvk bvkVar3 = ctlVar.g;
                defpackage.bvi bviVar = this.b;
                if (bviVar == null) {
                    defpackage.csc.a("parent composition reference not set");
                    throw new defpackage.afap();
                }
                if (bvkVar3 == null || bvkVar3.f()) {
                    if (z) {
                        android.view.ViewGroup.LayoutParams layoutParams = defpackage.dcz.a;
                        bvkVar = new defpackage.bvk(bviVar, new defpackage.czi(cxlVar));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams2 = defpackage.dcz.a;
                        bvkVar = new defpackage.bvk(bviVar, new defpackage.czi(cxlVar));
                    }
                    bvkVar3 = bvkVar;
                }
                ctlVar.g = bvkVar3;
                defpackage.affg cczVar = ctlVar.b;
                if (p() != null) {
                    ctlVar.f = false;
                } else {
                    ctlVar.f = true;
                    cczVar = new defpackage.ccz(1524156494, true, new defpackage.bmg(ctlVar, cczVar, 10));
                }
                if (z) {
                    if (ctlVar.d) {
                        bvkVar3.u();
                        bvkVar3.q();
                        ctlVar.h = bvkVar3.w(true, cczVar);
                    } else {
                        ctlVar.h = bvkVar3.w(bvkVar3.u(), cczVar);
                    }
                } else if (ctlVar.d) {
                    bvkVar3.u();
                    bvkVar3.q();
                    bvkVar3.m(cczVar);
                } else {
                    bvkVar3.e(cczVar);
                }
                ctlVar.d = false;
                cxlVar2.n = false;
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                ctlVar.c = false;
            } catch (java.lang.Throwable th) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                throw th;
            }
        }
    }

    public final void o(int i, int i2) {
        defpackage.cxl cxlVar = this.a;
        cxlVar.n = true;
        cxlVar.O(i, i2, 1);
        cxlVar.n = false;
    }
}
