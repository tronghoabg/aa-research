package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class wva extends wvc {
    final SideSheetBehavior a;

    public wva(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.wvc
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.wvc
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.wvc
    public final int c() {
        int iD = d();
        SideSheetBehavior sideSheetBehavior = this.a;
        return Math.max(0, (iD - sideSheetBehavior.f) - sideSheetBehavior.i);
    }

    @Override // defpackage.wvc
    public final int d() {
        return this.a.g;
    }

    @Override // defpackage.wvc
    public final int e() {
        return this.a.g;
    }

    @Override // defpackage.wvc
    public final int f() {
        return c();
    }

    @Override // defpackage.wvc
    public final int g(View view) {
        return view.getLeft() - this.a.i;
    }

    @Override // defpackage.wvc
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // defpackage.wvc
    public final int i() {
        return 0;
    }

    @Override // defpackage.wvc
    public final void j(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // defpackage.wvc
    public final void k(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.g;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }

    @Override // defpackage.wvc
    public final boolean l(float f) {
        return f < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wvc
    public final boolean m(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // defpackage.wvc
    public final boolean n(float f, float f2) {
        return wox.g(f, f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.wvc
    public final boolean o(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.e)) > 0.5f;
    }

    @Override // defpackage.wvc
    public final void p() {
        c();
    }
}
