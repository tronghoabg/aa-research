package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class csx extends defpackage.ece implements java.lang.Runnable, android.view.View.OnAttachStateChangeListener, defpackage.eap {
    public final defpackage.aau a;
    public final androidx.compose.runtime.snapshots.SnapshotStateList b;
    public final defpackage.byj c;
    public final defpackage.aan d;
    private boolean g;
    private int h;
    private defpackage.edf i;

    public csx() {
        super(1);
        defpackage.aau aauVar = new defpackage.aau(9);
        int i = defpackage.cvs.a;
        aauVar.m(defpackage.cvr.a, new defpackage.cvv("caption bar"));
        aauVar.m(defpackage.cvr.b, new defpackage.cvv("display cutout"));
        aauVar.m(defpackage.cvr.c, new defpackage.cvv("ime"));
        aauVar.m(defpackage.cvr.d, new defpackage.cvv("mandatory system gestures"));
        aauVar.m(defpackage.cvr.e, new defpackage.cvv("navigation bars"));
        aauVar.m(defpackage.cvr.f, new defpackage.cvv("status bars"));
        aauVar.m(defpackage.cvr.g, new defpackage.cvv("system gestures"));
        aauVar.m(defpackage.cvr.h, new defpackage.cvv("tappable element"));
        aauVar.m(defpackage.cvr.i, new defpackage.cvv("waterfall"));
        this.a = aauVar;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.d = new defpackage.aan(4);
        this.b = new androidx.compose.runtime.snapshots.SnapshotStateList();
    }

    private final void f(defpackage.edf edfVar) {
        char c;
        char c2;
        char c3;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        long[] jArr;
        int[] iArr;
        java.lang.Object[] objArr;
        int i;
        long j3;
        char c4;
        defpackage.zo zoVar = defpackage.cvu.a;
        int[] iArr2 = zoVar.b;
        java.lang.Object[] objArr2 = zoVar.c;
        long[] jArr2 = zoVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j4 = jArr2[i2];
                c3 = '0';
                j = 0;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        z = true;
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j4 & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr2[i5];
                            defpackage.cvs cvsVar = (defpackage.cvs) objArr2[i5];
                            defpackage.dvl dvlVarF = edfVar.f(i6);
                            long j5 = ((long) dvlVarF.b) << 48;
                            long j6 = ((long) dvlVarF.c) << 32;
                            long j7 = ((long) dvlVarF.d) << 16;
                            int i7 = dvlVarF.e;
                            java.lang.Object objA = this.a.a(cvsVar);
                            objA.getClass();
                            defpackage.cvv cvvVar = (defpackage.cvv) objA;
                            long j8 = j5 | j6 | j7 | ((long) i7);
                            if (j8 != cvvVar.c) {
                                cvvVar.c = j8;
                                if (j8 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                    z3 = true;
                                }
                            }
                            if (i6 != 8) {
                                defpackage.dvl dvlVarG = edfVar.g(i6);
                                j3 = j4;
                                long j9 = (((long) dvlVarG.b) << 48) | (((long) dvlVarG.c) << 32) | (((long) dvlVarG.d) << 16) | ((long) dvlVarG.e);
                                if (cvvVar.d != j9) {
                                    cvvVar.d = j9;
                                    z2 = true;
                                    if (j9 != 0) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                j3 = j4;
                            }
                            cvvVar.e(edfVar.z(i6));
                            c4 = '\b';
                        } else {
                            j3 = j4;
                            c4 = '\b';
                        }
                        j4 = j3 >> c4;
                        i4++;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i != 8) {
                        break;
                    } else {
                        break;
                    }
                }
                jArr = jArr2;
                iArr = iArr2;
                objArr = objArr2;
                z = true;
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            c3 = '0';
            j = 0;
            z = true;
            z2 = false;
            z3 = false;
        }
        defpackage.eag eagVarK = edfVar.k();
        if (eagVarK == null) {
            j2 = j;
        } else {
            defpackage.dvl dvlVarA = eagVarK.a();
            j2 = (((long) dvlVarA.b) << c3) | (((long) dvlVarA.c) << c2) | (((long) dvlVarA.d) << c) | ((long) dvlVarA.e);
        }
        defpackage.aau aauVar = this.a;
        int i8 = defpackage.cvs.a;
        java.lang.Object objA2 = aauVar.a(defpackage.cvr.i);
        objA2.getClass();
        defpackage.cvv cvvVar2 = (defpackage.cvv) objA2;
        cvvVar2.e(!(j2 == j ? z : false));
        if (cvvVar2.c != j2) {
            cvvVar2.c = j2;
            cvvVar2.d = j2;
            if (j2 == j) {
                z2 = z;
            } else {
                z2 = z;
                z3 = z2;
            }
        }
        if (eagVarK == null) {
            defpackage.aan aanVar = this.d;
            if (aanVar.b > 0) {
                aanVar.k();
                this.b.clear();
                z2 = z;
            }
        } else {
            java.util.List listM = hh$.ExternalSyntheticApiModelOutline0.m(eagVarK.a);
            int size = listM.size();
            defpackage.aan aanVar2 = this.d;
            if (size < aanVar2.b) {
                aanVar2.l(listM.size(), aanVar2.b);
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
                snapshotStateList.f(listM.size(), snapshotStateList.a());
                z2 = z;
            } else {
                int size2 = listM.size() - aanVar2.b;
                int i9 = 0;
                while (i9 < size2) {
                    aanVar2.p(new androidx.compose.runtime.ParcelableSnapshotMutableState(listM.get(aanVar2.b), defpackage.bxv.c));
                    this.b.add(new defpackage.cva("display cutout rect " + aanVar2.b, 0));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = listM.size();
            for (int i10 = 0; i10 < size3; i10++) {
                android.graphics.Rect rect = (android.graphics.Rect) listM.get(i10);
                defpackage.bwx bwxVar = (defpackage.bwx) aanVar2.c(i10);
                if (!defpackage.afga.f(bwxVar.a(), rect)) {
                    bwxVar.b(rect);
                    z2 = z;
                }
            }
            if (!listM.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.c.e() != 0) && z2) {
            defpackage.byj byjVar = this.c;
            byjVar.h(byjVar.e() + 1);
            defpackage.bzd.l();
        }
    }

    private static final void g(defpackage.cvv cvvVar, defpackage.kwv kwvVar) {
        cvvVar.d(kwvVar.D());
        cvvVar.a(kwvVar.C());
        cvvVar.c(kwvVar.F());
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        if (this.g) {
            this.i = edfVar;
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return edfVar;
            }
        } else if (this.h == 0) {
            f(edfVar);
        }
        return edfVar;
    }

    @Override // defpackage.ece
    public final defpackage.edf b(defpackage.edf edfVar, java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.kwv kwvVar = (defpackage.kwv) list.get(i);
            defpackage.cvs cvsVar = (defpackage.cvs) defpackage.cvu.a.a(kwvVar.E());
            if (cvsVar != null) {
                java.lang.Object objA = this.a.a(cvsVar);
                objA.getClass();
                defpackage.cvv cvvVar = (defpackage.cvv) objA;
                if (cvvVar.f()) {
                    g(cvvVar, kwvVar);
                }
            }
        }
        f(edfVar);
        return edfVar;
    }

    @Override // defpackage.ece
    public final ecd c(defpackage.kwv kwvVar, ecd ecdVar) {
        defpackage.edf edfVar = this.i;
        this.g = false;
        this.i = null;
        if (kwvVar.F() > 0 && edfVar != null) {
            int iE = kwvVar.E();
            this.h |= iE;
            defpackage.cvs cvsVar = (defpackage.cvs) defpackage.cvu.a.a(iE);
            if (cvsVar != null) {
                java.lang.Object objA = this.a.a(cvsVar);
                objA.getClass();
                defpackage.cvv cvvVar = (defpackage.cvv) objA;
                defpackage.dvl dvlVarF = edfVar.f(iE);
                int i = dvlVarF.b;
                int i2 = dvlVarF.c;
                int i3 = dvlVarF.d;
                int i4 = dvlVarF.e;
                long j = cvvVar.c;
                long j2 = i4;
                long j3 = j2 | (((long) i3) << 16) | (((long) i) << 48) | (i2 << 32);
                if (j3 != j) {
                    cvvVar.e = j;
                    cvvVar.f = j3;
                    cvvVar.b(true);
                    g(cvvVar, kwvVar);
                    defpackage.byj byjVar = this.c;
                    byjVar.h(byjVar.e() + 1);
                    defpackage.bzd.l();
                }
            }
        }
        return ecdVar;
    }

    @Override // defpackage.ece
    public final void d(defpackage.kwv kwvVar) {
        this.g = false;
        int iE = kwvVar.E();
        this.h = (~iE) & this.h;
        this.i = null;
        defpackage.cvs cvsVar = (defpackage.cvs) defpackage.cvu.a.a(iE);
        if (cvsVar != null) {
            java.lang.Object objA = this.a.a(cvsVar);
            objA.getClass();
            defpackage.cvv cvvVar = (defpackage.cvv) objA;
            cvvVar.d(0.0f);
            cvvVar.a(1.0f);
            cvvVar.c(0L);
            cvvVar.d(0.0f);
            cvvVar.b(false);
            cvvVar.e = -1L;
            cvvVar.f = -1L;
            defpackage.byj byjVar = this.c;
            byjVar.h(byjVar.e() + 1);
            defpackage.bzd.l();
        }
    }

    @Override // defpackage.ece
    public final void e(defpackage.kwv kwvVar) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(view, this);
        defpackage.kwv.G(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(view, null);
        defpackage.kwv.G(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.h = 0;
            this.g = false;
            defpackage.edf edfVar = this.i;
            if (edfVar != null) {
                f(edfVar);
                this.i = null;
            }
        }
    }
}
