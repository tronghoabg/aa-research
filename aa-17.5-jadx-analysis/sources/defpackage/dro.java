package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dro implements dqx {
    final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public dro(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // defpackage.dqx
    public final void a() {
        ConstraintLayout constraintLayout = this.a;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt instanceof drz) {
                throw null;
            }
        }
        ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    @Override // defpackage.dqx
    public final void b(dqn dqnVar, dqw dqwVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (dqnVar == null) {
            return;
        }
        if (dqnVar.ar == 8) {
            dqwVar.c = 0;
            dqwVar.d = 0;
            dqwVar.e = 0;
            return;
        }
        if (dqnVar.ae != null) {
            int i3 = dqwVar.i;
            int i4 = dqwVar.j;
            int i5 = dqwVar.a;
            int i6 = dqwVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            View view = (View) dqnVar.aq;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = dqnVar.C;
                int i11 = dqwVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = view.getMeasuredHeight();
                    int iH = dqnVar.h();
                    if (dqwVar.h == 2 || i10 != 1 || measuredHeight == iH || (view instanceof drz) || dqnVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dqnVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                dqm dqmVar = dqnVar.T;
                int i13 = dqmVar != null ? dqmVar.f : 0;
                dqm dqmVar2 = dqnVar.V;
                if (dqmVar2 != null) {
                    i13 += dqmVar2.f;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = dqnVar.D;
                int i16 = dqwVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = view.getMeasuredWidth();
                    int iJ = dqnVar.j();
                    if (dqwVar.h == 2 || i15 != 1 || measuredWidth == iJ || (view instanceof drz) || dqnVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dqnVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = dqnVar.T != null ? dqnVar.U.f : 0;
                if (dqnVar.V != null) {
                    i18 += dqnVar.W.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            dqo dqoVar = (dqo) dqnVar.ae;
            if (dqoVar != null && (this.h.e & 256) == 256 && view.getMeasuredWidth() == dqnVar.j() && view.getMeasuredWidth() < dqoVar.j() && view.getMeasuredHeight() == dqnVar.h() && view.getMeasuredHeight() < dqoVar.h() && view.getBaseline() == dqnVar.al && !dqnVar.T() && c(dqnVar.R, iMakeMeasureSpec, dqnVar.j()) && c(dqnVar.S, iMakeMeasureSpec2, dqnVar.h())) {
                dqwVar.c = dqnVar.j();
                dqwVar.d = dqnVar.h();
                dqwVar.e = dqnVar.al;
                return;
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && dqnVar.ah > BitmapDescriptorFactory.HUE_RED;
            boolean z6 = z2 && dqnVar.ah > BitmapDescriptorFactory.HUE_RED;
            if (view != null) {
                drn drnVar = (drn) view.getLayoutParams();
                int i19 = dqwVar.h;
                if (i19 != 1 && i19 != 2 && z && dqnVar.C == 0 && z2 && dqnVar.D == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((view instanceof dsc) && (dqnVar instanceof dqu)) {
                        ((dsc) view).b((dqu) dqnVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    dqnVar.F(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i20 = dqnVar.F;
                    iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = dqnVar.G;
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    int i22 = dqnVar.I;
                    iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    boolean z7 = z4;
                    int i23 = dqnVar.J;
                    if (i23 > 0) {
                        iMax2 = Math.min(i23, iMax2);
                    }
                    if ((this.h.e & 1) != 1) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * dqnVar.ah) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / dqnVar.ah) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                        if (measuredWidth2 != iMax) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        dqnVar.F(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view.getMeasuredWidth();
                        iMax2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                dqwVar.g = (iMax == dqwVar.a && iMax2 == dqwVar.b) ? false : true;
                boolean z9 = drnVar.ag | z8;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (dqnVar.al != baseline) {
                        dqwVar.g = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                dqwVar.c = iMax;
                dqwVar.d = iMax2;
                dqwVar.f = z9;
                dqwVar.e = i2;
            }
        }
    }
}
