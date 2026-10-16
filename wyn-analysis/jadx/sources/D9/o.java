package D9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import j$.util.Objects;
import java.util.ArrayList;
import t3.AbstractC4096p;
import u3.C4242d;

/* loaded from: classes4.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2595b;

    public /* synthetic */ o(Object obj, int i5) {
        this.f2594a = i5;
        this.f2595b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2594a) {
            case 1:
                F6.q qVar = (F6.q) this.f2595b;
                qVar.setEnabled(true);
                qVar.f4008a.setEnabled(true);
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2595b;
                actionBarOverlayLayout.f17836w = null;
                actionBarOverlayLayout.k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2594a) {
            case 0:
                s sVar = (s) this.f2595b;
                View view = sVar.f2610e;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height = view.getHeight();
                ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(sVar.f2609d);
                duration.addListener(new q(sVar, layoutParams, height));
                duration.addUpdateListener(new r(sVar, layoutParams));
                duration.start();
                break;
            case 1:
                F6.q qVar = (F6.q) this.f2595b;
                qVar.setEnabled(true);
                qVar.f4008a.setEnabled(true);
                break;
            case 2:
                ((HideBottomViewOnScrollBehavior) this.f2595b).f26781h = null;
                break;
            case 3:
                f8.j jVar = (f8.j) this.f2595b;
                jVar.q();
                jVar.f35152r.start();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2595b;
                actionBarOverlayLayout.f17836w = null;
                actionBarOverlayLayout.k = false;
                break;
            case 5:
                ((AbstractC4096p) this.f2595b).n();
                animator.removeListener(this);
                break;
            default:
                C4242d c4242d = (C4242d) this.f2595b;
                ArrayList arrayList = new ArrayList(c4242d.f46582e);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ColorStateList colorStateList = ((Q7.a) arrayList.get(i5)).f9886b.f9901o;
                    if (colorStateList != null) {
                        c4242d.setTintList(colorStateList);
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2594a) {
            case 1:
                F6.q qVar = (F6.q) this.f2595b;
                qVar.setEnabled(false);
                qVar.f4008a.setEnabled(false);
                break;
            case 6:
                C4242d c4242d = (C4242d) this.f2595b;
                ArrayList arrayList = new ArrayList(c4242d.f46582e);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Q7.c cVar = ((Q7.a) arrayList.get(i5)).f9886b;
                    ColorStateList colorStateList = cVar.f9901o;
                    if (colorStateList != null) {
                        c4242d.setTint(colorStateList.getColorForState(cVar.f9905s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public o(F6.q qVar) {
        this.f2594a = 1;
        Objects.requireNonNull(qVar);
        this.f2595b = qVar;
    }
}
