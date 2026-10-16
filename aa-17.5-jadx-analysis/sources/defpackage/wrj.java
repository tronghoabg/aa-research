package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wrj extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ wrk c;

    public wrj(wrk wrkVar, boolean z, int i) {
        this.a = z;
        this.b = i;
        this.c = wrkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wrk wrkVar = this.c;
        wrkVar.a.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        wrkVar.g(BitmapDescriptorFactory.HUE_RED, this.a, this.b);
    }
}
