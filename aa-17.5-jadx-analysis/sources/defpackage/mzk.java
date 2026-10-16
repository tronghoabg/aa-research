package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class mzk implements Animator.AnimatorListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mzk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.c != 0) {
            return;
        }
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c != 0) {
            return;
        }
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.c == 0) {
            animator.getClass();
            return;
        }
        Object obj = this.a;
        fcn fcnVar = (fcn) this.b;
        fco fcoVar = (fco) obj;
        fcoVar.a(1.0f, fcnVar, true);
        fcnVar.e();
        fcnVar.f();
        fcnVar.g();
        if (!fcoVar.d) {
            fcoVar.c += 1.0f;
            return;
        }
        fcoVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        fcnVar.c(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.c != 0) {
            ((fco) this.a).c = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        animator.getClass();
        Object obj = this.a;
        ((View) obj).setVisibility(0);
        ((ImageView) obj).setImageDrawable((Drawable) this.b);
    }
}
