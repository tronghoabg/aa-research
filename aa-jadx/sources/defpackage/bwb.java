package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bwb extends defpackage.bvi {
    public final defpackage.bwx a;
    final /* synthetic */ defpackage.bwc b;
    public final defpackage.aaw c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private java.util.Set g;

    public bwb(defpackage.bwc bwcVar, long j, boolean z, boolean z2) {
        this.b = bwcVar;
        this.d = j;
        this.e = z;
        this.f = z2;
        defpackage.aaw aawVar = defpackage.aax.a;
        this.c = new defpackage.aaw(6);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.cdd.d, defpackage.bxv.a);
    }

    @Override // defpackage.bvi
    public final long a() {
        return this.d;
    }

    @Override // defpackage.bvi
    public final defpackage.buv b(defpackage.afer aferVar) {
        return this.b.b.b(aferVar);
    }

    @Override // defpackage.bvi
    public final defpackage.bvh c() {
        return this.b.d;
    }

    @Override // defpackage.bvi
    public final defpackage.afdo d() {
        return this.b.b.d();
    }

    @Override // defpackage.bvi
    public final void e(defpackage.bws bwsVar) {
        this.b.b.e(bwsVar);
    }

    @Override // defpackage.bvi
    public final void f() {
        this.b.j--;
    }

    @Override // defpackage.bvi
    public final void g(java.util.Set set) {
        java.util.Set hashSet = this.g;
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            this.g = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.bvi
    public final void h(defpackage.bve bveVar) {
        this.c.j(bveVar);
    }

    @Override // defpackage.bvi
    public final void i(defpackage.bxl bxlVar) {
        this.b.b.i(bxlVar);
    }

    @Override // defpackage.bvi
    public final void j() {
        this.b.j++;
    }

    @Override // defpackage.bvi
    public final void k(defpackage.bve bveVar) {
        java.util.Set set = this.g;
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((java.util.Set) it.next()).remove(((defpackage.bwc) bveVar).e());
            }
        }
        this.c.l(bveVar);
    }

    @Override // defpackage.bvi
    public final boolean l() {
        return this.b.b.l();
    }

    @Override // defpackage.bvi
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.bvi
    public final boolean n() {
        return this.f;
    }

    @Override // defpackage.bvi
    public final boolean o() {
        return this.b.b.o();
    }

    @Override // defpackage.bvi
    public final defpackage.aaw p(defpackage.bvk bvkVar, defpackage.byc bycVar, defpackage.affg affgVar) {
        return this.b.b.p(bvkVar, bycVar, affgVar);
    }

    @Override // defpackage.bvi
    public final defpackage.aaw q(defpackage.bvk bvkVar, defpackage.byc bycVar, defpackage.aaw aawVar) {
        return this.b.b.q(bvkVar, bycVar, aawVar);
    }

    @Override // defpackage.bvi
    public final defpackage.cdd r() {
        return (defpackage.cdd) this.a.a();
    }

    @Override // defpackage.bvi
    public final void s(defpackage.bvk bvkVar, defpackage.affg affgVar) {
        this.b.b.s(bvkVar, affgVar);
    }

    @Override // defpackage.bvi
    public final void t(defpackage.bvk bvkVar) {
        defpackage.bwc bwcVar = this.b;
        defpackage.bvi bviVar = bwcVar.b;
        bviVar.t(bwcVar.d);
        bviVar.t(bvkVar);
    }

    @Override // defpackage.bvi
    public final void u(defpackage.bvk bvkVar) {
        this.b.b.u(bvkVar);
    }

    @Override // defpackage.bvi
    public final void v(defpackage.bvk bvkVar) {
        this.b.b.v(bvkVar);
    }

    @Override // defpackage.bvi
    public final defpackage.khb w(defpackage.bws bwsVar) {
        return this.b.b.w(bwsVar);
    }

    @Override // defpackage.bvi
    public final void x(defpackage.bws bwsVar, defpackage.khb khbVar, defpackage.buq buqVar) {
        this.b.b.x(bwsVar, khbVar, buqVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[LOOP:0: B:9:0x0019->B:23:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[EDGE_INSN: B:27:0x0068->B:24:0x0068 BREAK  A[LOOP:0: B:9:0x0019->B:23:0x0065], SYNTHETIC] */
    public final void y() {
        int i;
        defpackage.aaw aawVar = this.c;
        if (aawVar.c()) {
            java.util.Set set = this.g;
            if (set != null) {
                java.lang.Object[] objArr = aawVar.b;
                long[] jArr = aawVar.a;
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
                                if ((255 & j) < 128) {
                                    defpackage.bwc bwcVar = (defpackage.bwc) objArr[(i2 << 3) + i4];
                                    java.util.Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        ((java.util.Set) it.next()).remove(bwcVar.e());
                                    }
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
            }
            aawVar.d();
        }
    }
}
