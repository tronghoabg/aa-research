package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class drw implements defpackage.drf {
    final androidx.constraintlayout.widget.ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout h;

    public drw(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // defpackage.drf
    public final void a() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.a;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            if (childAt instanceof defpackage.dsh) {
                throw null;
            }
        }
        java.util.ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    @Override // defpackage.drf
    public final void b(defpackage.dqv dqvVar, defpackage.dre dreVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (dqvVar == null) {
            return;
        }
        if (dqvVar.ar == 8) {
            dreVar.c = 0;
            dreVar.d = 0;
            dreVar.e = 0;
            return;
        }
        if (dqvVar.ae != null) {
            int i3 = dreVar.i;
            int i4 = dreVar.j;
            int i5 = dreVar.a;
            int i6 = dreVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            android.view.View view = (android.view.View) dqvVar.aq;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = dqvVar.C;
                int i11 = dreVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = view.getMeasuredHeight();
                    int iH = dqvVar.h();
                    if (dreVar.h == 2 || i10 != 1 || measuredHeight == iH || (view instanceof defpackage.dsh) || dqvVar.e()) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(dqvVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                defpackage.dqu dquVar = dqvVar.T;
                int i13 = dquVar != null ? dquVar.f : 0;
                defpackage.dqu dquVar2 = dqvVar.V;
                if (dquVar2 != null) {
                    i13 += dquVar2.f;
                }
                iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = dqvVar.D;
                int i16 = dreVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = view.getMeasuredWidth();
                    int iJ = dqvVar.j();
                    if (dreVar.h == 2 || i15 != 1 || measuredWidth == iJ || (view instanceof defpackage.dsh) || dqvVar.f()) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(dqvVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = dqvVar.T != null ? dqvVar.U.f : 0;
                if (dqvVar.V != null) {
                    i18 += dqvVar.W.f;
                }
                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            defpackage.dqw dqwVar = (defpackage.dqw) dqvVar.ae;
            if (dqwVar != null && (this.h.e & 256) == 256 && view.getMeasuredWidth() == dqvVar.j() && view.getMeasuredWidth() < dqwVar.j() && view.getMeasuredHeight() == dqvVar.h() && view.getMeasuredHeight() < dqwVar.h() && view.getBaseline() == dqvVar.al && !dqvVar.T() && c(dqvVar.R, iMakeMeasureSpec, dqvVar.j()) && c(dqvVar.S, iMakeMeasureSpec2, dqvVar.h())) {
                dreVar.c = dqvVar.j();
                dreVar.d = dqvVar.h();
                dreVar.e = dqvVar.al;
                return;
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && dqvVar.ah > 0.0f;
            boolean z6 = z2 && dqvVar.ah > 0.0f;
            if (view != null) {
                defpackage.drv drvVar = (defpackage.drv) view.getLayoutParams();
                int i19 = dreVar.h;
                if (i19 != 1 && i19 != 2 && z && dqvVar.C == 0 && z2 && dqvVar.D == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((view instanceof defpackage.dsk) && (dqvVar instanceof defpackage.drc)) {
                        ((defpackage.dsk) view).b((defpackage.drc) dqvVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    dqvVar.F(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i20 = dqvVar.F;
                    iMax = i20 > 0 ? java.lang.Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = dqvVar.G;
                    if (i21 > 0) {
                        iMax = java.lang.Math.min(i21, iMax);
                    }
                    int i22 = dqvVar.I;
                    iMax2 = i22 > 0 ? java.lang.Math.max(i22, measuredHeight2) : measuredHeight2;
                    boolean z7 = z4;
                    int i23 = dqvVar.J;
                    if (i23 > 0) {
                        iMax2 = java.lang.Math.min(i23, iMax2);
                    }
                    if ((this.h.e & 1) != 1) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * dqvVar.ah) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / dqvVar.ah) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                        if (measuredWidth2 != iMax) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        dqvVar.F(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view.getMeasuredWidth();
                        iMax2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                dreVar.g = (iMax == dreVar.a && iMax2 == dreVar.b) ? false : true;
                boolean z9 = drvVar.ag | z8;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (dqvVar.al != baseline) {
                        dreVar.g = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                dreVar.c = iMax;
                dreVar.d = iMax2;
                dreVar.f = z9;
                dreVar.e = i2;
            }
        }
    }
}
