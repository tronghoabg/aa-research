package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class wmd extends wlx {
    private final Boolean a;
    private final ecy b;
    private Window c;
    private boolean d;

    public wmd(View view, ecy ecyVar) {
        this.b = ecyVar;
        wue wueVar = BottomSheetBehavior.M(view).e;
        ColorStateList colorStateListD = wueVar != null ? wueVar.D() : view.getBackgroundTintList();
        if (colorStateListD != null) {
            this.a = Boolean.valueOf(woy.r(colorStateListD.getDefaultColor()));
            return;
        }
        Integer numH = woy.H(view);
        if (numH != null) {
            this.a = Boolean.valueOf(woy.r(numH.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(View view) {
        int top = view.getTop();
        ecy ecyVar = this.b;
        if (top < ecyVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                ecw.c(bool == null ? this.d : bool.booleanValue(), Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(window.getDecorView())));
            }
            view.setPadding(view.getPaddingLeft(), ecyVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                ecw.c(this.d, Build.VERSION.SDK_INT >= 35 ? new edd(window2) : Build.VERSION.SDK_INT >= 30 ? new edc(window2) : new edb(window2, new kwp(window2.getDecorView())));
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.wlx
    public final void a(View view, int i) {
        e(view);
    }

    @Override // defpackage.wlx
    public final void b(View view) {
        e(view);
    }

    @Override // defpackage.wlx
    public final void c(View view) {
        e(view);
    }

    public final void d(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = (Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(window.getDecorView()))).e();
        }
    }
}
