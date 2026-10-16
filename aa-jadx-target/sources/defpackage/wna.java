package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wna extends defpackage.wmv {
    private final java.lang.Boolean a;
    private final defpackage.edf b;
    private android.view.Window c;
    private boolean d;

    public wna(android.view.View view, defpackage.edf edfVar) {
        this.b = edfVar;
        defpackage.wvd wvdVar = com.google.android.material.bottomsheet.BottomSheetBehavior.B(view).e;
        android.content.res.ColorStateList colorStateListD = wvdVar != null ? wvdVar.D() : view.getBackgroundTintList();
        if (colorStateListD != null) {
            this.a = java.lang.Boolean.valueOf(defpackage.sqs.bB(colorStateListD.getDefaultColor()));
            return;
        }
        java.lang.Integer numH = defpackage.wqn.h(view);
        if (numH != null) {
            this.a = java.lang.Boolean.valueOf(defpackage.sqs.bB(numH.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(android.view.View view) {
        defpackage.edf edfVar = this.b;
        if (view.getTop() < edfVar.d()) {
            android.view.Window window = this.c;
            if (window != null) {
                java.lang.Boolean bool = this.a;
                defpackage.wqn.a(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), edfVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            android.view.Window window2 = this.c;
            if (window2 != null) {
                defpackage.wqn.a(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.wmv
    public final void a(android.view.View view, int i) {
        e(view);
    }

    @Override // defpackage.wmv
    public final void b(android.view.View view) {
        e(view);
    }

    @Override // defpackage.wmv
    public final void c(android.view.View view) {
        e(view);
    }

    public final void d(android.view.Window window) {
        edk edjVar;
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            defpackage.erh erhVar = new defpackage.erh(window.getDecorView(), (byte[]) null);
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                edjVar = new edk(window);
            } else {
                edjVar = android.os.Build.VERSION.SDK_INT >= 30 ? new defpackage.edj(window) : new edi(window, erhVar);
            }
            this.d = edjVar.f();
        }
    }
}
