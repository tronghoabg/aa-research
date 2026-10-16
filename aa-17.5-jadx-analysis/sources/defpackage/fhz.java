package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public final class fhz implements eaj {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public fhz(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        ecy ecyVarE = ebm.e(view, ecyVar);
        if (ecyVarE.y()) {
            return ecyVarE;
        }
        Rect rect = this.b;
        rect.left = ecyVarE.b();
        rect.top = ecyVarE.d();
        rect.right = ecyVarE.c();
        rect.bottom = ecyVarE.a();
        ViewPager viewPager = this.a;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ecy ecyVarD = ebm.d(viewPager.getChildAt(i), ecyVarE);
            rect.left = Math.min(ecyVarD.b(), rect.left);
            rect.top = Math.min(ecyVarD.d(), rect.top);
            rect.right = Math.min(ecyVarD.c(), rect.right);
            rect.bottom = Math.min(ecyVarD.a(), rect.bottom);
        }
        ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVarE) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVarE) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVarE) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVarE) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVarE) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVarE) : new ecf(ecyVarE);
        eclVar.c(dve.d(rect));
        return eclVar.a();
    }
}
