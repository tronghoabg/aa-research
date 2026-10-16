package android.support.v7.app;

import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f636a;

    y(an anVar) {
        this.f636a = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an anVar = this.f636a;
        anVar.f535i.showAtLocation(anVar.f534h, 55, 0, 0);
        anVar.N();
        if (!anVar.V()) {
            anVar.f534h.setAlpha(1.0f);
            anVar.f534h.setVisibility(0);
            return;
        }
        anVar.f534h.setAlpha(0.0f);
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(anVar.f534h);
        viewPropertyAnimatorCompatAnimate.alpha(1.0f);
        anVar.f537k = viewPropertyAnimatorCompatAnimate;
        anVar.f537k.setListener(new x(this));
    }
}
