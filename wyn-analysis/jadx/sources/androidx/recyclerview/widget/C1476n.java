package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import t3.AbstractC4104x;

/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18922a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18923b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18924c;

    public C1476n(View view) {
        this.f18924c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f18922a) {
            case 0:
                this.f18923b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18922a) {
            case 0:
                if (!this.f18923b) {
                    C1478p c1478p = (C1478p) this.f18924c;
                    if (((Float) c1478p.f18958z.getAnimatedValue()).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        c1478p.f18932A = 2;
                        c1478p.f18951s.invalidate();
                        break;
                    } else {
                        c1478p.f18932A = 0;
                        c1478p.d(0);
                        break;
                    }
                } else {
                    this.f18923b = false;
                    break;
                }
            default:
                t3.y yVar = AbstractC4104x.f45735a;
                View view = (View) this.f18924c;
                yVar.J(view, 1.0f);
                if (this.f18923b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f18922a) {
            case 1:
                WeakHashMap weakHashMap = k1.S.f38779a;
                View view = (View) this.f18924c;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f18923b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C1476n(C1478p c1478p) {
        this.f18924c = c1478p;
    }
}
