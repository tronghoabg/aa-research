package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class jha extends AnimatorListenerAdapter {
    final /* synthetic */ jhb a;

    public jha(jhb jhbVar) {
        this.a = jhbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jhb jhbVar = this.a;
        jhbVar.D = BitmapDescriptorFactory.HUE_RED;
        jhbVar.J = false;
        jhbVar.c.z();
    }
}
