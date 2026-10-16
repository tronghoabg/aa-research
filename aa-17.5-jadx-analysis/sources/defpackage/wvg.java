package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wvg extends AnimatorListenerAdapter {
    final /* synthetic */ SideSheetBehavior a;

    public wvg(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SideSheetBehavior sideSheetBehavior = this.a;
        sideSheetBehavior.M(5);
        WeakReference weakReference = sideSheetBehavior.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) sideSheetBehavior.j.get()).requestLayout();
    }
}
