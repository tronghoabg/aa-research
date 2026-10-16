package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.carstream.tech.core.ui.SplashView;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class fb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ SplashView c;

    public /* synthetic */ fb(SplashView splashView, Runnable runnable, int i) {
        this.a = i;
        this.c = splashView;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SplashView splashView = this.c;
                ValueAnimator valueAnimator = splashView.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    splashView.f = null;
                }
                ViewGroup viewGroup = (ViewGroup) splashView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(splashView);
                }
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                SplashView splashView2 = this.c;
                if (!splashView2.g) {
                    splashView2.g = true;
                    splashView2.animate().alpha(0.0f).setDuration(220L).withEndAction(new fb(splashView2, this.b, 0)).start();
                    break;
                }
                break;
        }
    }
}
