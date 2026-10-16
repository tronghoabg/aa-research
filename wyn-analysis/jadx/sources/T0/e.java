package T0;

import A.AbstractC0213f;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f11214a;

    /* renamed from: b, reason: collision with root package name */
    public int f11215b;

    /* renamed from: c, reason: collision with root package name */
    public int f11216c;

    /* renamed from: d, reason: collision with root package name */
    public int f11217d;

    /* renamed from: e, reason: collision with root package name */
    public int f11218e;

    /* renamed from: f, reason: collision with root package name */
    public int f11219f;

    /* renamed from: g, reason: collision with root package name */
    public int f11220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f11221h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f11221h = constraintLayout;
        this.f11214a = constraintLayout2;
    }

    public static boolean a(int i5, int i10, int i11) {
        if (i5 == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
        }
        return false;
    }

    public final void b(Q0.d dVar, R0.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i5;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i10;
        if (dVar == null) {
            return;
        }
        if (dVar.f9553g0 == 8) {
            bVar.f10042e = 0;
            bVar.f10043f = 0;
            bVar.f10044g = 0;
            return;
        }
        if (dVar.f9533T == null) {
            return;
        }
        int i11 = bVar.f10038a;
        int i12 = bVar.f10039b;
        int i13 = bVar.f10040c;
        int i14 = bVar.f10041d;
        int i15 = this.f11215b + this.f11216c;
        int i16 = this.f11217d;
        View view = dVar.f9551f0;
        int iF = AbstractC0213f.f(i11);
        Q0.c cVar = dVar.f9525K;
        Q0.c cVar2 = dVar.f9523I;
        if (iF == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iF == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f11219f, i16, -2);
        } else if (iF == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f11219f, i16, -2);
            boolean z10 = dVar.f9572r == 1;
            int i17 = bVar.f10047j;
            if (i17 == 1 || i17 == 2) {
                boolean z11 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f10047j == 2 || !z10 || ((z10 && z11) || dVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (iF != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i18 = this.f11219f;
            int i19 = cVar2 != null ? cVar2.f9512g : 0;
            if (cVar != null) {
                i19 += cVar.f9512g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i18, i16 + i19, -1);
        }
        int iF2 = AbstractC0213f.f(i12);
        if (iF2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else if (iF2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f11220g, i15, -2);
        } else if (iF2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f11220g, i15, -2);
            boolean z12 = dVar.f9573s == 1;
            int i20 = bVar.f10047j;
            if (i20 == 1 || i20 == 2) {
                boolean z13 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f10047j == 2 || !z12 || ((z12 && z13) || dVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iF2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i21 = this.f11220g;
            int i22 = cVar2 != null ? dVar.f9524J.f9512g : 0;
            if (cVar != null) {
                i22 += dVar.L.f9512g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i21, i15 + i22, -1);
        }
        Q0.e eVar = (Q0.e) dVar.f9533T;
        ConstraintLayout constraintLayout = this.f11221h;
        if (eVar != null && Q0.j.c(constraintLayout.f18030i, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f9541a0 && !dVar.z() && a(dVar.f9521G, iMakeMeasureSpec, dVar.q()) && a(dVar.f9522H, iMakeMeasureSpec2, dVar.k())) {
            bVar.f10042e = dVar.q();
            bVar.f10043f = dVar.k();
            bVar.f10044g = dVar.f9541a0;
            return;
        }
        boolean z14 = i11 == 3;
        boolean z15 = i12 == 3;
        boolean z16 = i12 == 4 || i12 == 1;
        boolean z17 = i11 == 4 || i11 == 1;
        boolean z18 = z14 && dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z19 = z15 && dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (view == null) {
            return;
        }
        d dVar2 = (d) view.getLayoutParams();
        int i23 = bVar.f10047j;
        if (i23 != 1 && i23 != 2 && z14 && dVar.f9572r == 0 && z15 && dVar.f9573s == 0) {
            z2 = false;
            measuredWidth = 0;
            baseline = 0;
            i10 = -1;
            iMax = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof Q0.g)) {
                ((s) view).j((Q0.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.f9521G = iMakeMeasureSpec;
            dVar.f9522H = iMakeMeasureSpec2;
            dVar.f9552g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i24 = dVar.f9575u;
            int iMax2 = i24 > 0 ? Math.max(i24, measuredWidth2) : measuredWidth2;
            int i25 = dVar.f9576v;
            if (i25 > 0) {
                iMax2 = Math.min(i25, iMax2);
            }
            int i26 = dVar.f9578x;
            iMax = i26 > 0 ? Math.max(i26, measuredHeight) : measuredHeight;
            boolean z20 = z17;
            int i27 = dVar.f9579y;
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            if (!Q0.j.c(constraintLayout.f18030i, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * dVar.f9536W) + 0.5f);
                } else if (z19 && z20) {
                    iMax = (int) ((iMax2 / dVar.f9536W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z2 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i5 = 1073741824;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i5 = 1073741824;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i5);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                dVar.f9521G = iMakeMeasureSpec;
                dVar.f9522H = iMakeMeasureSpec2;
                z2 = false;
                dVar.f9552g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i10 = -1;
        }
        boolean z21 = baseline != i10 ? true : z2;
        if (measuredWidth != bVar.f10040c || iMax != bVar.f10041d) {
            z2 = true;
        }
        bVar.f10046i = z2;
        boolean z22 = dVar2.f11178c0 ? true : z21;
        if (z22 && baseline != -1 && dVar.f9541a0 != baseline) {
            bVar.f10046i = true;
        }
        bVar.f10042e = measuredWidth;
        bVar.f10043f = iMax;
        bVar.f10045h = z22;
        bVar.f10044g = baseline;
    }
}
