package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class es implements defpackage.eap {
    final /* synthetic */ defpackage.ff a;

    public es(defpackage.ff ffVar) {
        this.a = ffVar;
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        defpackage.ff ffVar = this.a;
        int iD = edfVar.d();
        int iD2 = edfVar.d();
        android.support.v7.widget.ActionBarContextView actionBarContextView = ffVar.r;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) ffVar.r.getLayoutParams();
            boolean z = false;
            if (ffVar.r.isShown()) {
                if (ffVar.H == null) {
                    ffVar.H = new android.graphics.Rect();
                    ffVar.I = new android.graphics.Rect();
                }
                android.graphics.Rect rect = ffVar.H;
                android.graphics.Rect rect2 = ffVar.I;
                rect.set(edfVar.b(), edfVar.d(), edfVar.c(), edfVar.a());
                defpackage.dvl dvlVarF = edfVar.f(2);
                android.view.ViewGroup viewGroup = ffVar.v;
                boolean z2 = true;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    android.graphics.Insets insetsM$3 = ep$.ExternalSyntheticApiModelOutline0.m$3(viewGroup.computeSystemWindowInsets(ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.view.WindowInsets.Builder(), ep$.ExternalSyntheticApiModelOutline0.m(rect))), rect2));
                    rect.set(alh$.ExternalSyntheticApiModelOutline0.m(insetsM$3), alh$.ExternalSyntheticApiModelOutline0.m$2(insetsM$3), alh$.ExternalSyntheticApiModelOutline0.m$1(insetsM$3), alh$.ExternalSyntheticApiModelOutline0.m$3(insetsM$3));
                } else {
                    if (!defpackage.ca.a) {
                        defpackage.ca.a = true;
                        try {
                            defpackage.ca.b = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
                            if (!defpackage.ca.b.isAccessible()) {
                                defpackage.ca.b.setAccessible(true);
                            }
                        } catch (java.lang.NoSuchMethodException unused) {
                            android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    java.lang.reflect.Method method = defpackage.ca.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (java.lang.Exception e) {
                            android.util.Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                defpackage.dvl dvlVarE = defpackage.dvl.e(java.lang.Math.max(0, dvlVarF.b - rect2.left), java.lang.Math.max(0, dvlVarF.c - rect2.top), java.lang.Math.max(0, dvlVarF.d - rect2.right), java.lang.Math.max(0, dvlVarF.e - rect2.bottom));
                int i = marginLayoutParams.leftMargin;
                int i2 = dvlVarE.b;
                if (i == i2 && marginLayoutParams.rightMargin == dvlVarE.d) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = dvlVarE.d;
                }
                android.support.v7.widget.ActionBarContextView actionBarContextView2 = ffVar.r;
                int i3 = rect.left - i2;
                int i4 = rect.top;
                int i5 = rect.right - dvlVarE.d;
                actionBarContextView2.k = i3;
                actionBarContextView2.l = i4;
                actionBarContextView2.m = i5;
                actionBarContextView2.n();
                if (!ffVar.y && rect.top > 0) {
                    iD2 = 0;
                }
                z = z2;
            }
            if (z) {
                ffVar.r.setLayoutParams(marginLayoutParams);
            }
        }
        return defpackage.ebt.e(view, iD != iD2 ? edfVar.p(edfVar.b(), iD2, edfVar.c(), edfVar.a()) : edfVar);
    }
}
