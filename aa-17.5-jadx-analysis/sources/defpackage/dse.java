package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class dse implements eaj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dse(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, ecyVar)) {
                coordinatorLayout.e = ecyVar;
                boolean z2 = ecyVar.d() > 0;
                coordinatorLayout.f = z2;
                coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                if (!ecyVar.y()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        int[] iArr = ebm.a;
                        if (childAt.getFitsSystemWindows() && ((dsj) childAt.getLayoutParams()).a != null && ecyVar.y()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return ecyVar;
        }
        if (i != 1) {
            wme wmeVar = (wme) this.a;
            wmd wmdVar = wmeVar.f;
            if (wmdVar != null) {
                wmeVar.a.E.remove(wmdVar);
            }
            wmeVar.f = new wmd(wmeVar.b, ecyVar);
            wmeVar.f.d(wmeVar.getWindow());
            wmeVar.a.N(wmeVar.f);
            return ecyVar;
        }
        int iD = ecyVar.d();
        int iD2 = ecyVar.d();
        fe feVar = (fe) this.a;
        ActionBarContextView actionBarContextView = feVar.r;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) feVar.r.getLayoutParams();
            if (feVar.r.isShown()) {
                if (feVar.H == null) {
                    feVar.H = new Rect();
                    feVar.I = new Rect();
                }
                Rect rect = feVar.H;
                Rect rect2 = feVar.I;
                rect.set(ecyVar.b(), ecyVar.d(), ecyVar.c(), ecyVar.a());
                dve dveVarF = ecyVar.f(2);
                ViewGroup viewGroup = feVar.v;
                if (Build.VERSION.SDK_INT >= 29) {
                    Insets systemWindowInsets = viewGroup.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                    rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                } else {
                    if (!ca.a) {
                        ca.a = true;
                        try {
                            ca.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!ca.b.isAccessible()) {
                                ca.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = ca.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                dve dveVarE = dve.e(Math.max(0, dveVarF.b - rect2.left), Math.max(0, dveVarF.c - rect2.top), Math.max(0, dveVarF.d - rect2.right), Math.max(0, dveVarF.e - rect2.bottom));
                int i3 = marginLayoutParams.leftMargin;
                int i4 = dveVarE.b;
                if (i3 == i4 && marginLayoutParams.rightMargin == dveVarE.d) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = dveVarE.d;
                }
                ActionBarContextView actionBarContextView2 = feVar.r;
                int i5 = rect.left - i4;
                int i6 = rect.top;
                int i7 = rect.right - dveVarE.d;
                actionBarContextView2.k = i5;
                actionBarContextView2.l = i6;
                actionBarContextView2.m = i7;
                actionBarContextView2.n();
                if (!feVar.y && rect.top > 0) {
                    iD2 = 0;
                }
                z = z;
            }
            if (z) {
                feVar.r.setLayoutParams(marginLayoutParams);
            }
        }
        return ebm.e(view, iD != iD2 ? ecyVar.p(ecyVar.b(), iD2, ecyVar.c(), ecyVar.a()) : ecyVar);
    }
}
