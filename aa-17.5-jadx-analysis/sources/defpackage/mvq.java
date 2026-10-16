package defpackage;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class mvq implements Animation.AnimationListener {
    public float a;
    final /* synthetic */ mvr b;

    public mvq(mvr mvrVar) {
        this.b = mvrVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        View view = this.b.getView();
        if (view != null) {
            view.post(new mgw(view, this, 7, null));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        mvr mvrVar = this.b;
        if (mvrVar.getView() != null) {
            View viewRequireView = mvrVar.requireView();
            int[] iArr = ebm.a;
            this.a = viewRequireView.getTranslationZ();
            mvrVar.requireView().setTranslationZ(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
