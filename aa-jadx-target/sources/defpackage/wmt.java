package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wmt extends defpackage.eet {
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior a;

    public wmt(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.eet
    public final void d(int i) {
        if (i == 1) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.x) {
                bottomSheetBehavior.K(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    @Override // defpackage.eet
    public final void e(android.view.View view, float f, float f2) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        int i = 6;
        if (f2 < 0.0f) {
            if (bottomSheetBehavior.a) {
                i = 3;
            } else {
                int top = view.getTop();
                android.os.SystemClock.uptimeMillis();
                if (top <= bottomSheetBehavior.r) {
                    i = 3;
                }
            }
        } else if (bottomSheetBehavior.v && bottomSheetBehavior.Q(view, f2)) {
            if ((java.lang.Math.abs(f) < java.lang.Math.abs(f2) && f2 > bottomSheetBehavior.b) || view.getTop() > (bottomSheetBehavior.B + bottomSheetBehavior.y()) / 2) {
                i = 5;
            } else if (bottomSheetBehavior.a || java.lang.Math.abs(view.getTop() - bottomSheetBehavior.y()) < java.lang.Math.abs(view.getTop() - bottomSheetBehavior.r)) {
                i = 3;
            }
        } else if (f2 == 0.0f || java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.a) {
                int i2 = bottomSheetBehavior.r;
                if (top2 < i2) {
                    if (top2 < java.lang.Math.abs(top2 - bottomSheetBehavior.t)) {
                        i = 3;
                    }
                } else if (java.lang.Math.abs(top2 - i2) >= java.lang.Math.abs(top2 - bottomSheetBehavior.t)) {
                    i = 4;
                }
            } else if (java.lang.Math.abs(top2 - bottomSheetBehavior.q) < java.lang.Math.abs(top2 - bottomSheetBehavior.t)) {
                i = 3;
            } else {
                i = 4;
            }
        } else if (bottomSheetBehavior.a) {
            i = 4;
        } else {
            int top3 = view.getTop();
            if (java.lang.Math.abs(top3 - bottomSheetBehavior.r) >= java.lang.Math.abs(top3 - bottomSheetBehavior.t)) {
                i = 4;
            }
        }
        this.a.M(view, i, true);
    }

    @Override // defpackage.eet
    public final boolean f(android.view.View view, int i) {
        android.view.View viewA;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.y;
        if (i2 == 1 || bottomSheetBehavior.I) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.G == i) {
            if (bottomSheetBehavior.c) {
                java.lang.ref.WeakReference weakReference = bottomSheetBehavior.H;
                viewA = weakReference != null ? (android.view.View) weakReference.get() : null;
            } else {
                viewA = bottomSheetBehavior.A();
            }
            if (viewA != null && viewA.canScrollVertically(-1)) {
                return false;
            }
        }
        android.os.SystemClock.uptimeMillis();
        java.lang.ref.WeakReference weakReference2 = bottomSheetBehavior.C;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.eet
    public final int g(android.view.View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.eet
    public final int h(android.view.View view, int i) {
        return defpackage.duc.c(i, this.a.y(), i());
    }

    @Override // defpackage.eet
    public final int i() {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.O() ? bottomSheetBehavior.B : bottomSheetBehavior.t;
    }

    @Override // defpackage.eet
    public final void l(android.view.View view, int i, int i2) {
        this.a.E(i2);
    }
}
