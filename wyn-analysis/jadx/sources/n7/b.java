package N7;

import Va.M6;
import a.AbstractC1304a;
import ad.L;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class b extends AbstractC1304a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0.a f8580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(V0.a aVar, int i5) {
        super(23);
        this.f8579b = i5;
        this.f8580c = aVar;
    }

    @Override // a.AbstractC1304a
    public final void D(int i5) {
        switch (this.f8579b) {
            case 0:
                if (i5 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8580c;
                    if (bottomSheetBehavior.f26799K) {
                        bottomSheetBehavior.A(1);
                        break;
                    }
                }
                break;
            default:
                if (i5 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8580c;
                    if (sideSheetBehavior.f26994g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // a.AbstractC1304a
    public final void E(View view, int i5, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f8579b) {
            case 0:
                ((BottomSheetBehavior) this.f8580c).t(i10);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8580c;
                WeakReference weakReference = sideSheetBehavior.f27002p;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    L l10 = sideSheetBehavior.f26988a;
                    int left = view.getLeft();
                    view.getRight();
                    int i11 = ((SideSheetBehavior) l10.f17515b).f26999m;
                    if (left <= i11) {
                        marginLayoutParams.rightMargin = i11 - left;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f27006t;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                L l11 = sideSheetBehavior.f26988a;
                Object obj = l11.f17515b;
                l11.o();
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw M6.j(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    @Override // a.AbstractC1304a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(android.view.View r8, float r9, float r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.b.F(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // a.AbstractC1304a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(int r5, android.view.View r6) {
        /*
            r4 = this;
            int r0 = r4.f8579b
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            V0.a r5 = r4.f8580c
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            int r0 = r5.f26995h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r5 = r5.f27001o
            if (r5 == 0) goto L1b
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            V0.a r0 = r4.f8580c
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f26815a0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f26812Y
            if (r1 != r5) goto L48
            java.lang.ref.WeakReference r5 = r0.f26809V
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L3e
        L3d:
            r5 = 0
        L3e:
            if (r5 == 0) goto L48
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r5 = r0.f26808U
            if (r5 == 0) goto L56
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.b.N(int, android.view.View):boolean");
    }

    @Override // a.AbstractC1304a
    public final int l(int i5, View view) {
        switch (this.f8579b) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8580c;
                return S3.f.m(i5, sideSheetBehavior.f26988a.o(), sideSheetBehavior.f26999m);
        }
    }

    @Override // a.AbstractC1304a
    public final int m(int i5, View view) {
        switch (this.f8579b) {
            case 0:
                return S3.f.m(i5, ((BottomSheetBehavior) this.f8580c).w(), y());
            default:
                return view.getTop();
        }
    }

    @Override // a.AbstractC1304a
    public int x(View view) {
        switch (this.f8579b) {
            case 1:
                return ((SideSheetBehavior) this.f8580c).f26999m;
            default:
                return super.x(view);
        }
    }

    @Override // a.AbstractC1304a
    public int y() {
        switch (this.f8579b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8580c;
                return bottomSheetBehavior.f26797I ? bottomSheetBehavior.f26807T : bottomSheetBehavior.f26795G;
            default:
                return super.y();
        }
    }
}
