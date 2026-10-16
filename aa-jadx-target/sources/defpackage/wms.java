package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wms implements wrs {
    final /* synthetic */ boolean a;
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior b;

    public wms(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.a = z;
        this.b = bottomSheetBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    public final void a(android.view.View view, defpackage.edf edfVar, defpackage.wrt wrtVar) {
        boolean z;
        defpackage.dvl dvlVarF = edfVar.f(519);
        int i = dvlVarF.c;
        defpackage.dvl dvlVarF2 = edfVar.f(32);
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.o = i;
        boolean zJ = defpackage.wqn.j(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.h) {
            int iA = edfVar.a();
            bottomSheetBehavior.n = iA;
            paddingBottom = wrtVar.d + iA;
        }
        if (bottomSheetBehavior.i) {
            paddingLeft = dvlVarF.b + (zJ ? wrtVar.c : wrtVar.a);
        }
        if (bottomSheetBehavior.j) {
            paddingRight = (zJ ? wrtVar.a : wrtVar.c) + dvlVarF.d;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z2 = true;
        boolean z3 = false;
        if (bottomSheetBehavior.k) {
            int i2 = marginLayoutParams.leftMargin;
            int i3 = dvlVarF.b;
            if (i2 != i3) {
                marginLayoutParams.leftMargin = i3;
                z3 = true;
            }
        }
        if (bottomSheetBehavior.l) {
            int i4 = marginLayoutParams.rightMargin;
            int i5 = dvlVarF.d;
            if (i4 != i5) {
                marginLayoutParams.rightMargin = i5;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
        }
        if (!bottomSheetBehavior.m || marginLayoutParams.topMargin == i) {
            if (z2) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            z = this.a;
            if (z) {
                bottomSheetBehavior.g = dvlVarF2.e;
            }
            if (!bottomSheetBehavior.h || z) {
                bottomSheetBehavior.S();
            }
            return;
        }
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z = this.a;
        if (z) {
            bottomSheetBehavior.g = dvlVarF2.e;
        }
        if (bottomSheetBehavior.h) {
        }
        bottomSheetBehavior.S();
    }
}
