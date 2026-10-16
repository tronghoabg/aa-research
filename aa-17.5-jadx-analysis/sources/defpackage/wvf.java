package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class wvf extends eem {
    final /* synthetic */ SideSheetBehavior a;

    public wvf(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.eem
    public final int a(View view) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return sideSheetBehavior.f + sideSheetBehavior.i;
    }

    @Override // defpackage.eem
    public final void d(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.a;
            if (sideSheetBehavior.b) {
                sideSheetBehavior.M(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.eem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r3 = r3.a
            wvc r0 = r3.a
            boolean r0 = r0.l(r5)
            r1 = 3
            if (r0 == 0) goto Lc
            goto L4d
        Lc:
            wvc r0 = r3.a
            boolean r0 = r0.o(r4, r5)
            r2 = 5
            if (r0 == 0) goto L27
            wvc r0 = r3.a
            boolean r5 = r0.n(r5, r6)
            if (r5 != 0) goto L25
            wvc r5 = r3.a
            boolean r5 = r5.m(r4)
            if (r5 == 0) goto L4d
        L25:
            r1 = r2
            goto L4d
        L27:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L32
            boolean r5 = defpackage.wox.g(r5, r6)
            if (r5 != 0) goto L25
        L32:
            int r5 = r4.getLeft()
            int r6 = r3.J()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            wvc r0 = r3.a
            int r0 = r0.d()
            int r5 = r5 - r0
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L25
        L4d:
            r5 = 1
            r3.N(r4, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvf.e(android.view.View, float, float):void");
    }

    @Override // defpackage.eem
    public final boolean f(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.a;
        return (sideSheetBehavior.c == 1 || (weakReference = sideSheetBehavior.j) == null || weakReference.get() != view) ? false : true;
    }

    @Override // defpackage.eem
    public final int g(View view, int i) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return dlz.j(i, sideSheetBehavior.a.f(), sideSheetBehavior.a.e());
    }

    @Override // defpackage.eem
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.eem
    public final void l(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.a;
        View viewK = sideSheetBehavior.K();
        if (viewK != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewK.getLayoutParams()) != null) {
            sideSheetBehavior.a.k(marginLayoutParams, view.getLeft(), view.getRight());
            viewK.setLayoutParams(marginLayoutParams);
        }
        Set set = sideSheetBehavior.k;
        if (set.isEmpty()) {
            return;
        }
        sideSheetBehavior.a.p();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((wvb) it.next()).a();
        }
    }
}
