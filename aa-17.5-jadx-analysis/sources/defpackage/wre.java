package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wre extends AnimatorListenerAdapter {
    final /* synthetic */ wrf a;

    public wre(wrf wrfVar) {
        this.a = wrfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wrf wrfVar = this.a;
        wrfVar.a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        wrfVar.g(BitmapDescriptorFactory.HUE_RED);
    }
}
