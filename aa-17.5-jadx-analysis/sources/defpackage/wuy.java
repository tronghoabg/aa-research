package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class wuy extends wvc {
    final SideSheetBehavior a;

    public wuy(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.wvc
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.wvc
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.wvc
    public final int c() {
        SideSheetBehavior sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.h + sideSheetBehavior.i);
    }

    @Override // defpackage.wvc
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.a;
        return (-sideSheetBehavior.f) - sideSheetBehavior.i;
    }

    @Override // defpackage.wvc
    public final int e() {
        return this.a.i;
    }

    @Override // defpackage.wvc
    public final int f() {
        return -this.a.f;
    }

    @Override // defpackage.wvc
    public final int g(View view) {
        return view.getRight() + this.a.i;
    }

    @Override // defpackage.wvc
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // defpackage.wvc
    public final int i() {
        return 1;
    }

    @Override // defpackage.wvc
    public final void j(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // defpackage.wvc
    public final void k(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.g) {
            marginLayoutParams.leftMargin = i2;
        }
    }

    @Override // defpackage.wvc
    public final boolean l(float f) {
        return f > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wvc
    public final boolean m(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // defpackage.wvc
    public final boolean n(float f, float f2) {
        return wox.g(f, f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.wvc
    public final boolean o(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.a.e)) > 0.5f;
    }

    @Override // defpackage.wvc
    public final void p() {
        c();
    }
}
