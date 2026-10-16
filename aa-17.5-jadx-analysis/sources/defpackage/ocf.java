package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class ocf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ocf(LogoView logoView, ValueAnimator valueAnimator, int i) {
        this.c = i;
        this.b = valueAnimator;
        this.a = logoView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i == 0) {
            ((oco) this.a).h.d((View) this.b, valueAnimator.getAnimatedFraction());
            return;
        }
        if (i == 1) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            fcn fcnVar = (fcn) this.b;
            fco.e(fFloatValue, fcnVar);
            fco fcoVar = (fco) this.a;
            fcoVar.a(fFloatValue, fcnVar, false);
            fcoVar.invalidateSelf();
            return;
        }
        if (i == 2) {
            int iIntValue = ((Integer) ((ValueAnimator) this.b).getAnimatedValue()).intValue();
            LogoView logoView = (LogoView) this.a;
            logoView.b = iIntValue;
            logoView.invalidate();
            return;
        }
        if (i == 3) {
            int iIntValue2 = ((Integer) ((ValueAnimator) this.b).getAnimatedValue()).intValue();
            LogoView logoView2 = (LogoView) this.a;
            logoView2.c = iIntValue2;
            logoView2.invalidate();
            return;
        }
        if (i == 4) {
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((wue) this.a).N(fFloatValue2);
            AppBarLayout appBarLayout = (AppBarLayout) this.b;
            Drawable drawable = appBarLayout.j;
            if (drawable instanceof wue) {
                ((wue) drawable).N(fFloatValue2);
            }
            Iterator it = appBarLayout.g.iterator();
            while (it.hasNext()) {
                ((wkw) it.next()).a();
            }
            Iterator it2 = appBarLayout.h.iterator();
            while (it2.hasNext()) {
                ((ykd) it2.next()).j(fFloatValue2 / appBarLayout.l);
            }
            return;
        }
        if (i != 5) {
            int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Rect rect = (Rect) this.b;
            rect.right = iIntValue3;
            ((wtt) this.a).a.j.setClipBounds(rect);
            return;
        }
        wrp wrpVar = (wrp) this.b;
        if (!wrpVar.c(true) || wrpVar.m == 0) {
            return;
        }
        wsd wsdVar = (wsd) this.a;
        if (wsdVar.isVisible()) {
            wsdVar.invalidateSelf();
        }
    }

    public /* synthetic */ ocf(AppBarLayout appBarLayout, wue wueVar, int i) {
        this.c = i;
        this.b = appBarLayout;
        this.a = wueVar;
    }

    public ocf(fco fcoVar, fcn fcnVar, int i) {
        this.c = i;
        this.a = fcoVar;
        this.b = fcnVar;
    }

    public /* synthetic */ ocf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
