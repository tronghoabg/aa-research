package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mh {
    public final java.util.ArrayList a;
    public java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.List d;
    int e;
    public final /* synthetic */ android.support.v7.widget.RecyclerView f;
    defpackage.dvd g;

    public mh(android.support.v7.widget.RecyclerView recyclerView) {
        this.f = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new java.util.ArrayList();
        this.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            android.support.v7.widget.RecyclerView recyclerView = this.f;
            defpackage.mo moVar = recyclerView.N;
            if (i < moVar.a()) {
                return !moVar.g ? i : recyclerView.g.a(i, 0);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        android.support.v7.widget.RecyclerView recyclerView2 = this.f;
        sb.append(recyclerView2.N.a());
        sb.append(recyclerView2.n());
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    final void b(defpackage.mr mrVar, boolean z) {
        android.support.v7.widget.RecyclerView.w(mrVar);
        android.support.v7.widget.RecyclerView recyclerView = this.f;
        android.view.View view = mrVar.a;
        defpackage.mt mtVar = recyclerView.R;
        if (mtVar != null) {
            defpackage.dzw dzwVarJ = mtVar.j();
            defpackage.ebt.n(view, dzwVarJ instanceof defpackage.ms ? (defpackage.dzw) ((defpackage.ms) dzwVarJ).b.remove(view) : null);
        }
        if (z) {
            java.util.List list = recyclerView.o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((mi) list.get(i)).a();
            }
            defpackage.lw lwVar = recyclerView.m;
            if (lwVar != null) {
                lwVar.o(mrVar);
            }
            if (recyclerView.N != null) {
                recyclerView.ab.E(mrVar);
            }
        }
        mrVar.r = null;
        mrVar.q = null;
        defpackage.dvd dvdVarP = p();
        int i2 = mrVar.f;
        java.util.ArrayList arrayList = dvdVarP.e(i2).a;
        if (((defpackage.mg) ((android.util.SparseArray) dvdVarP.c).get(i2)).b <= arrayList.size()) {
            defpackage.ebl.i(view);
        } else {
            mrVar.l();
            arrayList.add(mrVar);
        }
    }

    public final void c() {
        this.a.clear();
        g();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void d() {
        android.support.v7.widget.RecyclerView recyclerView;
        defpackage.lw lwVar;
        defpackage.dvd dvdVar = this.g;
        if (dvdVar == null || (lwVar = (recyclerView = this.f).m) == null || !recyclerView.q) {
            return;
        }
        dvdVar.b.add(lwVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void e(defpackage.lw lwVar, boolean z) {
        defpackage.dvd dvdVar = this.g;
        if (dvdVar == null) {
            return;
        }
        ?? r0 = dvdVar.b;
        r0.remove(lwVar);
        if (r0.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) dvdVar.c;
            if (i >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((defpackage.mg) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                defpackage.ebl.i(((defpackage.mr) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void f(android.view.View view) {
        defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(view);
        mrVarK.m = null;
        mrVarK.n = false;
        mrVarK.i();
        j(mrVarK);
    }

    public final void g() {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f.M.b();
                return;
            }
            h(size);
        }
    }

    public final void h(int i) {
        int i2 = android.support.v7.widget.RecyclerView.ac;
        java.util.ArrayList arrayList = this.c;
        b((defpackage.mr) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(android.view.View view) {
        defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(view);
        if (mrVarK.x()) {
            this.f.removeDetachedView(view, false);
        }
        if (mrVarK.w()) {
            mrVarK.p();
        } else if (mrVarK.B()) {
            mrVarK.i();
        }
        j(mrVarK);
        android.support.v7.widget.RecyclerView recyclerView = this.f;
        if (recyclerView.E == null || mrVarK.u()) {
            return;
        }
        recyclerView.E.c(mrVarK);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    final void j(defpackage.mr mrVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (!mrVar.w()) {
            android.view.View view = mrVar.a;
            if (view.getParent() == null) {
                if (mrVar.x()) {
                    throw new java.lang.IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + mrVar + this.f.n());
                }
                if (mrVar.A()) {
                    throw new java.lang.IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f.n()));
                }
                if ((mrVar.j & 16) == 0) {
                    int[] iArr = defpackage.ebt.a;
                    if (view.hasTransientState()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                android.support.v7.widget.RecyclerView recyclerView = this.f;
                if (mrVar.u()) {
                    if (this.e <= 0 || mrVar.q(526)) {
                        z2 = false;
                    } else {
                        java.util.ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.e && size > 0) {
                            h(0);
                            size--;
                        }
                        if (size > 0 && !recyclerView.M.d(mrVar.c)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (recyclerView.M.d(((defpackage.mr) arrayList.get(size)).c));
                            size++;
                        }
                        arrayList.add(size, mrVar);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        b(mrVar, true);
                    }
                    z4 = z2;
                } else {
                    z3 = false;
                }
                recyclerView.ab.E(mrVar);
                if (z4 || z3 || !z) {
                    return;
                }
                defpackage.ebl.i(view);
                mrVar.r = null;
                mrVar.q = null;
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(mrVar.w());
        sb.append(" isAttached:");
        sb.append(mrVar.a.getParent() != null);
        sb.append(this.f.n());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final void k(android.view.View view) {
        defpackage.lz lzVar;
        int i = android.support.v7.widget.RecyclerView.ac;
        defpackage.mr mrVar = view == null ? null : ((defpackage.md) view.getLayoutParams()).c;
        if (!mrVar.q(12) && mrVar.y() && (lzVar = this.f.E) != null && !lzVar.g(mrVar, mrVar.d())) {
            if (this.b == null) {
                this.b = new java.util.ArrayList();
            }
            mrVar.o(this, true);
            this.b.add(mrVar);
            return;
        }
        if (mrVar.t() && !mrVar.v()) {
            android.support.v7.widget.RecyclerView recyclerView = this.f;
            if (!recyclerView.m.c) {
                throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.n()));
            }
        }
        mrVar.o(this, false);
        this.a.add(mrVar);
    }

    public final void l(defpackage.mr mrVar) {
        if (mrVar.n) {
            this.b.remove(mrVar);
        } else {
            this.a.remove(mrVar);
        }
        mrVar.m = null;
        mrVar.n = false;
        mrVar.i();
    }

    public final void m() {
        defpackage.mc mcVar = this.f.n;
        this.e = (mcVar != null ? mcVar.y : 0) + 2;
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.e) {
                return;
            } else {
                h(size);
            }
        }
    }

    public final android.view.View n(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:175:0x0303 A[EDGE_INSN: B:175:0x0303->B:176:0x0305 BREAK  A[LOOP:3: B:170:0x02eb->B:174:0x0300]] */
    /* JADX WARN: Code duplicated, block: B:243:0x0471  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:274:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:276:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:277:0x0504  */
    /* JADX WARN: Code duplicated, block: B:282:0x0510  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[EDGE_INSN: B:35:0x007b->B:36:0x007c BREAK  A[LOOP:0: B:14:0x0023->B:20:0x003d]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [lw] */
    final defpackage.mr o(int i, long j) {
        boolean z;
        defpackage.mr mrVarF;
        defpackage.mr mrVar;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        android.view.View view;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        boolean z6;
        defpackage.mr mrVar2;
        android.view.View view2;
        int size;
        int iA;
        if (i >= 0) {
            android.support.v7.widget.RecyclerView recyclerView = this.f;
            defpackage.mo moVar = recyclerView.N;
            if (i < moVar.a()) {
                if (moVar.g) {
                    java.util.ArrayList arrayList = this.b;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                if (recyclerView.m.c && (iA = recyclerView.g.a(i, 0)) > 0 && iA < recyclerView.m.a()) {
                                    long jE = recyclerView.m.e(iA);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= size) {
                                            mrVarF = null;
                                            break;
                                        }
                                        defpackage.mr mrVar3 = (defpackage.mr) this.b.get(i3);
                                        if (!mrVar3.B() && mrVar3.e == jE) {
                                            mrVar3.f(32);
                                            mrVarF = mrVar3;
                                            break;
                                        }
                                        i3++;
                                    }
                                } else {
                                    mrVarF = null;
                                    break;
                                }
                            } else {
                                mrVarF = (defpackage.mr) this.b.get(i2);
                                if (!mrVarF.B() && mrVarF.c() == i) {
                                    mrVarF.f(32);
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        mrVarF = null;
                        break;
                    }
                    z = mrVarF != null;
                } else {
                    z = false;
                    mrVarF = null;
                }
                if (mrVarF == null) {
                    java.util.ArrayList arrayList2 = this.a;
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            defpackage.kf kfVar = recyclerView.h;
                            java.util.List list = kfVar.b;
                            int size3 = list.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    mrVar = null;
                                    view2 = null;
                                    break;
                                }
                                view2 = (android.view.View) list.get(i5);
                                defpackage.izq izqVar = kfVar.e;
                                defpackage.mr mrVar4 = view2 == null ? null : ((defpackage.md) view2.getLayoutParams()).c;
                                mrVar = null;
                                if (mrVar4.c() == i && !mrVar4.t() && !mrVar4.v()) {
                                    break;
                                }
                                i5++;
                            }
                            if (view2 == null) {
                                java.util.ArrayList arrayList3 = this.c;
                                int size4 = arrayList3.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size4) {
                                        mrVarF = mrVar;
                                        break;
                                    }
                                    defpackage.mr mrVar5 = (defpackage.mr) arrayList3.get(i6);
                                    if (!mrVar5.t() && mrVar5.c() == i && !mrVar5.r()) {
                                        arrayList3.remove(i6);
                                        mrVarF = mrVar5;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                defpackage.mr mrVar6 = ((defpackage.md) view2.getLayoutParams()).c;
                                defpackage.kf kfVar2 = recyclerView.h;
                                int iX = kfVar2.e.x(view2);
                                if (iX < 0) {
                                    java.util.Objects.toString(view2);
                                    throw new java.lang.IllegalArgumentException("view is not a child, cannot hide ".concat(view2.toString()));
                                }
                                defpackage.ke keVar = kfVar2.a;
                                if (!keVar.f(iX)) {
                                    java.util.Objects.toString(view2);
                                    throw new java.lang.RuntimeException("trying to unhide a view that was not hidden".concat(view2.toString()));
                                }
                                keVar.b(iX);
                                kfVar2.l(view2);
                                int iC = recyclerView.h.c(view2);
                                if (iC == -1) {
                                    throw new java.lang.IllegalStateException("layout index should not be -1 after unhiding a view:" + mrVar6 + recyclerView.n());
                                }
                                recyclerView.h.h(iC);
                                k(view2);
                                mrVar6.f(8224);
                                mrVarF = mrVar6;
                                break;
                            }
                        } else {
                            defpackage.mr mrVar7 = (defpackage.mr) arrayList2.get(i4);
                            if (!mrVar7.B() && mrVar7.c() == i && !mrVar7.t() && (moVar.g || !mrVar7.v())) {
                                mrVar7.f(32);
                                mrVarF = mrVar7;
                                mrVar = null;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (mrVarF != null) {
                        if (!mrVarF.v()) {
                            int i7 = mrVarF.c;
                            if (i7 < 0 || i7 >= recyclerView.m.a()) {
                                throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + mrVarF + recyclerView.n());
                            }
                            if (moVar.g || recyclerView.m.d(mrVarF.c) == mrVarF.f) {
                                defpackage.lw lwVar = recyclerView.m;
                                if (!lwVar.c || mrVarF.e == lwVar.e(mrVarF.c)) {
                                    z = true;
                                }
                            }
                            mrVarF.f(4);
                            if (mrVarF.w()) {
                                recyclerView.removeDetachedView(mrVarF.a, false);
                                mrVarF.p();
                            } else if (mrVarF.B()) {
                                mrVarF.i();
                            }
                            j(mrVarF);
                            mrVarF = mrVar;
                        } else if (moVar.g) {
                            z = true;
                        } else {
                            mrVarF.f(4);
                            if (mrVarF.w()) {
                                recyclerView.removeDetachedView(mrVarF.a, false);
                                mrVarF.p();
                            } else if (mrVarF.B()) {
                                mrVarF.i();
                            }
                            j(mrVarF);
                            mrVarF = mrVar;
                        }
                    }
                } else {
                    mrVar = null;
                }
                if (mrVarF == null) {
                    int iA2 = recyclerView.g.a(i, 0);
                    if (iA2 < 0 || iA2 >= recyclerView.m.a()) {
                        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iA2 + ").state:" + moVar.a() + recyclerView.n());
                    }
                    int iD = recyclerView.m.d(iA2);
                    defpackage.lw lwVar2 = recyclerView.m;
                    j2 = 0;
                    if (lwVar2.c) {
                        long jE2 = lwVar2.e(iA2);
                        java.util.ArrayList arrayList4 = this.a;
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                j3 = Long.MAX_VALUE;
                                java.util.ArrayList arrayList5 = this.c;
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        defpackage.mr mrVar8 = (defpackage.mr) arrayList5.get(size6);
                                        if (mrVar8.e != jE2 || mrVar8.r()) {
                                            size6--;
                                        } else {
                                            if (iD == mrVar8.f) {
                                                arrayList5.remove(size6);
                                                mrVarF = mrVar8;
                                                break;
                                            }
                                            h(size6);
                                        }
                                    }
                                    mrVarF = mrVar;
                                    break;
                                }
                            }
                            j3 = Long.MAX_VALUE;
                            defpackage.mr mrVar9 = (defpackage.mr) arrayList4.get(size5);
                            if (mrVar9.e == jE2 && !mrVar9.B()) {
                                if (iD == mrVar9.f) {
                                    mrVar9.f(32);
                                    if (mrVar9.v() && !moVar.g) {
                                        mrVar9.m(2, 14);
                                    }
                                    mrVarF = mrVar9;
                                    break;
                                }
                                arrayList4.remove(size5);
                                android.view.View view3 = mrVar9.a;
                                recyclerView.removeDetachedView(view3, false);
                                f(view3);
                            }
                            size5--;
                        }
                        if (mrVarF != null) {
                            mrVarF.c = iA2;
                            z = true;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (mrVarF == null) {
                        defpackage.mg mgVar = (defpackage.mg) ((android.util.SparseArray) p().c).get(iD);
                        if (mgVar == null) {
                            mrVar2 = mrVar;
                            break;
                        }
                        java.util.ArrayList arrayList6 = mgVar.a;
                        if (!arrayList6.isEmpty()) {
                            int size7 = arrayList6.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    mrVar2 = mrVar;
                                    break;
                                }
                                if (!((defpackage.mr) arrayList6.get(size7)).r()) {
                                    mrVar2 = (defpackage.mr) arrayList6.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            mrVar2 = mrVar;
                            break;
                        }
                        if (mrVar2 != null) {
                            mrVar2.l();
                        }
                        mrVarF = mrVar2;
                    }
                    if (mrVarF == null) {
                        long jNanoTime = java.lang.System.nanoTime();
                        if (j != j3) {
                            long j4 = this.g.e(iD).c;
                            if (j4 != 0 && j4 + jNanoTime >= j) {
                                return mrVar;
                            }
                        }
                        defpackage.lw lwVar3 = recyclerView.m;
                        if (defpackage.dwk.a()) {
                            java.lang.String.format("RV onCreateViewHolder type=0x%X", java.lang.Integer.valueOf(iD));
                        }
                        mrVarF = lwVar3.f(recyclerView, iD);
                        if (mrVarF.a.getParent() != null) {
                            throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        mrVarF.f = iD;
                        android.support.v7.widget.RecyclerView recyclerViewL = android.support.v7.widget.RecyclerView.l(mrVarF.a);
                        if (recyclerViewL != null) {
                            mrVarF.b = new java.lang.ref.WeakReference(recyclerViewL);
                        }
                        long jNanoTime2 = java.lang.System.nanoTime() - jNanoTime;
                        defpackage.mg mgVarE = this.g.e(iD);
                        mgVarE.c = defpackage.dvd.g(mgVarE.c, jNanoTime2);
                    }
                } else {
                    j2 = 0;
                    j3 = Long.MAX_VALUE;
                }
                if (z) {
                    android.support.v7.widget.RecyclerView recyclerView2 = this.f;
                    defpackage.mo moVar2 = recyclerView2.N;
                    if (!moVar2.g && mrVarF.q(8192)) {
                        mrVarF.m(0, 8192);
                        if (moVar2.j) {
                            defpackage.lz.i(mrVarF);
                            mrVarF.d();
                            recyclerView2.ax(mrVarF, defpackage.lz.n(mrVarF));
                        }
                    }
                }
                android.support.v7.widget.RecyclerView recyclerView3 = this.f;
                defpackage.mo moVar3 = recyclerView3.N;
                if (!moVar3.g || !mrVarF.s()) {
                    if (!mrVarF.s() || mrVarF.z() || mrVarF.t()) {
                        int iA3 = recyclerView3.g.a(i, 0);
                        mrVarF.r = mrVar;
                        mrVarF.q = recyclerView3;
                        int i8 = mrVarF.f;
                        long jNanoTime3 = java.lang.System.nanoTime();
                        if (j != j3) {
                            long j5 = this.g.e(i8).d;
                            if (j5 == j2 || j5 + jNanoTime3 < j) {
                            }
                        }
                        if (mrVarF.x()) {
                            android.view.View view4 = mrVarF.a;
                            recyclerView3.attachViewToParent(view4, recyclerView3.getChildCount(), view4.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        defpackage.lw lwVar4 = recyclerView3.m;
                        boolean z7 = mrVarF.r == null;
                        if (z7) {
                            mrVarF.c = iA3;
                            if (lwVar4.c) {
                                mrVarF.e = lwVar4.e(iA3);
                            }
                            mrVarF.m(1, 519);
                            if (defpackage.dwk.a()) {
                                z3 = false;
                                java.lang.String.format("RV onBindViewHolder type=0x%X", java.lang.Integer.valueOf(mrVarF.f));
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        mrVarF.r = lwVar4;
                        mrVarF.d();
                        lwVar4.n(mrVarF, iA3);
                        if (z7) {
                            mrVarF.h();
                            android.view.ViewGroup.LayoutParams layoutParams2 = mrVarF.a.getLayoutParams();
                            if (layoutParams2 instanceof defpackage.md) {
                                ((defpackage.md) layoutParams2).e = true;
                            }
                        }
                        if (z2) {
                            recyclerView3.detachViewFromParent(mrVarF.a);
                        }
                        long jNanoTime4 = java.lang.System.nanoTime();
                        defpackage.mg mgVarE2 = this.g.e(mrVarF.f);
                        mgVarE2.d = defpackage.dvd.g(mgVarE2.d, jNanoTime4 - jNanoTime3);
                        if (recyclerView3.an()) {
                            android.view.View view5 = mrVarF.a;
                            z4 = true;
                            if (view5.getImportantForAccessibility() == 0) {
                                view5.setImportantForAccessibility(1);
                            }
                            defpackage.mt mtVar = recyclerView3.R;
                            if (mtVar != null) {
                                defpackage.dzw dzwVarJ = mtVar.j();
                                if (dzwVarJ instanceof defpackage.ms) {
                                    defpackage.ms msVar = (defpackage.ms) dzwVarJ;
                                    defpackage.dzw dzwVarB = defpackage.ebt.b(view5);
                                    if (dzwVarB != null && dzwVarB != msVar) {
                                        msVar.b.put(view5, dzwVarB);
                                    }
                                }
                                defpackage.ebt.n(view5, dzwVarJ);
                            }
                        } else {
                            z4 = true;
                        }
                        if (moVar3.g) {
                            mrVarF.g = i;
                        }
                        z5 = z4;
                    }
                    view = mrVarF.a;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParamsGenerateLayoutParams = recyclerView3.generateDefaultLayoutParams();
                        view.setLayoutParams(layoutParamsGenerateLayoutParams);
                    } else if (recyclerView3.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = (defpackage.md) layoutParams;
                    } else {
                        layoutParamsGenerateLayoutParams = recyclerView3.generateLayoutParams(layoutParams);
                        view.setLayoutParams(layoutParamsGenerateLayoutParams);
                    }
                    defpackage.md mdVar = (defpackage.md) layoutParamsGenerateLayoutParams;
                    mdVar.c = mrVarF;
                    if (z || !z5) {
                        z6 = z3;
                    } else {
                        z6 = z4;
                    }
                    mdVar.f = z6;
                    return mrVarF;
                }
                mrVarF.g = i;
                z5 = false;
                z4 = true;
                z3 = false;
                view = mrVarF.a;
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParamsGenerateLayoutParams = recyclerView3.generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParamsGenerateLayoutParams);
                } else if (recyclerView3.checkLayoutParams(layoutParams)) {
                    layoutParamsGenerateLayoutParams = recyclerView3.generateLayoutParams(layoutParams);
                    view.setLayoutParams(layoutParamsGenerateLayoutParams);
                } else {
                    layoutParamsGenerateLayoutParams = (defpackage.md) layoutParams;
                }
                defpackage.md mdVar2 = (defpackage.md) layoutParamsGenerateLayoutParams;
                mdVar2.c = mrVarF;
                if (z) {
                    z6 = z3;
                } else {
                    z6 = z3;
                }
                mdVar2.f = z6;
                return mrVarF;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid item position ");
        sb.append(i);
        sb.append("(");
        sb.append(i);
        sb.append("). Item count:");
        android.support.v7.widget.RecyclerView recyclerView4 = this.f;
        sb.append(recyclerView4.N.a());
        sb.append(recyclerView4.n());
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final defpackage.dvd p() {
        if (this.g == null) {
            this.g = new defpackage.dvd();
            d();
        }
        return this.g;
    }
}
